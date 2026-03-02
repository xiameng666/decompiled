import j..util.Objects;
import java.util.Arrays;

public final class czsy {
    public final czry a;
    public final cztn b;
    public final String c;
    public final int d;
    public final ByteString e;
    public final boolean f;
    public final byte[] g;

    public czsy() {
        throw null;
    }

    public czsy(czry czry0, cztn cztn0, String s, int v, ByteString hfsf0, boolean z, byte[] arr_b) {
        this.a = czry0;
        this.b = cztn0;
        this.c = s;
        this.d = v;
        this.e = hfsf0;
        this.f = z;
        this.g = arr_b;
    }

    public static czsy a(czry czry0) {
        return czsy.b(czry0, 0);
    }

    public static czsy b(czry czry0, int v) {
        return czry0.f == null ? new czsy(czry0, null, null, v, null, czry0.i, czry0.h) : new czsy(czry0, null, null, v, ByteString.copyFrom(czry0.f), czry0.i, czry0.h);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof czsy)) {
            return false;
        }
        czry czry0 = this.a;
        if(czry0 == null) {
            return this.b == null ? Objects.equals(this.c, ((czsy)object0).c) : Objects.equals(this.b, ((czsy)object0).b);
        }
        return Objects.equals(czry0, ((czsy)object0).a);
    }

    @Override
    public final int hashCode() {
        czry czry0 = this.a;
        if(czry0 == null) {
            return this.b == null ? Objects.hashCode(this.c) : Objects.hashCode(this.b);
        }
        return Objects.hashCode(czry0);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.g);
        return "BlePeripheral{advertisement=" + this.a + ", dctAdvertisement=" + this.b + ", address=" + this.c + ", psm=" + this.d + ", deviceToken=" + this.e + ", isSecondProfile=" + this.f + ", rxInstantConnectionAdv=" + s + "}";
    }
}

