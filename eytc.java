import android.view.View.OnClickListener;

final class eytc {
    public final int a;
    public final View.OnClickListener b;

    public eytc(int v, View.OnClickListener view$OnClickListener0) {
        this.a = v;
        this.b = view$OnClickListener0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eytc)) {
            return false;
        }
        return this.a == ((eytc)object0).a ? ibuq.m(this.b, ((eytc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ButtonArgs(labelResId=" + this.a + ", listener=" + this.b + ")";
    }
}

