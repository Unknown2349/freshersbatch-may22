console.log("Using For loop");
const arr = [1, 2, 3, 4, 5];



function arraysum(a) {
    var total = 0;
    for (var i in a) {
        total += a[i];
    }
    return total;
}

let sum = arraysum(arr);
console.log("Total sum of Array", sum);





console.log("Using Do While loop");

const value = () => {
    let k = 0;
    first = 0;
    do {

        if (k < arr.length) {
            first += arr[k];
            //console.log(first);
        }
        k++;
    } while (k <= arr.length);
    console.log("Sum of Array", first);

}

value();






console.log("Using While loop");




const result = () => {
    var j = arr.length;
    var final = 0;
    while (j--) {
        final += arr[j]
    }
    console.log("Total sum", final)
}
result()