public class ThreadDeposer extends Thread {

    private Compte c;
    private double montant;

    
    public ThreadDeposer(double montant,Compte c) {
        this.c=c;
        this.montant=montant;
    }


    @Override
    public void run() {
        while(true)
        {
            synchronized(c){
                c.deposer(montant);
            }
        }
        
    }
   
}
