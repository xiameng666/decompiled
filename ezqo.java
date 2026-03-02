import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ezqo {
    public static final String a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final fiyl d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;

    static {
        ezqo.a = hlrf.b.e;
    }

    public ezqo(gful_cronetEngineProvider gful0, fiyl fiyl0, gful_cronetEngineProvider gful1, gful_cronetEngineProvider gful2, gful_cronetEngineProvider gful3) {
        this.b = gfus.a(gful0);
        this.d = fiyl0;
        this.c = gful1;
        this.e = gful2;
        this.f = gful3;
    }

    public static hffg a(List list0, List list1) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((String)object0), Integer.valueOf(1));
        }
        Iterator iterator1 = list1.iterator();
        while(true) {
            int v = 2;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            if(hashMap0.containsKey(((String)object1))) {
                v = 3;
            }
            hashMap0.put(((String)object1), Integer.valueOf(v));
        }
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for(Object object2: hashMap0.keySet()) {
            switch(((int)(((Integer)hashMap0.get(((String)object2)))))) {
                case 1: {
                    ++v1;
                    break;
                }
                case 2: {
                    ++v2;
                    break;
                }
                default: {
                    ++v3;
                }
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hffg)hftv0).b |= 2;
        ((hffg)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hffg)hftv1).b |= 4;
        ((hffg)hftv1).e = v2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffg hffg0 = (hffg)hftp0.b_message;
        hffg0.b |= 1;
        hffg0.c = v3;
        return (hffg)hftp0.N_build();
    }

    public final void b(hfge hfge0) {
        if(hzdj.r()) {
            cioq cioq0 = cioq.v();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            hffn hffn0 = hffn.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj0 = (hfgj)hftp0.b_message;
            hffn0.getClass();
            hfgj0.d = hffn0;
            hfgj0.c = 3;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfgc hfgc0 = (hfgc)hftp1.b_message;
            hfgc0.b |= 1;
            hfgc0.c = "com.google.android.gms#udc-facs";
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp0.b_message;
            hfgc hfgc1 = (hfgc)hftp1.N_build();
            hfgc1.getClass();
            hfgj1.f = hfgc1;
            hfgj1.b |= 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfgj hfgj2 = (hfgj)hftp0.b_message;
            hfge0.getClass();
            hfgj2.g = hfge0;
            hfgj2.b |= 4;
            cczb cczb0 = cioq0.c(((ProtoLiteMessage)(((hfgj)hftp0.N_build()))));
            cczb0.c = (int)1000;
            cczb0.a();
            return;
        }
        long v = (long)(((Long)this.c.mr()));
        if(this.d.a(v)) {
            ayud ayud0 = (ayud)this.b.mr();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfgj hfgj3 = (hfgj)hftp2.b_message;
            hfgj3.b |= 1;
            hfgj3.e = (int)v;
            hffn hffn1 = hffn.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfgj hfgj4 = (hfgj)hftp2.b_message;
            hffn1.getClass();
            hfgj4.d = hffn1;
            hfgj4.c = 3;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hfgc hfgc2 = (hfgc)hftp3.b_message;
            hfgc2.b |= 1;
            hfgc2.c = "com.google.android.gms#udc-facs";
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfgj hfgj5 = (hfgj)hftp2.b_message;
            hfgc hfgc3 = (hfgc)hftp3.N_build();
            hfgc3.getClass();
            hfgj5.f = hfgc3;
            hfgj5.b |= 2;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfgj hfgj6 = (hfgj)hftp2.b_message;
            hfge0.getClass();
            hfgj6.g = hfge0;
            hfgj6.b |= 4;
            ayuc ayuc0 = ayud0.i(((MessageLite)hftp2.N_build()));
            ayuc0.k(1000);
            ayuc0.d();
        }
    }

    public final void c(hfgi hfgi0, boolean z, boolean z1, boolean z2) {
        long v = (long)(((Long)this.c.mr()));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfgi0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hfgi0));
        if(z) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfgh.a).v_newBuilder();
            hfgq hfgq0 = hfgq.i;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hfgh)hftp1.b_message).c = hfgq0.l;
            ((hfgh)hftp1.b_message).b |= 1;
            ((hfgf)hftp0).a(hftp1);
        }
        if(z1) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfgh.a).v_newBuilder();
            hfgq hfgq1 = hfgq.b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hfgh)hftp2.b_message).c = hfgq1.l;
            ((hfgh)hftp2.b_message).b |= 1;
            ((hfgf)hftp0).a(hftp2);
        }
        if(z2) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgh.a).v_newBuilder();
            hfgq hfgq2 = hfgq.j;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hfgh)hftp3.b_message).c = hfgq2.l;
            ((hfgh)hftp3.b_message).b |= 1;
            ((hfgf)hftp0).a(hftp3);
        }
        if(hzdj.r()) {
            cioq cioq0 = cioq.v();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            hffn hffn0 = hffn.a;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hfgj hfgj0 = (hfgj)hftp4.b_message;
            hffn0.getClass();
            hfgj0.d = hffn0;
            hfgj0.c = 3;
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hfgc hfgc0 = (hfgc)hftp5.b_message;
            hfgc0.b |= 1;
            hfgc0.c = "com.google.android.gms#udc-facs";
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp4.b_message;
            hfgc hfgc1 = (hfgc)hftp5.N_build();
            hfgc1.getClass();
            hfgj1.f = hfgc1;
            hfgj1.b |= 2;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hfgj hfgj2 = (hfgj)hftp4.b_message;
            hfgi hfgi1 = (hfgi)((ProtoLiteBuilder)(((hfgf)hftp0))).N_build();
            hfgi1.getClass();
            hfgj2.h = hfgi1;
            hfgj2.b |= 8;
            cczb cczb0 = cioq0.c(((ProtoLiteMessage)(((hfgj)hftp4.N_build()))));
            cczb0.c = (int)1001;
            cczb0.a();
            return;
        }
        if(this.d.a(v)) {
            ayud ayud0 = (ayud)this.b.mr();
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hfgj hfgj3 = (hfgj)hftp6.b_message;
            hfgj3.b |= 1;
            hfgj3.e = (int)v;
            hffn hffn1 = hffn.a;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hfgj hfgj4 = (hfgj)hftp6.b_message;
            hffn1.getClass();
            hfgj4.d = hffn1;
            hfgj4.c = 3;
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            hfgc hfgc2 = (hfgc)hftp7.b_message;
            hfgc2.b |= 1;
            hfgc2.c = "com.google.android.gms#udc-facs";
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hfgj hfgj5 = (hfgj)hftp6.b_message;
            hfgc hfgc3 = (hfgc)hftp7.N_build();
            hfgc3.getClass();
            hfgj5.f = hfgc3;
            hfgj5.b |= 2;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hfgj hfgj6 = (hfgj)hftp6.b_message;
            hfgi hfgi2 = (hfgi)((ProtoLiteBuilder)(((hfgf)hftp0))).N_build();
            hfgi2.getClass();
            hfgj6.h = hfgi2;
            hfgj6.b |= 8;
            ayuc ayuc0 = ayud0.i(((MessageLite)hftp6.N_build()));
            ayuc0.k(1001);
            ayuc0.d();
        }
    }

    public final boolean d() {
        long v = (long)(((Long)this.e.mr()));
        return this.d.a(v);
    }
}

