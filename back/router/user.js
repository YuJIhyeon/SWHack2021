import express from 'express'

const router = express.Router()

//관심 분야 작성
router.post('/preference');

//내가 등록한 문구
router.get('/phrase');

//내가 스크랩(좋아요)한 문구
router.get('/scrap');

export default router;