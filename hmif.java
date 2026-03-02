import java.util.ArrayList;
import java.util.List;

public final class hmif {
    public final List a;
    public hmia b;
    public hmid c;
    public hmhz d;
    public hmib e;

    public hmif() {
        this.a = new ArrayList();
    }

    public final void a(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4) {
        this.e = new hmib(this, arr_b, arr_b1, arr_b2, arr_b3, arr_b4);
    }

    public final void b(byte b, byte b1, byte[] arr_b) {
        hmic hmic0 = new hmic(this, b, b1, arr_b);
        this.a.add(hmic0);
    }

    public final void c(byte[] arr_b, byte[] arr_b1, int v, int v1) {
        this.d = new hmhz(this, arr_b, arr_b1, 3, 5);
    }

    public final void d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4, byte[] arr_b5, byte[] arr_b6, byte[] arr_b7, byte[] arr_b8, byte[] arr_b9, boolean z, boolean z1, boolean z2, int v, int v1) {
        this.b = new hmia(this, arr_b, arr_b1, arr_b2, arr_b3, arr_b4, arr_b5, arr_b6, arr_b7, arr_b8, arr_b9, z, z1, z2, 1, 1);
    }

    public final void e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4, byte[] arr_b5, byte[] arr_b6, int v, int v1) {
        this.c = new hmid(this, arr_b, arr_b1, arr_b2, arr_b3, arr_b4, arr_b5, arr_b6, 1, 1);
    }
}

