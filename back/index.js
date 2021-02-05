import express from 'express'
import auth from './router/auth.js'
import phrase from './router/phrase.js'
import user from './router/user.js'
const app = express()

app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use('/auth', auth);
app.use('/phrase', phrase);
app.use('/user', user);
app.use('/', (req, res) => {
  res.json({'message': 'hello!'});
})

app.listen(80, () => {
  console.log('start');
})