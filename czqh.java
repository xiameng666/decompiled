import android.os.ParcelUuid;
import java.util.Arrays;

public final class czqh {
    public final String a;
    public final int b;
    public final byte[] c;
    public final ParcelUuid d;
    public final boolean e;
    public final byte[] f;

    public czqh() {
        throw null;
    }

    public czqh(String s, int v, byte[] arr_b, ParcelUuid parcelUuid0, boolean z, byte[] arr_b1) {
        this.a = s;
        this.b = v;
        this.c = arr_b;
        this.d = parcelUuid0;
        this.e = z;
        this.f = arr_b1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czqh) && this.a.equals(((czqh)object0).a) && this.b == ((czqh)object0).b && Arrays.equals(this.c, ((((czqh)object0) instanceof czqh) ? ((czqh)object0).c : ((czqh)object0).c))) {
            ParcelUuid parcelUuid0 = this.d;
            if(parcelUuid0 == null) {
                return ((czqh)object0).d == null ? this.e == ((czqh)object0).e && Arrays.equals(this.f, ((czqh)object0).f) : false;
            }
            return parcelUuid0.equals(((czqh)object0).d) ? this.e == ((czqh)object0).e && Arrays.equals(this.f, ((czqh)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        int v1 = ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ v;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        return this.e ? Arrays.hashCode(this.f) ^ ((v1 * 1000003 ^ v2) * 1000003 ^ 0x4CF) * 1000003 : Arrays.hashCode(this.f) ^ ((v1 * 1000003 ^ v2) * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        String s1 = Arrays.toString(this.f);
        return "BleAdvertiserInfo{serviceId=" + this.a + ", powerLevel=" + this.b + ", advertisementData=" + s + ", fastAdvertisementServiceUuid=" + this.d + ", allowGattConnection=" + this.e + ", rxInstantConnectionAdv=" + s1 + "}";
    }
}

