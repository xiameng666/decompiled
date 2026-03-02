import java.io.Serializable;
import java.util.Arrays;

public class sxm implements Serializable {
    public byte[] a;
    private static final long serialVersionUID = 1L;

    public sxm() {
    }

    public sxm(byte[] arr_b) {
        this.a = (byte[])arr_b.clone();
        this.j();
    }

    public sxm(char[] arr_c) {
        byte[] arr_b = new byte[5];
        this.a = arr_b;
        arr_b[0] = 0;
        arr_b[1] = -78;
        arr_b[2] = 1;
        arr_b[3] = 12;
        this.j();
    }

    public final byte a() {
        return this.a[2];
    }

    public final byte b() {
        return this.a[3];
    }

    public final int c() {
        return this.j().k ? (this.a[6] & 0xFF) + (this.a[5] & 0xFF) * 0xFF : this.a[4] & 0xFF;
    }

    public final int d() {
        sxl sxl0 = this.j();
        if(sxl0.j) {
            if(sxl0.k) {
                return this.a[this.a.length - 1] & 0xFF | (this.a[this.a.length - 2] & 0xFF) << 8;
            }
            int v = this.a[this.a.length - 1];
            return v == 0 ? 0x100 : v & 0xFF;
        }
        return -1;
    }

    public final boolean e() {
        return this.j().j;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof sxm) ? Arrays.equals(this.a, ((sxm)object0).f()) : false;
    }

    public final byte[] f() {
        return (byte[])this.a.clone();
    }

    public final byte[] g() {
        if(!this.j().i) {
            return new byte[0];
        }
        int v = this.j().ordinal();
        if(v != 2) {
            switch(v) {
                case 3: {
                    break;
                }
                case 4: {
                label_7:
                    int v1 = this.i();
                    byte[] arr_b = new byte[v1];
                    System.arraycopy(this.a, 7, arr_b, 0, v1);
                    return arr_b;
                }
                default: {
                    if(v != 6) {
                        throw new IllegalStateException("Implementation fault detected in " + sxm.class.toString());
                    }
                    goto label_7;
                }
            }
        }
        byte[] arr_b1 = this.a;
        int v2 = arr_b1[4] & 0xFF;
        byte[] arr_b2 = new byte[v2];
        System.arraycopy(arr_b1, 5, arr_b2, 0, v2);
        return arr_b2;
    }

    public final void h() {
        twz.c(this.a, false);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    private final int i() {
        return ((this.a[5] & 0xFF) << 8) + (this.a[6] & 0xFF);
    }

    private final sxl j() {
        byte[] arr_b = this.a;
        if(arr_b == null || arr_b.length < 4) {
            throw this.k();
        }
        if(arr_b.length == 4) {
            return sxl.a;
        }
        switch(arr_b.length) {
            case 5: {
                break;
            }
            case 6: {
                if(arr_b[4] != 0 || arr_b[5] != 0) {
                label_7:
                    if(arr_b[4] == 0) {
                        if(arr_b.length == 7) {
                            return sxl.f;
                        }
                        int v = this.i() + 7;
                        if(arr_b.length == v) {
                            return sxl.e;
                        }
                        int v1 = this.i() + 9;
                        if(this.a.length == v1) {
                            return sxl.g;
                        }
                    }
                    byte[] arr_b1 = this.a;
                    int v2 = arr_b1[4] & 0xFF;
                    if(arr_b1.length == v2 + 5) {
                        return sxl.c;
                    }
                    if(arr_b1.length != v2 + 6) {
                        throw new sxp("Wrong Length", sxr.k);
                    }
                    if(arr_b1[arr_b1.length - 1] != -1) {
                        return sxl.d;
                    }
                    throw this.k();
                }
                break;
            }
            default: {
                goto label_7;
            }
        }
        if(arr_b[4] != -1) {
            return sxl.b;
        }
        throw this.k();
    }

    private final IllegalArgumentException k() {
        return this.a == null ? new IllegalArgumentException("APDU encoding is invalid (, not according ISO 7816). null") : new IllegalArgumentException("APDU encoding is invalid (, not according ISO 7816). " + twz.b(this.a));
    }

    @Override
    public final String toString() {
        return this.j().h + ": " + twz.c(this.a, false);
    }
}

