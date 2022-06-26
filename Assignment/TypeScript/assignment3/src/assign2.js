var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name) {
        this.id = id;
        this.name = name;
    }
    Account.prototype.getbalance = function (balance) {
        if (balance === void 0) { balance = 0; }
        console.log(this.name + " is having" + " " + balance + " rupees");
    };
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name) || this;
        _this.interest = interest;
        _this.cash_credit = cash_credit;
        return _this;
    }
    SavingAccount.prototype.getbalance = function (balance) {
        if (balance === void 0) { balance = 10000; }
        console.log("Fetching SavingAccount Balance");
        _super.prototype.getbalance.call(this, balance);
    };
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name) || this;
        _this.interest = interest;
        _this.cash_credit = cash_credit;
        return _this;
    }
    CurrentAccount.prototype.getbalance = function (balance) {
        if (balance === void 0) { balance = 15000; }
        console.log("Fetching CurrentAccount Balance");
        _super.prototype.getbalance.call(this, balance);
    };
    return CurrentAccount;
}(Account));
var savingbal = new SavingAccount(1, "Wand", "5%", 500);
var currentbal = new CurrentAccount(2, "Hussain", "7%", 1000);
savingbal.getbalance();
currentbal.getbalance();
