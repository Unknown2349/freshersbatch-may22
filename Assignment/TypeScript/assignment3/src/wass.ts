class Car {
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    run(speed: number = 0) {
        console.log("A " + this.name + " is moving at " + speed + " mph!");
    }
}

class Mercedes extends Car {

    constructor(name: string) {
        super(name);
    }

    run(speed = 150) {
        console.log('A Mercedes started')
        super.run(speed);
    }
}

class Honda extends Car {

    constructor(name: string) {
        super(name);
    }

    run(speed = 100) {
        console.log('A Honda started')
        super.run(speed);
    }
}

let mercObj = new Mercedes("Mercedes-Benz GLA");
let hondaObj = new Honda("Honda City")

mercObj.run();  // A Mercedes started A Mercedes-Benz GLA is moving at 150 mph!
hondaObj.run(); // A Honda started A Honda City is moving at 100 mph!









// let squad:Circle= Employee ;

// interface Person {
//     name: string;
//     age: number;
// }

// interface ReadonlyPerson {
//     readonly name: string;
//     readonly age: number;
// }

// let writablePerson: Person = {
//     name: "Person McPersonface",
//     age: 42,
// };

// // works
// let readonlyPerson: ReadonlyPerson = writablePerson;

// console.log(readonlyPerson.age); // prints '42'
// writablePerson.age++;
// console.log(readonlyPerson.age); // prints '43'