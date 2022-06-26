function flipCoin() { return Math.random() < .5; }
function getNumberOfCoins() {
    var r = prompt("How many flips?");
    if (isNaN(r)) {
        alert("Please type a number!");
        return getNumberOfCoins();
    }
    if (!r) r = 0;
    return Math.floor(Number(r));
}

function coinFlip() {
    var f = getNumberOfCoins();
    var heads = 0;
    var tails = 0;
    for (var i = 0; i < f; i++) {
        flipCoin() ? heads++ : tails++;
    }
    {
        alert("heads: " + heads + "\ntails: " + tails);
    }
}