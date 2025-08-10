public class BankAccount {

    private int cpf;
    private String name;

    private double balance;

    private double specialCheck;
    private double limitSpecialCheck;
    private boolean useSpecialCheck;
    public double taxInSpecialCheck;

    public BankAccount(int cpf, String name, double balance){
        this.balance = balance;
        if(this.balance <= 500){
            this.specialCheck = 50;
            this.limitSpecialCheck = this.specialCheck + this.balance;
        } else if(balance > 500){
            this.limitSpecialCheck += (0.5 * this.balance);
            this.specialCheck = this.limitSpecialCheck;
        }
        this.useSpecialCheck = false;
        this.cpf = cpf;
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getSpecialCheck() {
        return this.specialCheck;
    }

    public void withdrawal(double value){
        if(this.balance >= value){
            balance -= value;
            return;
        }
        double totalDisponivel = this.balance + this.specialCheck;
        if(totalDisponivel >= value){
            double restante = value - this.balance;

            this.balance = 0;

            this.specialCheck -= restante;
            this.useSpecialCheck = true;
            this.taxInSpecialCheck += 0.2 * restante;

            BackAccountSummary();
            return;
        }
        System.out.println("Você não tem saldo e nem limite no cheque especial na conta");
    }

    public boolean isUseSpecialCheck() {
        return this.useSpecialCheck;
    }

    public void BackAccountSummary() {
        System.out.printf("Saldo: %s\nCheque Especial: %s\nCheque Especial está %s\n", getBalance(), getSpecialCheck(), isUseSpecialCheck() ? "sendo usado" : "não está sendo usado");
    }

    private void depositMoney(double value) {
        if(isUseSpecialCheck()){
           if(this.taxInSpecialCheck > value){
               //specialCheck;
           } else {

           }
           //
        }

    }

}
