import android.util.Base64;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class hmgz implements hmhh {
    public byte[] a;
    private static final char[] b;

    static {
        hmgz.b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public hmgz(byte b) {
        this.a = new byte[]{b};
    }

    public hmgz(char c) {
        byte[] arr_b = new byte[2];
        this.a = arr_b;
        arr_b[0] = (byte)(c >> 8);
        arr_b[1] = (byte)(c & 0xFF);
    }

    public hmgz(int v) {
        this.a = new byte[v];
    }

    public hmgz(String s) {
        if(s != null && !s.isEmpty() && !s.equals("0x")) {
            if(s.startsWith("0x")) {
                s = s.substring(2);
            }
            if(s.length() % 2 != 0) {
                s = "0" + s;
            }
            if(!Pattern.compile("^([A-Fa-f0-9]{2})+$", 2).matcher(s).matches()) {
                throw new IllegalArgumentException(a.a(s, "invalid hex string [", "]"));
            }
            int v1 = s.length();
            this.a = new byte[v1 / 2];
            for(int v = 0; v < v1; v += 2) {
                this.a[v / 2] = (byte)((Character.digit(s.charAt(v), 16) << 4) + Character.digit(s.charAt(v + 1), 16));
            }
            return;
        }
        this.a = new byte[0];
    }

    public hmgz(byte[] arr_b, int v) {
        byte[] arr_b1 = new byte[v];
        this.a = arr_b1;
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
    }

    public final byte a(int v) {
        return this.a[v];
    }

    public final int b() {
        return this.a.length;
    }

    public final hmgz c(int v, int v1) {
        if(v < 0) {
            throw new hmdl("The \'from\' index cannot be negative");
        }
        byte[] arr_b = this.a;
        if(v1 > arr_b.length) {
            throw new hmdl("The \'to\' index cannot be beyond");
        }
        if(v <= v1) {
            return new hmgz(Arrays.copyOfRange(arr_b, v, v1), v1 - v);
        }
        throw new hmdl("The \'from\' is greater than \'to\'");
    }

    @Override
    public final Object clone() {
        return hmgz.d(this);
    }

    public static hmgz d(hmgz hmgz0) {
        return new hmgz(hmgz0.a, hmgz0.a.length);
    }

    public static hmgz e(byte[] arr_b) {
        return new hmgz(arr_b, arr_b.length);
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a == null || !(object0 instanceof hmgz) ? super.equals(object0) : this.q(((hmgz)object0));
    }

    public final String f() {
        return Base64.encodeToString(this.a, 2);
    }

    @Override  // hmhh
    public final void g() {
        this.k();
    }

    public final String h() {
        String s = hmgw.g(this);
        if(s.length() > 8) {
            StringBuilder stringBuilder0 = new StringBuilder(s);
            int v = stringBuilder0.length();
            while(true) {
                v += -8;
                if(v <= 0) {
                    break;
                }
                stringBuilder0.insert(v, ' ');
            }
            return stringBuilder0.toString();
        }
        return s;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : Arrays.hashCode(this.a);
    }

    public final String i() {
        byte[] arr_b = this.a;
        if(arr_b != null) {
            try {
                char[] arr_c = new char[arr_b.length + arr_b.length];
                int v1 = 0;
                for(int v = 0; true; ++v) {
                    byte[] arr_b1 = this.a;
                    if(v >= arr_b1.length) {
                        break;
                    }
                    int v2 = arr_b1[v];
                    int v3 = v1 + 1;
                    arr_c[v1] = hmgz.b[v2 >>> 4 & 15];
                    v1 += 2;
                    arr_c[v3] = hmgz.b[v2 & 15];
                }
                return new String(arr_c);
            }
            catch(Exception unused_ex) {
                throw new IllegalArgumentException("Invalid Input");
            }
        }
        return "";
    }

    public final String j() {
        return new String(this.a);
    }

    public final void k() {
        byte[] arr_b = this.a;
        if(arr_b != null) {
            Arrays.fill(arr_b, 0);
        }
    }

    public final void l(int v) {
        byte[] arr_b = this.a;
        if(v > arr_b.length) {
            byte[] arr_b1 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            this.a = arr_b1;
        }
    }

    public final void m(int v, byte b) {
        this.a[v] = b;
    }

    public final void n(int v, byte[] arr_b) {
        byte[] arr_b1 = this.a;
        if(v + arr_b.length > arr_b1.length) {
            throw new hmdl("Not enough space in destination array");
        }
        System.arraycopy(arr_b, 0, arr_b1, v, arr_b.length);
    }

    public final void o(int v, byte[] arr_b, int v1, int v2) {
        byte[] arr_b1 = this.a;
        if(v + v2 > arr_b1.length) {
            throw new hmdl("Not enough space in destination array");
        }
        System.arraycopy(arr_b, v1, arr_b1, v, v2);
    }

    public final boolean p() {
        return this.a.length == 0;
    }

    public final boolean q(hmgz hmgz0) {
        return Arrays.equals(this.a, hmgz0.a);
    }

    public final void r(byte b) {
        int v = this.a.length;
        this.l(v + 1);
        this.a[v] = b;
    }

    public final void s(byte[] arr_b) {
        int v = this.a.length;
        this.l(arr_b.length + v);
        try {
            this.n(v, arr_b);
        }
        catch(hmdl unused_ex) {
        }
    }

    public final void t(int v) {
        if(this.a.length >= v) {
            return;
        }
        byte[] arr_b = new byte[v];
        Arrays.fill(arr_b, 0);
        System.arraycopy(this.a, 0, arr_b, v - this.a.length, this.a.length);
        this.a = arr_b;
    }

    @Override
    public final String toString() {
        return "MChipByteArray";
    }

    public final void u(int v, int v1) {
        this.m(v, ((byte)(~(1 << v1) & this.a(v))));
    }

    public final void v(hmgz hmgz0) {
        this.s(hmgz0.a);
    }
}

