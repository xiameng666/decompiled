import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class eqnd implements eqmz {
    public static final baun a;
    public static final String b;
    public final String c;
    private final eqmx d;

    static {
        eqnd.a = new erqc(new String[]{"ConnectionsAdvertisementV1"});
        eqnd.b = "\u0000";
    }

    public eqnd(String s, eqmx eqmx0) {
        this.c = s;
        this.d = eqmx0;
    }

    public eqnd(byte[] arr_b) {
        boolean z;
        int v;
        for(v = 1; true; ++v) {
            if(v >= 19) {
                z = false;
                v = 19;
                break;
            }
            if(arr_b[v] == 0) {
                z = true;
                break;
            }
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 1, v);
        try {
            this.c = new String(arr_b1, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        if(z) {
            ++v;
        }
        this.d = new eqmx(Arrays.copyOfRange(arr_b, v, arr_b.length));
    }

    @Override  // eqmz
    public final eqmw a() {
        return this.d;
    }

    @Override  // eqmz
    public final String b() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\u0001");
        stringBuilder0.append(this.c);
        try {
            byte[] arr_b = this.d.b;
            stringBuilder0.append(new String(Base64.encode((arr_b[12] == 1 ? Arrays.copyOf(arr_b, 60) : this.d.b), 3), "UTF-8"));
            return stringBuilder0.toString();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    @Override  // eqmz
    public final String c() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eqnd)) {
            return false;
        }
        return this.c.equals(((eqnd)object0).c) ? this.d.equals(((eqnd)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() * 0x1F + this.d.hashCode();
    }
}

