import android.graphics.drawable.Drawable;

public final class bdse implements bdsg {
    public final String a;
    public final Drawable b;

    public bdse(String s, Drawable drawable0) {
        this.a = s;
        this.b = drawable0;
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
        if(!(object0 instanceof bdse)) {
            return false;
        }
        return ibuq.m(this.a, ((bdse)object0).a) ? ibuq.m(this.b, ((bdse)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "NoCredentialsState(accountName=" + this.a + ", importingPasswordManagerIcon=" + this.b + ")";
    }
}

