import express from 'express'
import verifyToken from '../middleware/verifyToken.js;

const router = express.Router()

//명언 작성
router.post('/', verifyToken, async (req, res) => {
    const writerId = res.locals.jwtPayload.id;
    const {phrase, categoryName, referenceName} = req.body;
    try {
      const exist = await db.query('SELECT EXISTS(SELECT * FROM phrase WHERE phrase = ?) as isExist', [phrase]);
      if(exist[0]['isExist']) {
        res.status(409).json({
          message: 'exist phrase'
        });
        return;
      }
      const data = await db.query('INSERT INTO phrase(phrase, categoryName, writerId, referenceName) VALUE(?, ?, ?, ?)', [phrase, categoryName, writerId, referenceName]);
      console.log(data);
      if(categoryName === 'great') {
        await db.query('INSERT INTO great(?')
      } else if(categoryName === 'media') {

      } else if(categoryName === 'proverb') {

      }
      res.status(200).json({
        message: 'success'
      });
    } catch (error) {
      res.status(500).json(error);
    }
  })
  

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

export default router;