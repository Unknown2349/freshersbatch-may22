let A = [1, 2, 3];
let B = ["a", "b", "c"];

var newList = function (A, B) {
    let l = A.length + B.length;
    let r = [];
    let j = 0, k = 0;
    for (let i = 0; i < l; i++) {
        if (i % 2 == 0) {
            r[i] = A[j++];
        } else {
            r[i] = B[k++];
        }
    }
    return r;
}

console.log(newList(A, B));




