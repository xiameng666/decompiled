import java.net.InetAddress;

public final class czkz {
    public final gyxl a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final InetAddress g;

    public czkz() {
        throw null;
    }

    public czkz(gyxl gyxl0, String s, long v, long v1, long v2, String s1, InetAddress inetAddress0) {
        this.a = gyxl0;
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = s1;
        this.g = inetAddress0;
    }

    public static czky a() {
        czky czky0 = new czky();
        czky0.a = null;
        czky0.b = null;
        return czky0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czkz) && this.a.equals(((czkz)object0).a) && this.b.equals(((czkz)object0).b) && this.c == ((czkz)object0).c && this.d == ((czkz)object0).d && this.e == ((czkz)object0).e) {
            String s = this.f;
            if(s == null) {
                if(((czkz)object0).f == null) {
                    return this.g == null ? ((czkz)object0).g == null : this.g.equals(((czkz)object0).g);
                }
            }
            else if(s.equals(((czkz)object0).f)) {
                return this.g == null ? ((czkz)object0).g == null : this.g.equals(((czkz)object0).g);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ (this.f == null ? 0 : this.f.hashCode())) * 1000003;
        InetAddress inetAddress0 = this.g;
        if(inetAddress0 != null) {
            v = inetAddress0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "MdnsDiscoveryOptions{medium=" + this.a + ", expectedServiceType=" + this.b + ", registerWaitDurationSeconds=" + this.c + ", unregisterWaitDurationSeconds=" + this.d + ", resolveServiceWaitDurationSeconds=" + this.e + ", selfAdvertisingServiceName=" + this.f + ", localAddress=" + this.g + "}";
    }
}

