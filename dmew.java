import android.net.Uri;

public final class dmew {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final Uri h;

    public dmew(int v, String s, String s1, String s2, String s3, int v1, int v2, Uri uri0) {
        ibuq.f(s, "overlayText");
        ibuq.f(s1, "productName");
        super();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v1;
        this.g = v2;
        this.h = uri0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmew)) {
            return false;
        }
        if(this.a != ((dmew)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dmew)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dmew)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dmew)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dmew)object0).e)) {
            return false;
        }
        if(this.f != ((dmew)object0).f) {
            return false;
        }
        return this.g == ((dmew)object0).g ? ibuq.m(this.h, ((dmew)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + this.f) * 0x1F + this.g) * 0x1F;
        Uri uri0 = this.h;
        if(uri0 != null) {
            v = uri0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "RichCardArtAttributes(cardBrand=" + this.a + ", overlayText=" + this.b + ", productName=" + this.c + ", title=" + this.d + ", defaultTitle=" + this.e + ", overlayTextColor=" + this.f + ", cardColor=" + this.g + ", cardArtUri=" + this.h + ")";
    }
}

