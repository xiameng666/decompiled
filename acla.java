import android.content.Context;
import j..util.DesugarCollections;
import java.util.ArrayList;

public final class acla implements glzn {
    public final acln a;
    public final String b;
    public final Context c;
    public final acma d;

    public acla(acln acln0, String s, Context context0, acma acma0) {
        this.a = acln0;
        this.b = s;
        this.c = context0;
        this.d = acma0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((acmr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((acmr)object0))));
        String s = this.b;
        acmm acmm0 = hftp0.bh(s, acmm.a);
        if((acmm0.b & 1) != 0) {
            hftp0.bm(s);
            String s1 = acmm0.c;
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((acmr)hftp0.b_message).c)).keySet()) {
                arrayList0.add(this.d.a(((String)object1)));
            }
            return gmbu.a(arrayList0).a(new aclc(this.a, arrayList0, s1, hftp0, this.c), this.a.b);
        }
        return gmbu.i(((acmr)object0));
    }
}

