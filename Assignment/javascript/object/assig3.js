function Rectangle(height, width) {
    this.height = height;
    this.width = width;

    //this.height = 20;

    this.getArea = function () {
        return this.height * this.width;
    }

    //this.height = 20;
}



this.height = 20;
const tri = new Rectangle(5, 9);

console.log(tri.getArea());

