import java.io.IOException;

public final class ghdx implements ggyy {
    public static final ghdx a;

    static {
        ghdx.a = new ghdx();
    }

    public final ghdw a(ggxh ggxh0, ggxj ggxj0) {
        long v3;
        int v2;
        int v1;
        try {
            long v = ggxg.b(ggxh0, ggxj0);
            if(v < 0L) {
                throw new IOException(a.u(v, "Invalid input data, totalBytes = "));
            }
            v1 = glwy.a(v >> 3);
            v2 = glwy.a((v & 7L) + 1L);
            v3 = ggxj0.a;
            long v4 = ((long)v1) * ((long)v2) + v3;
            ggxj0.a = v4;
        }
        catch(ArrayIndexOutOfBoundsException | IllegalArgumentException exception0) {
            throw new IOException("Input data invalid or too short.", exception0);
        }
        if(v4 <= ggxh0.b()) {
            return new ghdw(this, ggxh0, v3, v2, v1);
        }
        throw new IOException(String.format("Decoding from \'data\' with length %s bytes, but %s bytes are required.", ggxh0.b(), ((long)ggxj0.a)));
    }

    @Override  // ggyy
    public final Object b(ggxh ggxh0, ggxj ggxj0) {
        return this.a(ggxh0, ggxj0);
    }
}

