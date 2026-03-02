import android.content.Context;
import j..util.DesugarCollections;

public final class aclg implements glzn {
    public final acln a;
    public final String b;
    public final acmm c;
    public final hfwn d;
    public final String e;
    public final Context f;
    public final ProtoLiteBuilder g;

    public aclg(acln acln0, String s, acmm acmm0, hfwn hfwn0, ProtoLiteBuilder hftp0, String s1, Context context0) {
        this.a = acln0;
        this.b = s;
        this.c = acmm0;
        this.d = hfwn0;
        this.g = hftp0;
        this.e = s1;
        this.f = context0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = ((aclv)object0).a;
        String s1 = this.b;
        acln acln0 = this.a;
        Context context0 = this.f;
        ProtoLiteBuilder hftp0 = this.g;
        String s2 = this.e;
        hfwn hfwn0 = this.d;
        if(s1.equals(s)) {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
            hftp1.X(((ProtoLiteMessage)this.c));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            acmm acmm0 = (acmm)hftp1.b_message;
            hfwn0.getClass();
            acmm0.d = hfwn0;
            acmm0.b |= 2;
            hftp0.bk(s2, ((acmm)hftp1.N_build()));
            acmn acmn0 = hftp0.bj(s1);
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)acmn0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)acmn0));
            hftp0.bl(s1, acln0.i(context0, hftp2, s1, hfwn0));
            return gmbu.i(((acmr)hftp0.N_build()));
        }
        hftp0.bk(s2, acln.c(s, hfwn0));
        hftp0.bl(s, acln0.d(context0, hftp0.bi(s, acmn.a), s, ((aclv)object0).b, hfwn0));
        for(Object object1: DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((acmr)hftp0.b_message).c)).values()) {
            if(((acmm)object1).c.equals(s1)) {
                return gmbu.i(((acmr)hftp0.N_build()));
            }
        }
        hftp0.bn(s1);
        return gmbu.i(((acmr)hftp0.N_build()));
    }
}

