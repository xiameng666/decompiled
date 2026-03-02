import android.content.Context;
import java.lang.ref.WeakReference;

final class epoc extends ibsl implements ibtw {
    int a;
    final epng b;

    public epoc(epng epng0, ibrl ibrl0) {
        this.b = epng0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epoc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epoc(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        clbs clbs0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        epng epng0 = this.b;
        this.a = 1;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        epom epom0 = epom.a;
        synchronized(epom0) {
            Context context0 = epom.b;
            ibuq.e(context0, "access$getContext$p(...)");
            synchronized(epom0) {
                clbs0 = (clbs)epom.c.get();
                if(clbs0 == null) {
                    clbs0 = clbv.a(context0);
                    epom.c = new WeakReference(clbs0);
                }
                ibuq.c(clbs0);
            }
        }
        clbc clbc0 = new clbc(null);
        clbc0.b("https://maps.googleapis.com/maps/api/place/details/json");
        clbd clbd0 = new clbd(clbc0);
        clba clba0 = new clba(null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ephr.a).v_newBuilder();
        String s = hydq.a.b().a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ephr ephr0 = (ephr)hftp0.b_message;
        hfuo hfuo0 = ephr0.b;
        if(!hfuo0.c()) {
            ephr0.b = ProtoLiteMessage.E(hfuo0);
        }
        ephr0.b.add(s);
        String s1 = epng0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ephr ephr1 = (ephr)hftp0.b_message;
        s1.getClass();
        hfuo hfuo1 = ephr1.c;
        if(!hfuo1.c()) {
            ephr1.c = ProtoLiteMessage.E(hfuo1);
        }
        ephr1.c.add(s1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ephr ephr2 = (ephr)hftp0.b_message;
        hfuo hfuo2 = ephr2.e;
        if(!hfuo2.c()) {
            ephr2.e = ProtoLiteMessage.E(hfuo2);
        }
        ephr2.e.add("geometry/location");
        clba0.c(((MessageLite)hftp0.N_build()), ckvo.c, ephs.a);
        icbk0.d(new epod(clbs0.e(clcg.b(clbd0, new cldm(clba0), ckvo.b), new epnc(icbk0), new bblp(1, 9), -1, 0x10C01).e().a()));
        Object object2 = icbk0.k();
        if(object2 == ibrx.a) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

