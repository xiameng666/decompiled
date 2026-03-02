import java.util.Arrays;
import java.util.Locale;

public abstract class esvj {
    public final int b;

    protected esvj(int v) {
        int v1 = esvj.k(v);
        if(v1 == 1) {
            if((v & 0x1F) == 0x1F) {
                throw new esvm(v);
            }
            this.b = v;
            return;
        }
        if((v >> (v1 - 1) * 8 & 0x1F) != 0x1F) {
            throw new esvm(v);
        }
        this.b = v;
    }

    protected abstract int a(byte[] arg1, int arg2);

    public abstract int b();

    private static int c(int v) {
        if(v >= 0) {
            if(v <= 0x7F) {
                return 1;
            }
            if(v <= 0xFF) {
                return 2;
            }
            return v > 0xFFFF ? -1 : 3;
        }
        return -1;
    }

    private final int d() {
        int v = esvj.f(this.b);
        if(v != -1) {
            return v;
        }
        throw new AssertionError("Invalid tag: " + this.o());
    }

    private static int f(int v) {
        if((v & 0xFFFFFF00) == 0) {
            return 1;
        }
        if((0xFFFF0000 & v) == 0) {
            return 2;
        }
        return (v & 0xFF000000) == 0 ? 3 : -1;
    }

    protected final int i(byte[] arr_b, int v) {
        int v1 = (this.d() - 1) * 8;
        while(v1 >= 0) {
            arr_b[v] = (byte)(this.b >> v1 & 0xFF);
            v1 += -8;
            ++v;
        }
        int v2 = this.b();
        int v3 = esvj.c(v2);
        if(v3 == -1) {
            throw new esvl(v2);
        }
        if(v3 > 1) {
            --v3;
            arr_b[v] = (byte)(v3 | 0x80);
            ++v;
        }
        int v4 = (v3 - 1) * 8;
        while(v4 >= 0) {
            arr_b[v] = (byte)(v2 >> v4 & 0xFF);
            v4 += -8;
            ++v;
        }
        return this.a(arr_b, v);
    }

    public final int j() {
        int v = this.d();
        int v1 = this.b();
        int v2 = esvj.c(v1);
        if(v2 != -1) {
            return v + v2 + this.b();
        }
        throw new AssertionError("Invalid length: " + Integer.toHexString(v1));
    }

    public static int k(int v) {
        int v1 = esvj.f(v);
        if(v1 != -1) {
            return v1;
        }
        throw new esvm(v);
    }

    public final esvf l() {
        if(esvj.q(this.b)) {
            return (esvf)this;
        }
        throw new esvm("Not constructed: " + this.o());
    }

    public static esvj m(byte[] arr_b) {
        return esvj.n(arr_b, 0);
    }

    protected static esvj n(byte[] arr_b, int v) {
        esvi esvi0 = new esvi(arr_b, v);
        int v1 = esvi0.b();
        int v2 = esvi0.a();
        int v3 = esvi0.b;
        return !esvj.q(v1) ? esvg.d(v1, v2, arr_b, v3) : esvf.c(v1, v2, arr_b, v3);
    }

    public final String o() {
        return esvj.p(this.b);
    }

    public static String p(int v) {
        int v1 = 0;
        try {
            v1 = 4 - esvj.k(v);
        }
        catch(esvm unused_ex) {
        }
        Locale locale0 = Locale.US;
        return esxg.a(Arrays.copyOfRange(glwy.l(v), v1, 4)).toUpperCase(locale0);
    }

    static boolean q(int v) {
        switch(esvj.k(v)) {
            case 1: {
                return (v & 0x20) != 0;
            }
            case 2: {
                return (v & 0x2000) != 0;
            }
            case 3: {
                return (v & 0x200000) != 0;
            }
            default: {
                throw new esvm(v);
            }
        }
    }

    public final byte[] r() {
        int v = this.j();
        byte[] arr_b = new byte[v];
        int v1 = this.i(arr_b, 0);
        if(v == v1) {
            return arr_b;
        }
        throw new esvl(v, v1);
    }

    public byte[] s() {
        byte[] arr_b = new byte[this.b()];
        this.a(arr_b, 0);
        return arr_b;
    }
}

