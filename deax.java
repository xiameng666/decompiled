import android.net.Uri;

public final class deax {
    public final String a;
    public final Uri b;
    public final debb c;

    public deax(String s, Uri uri0, debb debb0) {
        ibuq.f(s, "name");
        super();
        this.a = s;
        this.b = uri0;
        this.c = debb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof deax)) {
            return false;
        }
        if(!ibuq.m(this.a, ((deax)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((deax)object0).b) ? ibuq.m(this.c, ((deax)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F + this.c.hashCode() : (v + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Contact(name=" + this.a + ", imageUri=" + this.b + ", info=" + this.c + ")";
    }
}

