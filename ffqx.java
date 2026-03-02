import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

final class ffqx extends ibsl implements ibtw {
    Object a;
    final ffqz b;

    public ffqx(ffqz ffqz0, ibrl ibrl0) {
        this.b = ffqz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ffqx)this.c(((ctef)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ffqx(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibns ibns0;
        ctdz ctdz0;
        ibnx.b(object0);
        ctef ctef0 = (ctef)this.a;
        switch(ctef0.f) {
            case 0: {
                ctdz0 = ctdz.a;
                break;
            }
            case 1: {
                ctdz0 = ctdz.b;
                break;
            }
            case 2: {
                ctdz0 = ctdz.c;
                break;
            }
            default: {
                ctdz0 = null;
            }
        }
        if(ctdz0 == null) {
            ctdz0 = ctdz.d;
        }
        ctdz ctdz1 = ctdz.c;
        if(ctdz0 == ctdz1) {
            ibns0 = new ibns(null, ibpt.a);
        }
        else {
            ((ggtj)ffqz.a.h()).x("Running data migration for XdFeature parent setting -> categories");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            if(!ffqz.a(ctef0, 3)) {
                if(ffqz.a(ctef0, 4)) {
                    linkedHashMap0.put(Integer.valueOf(4), Boolean.valueOf(false));
                }
                if(ffqz.a(ctef0, 5)) {
                    linkedHashMap0.put(Integer.valueOf(5), Boolean.valueOf(false));
                }
            }
            ibns0 = new ibns(ctdz1, linkedHashMap0);
        }
        ctdz ctdz2 = (ctdz)ibns0.a;
        Map map0 = (Map)ibns0.b;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ctef0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ctef0));
        cteh cteh0 = cteg.a(hftp0);
        if(!map0.isEmpty()) {
            for(Object object1: map0.entrySet()) {
                int v = ((Number)((Map.Entry)object1).getKey()).intValue();
                boolean z = ((Boolean)((Map.Entry)object1).getValue()).booleanValue();
                cteh0.h();
                cteh0.f(v, (z ? cteb.b : cteb.c));
            }
        }
        if(ctdz2 != null) {
            ProtoLiteBuilder hftp1 = cteh0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ctef ctef1 = (ctef)hftp1.b_message;
            ctef1.f = ctdz2.a();
        }
        return cteh0.a();
    }
}

