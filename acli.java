import android.content.Context;

public final class acli implements glzn {
    public final acln a;
    public final hfwn b;
    public final String c;
    public final Context d;
    public final ProtoLiteBuilder e;

    public acli(acln acln0, hfwn hfwn0, ProtoLiteBuilder hftp0, String s, Context context0) {
        this.a = acln0;
        this.b = hfwn0;
        this.e = hftp0;
        this.c = s;
        this.d = context0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        aclv aclv0 = (aclv)object0;
        acmm acmm0 = acln.c(aclv0.a, this.b);
        this.e.bk(this.c, acmm0);
        acmn acmn0 = this.e.bi(aclv0.a, acmn.a);
        acmn acmn1 = this.a.d(this.d, acmn0, aclv0.a, aclv0.b, this.b);
        this.e.bl(aclv0.a, acmn1);
        return gmbu.i(((acmr)this.e.N_build()));
    }
}

