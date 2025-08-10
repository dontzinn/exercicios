public class Person {
    public static String teste;

    public static String ola(){return "ola";}

    private String name;
    private final String constante;
    private int age;

    public static void setTeste(String testeDiff){
        //Não posso usar this, pois só pode usar variáveis estáticas e elas são fora das instâncias, só sendo no próprio corpo da classe
        //this -> Não posso usar
        teste = testeDiff;
        //name = teste; -> Não é uma variável static
    }

    public Person(String name, int age, String constante){
        this.name = name;
        this.age = age;
        this.constante = constante;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public static String getTeste(){
        return teste;
    }

    public void setAge(int age){
        this.age = age;
    }

    //public void setConstante(String coonst){
        //this.constate = coonst;
    //}
}
