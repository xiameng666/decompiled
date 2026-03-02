import java.util.List;

public final class igxo extends igyc {
    public final int a;

    public igxo() {
        this(null);
    }

    public igxo(int v) {
        this.a = v;
    }

    public igxo(byte[] arr_b) {
        this(0);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.b(new fssj(((int)this.a)));
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        int v = 0;
        fsvb fsvb0 = (fsvb)list0.get(0);
        if(fsvb0.b == 2) {
            v = (int)(((Integer)fsvb0.c));
        }
        return new igxo(v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igxo) ? this.a == ((igxo)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "FinishActivity(resultCode=" + this.a + ")";
    }
}

