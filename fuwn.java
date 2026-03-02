import java.nio.ByteBuffer;

final class fuwn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Comparable[] f;
    public final ByteBuffer g;
    public final int[] h;

    public fuwn(Comparable[] arr_comparable, ByteBuffer byteBuffer0, long v) {
        this.f = arr_comparable;
        this.g = byteBuffer0;
        byteBuffer0.rewind();
        long v1 = byteBuffer0.getLong();
        if(v1 != v) {
            throw new RuntimeException(a.J(v1, v, "Wrong version in model data. Expected ", ", found "));
        }
        this.a = byteBuffer0.getInt();
        this.b = byteBuffer0.getInt();
        this.c = byteBuffer0.getInt();
        this.d = byteBuffer0.getInt();
        this.e = byteBuffer0.getInt();
        int v2 = byteBuffer0.getInt();
        this.h = new int[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = byteBuffer0.getInt();
            this.h[v3] = byteBuffer0.position();
            byteBuffer0.position(this.h[v3] + v4);
        }
    }
}

