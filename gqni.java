import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class gqni implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z1;
        ProtoLiteBuilder hftp0;
        int v;
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = ((ggch)object0).iterator();
        while(true) {
            v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            for(Object object2: ((hhyh)object1).c) {
                hhyf hhyf0 = (hhyf)object2;
                gqlo gqlo0 = gqlo.c(hhyf0);
                if(hashMap0.containsKey(gqlo0)) {
                    hftp0 = (ProtoLiteBuilder)hashMap0.get(gqlo0);
                }
                else {
                    hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hhyf0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hhyf0));
                    String s = gqlo0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hhyf hhyf1 = (hhyf)hftp0.b_message;
                    hhyf1.b |= 1;
                    hhyf1.c = s;
                }
                boolean z = (((hhyf)hftp0.b_message).b & 2) == 0 && (hhyf0.b & 2) != 0;
                if(((hhyf0.d == null ? hhyd.a : hhyf0.d).b & 4) == 0) {
                    hhyd hhyd0 = ((hhyf)hftp0.b_message).d;
                    if(hhyd0 == null) {
                        hhyd0 = hhyd.a;
                    }
                    if((hhyd0.b & 4) != 0) {
                        z1 = true;
                        goto label_30;
                    }
                }
                z1 = false;
            label_30:
                if(z || z1) {
                    hhyd hhyd1 = hhyf0.d == null ? hhyd.a : hhyf0.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hhyf hhyf2 = (hhyf)hftp0.b_message;
                    hhyd1.getClass();
                    hhyf2.d = hhyd1;
                    hhyf2.b |= 2;
                }
                if((((hhyf)hftp0.b_message).b & 4) == 0 && (hhyf0.b & 4) != 0) {
                    String s1 = hhyf0.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hhyf hhyf3 = (hhyf)hftp0.b_message;
                    s1.getClass();
                    hhyf3.b |= 4;
                    hhyf3.e = s1;
                }
                hashMap0.put(gqlo0, hftp0);
            }
        }
        hhyg hhyg0 = (hhyg)((ProtoLiteMessage)hhyh.a).v_newBuilder();
        for(Object object3: hashMap0.values()) {
            hhyg0.k(((hhyf)((ProtoLiteBuilder)object3).N_build()));
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object4: ((ggch)object0)) {
            arrayList0.add(((hhyh)object4));
        }
        Collections.sort(arrayList0, new gqnr());
        int v1 = arrayList0.size();
        while(v < v1) {
            hhyh hhyh0 = (hhyh)arrayList0.get(v);
            ++v;
            if((hhyh0.b & 1) != 0) {
                hhyo hhyo0 = hhyh0.d == null ? hhyo.a : hhyh0.d;
                if(!hhyg0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhyg0).ensureMutable();
                }
                hhyh hhyh1 = (hhyh)hhyg0.b_message;
                hhyo0.getClass();
                hhyh1.d = hhyo0;
                hhyh1.b |= 1;
                return (hhyh)((ProtoLiteBuilder)hhyg0).N_build();
            }
        }
        return (hhyh)((ProtoLiteBuilder)hhyg0).N_build();
    }
}

