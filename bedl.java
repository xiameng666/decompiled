import java.util.List;

public final class bedl {
    public static gged_interceptors a(List list0) {
        bedg bedg0;
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            heqb heqb0 = (heqb)object0;
            if(heqb0.q.isEmpty()) {
                String s = heqb0.d;
                bedg0 = new bedg(heqb0.g, gfsx.m(new grdf(heqb0.i)), s, gfqx.a, gqmg.b, heqb0, null);
            }
            else {
                String s1 = heqb0.g;
                String s2 = heqb0.d;
                gfsx gfsx0 = gfsx.m(heqb0.q);
                bedg0 = new bedg(s1, gfqx.a, s2, gfsx0, gqmg.a, heqb0, null);
            }
            ggdy0.i(bedg0);
        }
        return ggdy0.h();
    }
}

