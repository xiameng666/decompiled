import com.google.android.gms.people.cpg.model.GroupContactOrder;

public final class egzw {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public gged_interceptors k;
    public GroupContactOrder l;
    public eggh m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private byte v;

    public egzw() {
    }

    public egzw(egzx egzx0) {
        this.n = egzx0.a;
        this.o = egzx0.b;
        this.p = egzx0.c;
        this.q = egzx0.d;
        this.r = egzx0.e;
        this.s = egzx0.f;
        this.t = egzx0.g;
        this.a = egzx0.h;
        this.b = egzx0.i;
        this.c = egzx0.j;
        this.d = egzx0.k;
        this.e = egzx0.l;
        this.f = egzx0.m;
        this.g = egzx0.n;
        this.h = egzx0.o;
        this.i = egzx0.p;
        this.j = egzx0.q;
        this.k = egzx0.r;
        this.l = egzx0.s;
        this.u = egzx0.t;
        this.m = egzx0.u;
        this.v = -1;
    }

    public final egzx a() {
        if(this.v != -1) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.v & 1) == 0) {
                stringBuilder0.append(" isMarkedAsFavorite");
            }
            if((this.v & 2) == 0) {
                stringBuilder0.append(" isVisible");
            }
            if((this.v & 4) == 0) {
                stringBuilder0.append(" isReadOnly");
            }
            if((this.v & 8) == 0) {
                stringBuilder0.append(" isAutoAdd");
            }
            if((this.v & 16) == 0) {
                stringBuilder0.append(" isDirty");
            }
            if((this.v & 0x20) == 0) {
                stringBuilder0.append(" isDeleted");
            }
            if((this.v & 0x40) == 0) {
                stringBuilder0.append(" isShouldSync");
            }
            if((this.v & 0x80) == 0) {
                stringBuilder0.append(" needsSecondSyncPass");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new egzx(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.u, this.m);
    }

    public final void b(boolean z) {
        this.q = z;
        this.v = (byte)(this.v | 8);
    }

    public final void c(boolean z) {
        this.s = z;
        this.v = (byte)(this.v | 0x20);
    }

    public final void d(boolean z) {
        this.r = z;
        this.v = (byte)(this.v | 16);
    }

    public final void e(boolean z) {
        this.n = z;
        this.v = (byte)(this.v | 1);
    }

    public final void f(boolean z) {
        this.p = z;
        this.v = (byte)(this.v | 4);
    }

    public final void g(boolean z) {
        this.t = z;
        this.v = (byte)(this.v | 0x40);
    }

    public final void h(boolean z) {
        this.o = z;
        this.v = (byte)(this.v | 2);
    }

    public final void i(boolean z) {
        this.u = z;
        this.v = (byte)(this.v | 0xFFFFFF80);
    }
}

