public class PetMachine {
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;
    private boolean machineIsClean = true;

    public PetMachine(){}

    public void takeAShower() {
        if(this.water <= 0 && this.shampoo <= 0 ){
            System.out.println("Não tem shampoo e água para lavar, necessário reabastecer");
        }else if(this.water <= 0){
            System.out.print("Máquina está sem água, por favor, reabasteça ");
            return;
        } else if (this.shampoo <= 0) {
            System.out.print("Máquina está sem shampoo, por favor, reabasteça ");
            return;
        } else if(this.pet != null) {
            this.pet.setClean(true);
            this.water -= 10;
            this.shampoo -= 2;
            this.machineIsClean = true;
            return;
        }
    }

    public void addWater(){
        if(this.water >= 30){
            System.out.print("Máquina já está na sua capacidade máxima de água\n");
            return;
        }
        this.water += 2;
        System.out.println("Foi abastecido 2 litro(s) de água");
    }

    public void addShampoo(){
        if(this.shampoo >= 10){
            System.out.print("Máquina já está na sua capacidade máxima de shampoo\n");
            return;
        }
        this.shampoo += 2;
        System.out.println("Foi abastecido 2 litro(s) de shampoo");
    }

    public int checkWater(){
        return this.water;
    }

    public int checkShampoo(){ return this.shampoo; }

    public boolean hasAPet(){
        if(this.pet != null){
            return true;
        }
        return false;
    }

    public void insertAPet(Pet pet){
        this.pet = pet;
        System.out.printf("O %s está na maquina de lavar para ficar limpinho\n", this.pet.getName());
    }

    public void removeAPet(){
        if(hasAPet()){
            System.out.printf("Tchau %s\n", this.pet.getName());
            this.machineIsClean = this.pet.isClean();
            this.pet = null;
            return;
        }
        System.out.println("Não tem pet na máquina");
    }

    public void cleanMachine(){
        if(hasAPet()){
            System.out.printf("Retire o %s da máquina, assim será levada\n", this.pet.getName());
            return;
        } else if (this.shampoo <= 0 && this.water <= 0){
            System.out.println("Não tem shampoo e água para lavar, necessário reabastecer");
            return;
        } else if (this.water <= 0) {
            System.out.println("Não tem água para lavar, necessário reabastecer");
            return;
        } else if(this.shampoo <= 0){
            System.out.println("Não tem shampoo para lavar, necessário reabastecer");
            return;
        } else if (this.machineIsClean) {
            System.out.println("Máquina já está limpa");
            return;
        }
        System.out.println("Máquina será lavada");
        this.water -= 3;
        this.shampoo -= 1;
        this.machineIsClean = true;
    }

    public String getNamePet(){
        return this.pet.getName();
    }
}
