import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class flal {
    public static int a(List list0, int v) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((flai)list0.get(v1)).c == v) {
                return v1;
            }
        }
        return -1;
    }

    public static int b(List list0, int v) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((flaj)list0.get(v1)).c == v) {
                return v1;
            }
        }
        return -1;
    }

    public static flai c(flai flai0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)flai0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)flai0));
        long v = flai0.d + 1L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        flai flai1 = (flai)hftp0.b_message;
        flai1.b |= 2;
        flai1.d = v;
        return (flai)hftp0.N_build();
    }

    public static flaj d(int v, long v1, long v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)flaj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((flaj)hftv0).b |= 1;
        ((flaj)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((flaj)hftv1).b |= 2;
        ((flaj)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        flaj flaj0 = (flaj)hftp0.b_message;
        flaj0.b |= 4;
        flaj0.e = v2;
        return (flaj)hftp0.N_build();
    }

    public static flaj e(flaj flaj0, long v) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)flaj0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)flaj0));
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if((((flaj)hftv0).b & 2) == 0 || ((flaj)hftv0).d > v) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            flaj flaj1 = (flaj)hftp0.b_message;
            flaj1.b |= 2;
            flaj1.d = v;
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if((((flaj)hftv1).b & 4) == 0 || ((flaj)hftv1).e > v) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            flaj flaj2 = (flaj)hftp0.b_message;
            flaj2.b |= 4;
            flaj2.e = v;
        }
        return (flaj)hftp0.N_build();
    }

    public static ggfp f(flak flak0) {
        ggfn ggfn0 = new ggfn();
        for(Object object0: flak0.c) {
            flai flai0 = (flai)object0;
            if(flai0.d != flai0.e) {
                ggfn0.i(Integer.valueOf(flai0.c));
            }
        }
        return ggfn0.h();
    }

    public static Map g(flak flak0) {
        Map map0 = new HashMap();
        for(Object object0: flak0.f) {
            flaj flaj0 = (flaj)object0;
            if((flaj0.b & 2) != 0) {
                map0.put(Integer.valueOf(flaj0.c), Long.valueOf(flaj0.d));
            }
        }
        ggqj ggqj0 = flal.f(flak0).om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            Integer integer0 = (Integer)object1;
            if(!map0.containsKey(integer0)) {
                map0.put(integer0, null);
            }
        }
        return map0;
    }

    public static flai h(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)flai.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((flai)hftv0).b |= 1;
        ((flai)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((flai)hftv1).b |= 4;
        ((flai)hftv1).e = 0L;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        flai flai0 = (flai)hftp0.b_message;
        flai0.b |= 2;
        flai0.d = 1L;
        return (flai)hftp0.N_build();
    }

    public static void i(flah flah0, List list0) {
        for(int v = 0; v < ((flak)flah0.b_message).c.size(); ++v) {
            flai flai0 = flah0.a(v);
            int v1 = flal.a(list0, flai0.c);
            long v2 = v1 == -1 ? 0L : ((flai)list0.get(v1)).d;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)flai0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)flai0));
            long v3 = Math.max(v2, flai0.e);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            flai flai1 = (flai)hftp0.b_message;
            flai1.b |= 4;
            flai1.e = v3;
            if(!flah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)flah0).ensureMutable();
            }
            flak flak0 = (flak)flah0.b_message;
            flai flai2 = (flai)hftp0.N_build();
            flai2.getClass();
            flak0.b();
            flak0.c.set(v, flai2);
        }
    }
}

