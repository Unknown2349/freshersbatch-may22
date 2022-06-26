let randomArray = Array.from({ length: 20 }, () => Math.floor(Math.random() * 100));

for (i = 0; i < randomArray.length; i++) {


    for (j = 0; j < (randomArray.length - i - 1); j++) {

        if (randomArray[j] > randomArray[j + 1]) {

            var temp = randomArray[j]
            randomArray[j] = randomArray[j + 1]
            randomArray[j + 1] = temp
        }
    }
}


console.log("Bubble Sorting", randomArray);