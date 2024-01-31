import java.util.Arrays;
import java.util.List;

public class Paraula{


    private final String[] paraula = new String[]{("Perro"),("gato"),("oca"),("hola"),("adios")};
    public Paraula() {
    }

    public String[] getParaula() {
        return paraula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paraula paraula1 = (Paraula) o;
        return Arrays.equals(paraula, paraula1.paraula);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(paraula);
    }

}
