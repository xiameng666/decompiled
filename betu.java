import j..util.DesugarCollections;
import java.util.Map;

public final class betu extends ibsl implements ibtw {
    Object a;
    final String b;

    public betu(String s, ibrl ibrl0) {
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((betu)this.c(((bgov)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new betu(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        bgov bgov0 = (bgov)this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bgov0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bgov0));
        bgox bgox0 = bgow.a(hftp0);
        ProtoLiteBuilder hftp1 = bgox0.a;
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((bgov)hftp1.b_message).d));
        ibuq.e(map0, "getAccountUsedPasswordSharingMap(...)");
        new hfxv(map0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bgov bgov1 = (bgov)hftp1.b_message;
        hfvh hfvh0 = bgov1.d;
        if(!hfvh0.b) {
            bgov1.d = hfvh0.a();
        }
        bgov1.d.put(this.b, Boolean.valueOf(true));
        return bgox0.a();
    }
}

