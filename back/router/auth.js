import express from 'express';
import db from '../config/db.js';

const router = express.Router();
const salt = 'swhackerton';

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
    await db.query('INSERT INTO user(ID, Password, Interest, age, sex) VALUE(?, ?, ?, ?, ?)', id, password, interest, age, sex);
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

  } catch (error) {

  }
})

export default router;