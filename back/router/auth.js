import express from 'express';
import db from '../config/db.js';
import crypto from 'crypto-promise';
import jwt from 'jsonwebtoken';

const router = express.Router();
const salt = 'swhackaton';
const jwtSecret = 'swhackaton'

async function pwHash(password) {
  const hash = await crypto.hash('sha256')(salt+password);
  return hash;
}

//사용자 회원가입
router.post('/register', async (req, res) => {
  const {id, password, interest, age, sex} = req.body;
  try {
    const exist = await db.query('SELECT * FROM user WHERE ID = ?', id);
    if(exist[0].length !== 0) {
      res.status(409).json({
        message: 'already exist user id'
      });
      return;
    }
    await db.query('INSERT INTO user(ID, Password, Interest, age, sex) VALUE(?, ?, ?, ?, ?)', id, await pwHash(password), interest, age, sex);
    res.status(200).json({
      message: 'success'
    });
  } catch (error) {
    res.status(500).json(error);
  }
})

//로그인 (로그인 토큰 발급)
router.post('/login', async (req, res) => {
  const {id, password} = req.body;
  try {
    let row = db.query('SELECT * FROM user WHERE ID = ?', id);
    let data = row[0];
    if(data.length === 0) {
      res.status(404).json({
        message: 'user id not found'
      });
      return;
    }
    if(data[0].Password !== await pwHash(password)) {
      res.status(409).json({
        message: 'password wrong!'
      });
      return;
    }
    const token = jwt.sign({
        id: data[0].id,
      },
      jwtSecret,
      {
        expiresIn: '1d',
        issuer: 'user'
      }
    );
    res.status(200).json({
      message: 'success',
      token: token
    });
  } catch (error) {
    res.status(500).json(error);
  }
})

export default router;