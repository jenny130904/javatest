public class CURP {

    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String fechaNacimiento;
    String sexo;
    String claveEntidadFederativa;
    int homoclave;

    public CURP(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String sexo, String claveEntidadFederativa, int homoclave) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.claveEntidadFederativa = claveEntidadFederativa;
        this.homoclave = homoclave;
    }

    public String getCURP() {
        String curp = "";
        curp = curp + apellidoPaterno.substring(0,1);
        curp = curp + getPrimeraVocalApellido();
        curp = curp + apellidoMaterno.substring(0,1);
        curp = curp + nombre.substring(0,1);
        curp = curp + fechaNacimiento.substring(8,10);
        curp = curp + fechaNacimiento.substring(3,5);
        curp = curp + fechaNacimiento.substring(0,2);
        curp = curp + sexo;
        curp = curp + claveEntidadFederativa;
        curp = curp + getPrimeraConsonanteApellido();
        curp = curp + getSegundaConsonante(apellidoMaterno);
        curp = curp + getSegundaConsonante(nombre);
        curp = curp + homoclave;
        return curp;
    }
    public String getPrimeraVocalApellido(){
        String primeraVocal = "";
        for (int i = 0; i < apellidoPaterno.length(); i++){
            char letra = apellidoPaterno.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o' || letra == 'u'){
                primeraVocal = String.valueOf(letra);
                break;
            }
        }
        return primeraVocal;
    }
    public String getPrimeraConsonanteApellido(){
        String primerConsonante = "";
        for (int i = 1; i < apellidoPaterno.length(); i++){
            char letra = apellidoPaterno.toLowerCase().charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
                primerConsonante = String.valueOf(letra);
                break;
            }
        }
        return primerConsonante;
    }
    public String getSegundaConsonante(String cadena){
        String segundaConsonante = "";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.toLowerCase().charAt(i);
            contador++;
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                if(contador > 2){
                    segundaConsonante = String.valueOf(letra);
                    break;
                }
            }
        }
        return segundaConsonante;
    }
}