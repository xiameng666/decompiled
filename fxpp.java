import android.content.Context;
import java.util.function.Supplier;

public final class fxpp {
    public final bbng a;
    public final bboh b;
    public final fxpn c;
    public int d;
    public int e;
    private final Context f;
    private final fxpo g;
    private final Supplier h;
    private final int i;

    public fxpp(Context context0, int v, bbng bbng0, bboh bboh0, fxpo fxpo0, Supplier supplier0, Supplier supplier1) {
        this.d = 2;
        this.e = 2;
        this.f = context0;
        this.i = v;
        this.a = bbng0;
        this.b = bboh0;
        this.g = fxpo0;
        this.h = supplier0;
        this.c = new fxpn(this, supplier1);
    }

    public final void a(int v) {
        this.d(4, fxpp.e(v));
    }

    public final void b() {
        this.d(5, 3);
    }

    public final void c(int v) {
        this.d(3, fxpp.e(v));
    }

    private final void d(int v, int v1) {
        if(v == this.d && v1 == this.e) {
            return;
        }
        bbng bbng0 = this.a;
        long v2 = bbng0.b();
        int v3 = this.d;
        if(v3 == 0) {
            throw null;
        }
        int v4 = this.e;
        if(v4 == 0) {
            throw null;
        }
        int v5 = ((fxob)this.h.get()).b.c;
        String s = bbpg.a(this.f);
        this.g.l(this.i, v3, v4, v, v1, v2, v5, s);
        fxpn fxpn0 = this.c;
        long v6 = bbng0.a();
        if(((Boolean)fxpn0.a.get()).booleanValue()) {
            fxpn0.e(v - 1, String.valueOf(v1 - 1));
            fxpn0.e = v6;
            if(v == 3) {
                fxpn0.i = v1;
                long v7 = fxpn0.h.a.a();
                fxpn0.c = v7;
                if(fxpn0.j == 2) {
                    fxpn0.j = fxpn0.i;
                    fxpn0.d = v7;
                }
            }
            else if(v == 5) {
                fxpn0.g = v6;
                if(fxpn0.f == -1L) {
                    fxpn0.f = v6;
                }
            }
        }
        this.d = v;
        this.e = v1;
    }

    private static final int e(int v) {
        switch(v) {
            case -1: {
                return 1;
            }
            case 0: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 2: {
                return 8;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 6;
            }
            case 5: {
                return 9;
            }
            case 6: {
                return 12;
            }
            case 7: {
                return 13;
            }
            case 8: {
                return 14;
            }
            case 9: {
                return 15;
            }
            case 10: {
                return 16;
            }
            case 11: {
                return 17;
            }
            case 12: {
                return 18;
            }
            case 13: {
                return 19;
            }
            case 14: {
                return 10;
            }
            case 15: {
                return 11;
            }
            case 16: {
                return 20;
            }
            case 17: {
                return 21;
            }
            case 18: {
                return 22;
            }
            case 19: {
                return 24;
            }
            case 20: {
                return 25;
            }
            case 21: {
                return 26;
            }
            case 22: {
                return 27;
            }
            case 23: {
                return 28;
            }
            case 24: {
                return 29;
            }
            case 25: {
                return 30;
            }
            case 26: {
                return 0x1F;
            }
            case 27: {
                return 0x20;
            }
            case 28: {
                return 33;
            }
            case 29: {
                return 34;
            }
            case 30: {
                return 35;
            }
            case 0x1F: {
                return 36;
            }
            case 0x20: {
                return 37;
            }
            case 33: {
                return 38;
            }
            case 34: {
                return 39;
            }
            case 35: {
                return 40;
            }
            case 36: {
                return 41;
            }
            case 37: {
                return 42;
            }
            case 38: {
                return 43;
            }
            case 39: {
                return 44;
            }
            case 40: {
                return 45;
            }
            default: {
                return 46;
            }
        }
    }
}

