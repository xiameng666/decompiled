import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class ttk implements Serializable {
    public final tvr d;
    public byte[] e;

    public ttk(byte[] arr_b, tvr tvr0) {
        this(arr_b, true, tvr0);
    }

    public ttk(byte[] arr_b, tvr tvr0, byte[] arr_b1) {
        this(arr_b, tvr0);
    }

    protected ttk(byte[] arr_b, boolean z, tvr tvr0) {
        if(arr_b == null) {
            throw new IllegalArgumentException("bytes cannot be null");
        }
        if(z) {
            arr_b = (byte[])arr_b.clone();
        }
        this.e = arr_b;
        this.d = tvr0;
        this.b();
    }

    private final void b() {
        int v = this.r().length;
        tvr tvr0 = this.d;
        int v1 = tvr0.c;
        if(v1 != -1 && v1 != v) {
            throw new IllegalStateException("Invalid length for data elemment " + tvr0.a + "; expected " + v1 + ", but was " + v);
        }
        int v2 = tvr0.d;
        if(v < v2 || v > tvr0.e) {
            throw new IllegalStateException("Invalid length for data elemment " + tvr0.a + "; expected between " + v2 + " and " + tvr0.e + ", but was " + v);
        }
        int v3 = tvr0.f;
        byte[] arr_b = this.e;
        int v4 = 0;
    alab1:
        switch(v3 - 1) {
            case 0: {
                String s = twz.c(arr_b, false);
                while(true) {
                    if(v4 >= s.length()) {
                        break alab1;
                    }
                    int v5 = s.charAt(v4);
                    if(v5 < 0x30 || v5 > 57) {
                        throw new IllegalArgumentException("Invalid numeric value: " + twz.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 1: {
                String s1 = twz.c(arr_b, false);
                while(true) {
                    if(v4 >= s1.length()) {
                        break alab1;
                    }
                    int v6 = s1.charAt(v4);
                    if(v6 != 70 && (v6 < 0x30 || v6 > 57)) {
                        throw new IllegalArgumentException("Invalid compact numeric value: " + twz.b(arr_b));
                    }
                    ++v4;
                    continue;
                }
            }
            case 4: {
                String s2 = new String(arr_b);
                while(true) {
                    if(v4 >= s2.length()) {
                        break alab1;
                    }
                    int v7 = s2.charAt(v4);
                    if((v7 < 0x30 || v7 > 57) && (v7 < 97 || v7 > 0x7A) && (v7 < 65 || v7 > 90)) {
                        throw new IllegalArgumentException("Invalid alpha numeric value: " + twz.b(arr_b));
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
                        throw new IllegalArgumentException("Invalid alpha numeric special value: " + twz.b(arr_b));
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
                throw new IllegalStateException("Unsupported format " + tvs.a(v3));
            }
        }
        this.n(this.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(!Arrays.equals(this.e, ((ttk)object0).e)) {
            return false;
        }
        tvr tvr0 = ((ttk)object0).d;
        return this.d == tvr0 || this.d.equals(tvr0);
    }

    public void fu() {
    }

    @Override
    public final int hashCode() {
        return (Arrays.hashCode(this.e) + 0x103) * 37 + this.d.hashCode();
    }

    public final byte i(int v) {
        return this.e[v];
    }

    public final String j(int v) {
        return this.p(v) ? "" : "not ";
    }

    public final String k(int v) {
        return this.p(v) ? "1" : "0";
    }

    public final void l(int v, int v1, boolean z) {
        byte[] arr_b = this.e;
        if(v >= arr_b.length) {
            throw new IndexOutOfBoundsException("byte index is out of bounds");
        }
        byte b = (byte)(arr_b[v] & ~((byte)(1 << v1)));
        if(z) {
            b = (byte)(((byte)(1 << v1)) | b);
        }
        arr_b[v] = b;
    }

    public final void m(byte[] arr_b) {
        this.e = (byte[])arr_b.clone();
        this.b();
        this.fu();
    }

    public void n(byte[] arr_b) {
    }

    public final void o(OutputStream outputStream0) {
        outputStream0.write(this.e);
    }

    @Deprecated
    public final boolean p(int v) {
        int v1 = this.e.length * 8;
        if(v < v1) {
            return this.q(v >> 3, 7 - (v & 7));
        }
        throw new IndexOutOfBoundsException(a.z(v1, v, "bit position ", " is out of bound "));
    }

    public final boolean q(int v, int v1) {
        byte[] arr_b = this.e;
        if(v < arr_b.length) {
            return (arr_b[v] & ((byte)(1 << v1))) != 0;
        }
        throw new IndexOutOfBoundsException("byte index is out of bounds");
    }

    public final byte[] r() {
        return (byte[])this.e.clone();
    }

    public final syd s() {
        byte[] arr_b = this.r();
        return syb.b(this.d.b, arr_b);
    }

    public final byte[] t(int v) {
        byte[] arr_b = this.e;
        if(v + 6 > arr_b.length) {
            throw new IllegalArgumentException();
        }
        byte[] arr_b1 = new byte[6];
        System.arraycopy(arr_b, v, arr_b1, 0, 6);
        return arr_b1;
    }

    @Override
    public String toString() {
        byte[] arr_b = this.e;
        switch(this.d.f - 1) {
            case 0: {
                return twz.c(arr_b, false).replaceFirst("^0+(?!$)", "");
            }
            case 1: {
                return twz.c(arr_b, false).replaceAll("F", "");
            }
            case 3: 
            case 4: 
            case 5: {
                return new String(arr_b);
            }
            default: {
                return twz.c(arr_b, false);
            }
        }
    }
}

