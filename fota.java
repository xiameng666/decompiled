import java.util.function.Predicate;

public final class fota {
    public String a;
    public iczv b;
    public String c;
    public Long d;
    public fowj e;
    public Predicate f;
    public fopr g;
    private boolean h;
    private idcw i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte n;

    public final fotb a() {
        if(this.n == 0x1F) {
            idcw idcw0 = this.i;
            if(idcw0 != null) {
                Predicate predicate0 = this.f;
                if(predicate0 != null) {
                    return new fotb(this.a, this.h, idcw0, this.b, this.c, this.d, this.j, this.e, this.k, this.l, predicate0, this.g, this.m);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.n & 1) == 0) {
            stringBuilder0.append(" isEventNameConstant");
        }
        if(this.i == null) {
            stringBuilder0.append(" metric");
        }
        if((this.n & 2) == 0) {
            stringBuilder0.append(" isUnsampled");
        }
        if((this.n & 4) == 0) {
            stringBuilder0.append(" shouldAttachActiveTraces");
        }
        if((this.n & 8) == 0) {
            stringBuilder0.append(" maxActiveTraces");
        }
        if(this.f == null) {
            stringBuilder0.append(" activeTracePredicate");
        }
        if((this.n & 16) == 0) {
            stringBuilder0.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.m = v;
        this.n = (byte)(this.n | 16);
    }

    public final void c(boolean z) {
        this.h = z;
        this.n = (byte)(this.n | 1);
    }

    public final void d(boolean z) {
        this.j = z;
        this.n = (byte)(this.n | 2);
    }

    public final void e(int v) {
        this.l = v;
        this.n = (byte)(this.n | 8);
    }

    public final void f(idcw idcw0) {
        if(idcw0 == null) {
            throw new NullPointerException("Null metric");
        }
        this.i = idcw0;
    }

    public final void g(boolean z) {
        this.k = z;
        this.n = (byte)(this.n | 4);
    }
}

