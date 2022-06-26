class Circle {
    radius: number;
}


class Employee {
    name: string;
}



interface Printable extends Circle, Employee { }

let printall: Printable = {
    name: "wand",
    radius: 42
};

//const aapp=printall(Hussain,60)

