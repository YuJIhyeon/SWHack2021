import express from 'express'
import auth from './router/auth.js'
const app = express()

app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use('/auth', auth);
app.use('/', (req, res) => {
  res.json({'message': 'hello!'});
})

app.listen(80, () => {
  console.log('start');
})