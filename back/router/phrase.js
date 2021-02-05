import express from 'express'
import verifyToken from '../middleware/verifyToken.js'
import db from '../config/db.js'

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
      const insertId = data['insertId'];
      if(categoryName === 'great') {
        await db.query('INSERT INTO great(phraseID, name) VALUE(?, ?)', insertId, req.body.name);
      } else if(categoryName === 'media') {
        await db.query('INSERT INTO media(phraseID, title, type) VALUE(?, ?, ?)', insertId, req.body.title, req.body.type);
      } else if(categoryName === 'proverb') {
        await db.query('INSERT INTO proverb(phraseID, nation) VALUE(?, ?)', insertId, req.body.nation);
      }
      res.status(200).json({
        message: 'success'
      });
    } catch (error) {
      console.log(error);
      res.status(500).json(error);
    }
  })
  

//명언 불러오기
router.get('/:id');


//명언 이름검색
router.get('/search_name', async (req, res) => {
  try {
    
    let name = req.query.name;
    const exist = await db.query('SELECT EXISTS(SELECT * FROM great WHERE name = ?) as isExist', name);

    if(exist[0]['isExist']) {
      let phraseInfo = await db.query('SELECT g.name, p.phrase, p.referenceName FROM great g, phrase p WHERE g.phraseId == p.Id');
      response.json(phraseInfo);
      return;
    }
    else {
      res.status(409).json({
        message: 'Does not exist phrase'
      });
    }   

  } catch (error) {
    res.status(500).json(error);
  }

});

//명언 구문검색
router.get('/search_phrase', async (req, res) => {
  try {
    
    let phrase = req.query.phrase;
    const exist = await db.query('SELECT EXISTS(SELECT * FROM phrase WHERE phrase = ?) as isExist', phrase);

    if(exist[0]['isExist']) {
      let phraseInfo = await db.query('SELECT g.name, p.phrase, p.referenceName,  FROM great g, phrase p WHERE g.phraseId == p.Id');
      response.json(phraseInfo);
      return;
    }
    else {
      res.status(409).json({
        message: 'Does not exist phrase'
      });
    }   

  } catch (error) {
    res.status(500).json(error);
  }

});

//공명의 주머니
router.get('/random');

//명언 댓글 가져오기
router.get('/:id/comment');

//명언 댓글 작성
router.post('/:id/comment');

//명언 댓글 삭제
router.delete('/:id/comment/:comment_id');

export default router;