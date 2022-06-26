class Account {

    id!: number;
    name: string; // public property

    constructor(id: number, name: string) {

        this.id = id;
        this.name = name;

    }



    getbalance(balance: number = 0) {
        console.log(this.name + " is having" + " " + balance + " rupees");
    }
}


class SavingAccount extends Account {
    interest: string;
    cash_credit: number;

    constructor(id: number, name: string, interest: string, cash_credit: number) {
        super(id, name)

        this.interest = interest;
        this.cash_credit = cash_credit;
    }

    getbalance(balance = 10000) {

        console.log("Fetching SavingAccount Balance");
        super.getbalance(balance);
    }
}


class CurrentAccount extends Account {
    interest: string;
    cash_credit: number;

    constructor(id: number, name: string, interest: string, cash_credit: number) {
        super(id, name)

        this.interest = interest;
        this.cash_credit = cash_credit;
    }

    getbalance(balance = 15000) {

        console.log("Fetching CurrentAccount Balance");
        super.getbalance(balance);
    }
}


let savingbal = new SavingAccount(1, "Wand", "5%", 500);
let currentbal = new CurrentAccount(2, "Hussain", "7%", 1000);

savingbal.getbalance();
currentbal.getbalance();


