import express from 'express';

const router = express.Router();

//공명의 주머니
router.get('/', async (req, res) => {
  let limit = 999;
  let query = 'SELECT * FROM phrase';
  let param = []
  if(req.params.category !== undefined) {
    query += 'WHERE referenceName = ?'
    param.push(req.params.category);
  }
  query += 'ORDER BY RAND() LIMIT ?'
  param.push(limit);
  if(req.params.limit !== undefined) {
    limit = parseInt(req.params.limit);
  }
  try {
    const data = await db.query(query, param);
    res.status(200).json(data);
  } catch (error) {
    console.log(error);
    res.status(500).json(error);
  }
});

export default router;