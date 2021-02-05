import db from '../config/db.js'

export default async (id) => {
  const data = await db.query('SELECT * FROM phrase WHERE id = ?', [id]);
  const attribute = await db.query('SELECT * FROM ' + data[0].referenceName + ' WHERE phraseID = ?', [id]);
  if(data[0].categoryName === 'great') {
    data[0].name = attribute[0].name;
  } else if (data[0].categoryName === 'media') {
    data[0].title = attribute[0].title;
    data[0].type = attribute[0].type;
  } else if(data[0].categoryName === 'proverb') {
    data[0].nation = attribute[0].nation;
  }
  return data[0];
}