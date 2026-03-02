public class bepj extends lsb {
    public static final gged_interceptors a;
    public static final gged_interceptors b;
    public final lqi c;
    public final lqi d;
    public final lqi e;
    public final lqi f;
    public int g;
    public gged_interceptors h;

    static {
        bepj.a = gged_interceptors.r(bevt.a, bevt.b, bevt.c, bevt.d, bevt.e, bevt.f, bevt.g);
        bepj.b = gged_interceptors.o(bevt.h, bevt.i, bevt.j, bevt.k);
    }

    public bepj() {
        this.c = new lqi();
        this.d = new lqi();
        this.e = new lqi();
        this.f = new lqi(Boolean.valueOf(false));
        this.g = -1;
    }

    public final void a() {
        int v = this.g;
        gged_interceptors gged0 = this.h;
        if(v < ((ggna)gged0).c - 1) {
            this.g = v + 1;
            bevt bevt0 = (bevt)gged0.get(v + 1);
            this.c.l(bevt0);
            this.b();
            return;
        }
        this.f.l(Boolean.valueOf(true));
    }

    public final void b() {
        bevt bevt0 = (bevt)this.c.ij();
        boolean z = true;
        boolean z1 = bevt0 != null && !bevt0.equals(bevt.h) && this.g > 0;
        this.d.l(Boolean.valueOf(z1));
        lqi lqi0 = this.e;
        if(this.g >= ((ggna)this.h).c - 1) {
            z = false;
        }
        lqi0.l(Boolean.valueOf(z));
    }
}

