import jwt from 'jsonwebtoken';

export default (req, res, next) => {
  try {
    const token = req.headers.authorization;
    if (token === undefined) {
      res.status(401).send({
        message: 'jwt token is not exist in header',
      });
      return;
    }
    const jwtPayload = jwt.verify(token, config.get('jwtSecret'));
    res.locals.jwtPayload = jwtPayload;
    const { id } = jwtPayload;
    const newToken = jwt.sign({ id: id }, config.get('jwtSecret'), {
      expiresIn: '1d',
    });
    res.setHeader('token', newToken);
  } catch (err) {
    res.status(401).send({
      message: 'jwt token is not valid',
    });
    return;
  }
  next();
};