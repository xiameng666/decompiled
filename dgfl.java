import android.net.Uri;
import com.google.android.gms.nearby.sharing.FileAttachment;

public final class dgfl implements dgeo {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final String i;
    public dgfu j;

    public dgfl(long v, long v1, int v2, String s, String s1, long v3, long v4, boolean z, String s2) {
        ibuq.f(s, "fileName");
        ibuq.f(s1, "mimeType");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = s1;
        this.f = v3;
        this.g = v4;
        this.h = z;
        this.i = s2;
        if(v3 <= 0L) {
            throw new IllegalArgumentException("File Size must be larger than 0.");
        }
        this.j = new dgft(0L);
    }

    @Override  // dgeo
    public final long a() {
        return this.a;
    }

    @Override  // dgeo
    public final long b() {
        return this.f;
    }

    public final FileAttachment c(Uri uri0) {
        dbyq dbyq0 = new dbyq(cuua.d(this.d));
        dbyq0.a = this.a;
        dbyq0.c = this.f;
        dbyq0.i = this.h;
        dbyq0.e = ddnb.d(this.e);
        dbyq0.f = cuua.e(this.i);
        dbyq0.d = this.c;
        dbyq0.h = this.g;
        dbyq0.b = uri0;
        return dbyq0.a();
    }

    @Override  // dgeo
    public final boolean d() {
        return this.j instanceof dgfs;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfl)) {
            return false;
        }
        if(this.a != ((dgfl)object0).a) {
            return false;
        }
        if(this.b != ((dgfl)object0).b) {
            return false;
        }
        if(this.c != ((dgfl)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((dgfl)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dgfl)object0).e)) {
            return false;
        }
        if(this.f != ((dgfl)object0).f) {
            return false;
        }
        if(this.g != ((dgfl)object0).g) {
            return false;
        }
        return this.h == ((dgfl)object0).h ? ibuq.m(this.i, ((dgfl)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.i == null ? 0 : this.i.hashCode();
        int v1 = ((((((dgfk.a(this.a) * 0x1F + dgfk.a(this.b)) * 0x1F + this.c) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + dgfk.a(this.f)) * 0x1F + dgfk.a(this.g)) * 0x1F;
        return this.h ? (v1 + 0x4CF) * 0x1F + v : (v1 + 0x4D5) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "FileMetadata(attachmentId=" + this.a + ", payloadId=" + this.b + ", type=" + this.c + ", fileName=" + this.d + ", mimeType=" + this.e + ", size=" + this.f + ", hash=" + this.g + ", isSensitiveContent=" + this.h + ", parentFolder=" + this.i + ")";
    }
}

