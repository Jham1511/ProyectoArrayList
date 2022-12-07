package proyecto_arraylists;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Instrumentos_Comandos {

    public ArrayList<String> instrumentos = new ArrayList<>();
    public ArrayList<Integer> cantidad = new ArrayList<>();
    public ArrayList<Integer> precio = new ArrayList<>();

    public void addbutton(String instrumentos, int cantidad, int precio) {
        this.instrumentos.add(instrumentos);
        this.cantidad.add(cantidad);
        this.precio.add(precio);
    }

    public int[] buscar(String instrumentos) {
        int[] temp = new int[2];
        if (this.instrumentos.contains(instrumentos)) {
            int lugar = this.instrumentos.indexOf(instrumentos);
            temp[0] = this.cantidad.get(lugar);//cantidad
            temp[1] = this.precio.get(lugar);//precio
        }else{
            temp[0]=0;
            temp[1]=0;
        }
        return temp;
    }//si hay instrumento
}
