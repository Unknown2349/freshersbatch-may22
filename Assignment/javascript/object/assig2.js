class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
}

Rectangle.prototype.area = function () {
    return (this.height * this.width);
};

const rect = new Rectangle(1, 2);
console.log("Area of Triangle1 is", rect.area());
const ship = new Rectangle(5, 9);
console.log("Area of Triangle2 is", ship.area());