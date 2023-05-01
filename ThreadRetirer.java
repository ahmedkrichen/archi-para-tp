public class ThreadRetirer extends Thread {
    private Compte c;
    private double montant;

    
    public ThreadRetirer(double montant,Compte c) {
        this.c=c;
        this.montant=montant;
    }


    @Override
    public void run() {
        while(true)
        {
            try {
                synchronized(c){
                    if(c.getSolde()<montant)
                    {
                    
                        wait();
                    }
                    else{
                        c.retirer(montant);
                    }
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
