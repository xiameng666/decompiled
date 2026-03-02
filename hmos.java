import java.util.ArrayList;
import java.util.List;

public final class hmos {
    public hmni a;
    public hmnz b;
    public byte c;
    public byte d;
    public int e;
    public boolean f;
    public boolean g;
    public final List h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    public hmos() {
        this.h = new ArrayList();
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
    }

    public final hmni a(boolean z) {
        hmni hmni0 = this.a;
        if(hmni0 == null && z) {
            throw new hmnj(0x9D);
        }
        return hmni0;
    }

    public final void b() {
        this.f = false;
        this.e = 0;
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = null;
        this.k = false;
        this.j = false;
        this.l = false;
        this.m = false;
    }

    public final void c(hmno hmno0) {
        hmni hmni0 = this.a;
        if(hmni0 != null) {
            for(Object object0: hmni0.a) {
                ((hmnz)object0).i(hmno0);
            }
        }
        this.m = false;
    }

    public final void d(boolean z, hmno hmno0) {
        hmni hmni0 = this.a;
        if(hmni0 != null) {
            hmni0.n(z, hmno0);
        }
        this.m = false;
    }
}

