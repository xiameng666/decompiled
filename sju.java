import android.graphics.drawable.Drawable;

public final class sju {
    public final Drawable a;
    public final Drawable b;
    public final String c;
    public final String d;

    public sju(Drawable drawable0, Drawable drawable1, String s, String s1) {
        ibuq.f(drawable0, "collapseIcon");
        ibuq.f(drawable1, "expandIcon");
        ibuq.f(s, "collapseText");
        ibuq.f(s1, "expandText");
        super();
        this.a = drawable0;
        this.b = drawable1;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof sju)) {
            return false;
        }
        if(!ibuq.m(this.a, ((sju)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((sju)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((sju)object0).c) ? ibuq.m(this.d, ((sju)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "CollapseButtonResources(collapseIcon=" + this.a + ", expandIcon=" + this.b + ", collapseText=" + this.c + ", expandText=" + this.d + ")";
    }
}

