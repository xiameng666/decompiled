import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

public class tak implements Serializable {
    public final tcz a;
    public byte[] b;

    public tak(byte[] arr_b, tcz tcz0) {
        this(arr_b, true, tcz0);
    }

    public tak(byte[] arr_b, boolean z, tcz tcz0) {
        if(arr_b == null) {
            throw new IllegalArgumentException("bytes cannot be null");
        }
        if(z) {
            arr_b = (byte[])arr_b.clone();
        }
        this.b = arr_b;
        this.a = tcz0;
        int v = this.f().length;
        int v1 = tcz0.c;
        if(v1 != -1 && v1 != v) {
            throw new IllegalStateException("Invalid length for data elemment " + tcz0.a + "; expected " + v1 + ", but was " + v);
        }
        int v2 = tcz0.d;
        if(v > v2) {
            throw new IllegalStateException("Invalid length for data elemment " + tcz0.a + "; expected between -2147483648 and " + v2 + ", but was " + v);
        }
        int v3 = tcz0.e;
        byte[] arr_b1 = this.b;
        int v4 = 0;
    alab1:
        switch(v3 - 1) {
            case 0: {
                String s = tek.c(arr_b1, false);
                while(true) {
                    if(v4 >= s.length()) {
                        break alab1;
                    }
                    int v5 = s.charAt(v4);
                    if(v5 < 0x30 || v5 > 57) {
                        throw new IllegalArgumentException("Invalid numeric value: " + tek.b(arr_b1));
                    }
                    ++v4;
                    continue;
                }
            }
            case 1: {
                String s1 = tek.c(arr_b1, false);
                while(true) {
                    if(v4 >= s1.length()) {
                        break alab1;
                    }
                    int v6 = s1.charAt(v4);
                    if(v6 != 70 && (v6 < 0x30 || v6 > 57)) {
                        throw new IllegalArgumentException("Invalid compact numeric value: " + tek.b(arr_b1));
                    }
                    ++v4;
                    continue;
                }
            }
            case 4: {
                String s2 = new String(arr_b1);
                while(true) {
                    if(v4 >= s2.length()) {
                        break alab1;
                    }
                    int v7 = s2.charAt(v4);
                    if((v7 < 0x30 || v7 > 57) && (v7 < 97 || v7 > 0x7A) && (v7 < 65 || v7 > 90)) {
                        throw new IllegalArgumentException("Invalid alpha numeric value: " + tek.b(arr_b1));
                    }
                    ++v4;
                    continue;
                }
            }
            case 5: {
                while(true) {
                    if(v4 >= arr_b1.length) {
                        break alab1;
                    }
                    int v8 = arr_b1[v4];
                    int v9 = v8 & 0xF0;
                    if((v8 & 15) == 15 && v9 == 7 || v9 < 2) {
                        throw new IllegalArgumentException("Invalid alpha numeric special value: " + tek.b(arr_b1));
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
                throw new IllegalStateException("Unsupported format " + tda.a(v3));
            }
        }
        this.d(this.b);
    }

    public final byte a(int v) {
        return this.b[v];
    }

    public final String b() {
        int v = this.a.e;
        byte[] arr_b = this.f();
        switch(v - 1) {
            case 0: {
                return tek.c(arr_b, false).replaceFirst("^0*(?!$)", "");
            }
            case 1: {
                return tek.c(arr_b, false).replaceAll("F*$", "");
            }
            case 2: {
                return tek.c(arr_b, false);
            }
            case 4: {
                return tek.c(arr_b, false);
            }
            case 5: {
                return tek.c(arr_b, false);
            }
            case 6: {
                return tek.c(arr_b, false);
            }
            default: {
                throw new IllegalStateException("Unsupported format " + tda.a(v));
            }
        }
    }

    public final void c(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.b, 0, arr_b, v, v1);
    }

    public void d(byte[] arr_b) {
    }

    public static byte[] e(tak[] arr_tak) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            for(int v = 0; v < arr_tak.length; ++v) {
                byteArrayOutputStream0.write(arr_tak[v].f());
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(!Arrays.equals(this.b, ((tak)object0).b)) {
            return false;
        }
        tcz tcz0 = ((tak)object0).a;
        return this.a == tcz0 || this.a.equals(tcz0);
    }

    public final byte[] f() {
        return (byte[])this.b.clone();
    }

    public final szg g() {
        byte[] arr_b = this.f();
        return sze.b(this.a.b, arr_b);
    }

    @Override
    public final int hashCode() {
        return (Arrays.hashCode(this.b) + 0x103) * 37 + this.a.hashCode();
    }

    @Override
    public String toString() {
        byte[] arr_b = this.b;
        switch(this.a.e - 1) {
            case 0: {
                return tek.c(arr_b, false).replaceFirst("^0+(?!$)", "");
            }
            case 1: {
                return tek.c(arr_b, false).replaceAll("F", "");
            }
            case 3: 
            case 4: 
            case 5: {
                return new String(arr_b);
            }
            default: {
                return tek.c(arr_b, false);
            }
        }
    }
}

