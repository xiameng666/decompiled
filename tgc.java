import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class tgc implements Serializable {
    public final tik b;
    public byte[] c;

    public tgc(byte[] arr_b, tik tik0) {
        this(arr_b, true, tik0);
    }

    public tgc(byte[] arr_b, tik tik0, byte[] arr_b1) {
        this(arr_b, tik0);
    }

    protected tgc(byte[] arr_b, boolean z, tik tik0) {
        if(arr_b == null) {
            throw new IllegalArgumentException("bytes cannot be null");
        }
        if(z) {
            arr_b = (byte[])arr_b.clone();
        }
        this.c = arr_b;
        this.b = tik0;
        this.n();
    }

    public final byte a(int v) {
        return this.c[v];
    }

    public final String b(int v) {
        return this.i(v) ? "" : "not ";
    }

    public final String c(int v) {
        return this.i(v) ? "1" : "0";
    }

    public void d() {
    }

    public final void e(int v, int v1, boolean z) {
        byte[] arr_b = this.c;
        if(v >= arr_b.length) {
            throw new IndexOutOfBoundsException("byte index is out of bounds");
        }
        byte b = (byte)(arr_b[v] & ~((byte)(1 << v1)));
        if(z) {
            b = (byte)(((byte)(1 << v1)) | b);
        }
        arr_b[v] = b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(!Arrays.equals(this.c, ((tgc)object0).c)) {
            return false;
        }
        tik tik0 = ((tgc)object0).b;
        return this.b == tik0 || this.b.equals(tik0);
    }

    public final void f(byte[] arr_b) {
        this.c = (byte[])arr_b.clone();
        this.n();
        this.d();
    }

    public void g(byte[] arr_b) {
    }

    public final void h(OutputStream outputStream0) {
        outputStream0.write(this.c);
    }

    @Override
    public final int hashCode() {
        return (Arrays.hashCode(this.c) + 0x103) * 37 + this.b.hashCode();
    }

    @Deprecated
    public final boolean i(int v) {
        int v1 = this.c.length * 8;
        if(v < v1) {
            return this.j(v >> 3, 7 - (v & 7));
        }
        throw new IndexOutOfBoundsException(a.z(v1, v, "bit position ", " is out of bound "));
    }

    public final boolean j(int v, int v1) {
        byte[] arr_b = this.c;
        if(v < arr_b.length) {
            return (arr_b[v] & ((byte)(1 << v1))) != 0;
        }
        throw new IndexOutOfBoundsException("byte index is out of bounds");
    }

    public final byte[] k() {
        return (byte[])this.c.clone();
    }

    public final tfe l() {
        byte[] arr_b = this.k();
        return tfc.a(this.b.b, arr_b);
    }

    public final byte[] m(int v) {
        byte[] arr_b = this.c;
        if(v + 6 > arr_b.length) {
            throw new IllegalArgumentException();
        }
        byte[] arr_b1 = new byte[6];
        System.arraycopy(arr_b, v, arr_b1, 0, 6);
        return arr_b1;
    }

    private final void n() {
        String s;
        int v = this.k().length;
        tik tik0 = this.b;
        int v1 = tik0.c;
        if(v1 != -1 && v1 != v) {
            throw new IllegalStateException("Invalid length for data elemment " + tik0.a + "; expected " + v1 + ", but was " + v);
        }
        int v2 = tik0.d;
        if(v < v2 || v > tik0.e) {
            throw new IllegalStateException("Invalid length for data elemment " + tik0.a + "; expected between " + v2 + " and " + tik0.e + ", but was " + v);
        }
        int v3 = tik0.f;
        byte[] arr_b = this.c;
        int v4 = 0;
    alab1:
        switch(v3 - 1) {
            case 0: {
                String s1 = tjs.c(arr_b, false);
                while(true) {
                    if(v4 >= s1.length()) {
                        break alab1;
                    }
                    int v5 = s1.charAt(v4);
                    if(v5 < 0x30 || v5 > 57) {
                        throw new IllegalArgumentException("Invalid numeric value: " + tjs.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 1: {
                String s2 = tjs.c(arr_b, false);
                while(true) {
                    if(v4 >= s2.length()) {
                        break alab1;
                    }
                    int v6 = s2.charAt(v4);
                    if(v6 != 70 && (v6 < 0x30 || v6 > 57)) {
                        throw new IllegalArgumentException("Invalid compact numeric value: " + tjs.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 4: {
                String s3 = new String(arr_b);
                while(true) {
                    if(v4 >= s3.length()) {
                        break alab1;
                    }
                    int v7 = s3.charAt(v4);
                    if((v7 < 0x30 || v7 > 57) && (v7 < 97 || v7 > 0x7A) && (v7 < 65 || v7 > 90)) {
                        throw new IllegalArgumentException("Invalid alpha numeric value: " + tjs.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 5: {
                while(true) {
                    if(v4 >= arr_b.length) {
                        break alab1;
                    }
                    int v8 = arr_b[v4];
                    int v9 = v8 & 0xF0;
                    if((v8 & 15) == 15 && v9 == 7 || v9 < 2) {
                        throw new IllegalArgumentException("Invalid alpha numeric special value: " + tjs.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 2: 
            case 6: {
                break;
            }
            default: {
                switch(v3) {
                    case 1: {
                        s = "N";
                        break;
                    }
                    case 2: {
                        s = "CN";
                        break;
                    }
                    case 3: {
                        s = "B";
                        break;
                    }
                    case 4: {
                        s = "A";
                        break;
                    }
                    case 5: {
                        s = "AN";
                        break;
                    }
                    case 6: {
                        s = "ANS";
                        break;
                    }
                    default: {
                        s = "VAR";
                    }
                }
                throw new IllegalStateException("Unsupported format " + s);
            }
        }
        this.g(this.c);
    }

    @Override
    public String toString() {
        byte[] arr_b = this.c;
        switch(this.b.f - 1) {
            case 0: {
                return tjs.c(arr_b, false).replaceFirst("^0+(?!$)", "");
            }
            case 1: {
                return tjs.c(arr_b, false).replaceAll("F", "");
            }
            case 3: 
            case 4: 
            case 5: {
                return new String(arr_b);
            }
            default: {
                return tjs.c(arr_b, false);
            }
        }
    }
}

