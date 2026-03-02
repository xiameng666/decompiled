import java.util.logging.Level;
import java.util.logging.Logger;

public final class esur {
    public final boolean a;
    private static final Logger b;
    private static final String c;
    private final esut d;
    private final byte[] e;
    private int f;

    static {
        esur.b = Logger.getLogger(esur.class.getName());
        esur.c = "GPAY: esur";
    }

    public esur(esut esut0, byte[] arr_b) {
        this.f = 1;
        this.d = esut0;
        this.e = (byte[])arr_b.clone();
        this.a = this.d();
    }

    public esur(esut esut0, byte[] arr_b, int v) {
        boolean z = true;
        this.f = 1;
        this.d = esut0;
        byte[] arr_b1 = (byte[])arr_b.clone();
        this.e = arr_b1;
        this.f = v;
        if(v != 2 && v != 3 && v != 7) {
            this.a = this.d();
            return;
        }
        if(arr_b1.length <= 0) {
            z = false;
        }
        this.a = z;
    }

    public final int a() {
        return this.e[6] & 0xFF;
    }

    public final byte[] b(String s) {
        esus esus0 = this.d.a(s);
        if(esus0 == null) {
            return new byte[0];
        }
        int v = esus0.b;
        byte[] arr_b = new byte[v];
        int v1 = this.f == 2 || this.f == 3 || this.f == 6 || this.f == 7 ? esus0.c : esus0.c + 7;
        byte[] arr_b1 = this.e;
        if(v1 < arr_b1.length) {
            System.arraycopy(arr_b1, v1, arr_b, 0, Math.min(v, arr_b1.length - v1));
        }
        return arr_b;
    }

    public final byte[] c(String s) {
        int v2;
        esus esus0 = this.d.a(s);
        if(esus0 == null) {
            return new byte[0];
        }
        byte[] arr_b = this.e;
        int v = esus0.b;
        byte[] arr_b1 = new byte[v];
        int v1 = arr_b.length;
        if(this.f != 2 && this.f != 3 && this.f != 4) {
            v2 = esus0.c + 7;
            --v1;
        }
        else {
            v2 = esus0.c;
        }
        if(v2 < v1) {
            System.arraycopy(arr_b, v2, arr_b1, 0, Math.min(v, v1 - v2));
        }
        return arr_b1;
    }

    private final boolean d() {
        byte[] arr_b = this.e;
        if(arr_b.length < 8) {
            return false;
        }
        if(this.a() + 8 != arr_b.length) {
            return false;
        }
        if(arr_b[5] != 0xFFFFFF83) {
            esur.b.logp(Level.WARNING, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayutils.DOL", "isValidCommand", esur.c + "Wrong tag for PDOL");
            return false;
        }
        return true;
    }
}

