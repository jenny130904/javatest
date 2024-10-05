public class Person {
    /*Modificador de Acceso
      private: solo son visibles y editables dentro de la clase
      protected
      public*/
    //Encapsulamiento al proteger los atributos haciendolo mas seguro
    //Herencia: cuando se pasan los atributos a otra clase
    //Atributos compartidos de Teacher y student

    private String name;
    private int age;
    private int identificador;
    private int campus;

    //Constructor: metodos igual que la clase
    public Person(String name, int campus, int identificador, int age) {
        this.name = name;
        this.campus = campus;
        this.identificador = identificador;
        this.age = age;
    }

    public Person(String name, int identificador) {
        this.name = name;
        this.identificador = identificador;
    }

    public Person(String name, int age, int identificador) {
        this.name = name;
        this.age = age;
        this.identificador = identificador;
    }
    //Metodos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    //Obtener informacion
    public int getCampus() {
        return campus;
    }
    //Modificar informacion
    public void setCampus(int campus) {
        this.campus = campus;
    }
    //Desplegar informacion
    public void displayInfo(){
        System.out.println("\n El nombre es " + name + " con id " + identificador);
        if(age>0){
            System.out.println("\t tiene " + age + " años");
        }
    }
}
