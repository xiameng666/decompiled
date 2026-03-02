import java.util.List;
import java.util.Map;

public final class igxy extends igyc {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public static final int e;

    public igxy() {
        this(null);
    }

    public igxy(String s, String s1, String s2, Map map0) {
        ibuq.f(s1, "packageName");
        ibuq.f(s2, "activityName");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = map0;
    }

    public igxy(byte[] arr_b) {
        this(null, "", "", ibpt.a);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{new fssr(this.a), new fssr(this.b), new fssr(this.c), new fssp(this.d)});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        String s = (String)fssm.h(((fsvb)list0.get(0)), new igxx());
        fsvb fsvb0 = (fsvb)list0.get(1);
        String s1 = "";
        String s2 = fsvb0.b == 5 ? ((String)fsvb0.c) : "";
        ibuq.e(s2, "getString(...)");
        fsvb fsvb1 = (fsvb)list0.get(2);
        if(fsvb1.b == 5) {
            s1 = (String)fsvb1.c;
        }
        ibuq.e(s1, "getString(...)");
        return new igxy(s, s2, s1, fsso.b(((fsvb)list0.get(3))));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igxy)) {
            return false;
        }
        if(!ibuq.m(this.a, ((igxy)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((igxy)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((igxy)object0).c) ? ibuq.m(this.d, ((igxy)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? (this.b.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "StartActivity(action=" + this.a + ", packageName=" + this.b + ", activityName=" + this.c + ", extras=" + this.d + ")";
    }
}

