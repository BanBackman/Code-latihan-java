import java.util.ArrayList;
import java.util.Scanner; 


public class runningtime {

        public static void main(String[] args) {

            Mahasiswa mahasiswa = new Mahasiswa ();

            Scanner scanner = new Scanner (System.in);

            System.out.println("Nama:");
            String nama = scanner.nextLine();

            System.out.println("NIM:");
            String nim = scanner.nextLine();


            mahasiswa.setNama(nama);
            mahasiswa.setNim(nim);

            String ulang;

            do{
                Matakuliah matakuliah1 = new Matakuliah();
                System.out.println("Mata Kuliah:");
                String nmMK = scanner.nextLine();
                matakuliah1.setNama(nmMK);

                System.out.println("Nilai:");
                float nilai = Float.parseFloat(scanner.nextLine());
                matakuliah1.setNilai(nilai);

                System.out.println("SKS:");
                int sks = Integer.parseInt(scanner.nextLine());
                matakuliah1.setSKS(sks);

                mahasiswa.addMatakuliah(matakuliah1);

                System.out.println("Ketik 'y' untuk menambah matakuliah:");
                ulang = scanner.nextLine();

            }while(ulang.equals("y"));

            System.out.println("Nama \b:"+mahasiswa.getNama());
            System.out.println("NIM \b:"+mahasiswa.getNim());

            System.out.println("Matakuliah yang diambil:");
            System.out.println("========================");

            ArrayList<Matakuliah> matakuliahMhs = mahasiswa.getMatakuliah();

            for(int i = 0;i<mahasiswa.getMatakuliah().size();i++) {
                System.out.println(matakuliahMhs.get(i).getNama ()+" "
                                    +matakuliahMhs.get(i).getSks ()+" "
                                    +matakuliahMhs.get(i).getNilai ()) ;
            }
        }
}