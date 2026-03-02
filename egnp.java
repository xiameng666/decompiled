import android.text.TextUtils;
import j..util.Objects;

public final class egnp {
    public final egnt a;
    public final int b;
    public final String c;
    public final String d;

    public egnp(egnt egnt0, int v, String s, String s1) {
        gftb.b(((boolean)(TextUtils.isEmpty(s1) ^ 1)), "Non-empty phone is required");
        this.a = egnt0;
        this.b = v;
        this.c = s;
        this.d = s1;
    }

    final boolean a() {
        return !TextUtils.isEmpty(this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof egnp) ? this.b == ((egnp)object0).b && Objects.equals(this.a, ((egnp)object0).a) && Objects.equals(this.c, ((egnp)object0).c) && Objects.equals(this.d, ((egnp)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b), this.c, this.d});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("simEfKey", this.a);
        gfsv0.f("recordNumber", this.b);
        gfsv0.add("name", this.c);
        gfsv0.add("phone", this.d);
        return gfsv0.toString();
    }
}

