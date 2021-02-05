import express from 'express';
import db from '../config/db.js';
import crypto from 'crypto-promise';
import jwt from 'jsonwebtoken';

var mysqlRouter = require('./routes/mysql');
var app=express();

var router = express.Router();
var mysql= require('mysql');


app.use('/mysql',mysqlRouter)

router.get('/',function(req,res,next){
    
    var connection =mysql.createConnection({
        host: 'localhost',
        port:3306, // TCP port number check
        user: 'garasadae', // user check
        password: 'garasadae', //password check
        database : 'garasadae'
    });

    connection.connect(function(err){
        
        if(err){
            res.render('mysql',{connect: 'Fail to load DB', err:err});
            console.error(err);
            throw err;
        }
        else{
            res.render('mysql',{connect:'Load Success',err:'None'});
        }
    });
    connection.end();
});
module.exports = router;