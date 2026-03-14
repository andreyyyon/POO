public class BankAccount {
    private int accountNumber;
    private int agencyAccount;
    private String holderAccount;
    private double balanceAccount;
    private double limitAccount;

    public BankAccount(int accountNumber, int agencyAccount, String holderAccount, double balanceAccount, double limitAccount) {
        this.accountNumber = accountNumber;
        this.agencyAccount = agencyAccount;
        this.holderAccount = holderAccount;
        this.balanceAccount = balanceAccount;
        this.limitAccount = limitAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyAccount() {
        return agencyAccount;
    }

    public void setAgencyAccount(int agencyAccount) {
        this.agencyAccount = agencyAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public double getLimitAccount() {
        return limitAccount;
    }

    public void setLimitAccount(double limitAccount) {
        this.limitAccount = limitAccount;
    }

    public void withdrawal(double amount){
        if((this.balanceAccount + this.limitAccount) > amount){
            setBalanceAccount(this.balanceAccount - amount);
        }
    }

    public void deposit(double amount){
        if(amount < 0) return;
        setBalanceAccount(this.balanceAccount + amount);
    }
}
