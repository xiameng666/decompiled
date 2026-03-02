import j..util.DesugarCollections;
import java.security.SecureRandom;
import java.util.Set;

public final class bxxm implements ibts {
    public final String a;
    public final String b;
    public final bxxw c;

    public bxxm(String s, String s1, bxxw bxxw0) {
        this.a = s;
        this.b = s1;
        this.c = bxxw0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Integer integer0;
        if(((byfr)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s = this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((byfr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((byfr)object0))));
        byft byft0 = byfs.a(hftp0);
        byfo byfo0 = (byfo)DesugarCollections.unmodifiableMap(((byfr)object0).b).get(s);
        if(byfo0 == null) {
            byfx byfx0 = byfw.a(((ProtoLiteMessage)byfo.a).v_newBuilder());
            byfx0.c(this.b);
            byfo0 = byfx0.a();
        }
        bxxw bxxw0 = this.c;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)byfo0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)byfo0));
        byfx byfx1 = byfw.a(hftp1);
        hfxv hfxv0 = byfx1.b();
        String s1 = bxxw0.b;
        byfl byfl0 = (byfl)hfxv0.get(s1);
        if(byfl0 == null) {
            byfl0 = byfu.a(((ProtoLiteMessage)byfl.a).v_newBuilder()).a();
        }
        byfx1.b();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)byfl0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)byfl0));
        byfv byfv0 = byfu.a(hftp2);
        Set set0 = byfv0.b().c();
        SecureRandom secureRandom0 = bxxv.a;
        int v;
        for(v = secureRandom0.nextInt(); true; v = secureRandom0.nextInt()) {
            integer0 = v;
            if(!set0.contains(integer0)) {
                break;
            }
        }
        byfv0.b();
        byfz byfz0 = byfy.a(((ProtoLiteMessage)byfq.a).v_newBuilder());
        byfz0.b(ByteString.copyFrom(bxxw0.d));
        byfz0.d(ByteString.copyFrom(bxxw0.e));
        byfz0.c(bxxw0.f);
        byfq byfq0 = byfz0.a();
        ibuq.f(byfq0, "value");
        ProtoLiteBuilder hftp3 = byfv0.a;
        byfq0.getClass();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((byfl)hftp3.b_message).b().put(integer0, byfq0);
        for(Object object1: bxxw0.c) {
            byfv0.c();
            ibuq.f(((String)object1), "key");
            ((String)object1).getClass();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((byfl)hftp3.b_message).c().put(((String)object1), Integer.valueOf(v));
        }
        Set set1 = ibpo.ay(byfv0.c().a());
        for(Object object2: ibpo.ay(byfv0.b().c())) {
            int v1 = ((Number)object2).intValue();
            if(!set1.contains(Integer.valueOf(v1))) {
                byfv0.b();
                byfv0.d(v1);
            }
        }
        byfx1.e(s1, byfv0.a());
        byfo byfo1 = byfx1.a();
        byft0.b();
        byft0.c(s, byfo1);
        return byft0.a();
    }
}

