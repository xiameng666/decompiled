public class jrv extends jrt {
    public int aL;
    public int aM;
    public int aN;
    public int aO;
    public int aP;
    public int aQ;
    public boolean aR;
    public int aS;
    public int aT;
    protected final jrx aU;
    jss aV;

    public jrv() {
        this.aL = 0;
        this.aM = 0;
        this.aN = 0;
        this.aO = 0;
        this.aP = 0;
        this.aQ = 0;
        this.aR = false;
        this.aS = 0;
        this.aT = 0;
        this.aU = new jrx();
        this.aV = null;
    }

    public void W(int v, int v1, int v2, int v3) {
    }

    @Override  // jrt
    public final void Y() {
        for(int v = 0; v < this.aK; ++v) {
            jro jro0 = this.aJ[v];
            if(jro0 != null) {
                jro0.H = true;
            }
        }
    }

    public final void Z(int v, int v1) {
        this.aS = v;
        this.aT = v1;
    }

    protected final void aa(jro jro0, int v, int v1, int v2, int v3) {
        jss jss0;
        while((jss0 = this.aV) == null) {
            jro jro1 = this.V;
            if(jro1 == null) {
                break;
            }
            this.aV = ((jrp)jro1).aI;
        }
        this.aU.i = v;
        this.aU.j = v2;
        this.aU.a = v1;
        this.aU.b = v3;
        jss0.a(jro0, this.aU);
        jro0.F(this.aU.c);
        jro0.A(this.aU.d);
        jro0.G = this.aU.f;
        jro0.x(this.aU.e);
    }
}

