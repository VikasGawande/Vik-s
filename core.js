//const os = require('os');

// find the user who are in login

//console.log(os.userInfo().username);

//type of the operating sys
//console.log(os.type());

//architecture of cup x64 or x32
//console.log(os.arch());

//number of processor i5 or i8
//console.log(os.cpus());

const process = require('process')
console.log(process.env);
process.env.test = 123;



