import android.view.View.OnClickListener;

public final class ftrz {
    public final CharSequence a;
    public final View.OnClickListener b;

    public ftrz(CharSequence charSequence0, View.OnClickListener view$OnClickListener0) {
        ibuq.f(charSequence0, "text");
        ibuq.f(view$OnClickListener0, "onClickListener");
        super();
        this.a = charSequence0;
        this.b = view$OnClickListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftrz)) {
            return false;
        }
        return ibuq.m(this.a, ((ftrz)object0).a) ? ibuq.m(this.b, ((ftrz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Action(text=" + this.a + ", onClickListener=" + this.b + ")";
    }
}

