import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class aizn implements gfsi {
    public final String a;

    public aizn(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        String s = this.a;
        for(Object object1: aizr.g(((ajbz)object0), gged_interceptors.l(s))) {
            ((String)object1).getClass();
            Map map0 = DesugarCollections.unmodifiableMap(((ajbz)hftp0.b_message).g);
            if(!map0.containsKey(((String)object1))) {
                throw new IllegalArgumentException();
            }
            ajbp ajbp0 = (ajbp)map0.get(((String)object1));
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)ajbp0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ajbp ajbp1 = (ajbp)hftp1.b_message;
            ajbp1.b |= 2;
            ajbp1.d = true;
            hftp0.bO(((String)object1), ((ajbp)hftp1.N_build()));
            continue;
        }
        for(Object object2: aizr.f(((ajbz)object0), gged_interceptors.l(s))) {
            HashMap hashMap0 = new HashMap();
            ((String)object2).getClass();
            ajbw ajbw0 = (ajbw)((ajbz)object0).e.get(((String)object2));
            if(ajbw0 == null) {
                throw new IllegalArgumentException();
            }
            for(Object object3: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                ajbr ajbr0 = (ajbr)((Map.Entry)object3).getValue();
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbr0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)ajbr0));
                ajbp ajbp2 = ajbr0.d == null ? ajbp.a : ajbr0.d;
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp2).jf(5, null);
                hftp3.X(((ProtoLiteMessage)ajbp2));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ajbp ajbp3 = (ajbp)hftp3.b_message;
                ajbp3.b |= 2;
                ajbp3.d = true;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ajbr ajbr1 = (ajbr)hftp2.b_message;
                ajbp ajbp4 = (ajbp)hftp3.N_build();
                ajbp4.getClass();
                ajbr1.d = ajbp4;
                ajbr1.b |= 2;
                ajbr ajbr2 = (ajbr)hftp2.N_build();
                hashMap0.put(((String)((Map.Entry)object3).getKey()), ajbr2);
            }
            ((String)object2).getClass();
            ajbw ajbw1 = (ajbw)((ajbz)object0).e.get(((String)object2));
            if(ajbw1 == null) {
                throw new IllegalArgumentException();
            }
            ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw1).jf(5, null);
            hftp4.X(((ProtoLiteMessage)ajbw1));
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((ajbw)hftp4.b_message).b().clear();
            hftp4.bT(hashMap0);
            hftp0.bN(((String)object2), ((ajbw)hftp4.N_build()));
            continue;
        }
        return (ajbz)hftp0.N_build();
    }
}

