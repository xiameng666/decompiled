import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public final class gqls {
    static final Comparator a;
    public String b;
    public static final int c;
    private final ArrayList d;
    private hhyo e;
    private ggdy f;
    private gged_interceptors g;

    static {
        gqls.a = ggmo.g(new gqlq()).f(new gqlr());
    }

    public gqls() {
        this.d = new ArrayList();
    }

    public gqls(gqlt gqlt0) {
        this.b = gqlt0.a;
        this.e = gqlt0.b;
        this.g = gqlt0.c;
    }

    public final gqlt a() {
        ArrayList arrayList0 = this.d;
        Collections.sort(arrayList0, gqls.a);
        if(this.f == null) {
            if(this.g == null) {
                this.f = new ggdy();
            }
            else {
                ggdy ggdy0 = new ggdy();
                this.f = ggdy0;
                ggdy0.k(this.g);
                this.g = null;
            }
        }
        this.f.k(arrayList0);
        ggdy ggdy1 = this.f;
        if(ggdy1 != null) {
            this.g = ggdy1.h();
        }
        else if(this.g == null) {
            this.g = ggna.a;
        }
        String s = this.b;
        if(s != null) {
            hhyo hhyo0 = this.e;
            if(hhyo0 != null) {
                return new gqlt(s, hhyo0, this.g);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" id");
        }
        if(this.e == null) {
            stringBuilder0.append(" groupBrandingInfo");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(Collection collection0) {
        this.d.addAll(collection0);
    }

    public final void c(hhyo hhyo0) {
        if(hhyo0 == null) {
            throw new NullPointerException("Null groupBrandingInfo");
        }
        this.e = hhyo0;
    }
}

