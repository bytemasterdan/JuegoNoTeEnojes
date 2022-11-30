public class Tablero {
    Colors console = new Colors();

    int tirarDados(String nombre ,String icono, int avanceAnterior){
        int nuevoAvance = (int) Math.floor(Math.random()*6 + 1);
        
        console.printBlue("\n"+ nombre);
        console.printWhite(" lanzo el dado.....");
        console.printWhite("\nEl dado marca : ");
        console.printRed(nuevoAvance+"\n");
        console.printWhite("\nPosicion Anterior: ");
        console.printRed(avanceAnterior+"\n");
        console.printCyan(icono + " ");
        console.printGreen(nombre);
        console.printWhite(" avanza");
        int totalAvance = nuevoAvance + avanceAnterior;
        if(totalAvance > 50){
            int avanceAux = totalAvance - 50;
            totalAvance = 50 - avanceAux;
            console.printYellow( " "+ (nuevoAvance - avanceAux));
            console.printWhite(" posiciones y retrocede");
            console.printYellow( " "+ avanceAux);
            console.printWhite(" posiciones");
        }else{
            console.printYellow( " "+ nuevoAvance);
            console.printWhite(" posiciones");
        }
        return totalAvance;
    }

    void mostrarDatos(String nombre,String icono ,int avance){
        console.printCyan("\n"+icono+ " ");
        console.printGreen(nombre);
        console.printWhite(" se encuentra en la posicion:");
        console.printRed( " "+ avance);
    }

}
