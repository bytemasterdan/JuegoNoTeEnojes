
public class Persona{
    String nombre;
    int avance = 0;
    private int turno;
    private String icono[] = { "\u2660", "\u2663", "\u2665", "\u2666", "\u263B"};

    Persona( String _nombre, int _turno){
        nombre = _nombre;
        turno = _turno;
    }
    
    public String getIcono() {
        return icono[turno];
    }
}
