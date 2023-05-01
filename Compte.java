public class Compte {
    private double solde=100;

    public Compte(double solde) {
        this.solde = solde;
    }
    public Compte() {}

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    
    public synchronized void deposer(double montant){
        
        solde+=montant;
        notifyAll();
    }

    public synchronized void retirer(double montant)
    {
        if(solde>=montant)
        {
            solde-=montant;
        }
    
    }

   public void consulter(){
    System.out.println("Votre solde est: "+solde);
   } 


    
}
