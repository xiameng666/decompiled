import android.content.Context;
import j..util.DesugarCollections;
import java.util.HashMap;

public final class acld implements glzn {
    public final acln a;
    public final Context b;

    public acld(acln acln0, Context context0) {
        this.a = acln0;
        this.b = context0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((acmr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((acmr)object0))));
        HashMap hashMap0 = new HashMap(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((acmr)hftp0.b_message).b)));
        for(Object object1: hashMap0.keySet()) {
            String s = (String)object1;
            acmn acmn0 = (acmn)hashMap0.get(s);
            hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
            if(!acln.g(acmn0, hfwn0)) {
                this.a.a.b(this.b, s);
                hftp0.bn(s);
                acln.e(this.b, acmn0, hfwn0);
            }
        }
        return gmbu.i(((acmr)hftp0.N_build()));
    }
}

