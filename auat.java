import java.io.IOException;
import java.io.OutputStream;

final class auat extends OutputStream {
    private final auar a;

    public auat(auar auar0) {
        this.a = auar0;
    }

    @Override
    public final void write(int v) {
        auar auar0 = this.a;
        if(auar0.c() <= 0) {
            throw new IOException("Buffer overflow");
        }
        auar0.g(((byte)(v & 0xFF)));
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        auar auar0 = this.a;
        if(auar0.c() < v1) {
            throw new IOException("Buffer overflow");
        }
        int v2 = Math.min(v1, (auar0.e ? auar0.a.length : (auar0.c < auar0.b ? auar0.b : auar0.a.length) - auar0.c));
        byte[] arr_b1 = auar0.a;
        System.arraycopy(arr_b, v, arr_b1, auar0.c, v2);
        auar0.e(v2);
        int v3 = v1 - v2;
        if(v3 > 0) {
            System.arraycopy(arr_b, v + v2, arr_b1, auar0.c, v3);
            auar0.e(v3);
        }
    }
}

