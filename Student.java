public class Student extends Person{
    public int[] grades;

    public Student(String name, int campus, int identificador, int age, int[] grades) {
        super(name, campus, identificador, age);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double calculateAverage(){
        int suma=0;
        for(int i=0; i<grades.length; i++){
            suma= suma + grades[i];
        }
        return (double) suma / grades.length;
    }

    public char setFinalGrade(double average){
        char grade;
        int avg = (int) average;
        switch (avg / 10){
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }
        return grade;
    }

    public void displayInfo(){
        System.out.println("Nombre del estudiante: " + getName());
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Calificacion " + (i+1) + ": " + grades[i]);
        }
        double promedio = calculateAverage();
        char califiacionFinal = setFinalGrade(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + califiacionFinal);
    }

}