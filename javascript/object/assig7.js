var text = '{ "firstName":"John" , "lastName":"Doe" }';

const obj = JSON.parse(text);

console.log(obj.firstName + " " + obj.lastName);

