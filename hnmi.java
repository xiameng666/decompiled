import java.util.Arrays;

public final class hnmi implements hnkk {
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
    public final byte[] k;
    public final byte[] l;
    public final byte[] m;

    public hnmi(byte[] arr_b) {
        if(arr_b.length != 56) {
            throw new hnkl();
        }
        this.a = (byte[])arr_b.clone();
        this.b = Arrays.copyOfRange(arr_b, 0, 6);
        this.c = Arrays.copyOfRange(arr_b, 6, 12);
        this.d = Arrays.copyOfRange(arr_b, 12, 14);
        this.e = Arrays.copyOfRange(arr_b, 14, 19);
        this.f = Arrays.copyOfRange(arr_b, 19, 21);
        this.g = Arrays.copyOfRange(arr_b, 21, 24);
        this.h = Arrays.copyOfRange(arr_b, 24, 25);
        this.i = Arrays.copyOfRange(arr_b, 25, 29);
        this.j = Arrays.copyOfRange(arr_b, 29, 30);
        this.k = Arrays.copyOfRange(arr_b, 30, 33);
        this.l = Arrays.copyOfRange(arr_b, 33, 36);
        this.m = Arrays.copyOfRange(arr_b, 36, 56);
    }

    @Override  // hnkk
    public final byte[] a() {
        throw null;
    }
}

