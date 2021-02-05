import db from '../config/db.js'

export default async (id) => {
  const data = await db.query('SELECT * FROM phrase WHERE id = ?', [id]);
  const attribute = await db.query('SELECT * FROM ' + data[0].referenceName + ' WHERE phraseID = ?', [id]);
  if(categoryName === 'great') {
    data[0].name = attribute[0].name;
  } else if (categoryName === 'media') {
    data[0].title = attribute[0].title;
    data[0].type = attribute[0].type;
  } else if(categoryName === 'proverb') {
    data[0].nation = attribute[0].nation;
  }
  return data[0];
}