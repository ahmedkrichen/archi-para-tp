public class Test {
    public static void main(String[] args) {
        Compte c=new Compte(0);
        ThreadDeposer td=new ThreadDeposer(100,c);
        ThreadRetirer tr=new ThreadRetirer(100,c);
        td.start();
        tr.start();
        System.out.println(c.getSolde());
    } 
}
