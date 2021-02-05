import express from 'express'
import verifyToken from '../middleware/verifyToken.js';
import db from '../config/db.js'

const router = express.Router()

//내가 등록한 문구
router.get('/phrase', verifyToken, async (req, res) => {
  try {
    const userID = res.locals.jwtPayload.id;
    const data = await db.query('SELECT * FROM phrase WHERE WriterID = ?', userID);
    res.status(200).json(data);
  }
  catch (error) {
    console.log(error);
    res.status(500).json(error);
  }
});

//내가 스크랩(좋아요)한 문구
router.get('/scrap', verifyToken, async (req, res) => {
  try {
    const userID = res.locals.jwtPayload.id;
    const data = await db.query('SELECT * FROM phrase JOIN liked ON phrase.id = liked.phraseID WHERE liked.userID = ?', [userID]);
    res.status(200).json(data);
  } catch (error) {
    console.log(error);
    res.status(500).json(error);
  }
});

export default router;