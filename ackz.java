import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class ackz implements glzn {
    public final acln a;
    public final Context b;
    public final String c;
    public final gmcd d;
    public final AtomicReference e;

    public ackz(acln acln0, Context context0, String s, gmcd gmcd0, AtomicReference atomicReference0) {
        this.a = acln0;
        this.b = context0;
        this.c = s;
        this.d = gmcd0;
        this.e = atomicReference0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((acmr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((acmr)object0))));
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        String s = this.c;
        acmm acmm0 = hftp0.bh(s, acmm.a);
        gmcd gmcd0 = this.d;
        acln acln0 = this.a;
        Context context0 = this.b;
        if((acmm0.b & 1) != 0) {
            String s1 = acmm0.c;
            if(acln.f(acmm0, hfwn0)) {
                acmn acmn0 = hftp0.bj(s1);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)acmn0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)acmn0));
                hftp0.bl(s1, acln0.i(context0, hftp1, s1, hfwn0));
                return glzd.f(gmbu.i(((acmr)hftp0.N_build())), new aclj(s, this.e), acln0.b);
            }
            return glzd.f(glzd.g(glzd.g(gmbt.h(gmcd0), new aclf(s), acln0.b), new aclg(acln0, s1, acmm0, hfwn0, hftp0, s, context0), acln0.b), new aclj(s, this.e), acln0.b);
        }
        return glzd.f(glzd.g(glzd.g(gmbt.h(gmcd0), new aclh(s), acln0.b), new acli(acln0, hfwn0, hftp0, s, context0), acln0.b), new aclj(s, this.e), acln0.b);
    }
}

