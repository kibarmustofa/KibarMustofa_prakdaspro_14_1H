public class LinearSearch14 {
 
    public static void main(String[] args) {
        
        int [] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63}; //inisialisasi
        int key = 20;
        int hasil = 0;
 
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt [i] == key) { //kondisi
                hasil = i;
                break;
            }
        }
 
        System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
    } //tampilan
    
}
