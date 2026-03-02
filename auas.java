import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

final class auas extends InputStream implements InputStreamRetargetInterface {
    public int a;
    private final auar b;

    public auas(auar auar0) {
        this.b = auar0;
    }

    @Override
    public final int available() {
        return this.a;
    }

    @Override
    public final int read() {
        if(this.a != 0) {
            Byte byte0 = this.b.b() > 0 ? this.b.a() : null;
            if(byte0 != null) {
                --this.a;
                return (byte)byte0;
            }
        }
        return -1;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(v < 0 || v1 < 0 || v + v1 > arr_b.length) {
            throw new IndexOutOfBoundsException();
        }
        int v2 = this.a;
        if(v1 > v2) {
            v1 = v2;
        }
        if(v2 != 0) {
            auar auar0 = this.b;
            if(auar0.b() >= v1) {
                int v3 = Math.min(v1, (auar0.e ? 0 : (auar0.b < auar0.c ? auar0.c : auar0.a.length) - auar0.b));
                byte[] arr_b1 = auar0.a;
                System.arraycopy(arr_b1, auar0.b, arr_b, v, v3);
                auar0.d(v3);
                int v4 = v1 - v3;
                if(v4 > 0) {
                    System.arraycopy(arr_b1, auar0.b, arr_b, v + v3, v4);
                    auar0.d(v4);
                }
                this.a -= v1;
                return v1;
            }
        }
        return -1;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

