import android.net.Network;

public final class rgw {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final Network e;
    public final String f;
    public final bkbc g;

    public rgw() {
        throw null;
    }

    public rgw(String s, String s1, boolean z, int v, Network network0, bkbc bkbc0, String s2) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = network0;
        this.g = bkbc0;
        this.f = s2;
    }

    public static rgv a() {
        rgv rgv0 = new rgv();
        rgv0.d("");
        rgv0.b("");
        rgv0.f(false);
        rgv0.e(30);
        rgv0.c("nai.epc");
        return rgv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof rgw) && this.a.equals(((rgw)object0).a) && this.b.equals(((rgw)object0).b) && this.c == ((rgw)object0).c && this.d == ((rgw)object0).d) {
            Network network0 = this.e;
            if(network0 != null) {
                if(network0.equals(((rgw)object0).e)) {
                label_8:
                    bkbc bkbc0 = this.g;
                    if(bkbc0 == null) {
                        return ((rgw)object0).g == null ? this.f.equals(((rgw)object0).f) : false;
                    }
                    return bkbc0.equals(((rgw)object0).g) ? this.f.equals(((rgw)object0).f) : false;
                }
            }
            else if(((rgw)object0).e == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c ? 0x4CF : 0x4D5)) * 1000003 ^ this.d) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003;
        bkbc bkbc0 = this.g;
        if(bkbc0 != null) {
            v = bkbc0.hashCode();
        }
        return this.f.hashCode() ^ (v1 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "CarrierConfig{serverUrl=" + this.a + ", clientTs43=" + this.b + ", useHttpPost=" + this.c + ", timeoutInSec=" + this.d + ", network=" + this.e + ", urlConnectionFactory=" + this.g + ", eapAkaRealm=" + this.f + "}";
    }
}

