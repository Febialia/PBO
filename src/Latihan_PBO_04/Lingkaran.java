package Latihan_PBO_04;

public class Lingkaran {
		// 1 Variabel
	    private int jari2;
	    public Lingkaran(int jari2) {
	        this.jari2 = jari2;
	    }
	    public double getJari2() {
	        return jari2;
	    }
	    public void setJari2(int jari2) {
	        this.jari2 = jari2;
	    }
	
	    public static void main(String[] args) {
	        Lingkaran l1 = new Lingkaran(5);
	        Lingkaran l2 = l1;
	        Lingkaran l3 = new Lingkaran(7);         
	        
	        System.out.println(l1.getJari2()); // 5.0
	        System.out.println(l2.getJari2()); // 5.0
	        System.out.println(l3.getJari2()); // 7.0
	        l1 = null;
	        l2 = null;
	        l3 = null;
	        
//	        System.out.println(l1.getJari2()); // 5.0
//	        if (l2 != null) System.out.println(l2.getJari2()); //setelah ditambah if
//	        System.out.println(l3.getJari2()); // 7.0
	    }	
}