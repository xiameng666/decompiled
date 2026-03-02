import android.view.View.OnClickListener;

public final class fuob {
    public final int a;
    public final View.OnClickListener b;

    public fuob(int v, View.OnClickListener view$OnClickListener0) {
        this.a = v;
        this.b = view$OnClickListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuob)) {
            return false;
        }
        return this.a == ((fuob)object0).a ? ibuq.m(this.b, ((fuob)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Action(textResId=" + this.a + ", onClickListener=" + this.b + ")";
    }
}

