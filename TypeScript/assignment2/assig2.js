
// function findArmstrong(low, high) {
// 	for (let i = low + 1;
// 		i < high; ++i) {

// 		// number of digits calculation
// 		let x = i;
// 		let n = 0;
// 		while (x != 0) {
// 			x = parseInt(x / 10);
// 			++n;
// 		}

// 		// compute sum of nth power of its digits
// 		let pow_sum = 0;
// 		x = i;
// 		while (x != 0) {
// 			let digit = x % 10;
// 			pow_sum += parseInt(Math.pow(digit, n));
// 			x = parseInt(x / 10);
// 		}

// 		// checks if number i is equal to the sum of nth power of its digits
// 		if (pow_sum == i)
// 			console.log(i + " ");
// 	}
// }



let lowNumber = 10;
function armstong() {

	if (lowNumber >= 1000) {
		console.log("Exceeds 1000 error occured");
		lowNumber = 10;
	}
	else {
		for (let i = lowNumber; i > 0; i++) {
			let numberOfDigits = i.toString().length;
			let sum = 0;
			let temp = i.toString();
			for (let char of temp) {
				sum += Math.pow(parseInt(char), numberOfDigits);
			}
			if (sum == i) {
				console.log(i);
				lowNumber = i;
				break;
			}

		}
	}
}

function getNextArmstrong() {
	lowNumber++;
	armstong();
}

armstong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();