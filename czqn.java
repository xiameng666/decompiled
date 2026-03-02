import android.os.ParcelUuid;
import android.os.WorkSource;
import com.google.android.gms.nearby.internal.connection.DiscoveryOptions;

public final class czqn {
    public final String a;
    public final int b;
    public final WorkSource c;
    public final boolean d;
    public final ParcelUuid e;

    public czqn() {
        throw null;
    }

    public czqn(String s, int v, WorkSource workSource0, boolean z, ParcelUuid parcelUuid0) {
        this.a = s;
        this.b = v;
        this.c = workSource0;
        this.d = z;
        this.e = parcelUuid0;
    }

    public static czqn a(String s, DiscoveryOptions discoveryOptions0, WorkSource workSource0) {
        czqm czqm0 = new czqm();
        czqm0.d(s);
        czqm0.b(discoveryOptions0.p);
        czqm0.c(discoveryOptions0.t);
        czqm0.a = workSource0;
        czqm0.b = discoveryOptions0.f;
        return czqm0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czqn) && this.a.equals(((czqn)object0).a) && this.b == ((czqn)object0).b) {
            WorkSource workSource0 = this.c;
            if(workSource0 != null) {
                if(workSource0.equals(((czqn)object0).c)) {
                label_8:
                    if(this.d == ((czqn)object0).d) {
                        return this.e == null ? ((czqn)object0).e == null : this.e.equals(((czqn)object0).e);
                    }
                }
            }
            else if(((czqn)object0).c == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003;
        int v2 = this.d ? 0x4CF : 0x4D5;
        ParcelUuid parcelUuid0 = this.e;
        if(parcelUuid0 != null) {
            v = parcelUuid0.hashCode();
        }
        return (v1 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "BleScannerInfo{serviceId=" + this.a + ", powerLevel=" + this.b + ", workSource=" + this.c + ", allowGattConnection=" + this.d + ", fastAdvertisementServiceUuid=" + this.e + "}";
    }
}

