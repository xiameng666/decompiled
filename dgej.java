import java.util.List;

public final class dgej {
    public final int a;
    public final dgfi b;
    private final int c;
    private final String d;
    private final List e;
    private final int f;
    private final boolean g;

    public dgej(int v, dgfi dgfi0, int v1, String s, List list0, int v2) {
        this.a = v;
        this.b = dgfi0;
        this.c = v1;
        this.d = s;
        this.e = list0;
        this.f = v2;
        boolean z = false;
        if(!ibpo.g(new Integer[]{((int)0), ((int)1)}).contains(Integer.valueOf(v))) {
            throw new IllegalArgumentException("Only supports V1 or V2.");
        }
        if(s != null) {
            byte[] arr_b = s.getBytes(ibyo.a);
            ibuq.e(arr_b, "getBytes(...)");
            if(arr_b.length <= 0) {
                throw new IllegalArgumentException("Device name is empty");
            }
            if(arr_b.length > 0x20) {
                throw new IllegalArgumentException("Device name " + s + " is longer than 32");
            }
        }
        if(s != null || list0 != null) {
            z = true;
        }
        this.g = z;
    }

    public final dgfh a(dggg dggg0, dgfy dgfy0) {
        String s2;
        String s = null;
        djbi djbi0 = this.e == null || dgfy0 == null ? null : new djbj(ibpo.aC(dgfy0.a)).a(ibpo.aC(this.e));
        String s1 = this.d;
        if(s1 != null) {
            s2 = s1;
        }
        else if(djbi0 != null) {
            s2 = djbi0.b;
        }
        else {
            s2 = null;
        }
        boolean z = false;
        if(dggg0 == null) {
            if(s2 == null) {
                dcvz.a.d().p("Decode contact-only mode advertisement without credential.", new Object[0]);
                return null;
            }
            int v = this.a;
            int v1 = this.c;
            int v2 = this.f;
            if(djbi0 != null) {
                z = djbi0.a;
            }
            return new dgfh(v, v1, s2, null, null, null, false, false, null, v2, z);
        }
        if(s2 == null) {
            s2 = dggg0.d.a;
        }
        dger dger0 = dggg0.d;
        boolean z1 = dggg0.e;
        int v3 = this.a;
        int v4 = this.c;
        if(z1) {
            s = dger0.e;
        }
        if(djbi0 != null) {
            z = djbi0.a;
        }
        return new dgfh(v3, v4, s2, dger0.b, s, dger0.c, z1, true, dger0.d, dger0.f, z);
    }

    public final byte[] b() {
        byte[] arr_b2;
        int v = dgfj.a(dgfj.a(((byte)0), this.a, ((byte)5), ((byte)3)), this.c, ((byte)1), ((byte)3));
        String s = this.d;
        byte[] arr_b = ibpg.j(ibpg.j(new byte[]{dgfj.a(((byte)v), (s == null ? 1 : 0), ((byte)4), ((byte)1))}, this.b.b), this.b.a);
        if(this.g) {
            if(s == null) {
                arr_b2 = new byte[0];
            }
            else {
                byte[] arr_b1 = s.getBytes(ibyo.a);
                ibuq.e(arr_b1, "getBytes(...)");
                arr_b2 = arr_b1 == null ? new byte[0] : ibpg.k(new byte[]{((byte)arr_b1.length)}, arr_b1);
            }
            byte[] arr_b3 = ibpg.k(ibpg.k(arr_b, arr_b2), (this.e == null ? new byte[0] : ibpg.j(new byte[]{1, ((byte)this.e.size())}, this.e)));
            return this.f == 0 ? ibpg.k(arr_b3, new byte[0]) : ibpg.k(arr_b3, new byte[]{2, 1, ((byte)this.f)});
        }
        return arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgej)) {
            return false;
        }
        if(this.a != ((dgej)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgej)object0).b)) {
            return false;
        }
        if(this.c != ((dgej)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((dgej)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dgej)object0).e) ? this.f == ((dgej)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F;
        List list0 = this.e;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 + v) * 0x1F + this.f;
    }

    @Override
    public final String toString() {
        return "Advertisement(version=" + this.a + ", encryptedMetadataKey=" + this.b + ", deviceType=" + this.c + ", deviceName=" + this.d + ", qrCodeAdvertisingToken=" + this.e + ", vendorId=" + this.f + ")";
    }
}

