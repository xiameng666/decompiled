import android.graphics.drawable.Drawable;

public final class bglj {
    public final String a;
    public final String b;
    public final Drawable c;

    public bglj() {
        throw null;
    }

    public bglj(String s, String s1, Drawable drawable0) {
        this.a = s;
        this.b = s1;
        this.c = drawable0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bglj) && this.a.equals(((bglj)object0).a) && this.b.equals(((bglj)object0).b)) {
            return this.c == null ? ((bglj)object0).c == null : this.c.equals(((bglj)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        return this.c == null ? v * 1000003 : this.c.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "AppInfo{androidAppDomain=" + this.a + ", name=" + this.b + ", icon=" + this.c + "}";
    }
}

