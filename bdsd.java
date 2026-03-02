import android.graphics.drawable.Drawable;

public final class bdsd implements bdsg {
    public final String a;
    public final Drawable b;
    public final String c;

    public bdsd(String s, Drawable drawable0, String s1) {
        this.a = s;
        this.b = drawable0;
        this.c = s1;
    }

    @Override  // bdsg
    public final bdsb a() {
        return bdsb.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdsd)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bdsd)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bdsd)object0).b) ? ibuq.m(this.c, ((bdsd)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "LoadingState(accountName=" + this.a + ", importingPasswordManagerIcon=" + this.b + ", importingPasswordManagerDisplayName=" + this.c + ")";
    }
}

