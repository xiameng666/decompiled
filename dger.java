import android.net.Uri;
import java.util.List;

public final class dger {
    public final String a;
    public final String b;
    public final Uri c;
    public final List d;
    public final String e;
    public final int f;
    private final String g;

    public dger(String s, String s1, Uri uri0, List list0, String s2, String s3, int v) {
        ibuq.f(s, "deviceName");
        ibuq.f(s3, "modelName");
        super();
        this.a = s;
        this.b = s1;
        this.c = uri0;
        this.d = list0;
        this.g = s2;
        this.e = s3;
        this.f = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dger)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dger)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dger)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dger)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dger)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.g, ((dger)object0).g)) {
            return false;
        }
        return ibuq.m(this.e, ((dger)object0).e) ? this.f == ((dger)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.g;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + this.e.hashCode()) * 0x1F + this.f;
    }

    @Override
    public final String toString() {
        return "CertificateMetadata(deviceName=" + this.a + ", fullName=" + this.b + ", iconUrl=" + this.c + ", bluetoothMacAddress=" + this.d + ", accountName=" + this.g + ", modelName=" + this.e + ", vendorId=" + this.f + ")";
    }
}

