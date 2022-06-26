const order = {
    id: 1, title: "Dosa", price: 50
}


function getprice() {
    return order.price;

}

console.log(getprice());


function printOrder() {
    return order
}

console.log(printOrder());



const tgt = Object.assign(order);
console.log(tgt);
