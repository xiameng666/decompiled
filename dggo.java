import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

public final class dggo implements dgeo {
    public final long a;
    public final long b;
    public final String c;
    public final int d;
    public dgfu e;
    private final long f;

    public dggo(long v, long v1, String s, int v2) {
        ibuq.f(s, "ssid");
        super();
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = v2;
        this.e = new dgft(0L);
        this.f = ((long)s.length()) + 80L;
    }

    @Override  // dgeo
    public final long a() {
        return this.a;
    }

    @Override  // dgeo
    public final long b() {
        return this.f;
    }

    public final WifiCredentialsAttachment c(String s, boolean z) {
        dcns dcns0 = new dcns(this.c);
        dcns0.a = this.a;
        dcns0.b = this.d;
        dcns0.d = z;
        dcns0.c = s;
        return dcns0.a();
    }

    @Override  // dgeo
    public final boolean d() {
        return this.e instanceof dgfs;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggo)) {
            return false;
        }
        if(this.a != ((dggo)object0).a) {
            return false;
        }
        if(this.b != ((dggo)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((dggo)object0).c) ? this.d == ((dggo)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((dggn.a(this.a) * 0x1F + dggn.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "WifiCredentialsMetadata(attachmentId=" + this.a + ", payloadId=" + this.b + ", ssid=" + this.c + ", securityType=" + this.d + ")";
    }
}

