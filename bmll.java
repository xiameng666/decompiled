public final class bmll {
    public static final ghjc a;
    public static final hhrn b;
    public static final hhrn c;
    public static final hhrn d;
    public final ByteString e;
    public final ByteString f;
    public final ByteString g;
    public final ByteString h;
    public final String i;

    static {
        bmll.a = ghjc.f;
        bmll.b = new hhrn(1L);
        bmll.c = new hhrn(2L);
        bmll.d = new hhrn(3L);
    }

    public bmll(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, String s) {
        this.e = ByteString.copyFrom(arr_b);
        this.f = ByteString.copyFrom(arr_b1);
        this.g = ByteString.copyFrom(arr_b2);
        this.h = ByteString.copyFrom(arr_b3);
        this.i = s;
    }

    @Override
    public final String toString() {
        return "FcmDataComponents{routingId=" + this.e.toString() + ", tunnelId=" + this.f.toString() + ", linkId=" + this.g.toString() + ", clientNonce=" + this.h.toString() + ", hint=\'" + this.i + "\'}";
    }
}

