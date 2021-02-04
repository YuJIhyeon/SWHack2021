import express from 'express'

const app = express()

app.use('/', (req, res) => {
  res.json({'message': 'hello!'});
})

app.listen(3000, () => {
  console.log('start');
})