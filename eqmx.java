import android.util.Base64;
import j..util.Objects;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class eqmx implements eqmw {
    public static final baun a;
    public final byte[] b;

    static {
        eqmx.a = new erqc(new String[]{"AdvertisementDataV1"});
    }

    public eqmx() {
        this.b = new byte[84];
    }

    public eqmx(byte[] arr_b) {
        this.b = Base64.decode(arr_b, 0);
    }

    @Override  // eqmw
    public final byte a() {
        return this.b[14];
    }

    @Override  // eqmw
    public final int b() {
        return this.b[13];
    }

    @Override  // eqmw
    public final eqoe c() {
        return (eqoe)Objects.requireNonNullElse(eqoe.b(this.b[1]), eqoe.a);
    }

    @Override  // eqmw
    public final gjpi d() {
        return gjpi.b(this.b[0]);
    }

    @Override  // eqmw
    public final String e() {
        byte[] arr_b = this.b;
        int v = arr_b[12] == 1 ? 10 : 5;
        byte[] arr_b1 = new byte[v];
        int v1 = 0;
        for(int v2 = 2; v2 < v + 2; ++v2) {
            arr_b1[v2 - 2] = arr_b[v2];
            if(arr_b[v2] == 0) {
                break;
            }
            ++v1;
        }
        try {
            return new String(arr_b1, 0, v1, "UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return "";
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof eqmx) ? Arrays.equals(this.b, ((eqmx)object0).b) : false;
    }

    @Override  // eqmw
    public final boolean f() {
        return this.b[15] == 1;
    }

    @Override  // eqmw
    public final boolean g() {
        return this.b[12] == 1;
    }

    @Override  // eqmw
    public final byte[] h() {
        return new byte[]{this.b[7], this.b[8]};
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}

