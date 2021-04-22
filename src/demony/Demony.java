package demony;

import java.util.concurrent.*;

	class Demon implements Runnable {
	
		private Thread[] t = new Thread[10];

		public void run() {
			
			for(int i = 0; i < t.length; i++) {
				t[i] = new Thread(new Spawn_Demonów());
				t[i].start();
				System.out.println("Demon " + i + " started  ");
			}
			for(int i = 0; i < t.length; i++)
				System.out.println("t[" + i + "] - jest Demonem = " + t[i].isDaemon() + " ");
			while(true)
				Thread.yield();
		}
		
	}


	class Spawn_Demonów implements Runnable {
		
		public void run() {
			while(true)
				Thread.yield();
		}
		
	}
 

	public class Demony {
	
		public static void main(String[] args) throws Exception {
			
			Thread d = new Thread(new Demon());
                            d.setDaemon(true);
                            d.start();
                            
                            System.out.println("Czy wątek d jest Demonem? = " + d.isDaemon() + " ");

			TimeUnit.SECONDS.sleep(1);
			
		}
	}






/*Zadanie: zmodyfikować kod poprzez dodanie włąsnej klasy wielowątkowej, której
obiekty (wątki) będzie uruchamiał demon. Wątki wykonawcze powinny wykonywać proste
czynności, np. wypisywać coś na ekranie i spać.
*/
    


