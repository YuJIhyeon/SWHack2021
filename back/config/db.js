import mariadb from 'mariadb'

const pool = mariadb.createPool({
  host: 'localhost',
  user: 'root',
  database: 'garasadae',
  connectionLimit: 5
});

export default await pool.getConnection();