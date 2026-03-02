import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import java.util.Collection;
import java.util.TreeSet;
import java.util.concurrent.Executor;

public final class bnxs {
    public static final bboh a;
    public final Context b;
    public final fqxf c;
    public final bnvm d;
    public final bnxf e;
    public final Executor f;
    private final bnla g;

    static {
        bnxs.a = bboh.b("OwnerKeyExporter", bbcu.eD);
    }

    public bnxs(Context context0, bnla bnla0, fqxf fqxf0, bnvm bnvm0, bnxf bnxf0, Executor executor0) {
        this.b = context0;
        this.g = bnla0;
        this.c = fqxf0;
        this.d = bnvm0;
        this.e = bnxf0;
        this.f = executor0;
    }

    final gmcd a(fqzn fqzn0, String s, bnxi bnxi0, SharedKey sharedKey0, Collection collection0) {
        if(!collection0.isEmpty()) {
            Object object0 = collection0.iterator().next();
            int v = gtam.b(((gtan)object0).f);
            if(v == 0) {
                v = 1;
            }
            bnxi bnxi1 = bnxi.c(v);
            if(!bnxi1.equals(bnxi0)) {
                gftb.q(((boolean)(collection0.isEmpty() ^ 1)));
                gftb.q(((boolean)(bnxi0.equals(bnxi1) ^ 1)));
                ggdy ggdy0 = new ggdy();
                TreeSet treeSet0 = new TreeSet();
                for(Object object1: collection0) {
                    int v1 = gtam.b(((gtan)object1).f);
                    if(v1 == 0) {
                        v1 = 1;
                    }
                    gftb.q(v1 == bnxi1.c);
                    String s1 = ((gtan)object1).d;
                    if(treeSet0.add(s1)) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtan.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s1.getClass();
                        ((gtan)hftv0).d = s1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gtan)hftv1).c = -1;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gtan)hftp0.b_message).e = -1;
                        ggdy0.i(((gtan)hftp0.N_build()));
                    }
                }
                ByteString hfsf0 = ByteString.copyFrom(sharedKey0.b);
                ggdy0.i(fqwd.b(fqzn0, s, bnxi0.c, sharedKey0.a, hfsf0));
                ((ggtj)((ggtj)bnxs.a.h()).ar(4582)).X("Exporting owner key #%d encrypted with domain key#%d of new domain type %s", Integer.valueOf(fqzn0.e), Integer.valueOf(sharedKey0.a), bnxi0);
                gged_interceptors gged0 = ggdy0.h();
                return gdta.g(gdta.g(this.e.b(gged0, gfqx.a)).h(new bnxq(), gmap.a).i(new bnxr(this, treeSet0, bnxi1), this.f)).h(new bnxo(), gmap.a);
            }
        }
        for(Object object2: collection0) {
            gtan gtan0 = (gtan)object2;
            if(gtan0.c == fqzn0.e && !fqwd.a(gtan0) && gtan0.d.equals(s)) {
                int v2 = sharedKey0.a;
                if(gtan0.e == v2) {
                    ((ggtj)((ggtj)bnxs.a.h()).ar(4584)).F("An export of owner key #%d encrypted with the latest domain key (#%d) already exists", fqzn0.e, v2);
                    return gmbu.i(gfqx.a);
                }
            }
        }
        ((ggtj)((ggtj)bnxs.a.h()).ar(4583)).F("Exporting owner key #%d encrypted with domain key#%d", fqzn0.e, sharedKey0.a);
        ByteString hfsf1 = ByteString.copyFrom(sharedKey0.b);
        gged_interceptors gged1 = gged_interceptors.l(fqwd.b(fqzn0, s, bnxi0.c, sharedKey0.a, hfsf1));
        gdta gdta0 = gdta.g(this.g.m(gged1));
        bnxm bnxm0 = new bnxm(this);
        return gdta.g(gdta0.f(bnlq.class, bnxm0, this.f).i(new bnxn(this), this.f)).h(new bnxo(), gmap.a);
    }
}

