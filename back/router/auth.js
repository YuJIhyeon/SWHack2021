import express from 'express';
import db from '../config/db';

const router = express.Router();
const salt = 'swhackerton'

//사용자 회원가입
router.post('/register', async (req, res) => {
  const [id, password] = req.body;
  const rows = db.query('SHOW TABLES')
  res.status(200).json(rows)
})

//로그인 (로그인 토큰 발급)
router.post('/login', async (req, res) => {
  
})

export default router;