import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class bpjq implements gfsi {
    public final bpkl a;
    public final fqzf b;
    public final Set c;

    public bpjq(bpkl bpkl0, fqzf fqzf0, Set set0) {
        this.a = bpkl0;
        this.b = fqzf0;
        this.c = set0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggek ggek0;
        long v1;
        bpkl bpkl0 = this.a;
        Object object1 = bpkl0.k;
        fqzf fqzf0 = this.b;
        synchronized(object1) {
            v1 = bpkl0.h.a();
            bpkl0.f(v1);
            HashMap hashMap0 = new HashMap();
            Iterator iterator0 = this.c.iterator();
            Iterator iterator1 = ((List)object0).iterator();
            while(iterator0.hasNext() && iterator1.hasNext()) {
                Object object2 = iterator0.next();
                bpkj bpkj0 = (bpkj)object2;
                Object object3 = iterator1.next();
                gtae gtae0 = (gtae)object3;
                if(gtae0 != null) {
                    gfsx gfsx0 = bpkj0.f;
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)hashMap0.get(gfsx0);
                    if(hftp0 == null) {
                        hftp0 = ((ProtoLiteMessage)gtcd.a).v_newBuilder();
                        gtcf gtcf0 = bpkl0.j;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gtcd gtcd0 = (gtcd)hftp0.b_message;
                        gtcf0.getClass();
                        gtcd0.d = gtcf0;
                        gtcd0.b |= 1;
                        if(!gfsx0.i()) {
                            long v2 = fqzf0.c;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((gtcd)hftv0).e = v2;
                            long v3 = fqzf0.d;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gtcd)hftp0.b_message).f = v3;
                        }
                        hashMap0.put(gfsx0, hftp0);
                    }
                    bpko bpko0 = bpkj0.d;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtbt.a).v_newBuilder();
                    gtch gtch0 = bpkj0.e;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    gtch0.getClass();
                    ((gtbt)hftv1).c = gtch0;
                    ((gtbt)hftv1).b |= 1;
                    boolean z = bpko0.j;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gtbt)hftp1.b_message).e = z;
                    gfsx gfsx1 = bpko0.d.g;
                    if(gfsx1.i()) {
                        int v4 = ((fquo)gfsx1.d()).a();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gtbt gtbt0 = (gtbt)hftp1.b_message;
                        gtbt0.b |= 2;
                        gtbt0.d = v4;
                    }
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtbu.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gtbu gtbu0 = (gtbu)hftp2.b_message;
                    gtbt gtbt1 = (gtbt)hftp1.N_build();
                    gtbt1.getClass();
                    hfuo hfuo0 = gtbu0.c;
                    if(!hfuo0.c()) {
                        gtbu0.c = ProtoLiteMessage.E(hfuo0);
                    }
                    gtbu0.c.add(gtbt1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gtbu)hftp2.b_message).e = gtae0;
                    ((gtbu)hftp2.b_message).b |= 2;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
                    long v5 = bpko0.g;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((hfwn)hftp3.b_message).b = v5;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gtbu gtbu1 = (gtbu)hftp2.b_message;
                    hfwn hfwn0 = (hfwn)hftp3.N_build();
                    hfwn0.getClass();
                    gtbu1.d = hfwn0;
                    gtbu1.b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtcd gtcd1 = (gtcd)hftp0.b_message;
                    gtbu gtbu2 = (gtbu)hftp2.N_build();
                    gtbu2.getClass();
                    hfuo hfuo1 = gtcd1.c;
                    if(!hfuo1.c()) {
                        gtcd1.c = ProtoLiteMessage.E(hfuo1);
                    }
                    gtcd1.c.add(gtbu2);
                }
            }
            if(hsxl.i()) {
                bpkl0.d = gfsx.m(Long.valueOf(v1));
            }
            else {
                bpkl0.g(v1);
            }
            if(!hashMap0.isEmpty()) {
                bpkl0.f.c();
            }
            ggek0 = new ggek();
            for(Object object4: hashMap0.entrySet()) {
                ggek0.i(((gfsx)((Map.Entry)object4).getKey()), ((gtcd)((ProtoLiteBuilder)((Map.Entry)object4).getValue()).N_build()));
            }
        }
        return new bpjn(ggek0.b(), v1);
    }
}

