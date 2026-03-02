import java.net.HttpCookie;
import java.util.List;

public final class rhq {
    private final gged_interceptors a;

    private rhq(gged_interceptors gged0) {
        this.a = gged0;
    }

    public static rhq a(List list0) {
        List list1;
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            String s = (String)object0;
            try {
                list1 = HttpCookie.parse(s);
            }
            catch(IllegalArgumentException unused_ex) {
                rib.a(("Failed to parse cookie: " + s));
                list1 = ggna.a;
            }
            ggdy0.k(list1);
        }
        return new rhq(ggdy0.h());
    }

    public final gged_interceptors b() {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.a;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            HttpCookie httpCookie0 = (HttpCookie)gged0.get(v);
            httpCookie0.setDomain(null);
            httpCookie0.setPath(null);
            httpCookie0.setPortlist(null);
            ggdy0.i(httpCookie0.toString());
        }
        return ggdy0.h();
    }
}

