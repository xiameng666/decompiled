import java.util.List;

public final class igxw extends igyc {
    public final String a;

    public igxw() {
        this(null);
    }

    public igxw(String s) {
        ibuq.f(s, "text");
        super();
        this.a = s;
    }

    public igxw(byte[] arr_b) {
        this("");
    }

    @Override  // igyc
    public final List a() {
        return ibpo.b(new fssr(this.a));
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        fsvb fsvb0 = (fsvb)list0.get(0);
        String s = fsvb0.b == 5 ? ((String)fsvb0.c) : "";
        ibuq.e(s, "getString(...)");
        return new igxw(s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igxw) ? ibuq.m(this.a, ((igxw)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ShowToast(text=" + this.a + ")";
    }
}

