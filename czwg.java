public final class czwg {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public czwg(byte b, byte b1, byte b2, byte b3, byte[] arr_b, int v) {
        this.a = b;
        this.b = b1;
        this.c = b2;
        this.d = b3;
        this.g = arr_b;
        this.i = czwi.b(v);
        byte[] arr_b1 = czwi.b(arr_b.length);
        this.f = arr_b1;
        int v1 = 1;
        this.e = arr_b1.length == 2 ? new byte[1] : new byte[0];
        if(arr_b1.length != 0 || v <= 0xFF) {
            v1 = 0;
        }
        this.h = new byte[v1];
    }
}

