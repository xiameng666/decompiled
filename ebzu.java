import j..util.Iterator.-EL;
import java.util.Iterator;

public final class ebzu implements evpo {
    public final ecag a;
    public final Iterator b;
    public final dyey c;

    public ebzu(ecag ecag0, Iterator iterator0, dyey dyey0) {
        this.a = ecag0;
        this.b = iterator0;
        this.c = dyey0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        dyof dyof1;
        dyey dyey0 = this.c;
        ecag ecag0 = this.a;
        Iterator iterator0 = this.b;
        if(evql0.n() && evql0.j() == dyog.b) {
            ebst ebst0 = ecag0.c();
            String s = ecag0.b().name;
            ibuq.e(s, "name");
            int v = ecag0.a();
            ecag0.h();
            ebst.e(ebst0, s, v, System.currentTimeMillis() - ecag0.r, 0, 24);
            dyof dyof0 = ecag0.p;
            if(dyof0 == null) {
                ibuq.j("responseBuilder");
                dyof1 = null;
            }
            else {
                dyof1 = dyof0;
            }
            dyok dyok0 = dyoj.a(((ProtoLiteMessage)dyoh.a).v_newBuilder());
            String s1 = dyey0.c;
            ibuq.e(s1, "getCid(...)");
            dyok0.b(s1);
            dyna dyna0 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
            dyok0.c(dyna0);
            Object object0 = evql0.j();
            ibuq.e(object0, "getResult(...)");
            dyok0.d(((dyog)object0));
            dyof1.a(dyok0.a());
            ecag0.g();
            return ecag0.e(iterator0);
        }
        dyog dyog0 = evql0.n() ? ((dyog)evql0.j()) : dyog.c;
        ibuq.c(dyog0);
        ebst ebst1 = ecag0.c();
        String s2 = ecag0.b().name;
        ibuq.e(s2, "name");
        int v1 = ecag0.a();
        ecag0.h();
        ebst.e(ebst1, s2, v1, System.currentTimeMillis() - ecag0.r, dyog0.a(), 16);
        dyof dyof2 = ecag0.p;
        if(dyof2 == null) {
            ibuq.j("responseBuilder");
            dyof2 = null;
        }
        dyok dyok1 = dyoj.a(((ProtoLiteMessage)dyoh.a).v_newBuilder());
        String s3 = dyey0.c;
        ibuq.e(s3, "getCid(...)");
        dyok1.b(s3);
        dyna dyna1 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
        ibuq.e(dyna1, "getSecureElementServiceProvider(...)");
        dyok1.c(dyna1);
        dyok1.d(dyog0);
        dyof2.a(dyok1.a());
        Iterator.-EL.forEachRemaining(iterator0, new ebzy(new ebzx(ecag0)));
        ecag0.g();
        return evrg.d(null);
    }
}

