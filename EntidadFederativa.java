public class EntidadFederativa {
    private String nombre;
    public EntidadFederativa() {
        this.nombre = "";
    }
    public void mostrarCatalogo(){
        System.out.println("1. Aguascalientes");
        System.out.println("2. Baja California");
        System.out.println("3. Baja California Sur");
        System.out.println("4. Campeche");
        System.out.println("5. Coahuila");
        System.out.println("6. Colima");
        System.out.println("7. Chiapas");
        System.out.println("8. Chihuahua");
        System.out.println("9. Ciudad de México");
        System.out.println("10. Durango");
        System.out.println("11. Guanajuato");
        System.out.println("12. Guerrero");
        System.out.println("13. Hidalgo");
        System.out.println("14. Jalisco");
        System.out.println("15. México");
        System.out.println("16. Michoacán");
        System.out.println("17. Morelos");
        System.out.println("18. Nayarit");
        System.out.println("19. Nuevo León");
        System.out.println("20. Oaxaca");
        System.out.println("21. Puebla");
        System.out.println("22. Querétaro");
        System.out.println("23. Quintana Roo");
        System.out.println("24. San Luis Potosí");
        System.out.println("25. Sinaloa");
        System.out.println("26. Sonora");
        System.out.println("27. Tabasco");
        System.out.println("28. Tamaulipas");
        System.out.println("29. Tlaxcala");
        System.out.println("30. Veracruz");
        System.out.println("31. Yucatán");
        System.out.println("32. Zacatecas");
    }
    public String getClaveEntidad(int seleccionEntidadFederativa) {
        String codigoEntidad= "";
        switch (seleccionEntidadFederativa) {
            case 1:
                codigoEntidad = "AS";
                break;
            case 2:
                codigoEntidad = "BC";
                break;
            case 3:
                codigoEntidad = "BS";
                break;
            case 4:
                codigoEntidad = "CC";
                break;
            case 5:
                codigoEntidad = "CL";
                break;
            case 6:
                codigoEntidad = "CM";
                break;
            case 7:
                codigoEntidad = "CS";
                break;
            case 8:
                codigoEntidad = "CH";
                break;
            case 9:
                codigoEntidad = "DF";
                break;
            case 10:
                codigoEntidad = "DG";
                break;
            case 11:
                codigoEntidad = "GT";
                break;
            case 12:
                codigoEntidad = "GR";
                break;
            case 13:
                codigoEntidad = "HG";
                break;
            case 14:
                codigoEntidad = "JC";
                break;
            case 15:
                codigoEntidad = "MC";
                break;
            case 16:
                codigoEntidad = "MN";
                break;
            case 17:
                codigoEntidad = "MS";
                break;
            case 18:
                codigoEntidad = "NT";
                break;
            case 19:
                codigoEntidad = "NL";
                break;
            case 20:
                codigoEntidad = "OC";
                break;
            case 21:
                codigoEntidad = "PL";
                break;
            case 22:
                codigoEntidad = "QT";
                break;
            case 23:
                codigoEntidad = "QR";
                break;
            case 24:
                codigoEntidad = "SP";
                break;
            case 25:
                codigoEntidad = "SL";
                break;
            case 26:
                codigoEntidad = "SR";
                break;
            case 27:
                codigoEntidad = "TC";
                break;
            case 28:
                codigoEntidad = "TS";
                break;
            case 29:
                codigoEntidad = "TL";
                break;
            case 30:
                codigoEntidad = "VZ";
                break;
            case 31:
                codigoEntidad = "YN";
                break;
            case 32:
                codigoEntidad = "ZS";
                break;
            default:
                codigoEntidad = "NE";
                break;
        }
        return codigoEntidad;
    }
    public String getNombreEntidad(int seleccionEntidadFederativa){
        String nombreEntidad = "";
        switch (seleccionEntidadFederativa) {
            case 1:
                nombreEntidad = "Aguascalientes";
                break;
            case 2:
                nombreEntidad = "Baja California";
                break;
            case 3:
                nombreEntidad = "Baja California Sur";
                break;
            case 4:
                nombreEntidad = "Campeche";
                break;
            case 5:
                nombreEntidad = "Coahuila";
                break;
            case 6:
                nombreEntidad = "Colima";
                break;
            case 7:
                nombreEntidad = "Chiapas";
                break;
            case 8:
                nombreEntidad = "Chihuahua";
                break;
            case 9:
                nombreEntidad = "Distrito Federal";
                break;
            case 10:
                nombreEntidad = "Durango";
                break;
            case 11:
                nombreEntidad = "Guanajuato";
                break;
            case 12:
                nombreEntidad = "Guerrero";
                break;
            case 13:
                nombreEntidad = "Hidalgo";
                break;
            case 14:
                nombreEntidad = "Jalisco";
                break;
            case 15:
                nombreEntidad = "México";
                break;
            case 16:
                nombreEntidad = "Michoacan";
                break;
            case 17:
                nombreEntidad = "Morelos";
                break;
            case 18:
                nombreEntidad = "Nayarit";
                break;
            case 19:
                nombreEntidad = "Nuevo León";
                break;
            case 20:
                nombreEntidad = "Oaxaca";
                break;
            case 21:
                nombreEntidad = "Puebla";
                break;
            case 22:
                nombreEntidad = "Queretaro";
                break;
            case 23:
                nombreEntidad = "Quintana Roo";
                break;
            case 24:
                nombreEntidad = "San Luis Potosí";
                break;
            case 25:
                nombreEntidad = "Sinaloa";
                break;
            case 26:
                nombreEntidad = "Sonora";
                break;
            case 27:
                nombreEntidad = "Tabasco";
                break;
            case 28:
                nombreEntidad = "Tamaulipas";
                break;
            case 29:
                nombreEntidad = "Tlaxcala";
                break;
            case 30:
                nombreEntidad = "Veracruz";
                break;
            case 31:
                nombreEntidad = "Yucatan";
                break;
            case 32:
                nombreEntidad = "Zacatecas";
                break;
            default:
                nombreEntidad = "Nacido en el extranjero";
                break;
        }
        return nombreEntidad;
    }
}
