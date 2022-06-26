// var fibonacci = [0, 1];
// function fib(num) {
//     // starting at array index 1, and push current index + previous index to the array
//     for (var i = 1; i < num; i++) {
//         fibonacci.push(fibonacci[i] + fibonacci[i - 1]);
//     }
//     console.log(fibonacci);
// }
// fib(10);

function* fibonacci() {
    let current = 0;
    let next = 1;
    while (true) {
        let reset = yield current;
        [current, next] = [next, next + current];
        if (reset) {
            current = 0;
            next = 1;
        }
    }
}

const sequence = fibonacci();
console.log(sequence.next().value);     // 0
console.log(sequence.next().value);     // 1
console.log(sequence.next().value);     // 1
console.log(sequence.next().value);     // 2
console.log(sequence.next().value);     // 3
console.log(sequence.next().value);     // 5
console.log(sequence.next().value);     // 8