import java.util.List;
import java.util.Map;

public final class ctjw implements ibts {
    public final List a;
    public final Map b;
    public final ibts c;

    public ctjw(List list0, Map map0, ibts ibts0) {
        this.a = list0;
        this.b = map0;
        this.c = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dpp dpp0 = (dpp)object0;
        ibuq.f(dpp0, "$this$LazyVerticalGrid");
        ctjz ctjz0 = new ctjz(this.a);
        gze gze0 = new gze(0xBD681FEB, true, new ctka(this.a, this.b, this.c));
        dpn dpn0 = new dpn(dpp.a, ctjz0, gze0);
        dpp0.c.b(this.a.size(), dpn0);
        return ibom.a;
    }
}

