public abstract class fvtm {
    private final long a;
    public static final gged_interceptors b;
    public final int c;
    protected final int d;
    protected final int e;
    public final long f;
    public final gged_interceptors g;
    public final int h;
    public final int i;
    public final int j;

    static {
        fvtm.b = ggna.a;
    }

    protected fvtm(long v, long v1, int v2, int v3, int v4, int v5, int v6, gged_interceptors gged0, int v7) {
        this.a = v;
        this.f = v1;
        this.h = v2;
        this.c = v3;
        this.d = v4;
        this.e = v5;
        this.j = v6;
        this.g = gged0;
        this.i = v7;
    }

    public abstract long a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d(fvtm arg1);

    public final int e() {
        return this.a == -1L ? 0 : ((int)(this.f - this.a));
    }

    public static int f(int v) {
        switch(v) {
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 6;
            }
            case 5: {
                return 7;
            }
            default: {
                return -1;
            }
        }
    }

    public static fvtm g() {
        return fvtm.h(-1L);
    }

    public static fvtm h(long v) {
        return new fvtl(v, v, ggna.a);
    }

    public final boolean i() {
        return this.c != -1 && this.c != 0x7FFFFFFF && this.c();
    }

    public final boolean j(fvtm fvtm0) {
        return this.c == fvtm0.c && this.d == fvtm0.d && this.e == fvtm0.e && this.h == fvtm0.h && this.j == fvtm0.j && this.d(fvtm0);
    }

    static void k(StringBuilder stringBuilder0, fvtm fvtm0) {
        if(fvtm0 == null) {
            stringBuilder0.append("null");
            return;
        }
        stringBuilder0.append("[cid: ");
        stringBuilder0.append(fvtm0.c);
        stringBuilder0.append(" mcc: ");
        stringBuilder0.append(fvtm0.d);
        stringBuilder0.append(" mnc: ");
        stringBuilder0.append(fvtm0.e);
        stringBuilder0.append(fvtm0.b());
        stringBuilder0.append(" radioType: ");
        stringBuilder0.append(fvtm.f(fvtm0.h));
        stringBuilder0.append(" signalStrength: ");
        stringBuilder0.append(fvtm0.i);
        stringBuilder0.append(" timeStamp: ");
        stringBuilder0.append(fvtm0.f);
        stringBuilder0.append(" arfcn: ");
        stringBuilder0.append(fvtm0.j);
        stringBuilder0.append(" neighbors[");
        gged_interceptors gged0 = fvtm0.g;
        int v = gged0.size();
        int v1 = 0;
        for(boolean z = true; v1 < v; z = false) {
            fvtm fvtm1 = (fvtm)gged0.get(v1);
            if(!z) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(fvtm1);
            ++v1;
        }
        stringBuilder0.append("]]");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        fvtm.k(stringBuilder0, this);
        return stringBuilder0.toString();
    }
}

