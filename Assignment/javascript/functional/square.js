function app(arr) {

    ret = [];

    for (var i = 0, len = arr.length; i < len; i++) {
        ret.push(arr[i] * arr[i]);
    }

    return ret;
}


arr = [1, 2, 3, 4, 5];

apple = app(arr);
console.log(apple);