import java.util.List;

public final class iti {
    public static final ibtw a(iug iug0) {
        return (ibtw)itz.a(iug0.b, itw.e);
    }

    public static final void b(iug iug0, int v, ibts ibts0) {
        iug iug1;
        gwq gwq0 = new gwq(new iug[16]);
        List list0 = iti.c(iug0);
        int v1 = gwq0.b;
    alab1:
        while(true) {
            gwq0.p(v1, list0);
            while(true) {
                int v2 = gwq0.b;
                if(v2 == 0) {
                    break alab1;
                }
                iug1 = (iug)gwq0.c(v2 - 1);
                if(!iuk.a(iug1)) {
                    ity ity0 = iug1.b;
                    if(!ity0.f(iuz.i)) {
                        ihy ihy0 = iug1.d();
                        if(ihy0 == null) {
                            hxt.b("Expected semantics node to have a coordinator.");
                            throw new ibnm();
                        }
                        jlh jlh0 = jli.b(hzl.h(ihy0));
                        if(jlh0.b < jlh0.d && jlh0.c < jlh0.e) {
                            ibtw ibtw0 = iti.a(iug1);
                            itu itu0 = (itu)itz.a(ity0, iuz.u);
                            if(ibtw0 == null || itu0 == null || !(((Number)itu0.b.a()).floatValue() > 0.0f)) {
                                break;
                            }
                            ibts0.a(new ith(iug1, v + 1, jlh0, ihy0));
                            iti.b(iug1, v + 1, ibts0);
                        }
                    }
                }
            }
            list0 = iti.c(iug1);
            v1 = gwq0.b;
            continue;
        }
    }

    private static final List c(iug iug0) {
        return iug0.k(false, false);
    }
}

