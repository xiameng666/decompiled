import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class eqnf {
    private byte[] a;

    public eqnf() {
        byte[] arr_b = new byte[4];
        this.a = arr_b;
        arr_b[0] = 1;
    }

    private eqnf(byte[] arr_b) {
        this.a = arr_b;
    }

    public final int a() {
        return this.a[2];
    }

    public static eqnf b(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
        try {
            eqnf eqnf0 = new eqnf(Base64.decode(arr_b, 0));
            return eqnf0.a.length <= 4 ? eqnf0 : null;
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public final String c() {
        try {
            return new String(Base64.encode(this.a, 3), "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public final void d(boolean z) {
        this.a[3] = z;
    }

    public final void e(int v) {
        this.a[2] = (byte)v;
    }

    public final void f(boolean z) {
        this.a[1] = z;
    }

    public final void g() {
        this.a = Arrays.copyOf(this.a, 3);
    }

    public final boolean h() {
        return this.a.length >= 4 ? this.a[3] != 0 : false;
    }

    public final boolean i() {
        return this.a[1] != 0;
    }

    @Override
    public final String toString() {
        return String.format("SourceDeviceEndpointInfo[outOfBand=%s]", Boolean.valueOf(this.i()));
    }
}

