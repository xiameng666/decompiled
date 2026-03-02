import android.content.res.ColorStateList;

public final class fumq {
    public final fumm a;
    public final fryk b;
    public final ColorStateList c;
    public final fryk d;
    public final ibtw e;
    private final ColorStateList f;

    public fumq() {
        this(null, null, null, null, null, 0x3F);
    }

    public fumq(fumm fumm0, fryk fryk0, ColorStateList colorStateList0, fryk fryk1, ibtw ibtw0, int v) {
        if((v & 1) != 0) {
            fumm0 = new fumm(null, null, null, 0x3F);
        }
        if((v & 2) != 0) {
            fryk0 = null;
        }
        if((v & 4) != 0) {
            colorStateList0 = null;
        }
        if((v & 8) != 0) {
            fryk1 = null;
        }
        if((v & 0x20) != 0) {
            ibtw0 = null;
        }
        ibuq.f(fumm0, "commonState");
        super();
        this.a = fumm0;
        this.b = fryk0;
        this.c = colorStateList0;
        this.d = fryk1;
        this.f = null;
        this.e = ibtw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fumq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fumq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fumq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fumq)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fumq)object0).d)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.e, ((fumq)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : ((fryh)this.d).a;
        ibtw ibtw0 = this.e;
        if(ibtw0 != null) {
            v1 = ibtw0.hashCode();
        }
        return (((v + v2) * 0x1F + v3) * 0x1F + v4) * 961 + v1;
    }

    @Override
    public final String toString() {
        return "RowSecondaryIconState(commonState=" + this.a + ", startIconResource=" + this.b + ", startIconTint=" + this.c + ", endIconResource=" + this.d + ", endIconTint=null, urlLoader=" + this.e + ")";
    }
}

