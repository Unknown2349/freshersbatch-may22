// let names = ['Tom', 'Ivan', 'Jerry'];
// let lengths = names.map(name => name.length);
// //console.log(names);
// //console.log(lengths);
// //const obj = Object.assign({}, names);
// //const obj = Object.assign({ names, lengths });
// //const apple = { ...lengths, ...names }
// //console.log(obj);
// //console.log(apple);

// var result = Object.assign.apply({}, names.map((v, i) => ({ [v]: lengths[i] })))


// console.log(result);
let names = [`Tom`, `Iven`, `Jerry`];
console.log(names.map(names => "{name: " + names + ", length: " + names.length + "}"));