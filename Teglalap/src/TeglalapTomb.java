
public class TeglalapTomb {
	public static void main(String[] args) {
	
		int meret = 10;
		
		T�glalap teglalapok[] = new T�glalap[meret];
		
		for (int i = 0; i < teglalapok.length; i++) {
			teglalapok[i] = new T�glalap((int) (Math.random() * 9) + 2,
					(int) (Math.random() *9) + 2);
			System.out.println(teglalapok[i]);
			
		}
		int minindex = 0;
		
		for (int i = 1; i < teglalapok.length; i++) {
			if (teglalapok[minindex].nagyobbTeruletuMint(teglalapok[i]) ) {
				minindex = i;
			}
			
		}
		
		System.out.println(teglalapok[minindex]);
}
}
