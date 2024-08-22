public class Conta {
    private int p1;
    private int p2;
    public int i;
   


    Conta (int p1, int p2){
        super();
        this.p1 = p1;
        this.p2 = p2; 
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP1() {
        return this.p1;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP2() {
        return this.p2;
    }

    public int contando() throws MenorException{
        
        if (p1>p2) {
            throw new MenorException();
        }

        else{
            i = this.p2 - this.p1;

            
        }
        return i; 
        
    }
}
