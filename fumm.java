import android.view.View.OnClickListener;

public final class fumm {
    public final fryv a;
    public final fryv b;
    public final View.OnClickListener c;
    private final fryv d;
    private final fryv e;
    private final boolean f;

    public fumm() {
        this(null, null, null, 0x3F);
    }

    public fumm(fryv fryv0, fryv fryv1, View.OnClickListener view$OnClickListener0, int v) {
        if((v & 1) != 0) {
            fryv0 = new fryu("");
        }
        if((v & 4) != 0) {
            fryv1 = new fryu("");
        }
        if((v & 0x20) != 0) {
            view$OnClickListener0 = null;
        }
        ibuq.f(fryv0, "title");
        ibuq.f(fryv1, "subtitle");
        super();
        this.a = fryv0;
        this.d = null;
        this.b = fryv1;
        this.e = null;
        this.f = false;
        this.c = view$OnClickListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fumm)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fumm)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fumm)object0).b)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.c, ((fumm)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 961 + this.b.hashCode();
        return this.c == null ? (v * 961 + 0x4D5) * 0x1F : (v * 961 + 0x4D5) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "RowSecondaryState(title=" + this.a + ", titleContentDescription=null, subtitle=" + this.b + ", subtitleContentDescription=null, shouldSubtitleUnderlineLink=false, onClickListener=" + this.c + ")";
    }
}

