// parent class
class Account {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }



    getbalance(balance = this.balance) {
        console.log(this.name + " is having" + " " + balance + " rupees");
    }





}

// inheriting parent class
class SavingsAccount extends Account {

    constructor(id, name, balance, interest, cash_credit) {
        super(id, name, balance)

        this.interest = interest;
        this.cash_credit = cash_credit;


        console.log("Fetching SavingsAccount Balance: Rs.", this.balance);
        // let x = this.balance
        // console.log(x);



    }

}


let Saving = new SavingsAccount(1, 'Wand', 5000, "5%", 500);
Saving.getbalance();

class CurrentAccount extends Account {

    constructor(id, name, balance, interest, cash_credit) {
        super(id, name, balance)

        this.interest = interest;
        this.cash_credit = cash_credit;

        console.log("Fetching CurrentAccount Balance: Rs.", this.balance);

        // let y = this.balance
        // console.log(y);

    }

}


let Current = new CurrentAccount(2, 'Hussain', 10000, "10%", 1000);
Current.getbalance();


