package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        LocalDate dt = LocalDate.parse("2023-11-01");
        Galeria g1 = new Galeria();
        g1.felvesz(new KiallitasTargy("Marcell", "valami cim"));
        g1.felvesz(new KiallitasTargy(dt, "Ádám", "Föld alatti egerek"));
        g1.felvesz(new KiallitasTargy("Jakab", "Szép az ég"));
        g1.felvesz(new Festmeny("János", "virágok", ""));

        System.out.println(g1.toString());
        Galeria[] galeria = {g1};

        System.out.println("cim szerinti rendezés:");
        System.out.println(g1.CimSzerintRendez());

        System.out.println("Keszítő szerint rendezés");
        System.out.println(g1.KeszitoSzerintRendez());
        
        System.out.println("Állapotmentés");
        System.out.println(g1);
        allapotMentes(g1);
        
        System.out.println(g1.CimSzerintRendez());
        allapotMentes(g1);
        System.out.println("Beolvasás");
        beolvas();
    }

    public static void kiir(Galeria[] galeria) {
        for (Galeria galeria1 : galeria) {
            System.out.println(galeria1);
        }
    }

    public static void allapotMentes(Galeria h) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("galeria.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(h);
    }

    public static void beolvas() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("galeria.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        Galeria h = (Galeria) objectIn.readObject();
        objectIn.close();
        System.out.println(h);
    }
}
