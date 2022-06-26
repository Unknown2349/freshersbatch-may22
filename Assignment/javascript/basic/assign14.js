let randomArray = Array.from({ length: 100 }, () => Math.floor(Math.random() * 1000));




for (i = 0; i < randomArray.length; i++) {


    for (j = 0; j < (randomArray.length - i - 1); j++) {

        if (randomArray[j] > randomArray[j + 1]) {

            var temp = randomArray[j]
            randomArray[j] = randomArray[j + 1]
            randomArray[j + 1] = temp
        }
    }
}

console.log(randomArray);



console.log("Largest Number is", randomArray[randomArray.length - 1]);


console.log("Smallest Number is", randomArray[0]);


function CountingEvenOdd(randomArray, randomArray_size) {
    let even_count = 0;
    let odd_count = 0;


    for (let i = 0; i < randomArray_size; i++) {


        if (randomArray[i] & 1 == 1)
            odd_count++;
        else
            even_count++;
    }

    console.log("Number of even elements = " + even_count
        + "<br>" + "Number of odd elements = " + odd_count);
}


let n = randomArray.length;


CountingEvenOdd(randomArray, n);



const sum = randomArray.reduce((a, b) => a + b, 0);
console.log("Sum is", sum);



const average = randomArray.reduce((a, b) => a + b, 0) / randomArray.length;
console.log("Average is", average);