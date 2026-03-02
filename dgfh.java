import android.net.Uri;
import java.util.List;

public final class dgfh {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final boolean f;
    private final int g;
    private final String h;
    private final String i;
    private final Uri j;
    private final int k;

    public dgfh(int v, int v1, String s, String s1, String s2, Uri uri0, boolean z, boolean z1, List list0, int v2, boolean z2) {
        ibuq.f(s, "deviceName");
        super();
        this.g = v;
        this.a = v1;
        this.b = s;
        this.h = s1;
        this.i = s2;
        this.j = uri0;
        this.c = z;
        this.d = z1;
        this.e = list0;
        this.k = v2;
        this.f = z2;
    }

    public final dcls a(long v, boolean z, int v1) {
        dcls dcls0 = new dcls();
        dcls0.d(Long.valueOf(v));
        dcls0.r = this.g;
        dcls0.d = this.a;
        dcls0.b = this.b;
        dcls0.l = this.h;
        dcls0.k = z;
        dcls0.c = this.j;
        dcls0.u = this.i;
        dcls0.s = this.c;
        dcls0.t = v1;
        dcls0.v = this.f;
        dcls0.w = this.k;
        if(this.d) {
            dcls0.b();
        }
        return dcls0;
    }

    public static dgfh b(dgfh dgfh0) {
        ibuq.f(dgfh0.b, "deviceName");
        return new dgfh(dgfh0.g, dgfh0.a, dgfh0.b, dgfh0.h, dgfh0.i, dgfh0.j, dgfh0.c, dgfh0.d, dgfh0.e, dgfh0.k, false);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfh)) {
            return false;
        }
        if(this.g != ((dgfh)object0).g) {
            return false;
        }
        if(this.a != ((dgfh)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgfh)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.h, ((dgfh)object0).h)) {
            return false;
        }
        if(!ibuq.m(this.i, ((dgfh)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.j, ((dgfh)object0).j)) {
            return false;
        }
        if(this.c != ((dgfh)object0).c) {
            return false;
        }
        if(this.d != ((dgfh)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((dgfh)object0).e)) {
            return false;
        }
        return this.k == ((dgfh)object0).k ? this.f == ((dgfh)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((this.g * 0x1F + this.a) * 0x1F + this.b.hashCode()) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + dgfg.a(this.c)) * 0x1F + dgfg.a(this.d)) * 0x1F;
        List list0 = this.e;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return ((v1 + v) * 0x1F + this.k) * 0x1F + dgfg.a(this.f);
    }

    @Override
    public final String toString() {
        return "DeviceMetadata(version=" + this.g + ", deviceType=" + this.a + ", deviceName=" + this.b + ", displayName=" + this.h + ", modelName=" + this.i + ", imageUri=" + this.j + ", isSelfShare=" + this.c + ", isKnown=" + this.d + ", bluetoothMacAddress=" + this.e + ", vendorId=" + this.k + ", matchesLocalQrCode=" + this.f + ")";
    }
}

