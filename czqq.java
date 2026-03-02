import com.google.android.gms.nearby.internal.connection.AdvertisingOptions;
import j..util.Objects;

public final class czqq {
    public final int a;
    public final cztn b;

    public czqq() {
        throw null;
    }

    public czqq(int v, cztn cztn0) {
        this.a = v;
        this.b = cztn0;
    }

    public static czqq a(AdvertisingOptions advertisingOptions0, cztn cztn0) {
        int v = advertisingOptions0.A;
        if(cztn0 != null) {
            return new czqq(v, cztn0);
        }
        throw new NullPointerException("Null dctAdvertisement");
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof czqq) && this.a == ((czqq)object0).a && this.b.equals(((czqq)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b});
    }

    @Override
    public final String toString() {
        return "DctBleAdvertiserInfo{powerLevel=" + this.a + ", dctAdvertisement=" + this.b + "}";
    }
}

