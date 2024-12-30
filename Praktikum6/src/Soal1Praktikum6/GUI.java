package Soal1Praktikum6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class GUI {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("2312345678", "Adiyaus", " "),
            new Mahasiswa("2323456781", "Salwaliya", " "),
            new Mahasiswa("2334567812", "Husein"," "),
            new Mahasiswa("2345678123", "Basma"," "),
            new Mahasiswa("2356781234", "Gusti"," "),
            new Mahasiswa("2367812345", "Elma"," "),
            new Mahasiswa("2378123456", "Fatih"," "),
            new Mahasiswa("2381234567", "Rasya"," "),
            new Mahasiswa("2391234567", "Fawwaz"," "),
            new Mahasiswa("2301234567", "Pamel"," ")
        };

        String[] kolom = {"NIM", "Nama", " "};
        String[][] data = new String[mahasiswaList.length][2];
        for (int i = 0; i < mahasiswaList.length; i++) {
            data[i][0] = mahasiswaList[i].getNim();
            data[i][1] = mahasiswaList[i].getNama();
        }

        DefaultTableModel model = new DefaultTableModel(data, kolom);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
