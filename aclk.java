import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class aclk implements glzn {
    public final acln a;
    public final String b;
    public final Context c;
    public final gmcd d;

    public aclk(acln acln0, String s, Context context0, gmcd gmcd0) {
        this.a = acln0;
        this.b = s;
        this.c = context0;
        this.d = gmcd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        String s = this.b;
        acmm acmm0 = acmm.a;
        s.getClass();
        acmm acmm1 = (acmm)((acmr)object0).c.get(s);
        if(acmm1 != null) {
            acmm0 = acmm1;
        }
        if((acmm0.b & 1) != 0 && acln.f(acmm0, hfwn0)) {
            String s1 = acmm0.c;
            s1.getClass();
            acmn acmn0 = (acmn)((acmr)object0).b.get(s1);
            if(acmn0 == null) {
                throw new IllegalArgumentException();
            }
            if(acln.g(acmn0, hfwn0) && acln.h(acmn0, hfwn0)) {
                s.getClass();
                acmm acmm2 = (acmm)((acmr)object0).c.get(s);
                if(acmm2 == null) {
                    throw new IllegalArgumentException();
                }
                String s2 = acmm2.c;
                s2.getClass();
                acmn acmn1 = (acmn)((acmr)object0).b.get(s2);
                if(acmn1 != null) {
                    return gmbu.i(acln.a(acmn1));
                }
                throw new IllegalArgumentException();
            }
        }
        AtomicReference atomicReference0 = new AtomicReference();
        ackz ackz0 = new ackz(this.a, this.c, s, this.d, atomicReference0);
        return glzd.f(this.a.c.c(ackz0, this.a.b), new acle(atomicReference0), this.a.b);
    }
}

