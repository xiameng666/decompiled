import java.util.ArrayList;

public class jrw extends jro {
    public ArrayList aJ;

    public jrw() {
        this.aJ = new ArrayList();
    }

    public void W() {
        ArrayList arrayList0 = this.aJ;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                jro jro0 = (jro)this.aJ.get(v1);
                if((jro0 instanceof jrw)) {
                    ((jrw)jro0).W();
                }
            }
        }
    }

    public final void ab(jro jro0) {
        this.aJ.remove(jro0);
        jro0.t();
    }

    @Override  // jro
    public void t() {
        this.aJ.clear();
        super.t();
    }

    @Override  // jro
    public final void w(jrc jrc0) {
        super.w(jrc0);
        int v = this.aJ.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((jro)this.aJ.get(v1)).w(jrc0);
        }
    }
}

