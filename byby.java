import android.graphics.drawable.Drawable;

public final class byby {
    public final Drawable a;
    public final String b;

    public byby(Drawable drawable0, String s) {
        this.a = drawable0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byby)) {
            return false;
        }
        return ibuq.m(this.a, ((byby)object0).a) ? ibuq.m(this.b, ((byby)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "TopBrandingContent(icon=" + this.a + ", displayName=" + this.b + ")";
    }
}

