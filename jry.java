import java.util.ArrayList;

public final class jry {
    public final ArrayList a;
    public final jrp b;
    private final jrx c;

    public jry(jrp jrp0) {
        this.a = new ArrayList();
        this.c = new jrx();
        this.b = jrp0;
    }

    public final void a(jrp jrp0) {
        ArrayList arrayList0 = this.a;
        arrayList0.clear();
        int v = jrp0.aJ.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jro jro0 = (jro)jrp0.aJ.get(v1);
            if(jro0.P() == 3 || jro0.Q() == 3) {
                arrayList0.add(jro0);
            }
        }
        jrp0.c();
    }

    public final boolean b(jss jss0, jro jro0, int v) {
        jrx jrx0 = this.c;
        jrx0.i = jro0.P();
        jrx0.j = jro0.Q();
        jrx0.a = jro0.j();
        jrx0.b = jro0.h();
        jrx0.g = false;
        jrx0.h = v;
        boolean z = jrx0.j == 3 && jro0.Y > 0.0f;
        if(jrx0.i == 3 && (jro0.Y > 0.0f) && jro0.v[0] == 4) {
            jrx0.i = 1;
        }
        if(z && jro0.v[1] == 4) {
            jrx0.j = 1;
        }
        jss0.a(jro0, jrx0);
        jro0.F(jrx0.c);
        jro0.A(jrx0.d);
        jro0.G = jrx0.f;
        jro0.x(jrx0.e);
        jrx0.h = 0;
        return jrx0.g;
    }

    public final void c(jrp jrp0, int v, int v1, int v2) {
        int v3 = jrp0.ad;
        int v4 = jrp0.ae;
        jrp0.E(0);
        jrp0.D(0);
        jrp0.F(v1);
        jrp0.A(v2);
        jrp0.E(v3);
        jrp0.D(v4);
        this.b.c = v;
        this.b.W();
    }
}

