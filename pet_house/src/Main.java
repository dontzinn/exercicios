import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static final PetMachine petMachine = new PetMachine();

    public static int option;

    public static String name;

    public static void main(String[] args){

        do{
            System.out.println("===== Escolha uma opção =====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer água");
            System.out.println("3 - Abastecer shampoo");
            System.out.println("4 - Verificar nível da água");
            System.out.println("5 - Verificar nível da shampoo");
            System.out.println("6 - Verificar se tem pet na máquina");
            System.out.println("7 - Colocar o pet na máquina");
            System.out.println("8 - Retirar o pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = sc.nextInt();
            System.out.println("=============================");


            switch (option){
                case 1 -> takeAShower();
                case 2 -> addWater();
                case 3 -> addShampoo();
                case 4 -> checkWater();
                case 5 -> checkShampoo();
                case 6 -> checkHasAPet();
                case 7 -> addPetInMachine();
                case 8 -> removePetInMachine();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while(true);

    }
    public static void takeAShower(){
        if(petMachine.hasAPet()){
            petMachine.takeAShower();
            System.out.printf("O %s tomou seu banho\n", petMachine.getNamePet());
            return;
        }
        System.out.println("Não há pet na máquina");
    }

    public static void addWater(){
        petMachine.addWater();

    }

    public static void addShampoo(){
        petMachine.addShampoo();
    }

    public static void checkWater(){
        int water = petMachine.checkWater();
        System.out.printf("Quantidade de água: %sL\n", water);
    }

    public static void checkShampoo(){
        int shampoo = petMachine.checkShampoo();
        System.out.printf("Quantidade de shampoo: %sL\n", shampoo);
    }

    public static void checkHasAPet(){
        if(petMachine.hasAPet()){
            System.out.printf("O %s está na máquina\n", petMachine.getNamePet());
            return;
        }
        System.out.println("Não tem pet na máquina");
    }

    public static void addPetInMachine(){
        if(petMachine.hasAPet()){
            System.out.println("Já tem um pet na máquina");
            return;
        }
        System.out.println("Me informe o nome do seu pet, por favor");
        name = sc.next();
        Pet pet = new Pet(name);
        petMachine.insertAPet(pet);
    }

    public static void removePetInMachine(){
        if(petMachine.hasAPet()) {
            System.out.printf("O %s vai ser retirado da máquina\n", petMachine.getNamePet());
            petMachine.removeAPet();
            return;
        }
        System.out.println("Não tem pet há ser removido da máquina");
    }
}