import com.google.android.gms.nearby.sharing.TextAttachment;

public final class dggj implements dgeo {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final boolean f;
    public dgfu g;

    public dggj(long v, long v1, int v2, String s, long v3, boolean z) {
        ibuq.f(s, "textTitle");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = v3;
        this.f = z;
        if(v3 <= 0L) {
            throw new IllegalArgumentException(a.u(v3, "Text size must be larger than 0. Actual size: "));
        }
        this.g = new dgft(0L);
    }

    @Override  // dgeo
    public final long a() {
        return this.a;
    }

    @Override  // dgeo
    public final long b() {
        return this.e;
    }

    public final TextAttachment c(String s) {
        dcnj dcnj0 = new dcnj(this.d);
        dcnj0.a = this.a;
        dcnj0.c = this.c;
        dcnj0.d = this.e;
        dcnj0.b = s;
        dcnj0.f = this.f;
        return dcnj0.a();
    }

    @Override  // dgeo
    public final boolean d() {
        return this.g instanceof dgfs;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggj)) {
            return false;
        }
        if(this.a != ((dggj)object0).a) {
            return false;
        }
        if(this.b != ((dggj)object0).b) {
            return false;
        }
        if(this.c != ((dggj)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((dggj)object0).d)) {
            return false;
        }
        return this.e == ((dggj)object0).e ? this.f == ((dggj)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = ((dggi.a(this.a) * 0x1F + dggi.a(this.b)) * 0x1F + this.c) * 0x1F + this.d.hashCode();
        return this.f ? (v * 0x1F + dggi.a(this.e)) * 0x1F + 0x4CF : (v * 0x1F + dggi.a(this.e)) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "TextMetadata(attachmentId=" + this.a + ", payloadId=" + this.b + ", type=" + this.c + ", textTitle=" + this.d + ", size=" + this.e + ", isSensitiveText=" + this.f + ")";
    }
}

