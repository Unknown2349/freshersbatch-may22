class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
}

const obj = new Rectangle(3, 5);
// obj.height; // 3
// obj.width; // 5
console.log(obj);

const app = new Rectangle(8, 9);
console.log(app);

// obj instanceof Rectangle; // true
// ({}) instanceof Rectangle; // false