import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

final class ighw extends igcw {
    private final long[] a;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final ighu i;
    private static final long serialVersionUID = 0x6C69B735442CB4F9L;

    private ighw(String s, long[] arr_v, int[] arr_v1, int[] arr_v2, String[] arr_s, ighu ighu0) {
        super(s);
        this.a = arr_v;
        this.f = arr_v1;
        this.g = arr_v2;
        this.h = arr_s;
        this.i = ighu0;
    }

    @Override  // igcw
    public final int a(long v) {
        long[] arr_v = this.a;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 >= 0) {
            return this.f[v1];
        }
        if(~v1 < arr_v.length) {
            return ~v1 <= 0 ? 0 : this.f[~v1 - 1];
        }
        return this.i == null ? this.f[~v1 - 1] : this.i.a(v);
    }

    @Override  // igcw
    public final int b(long v) {
        long[] arr_v = this.a;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 >= 0) {
            return this.g[v1];
        }
        if(~v1 < arr_v.length) {
            return ~v1 <= 0 ? 0 : this.g[~v1 - 1];
        }
        return this.i == null ? this.g[~v1 - 1] : this.i.a;
    }

    static ighw c(DataInput dataInput0, String s) {
        int v = dataInput0.readUnsignedShort();
        String[] arr_s = new String[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_s[v2] = dataInput0.readUTF();
        }
        int v3 = dataInput0.readInt();
        long[] arr_v = new long[v3];
        int[] arr_v1 = new int[v3];
        int[] arr_v2 = new int[v3];
        String[] arr_s1 = new String[v3];
        for(int v1 = 0; v1 < v3; ++v1) {
            arr_v[v1] = ighy.a(dataInput0);
            arr_v1[v1] = (int)ighy.a(dataInput0);
            arr_v2[v1] = (int)ighy.a(dataInput0);
            try {
                arr_s1[v1] = arr_s[(v >= 0x100 ? dataInput0.readUnsignedShort() : dataInput0.readUnsignedByte())];
            }
            catch(ArrayIndexOutOfBoundsException unused_ex) {
                throw new IOException("Invalid encoding");
            }
        }
        return dataInput0.readBoolean() ? new ighw(s, arr_v, arr_v1, arr_v2, arr_s1, new ighu(s, ((int)ighy.a(dataInput0)), ighx.c(dataInput0), ighx.c(dataInput0))) : new ighw(s, arr_v, arr_v1, arr_v2, arr_s1, null);
    }

    @Override  // igcw
    public final long d(long v) {
        long[] arr_v = this.a;
        int v1 = Arrays.binarySearch(arr_v, v);
        int v2 = v1 < 0 ? ~v1 : v1 + 1;
        if(v2 < arr_v.length) {
            return arr_v[v2];
        }
        ighu ighu0 = this.i;
        if(ighu0 == null) {
            return v;
        }
        long v3 = arr_v[arr_v.length - 1];
        if(v < v3) {
            v = v3;
        }
        return ighu0.d(v);
    }

    @Override  // igcw
    public final long e(long v) {
        long[] arr_v = this.a;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 >= 0) {
            return v <= 0x8000000000000000L ? 0x8000000000000000L : v - 1L;
        }
        if(~v1 < arr_v.length) {
            if(~v1 > 0) {
                long v2 = arr_v[~v1 - 1];
                return v2 <= 0x8000000000000000L ? v : v2 - 1L;
            }
            return v;
        }
        ighu ighu0 = this.i;
        if(ighu0 != null) {
            long v3 = ighu0.e(v);
            if(v3 < v) {
                return v3;
            }
        }
        long v4 = arr_v[~v1 - 1];
        return v4 <= 0x8000000000000000L ? v : v4 - 1L;
    }

    @Override  // igcw
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if((object0 instanceof ighw) && this.d.equals(((ighw)object0).d) && Arrays.equals(this.a, ((ighw)object0).a) && Arrays.equals(this.h, ((ighw)object0).h) && Arrays.equals(this.f, ((ighw)object0).f) && Arrays.equals(this.g, ((ighw)object0).g)) {
            return this.i == null ? ((ighw)object0).i == null : this.i.equals(((ighw)object0).i);
        }
        return false;
    }

    @Override  // igcw
    public final String g(long v) {
        long[] arr_v = this.a;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 >= 0) {
            return this.h[v1];
        }
        if(~v1 < arr_v.length) {
            return ~v1 <= 0 ? "UTC" : this.h[~v1 - 1];
        }
        return this.i == null ? this.h[~v1 - 1] : this.i.g(v);
    }

    @Override  // igcw
    public final boolean h() {
        return false;
    }

    @Override  // igcw
    public final int hashCode() {
        return this.d.hashCode();
    }
}

