import j..util.Objects;
import java.util.List;

public final class hmia {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    final hmif n;
    public final int o;
    public final int p;

    public hmia(hmif hmif0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4, byte[] arr_b5, byte[] arr_b6, byte[] arr_b7, byte[] arr_b8, byte[] arr_b9, boolean z, boolean z1, boolean z2, int v, int v1) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = arr_b3;
        this.e = arr_b4;
        this.f = arr_b5;
        this.g = arr_b6;
        this.h = arr_b7;
        this.i = arr_b8;
        this.j = arr_b9;
        this.k = z;
        this.l = z1;
        this.m = z2;
        this.o = 1;
        this.p = 1;
        Objects.requireNonNull(hmif0);
        this.n = hmif0;
        super();
    }

    public final List a() {
        return this.n.a;
    }

    public final hmib b() {
        return this.n.e;
    }
}

