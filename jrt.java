import java.util.ArrayList;

public class jrt extends jro {
    public jro[] aJ;
    public int aK;

    public jrt() {
        this.aJ = new jro[4];
        this.aK = 0;
    }

    public final void X(ArrayList arrayList0, int v, jsm jsm0) {
        for(int v2 = 0; v2 < this.aK; ++v2) {
            jsm0.d(this.aJ[v2]);
        }
        for(int v1 = 0; v1 < this.aK; ++v1) {
            jsf.a(this.aJ[v1], v, arrayList0, jsm0);
        }
    }

    public void Y() {
    }
}

