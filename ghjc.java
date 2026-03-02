import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public abstract class ghjc {
    public static final ghjc d;
    public static final ghjc e;
    public static final ghjc f;

    static {
        Character character0 = Character.valueOf('=');
        ghjc.d = new ghiw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", character0);
        ghjc.e = new ghiw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", character0);
        new ghjb("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", character0);
        new ghjb("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", character0);
        ghjc.f = new ghiv(new ghiu("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] arg1, CharSequence arg2);

    public abstract void c(Appendable arg1, byte[] arg2, int arg3, int arg4);

    public abstract int d(int arg1);

    public abstract ghjc e();

    public abstract ghjc f();

    public abstract ghjc g();

    public abstract ghjc h();

    public abstract ghjc i(String arg1, int arg2);

    public abstract OutputStream j(Writer arg1);

    public CharSequence k(CharSequence charSequence0) {
        throw null;
    }

    public abstract boolean l(CharSequence arg1);

    public abstract ghjc m();

    public final String o(byte[] arr_b) {
        return this.p(arr_b, 0, arr_b.length);
    }

    public final String p(byte[] arr_b, int v, int v1) {
        gftb.p(v, v + v1, arr_b.length);
        StringBuilder stringBuilder0 = new StringBuilder(this.d(v1));
        try {
            this.c(stringBuilder0, arr_b, v, v1);
            return stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public final byte[] q(CharSequence charSequence0) {
        try {
            CharSequence charSequence1 = this.k(charSequence0);
            int v = this.r(charSequence1.length());
            byte[] arr_b = new byte[v];
            int v1 = this.a(arr_b, charSequence1);
            if(v1 == v) {
                return arr_b;
            }
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, 0, arr_b1, 0, v1);
            return arr_b1;
        }
        catch(ghix ghix0) {
            throw new IllegalArgumentException(ghix0);
        }
    }

    public abstract int r(int arg1);
}

