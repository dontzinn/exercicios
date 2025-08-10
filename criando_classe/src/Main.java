import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final Person male = new Person("João", 21, "teste");
        //male = new Person("João", 23, "teste4"); é uma constante e não é possível criar uma nova instância em cima de uma já criado com keyword final.
        male.setName("dont"); // Mas podemos alterar propriedades que há dentro dela porque já tem métodos que fazem essa substituição, mas não está instânciando algo a instância criada
        Person.setTeste("teste");
        male.setName("João");
        male.setAge(21);

        Person female = new Person("Maria",21, "teste");
        female.setName("Maria");
        female.setAge(21);

        System.out.println("Male name: " + male.getName() + " Age: " + male.getTeste());
        System.out.println("Female name: " + female.getName() + " Age: " + female.getAge());
    }
}