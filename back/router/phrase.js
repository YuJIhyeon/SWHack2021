import express from 'express'

const router = express.Router()
//명언 작성
router.post('/');

//명언 불러오기
router.get('/:id');

//명언 검색
router.get('/search');

//공명의 주머니
router.get('/random');

//명언 댓글 가져오기
router.get('/:id/comment');

//명언 댓글 작성
router.post('/:id/comment');

//명언 댓글 삭제
router.delete('/:id/comment/:comment_id');
