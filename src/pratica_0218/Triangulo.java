package pratica_0218;

public class Triangulo {
    private Reta AB;
    private Reta BC;
    private Reta CA;

    public Triangulo(Reta AB, Reta BC, Reta CA)
    {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }

    public Reta getAB() {
        return AB;
    }

    public void setAB(Reta AB) {
        this.AB = AB;
    }

    public Reta getBC() {
        return BC;
    }

    public void setBC(Reta BC) {
        this.BC = BC;
    }

    public Reta getCA() {
        return CA;
    }

    public void setCA(Reta CA) {
        this.CA = CA;
    }

    public boolean isEq()
    {
        if(this.AB.distancia() == this.BC.distancia() && this.BC.distancia() == this.CA.distancia()){ return true; }
        else { return false; }

    }
}
