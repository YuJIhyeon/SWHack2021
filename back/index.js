import express from 'express'
import auth from './router/auth'
const app = express()

app.use('/auth', auth);
app.use('/', (req, res) => {
  res.json({'message': 'hello!'});
})

app.listen(3000, () => {
  console.log('start');
})