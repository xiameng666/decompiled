import com.google.android.finsky.updateprompt.PlayAppFilteredError;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class acaf implements gfsi {
    public final gfsi a;
    public final AtomicReference b;
    public final long c;

    public acaf(gfsi gfsi0, AtomicReference atomicReference0, long v) {
        this.a = gfsi0;
        this.b = atomicReference0;
        this.c = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Iterator iterator3;
        hyle hyle1;
        acab acab3;
        AtomicReference atomicReference0;
        acaf acaf0 = this;
        acab acab0 = (acab)object0;
        hyle hyle0 = hyle.a;
        long v = hfyf.e(hyle0.b().i());
        long v1 = acaf0.c;
        Long long0 = Math.max(v1 - v, hfyn.b((acab0.f == null ? hfwn.a : acab0.f)));
        Object object1 = acaf0.a.apply(long0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)acab0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)acab0));
        hfwn hfwn0 = hfyn.h(v1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acab acab1 = (acab)hftp0.b_message;
        hfwn0.getClass();
        acab1.f = hfwn0;
        acab1.b |= 2;
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: DesugarCollections.unmodifiableList(((acab)hftp0.b_message).g)) {
            hfwn hfwn1 = (hfwn)object2;
            if(hfym.a(hfwn1, hfyn.m(hfyn.h(v1), hfyf.n(hyle0.b().c()))) > 0) {
                arrayList0.add(hfwn1);
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((acab)hftp0.b_message).g = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acab acab2 = (acab)hftp0.b_message;
        acab2.d();
        hfrj.E(arrayList0, acab2.g);
        if(((long)((acab)hftp0.b_message).g.size()) >= hyle0.b().d()) {
            return (acab)hftp0.N_build();
        }
        if(hfyn.b((acab0.e == null ? hfwn.a : acab0.e)) < v1) {
            return (acab)hftp0.N_build();
        }
        hfuf hfuf0 = hyle0.b().k().b;
        gged_interceptors gged0 = ggna.a;
        Iterator iterator1 = ((Map)object1).entrySet().iterator();
        long v2 = 0x8000000000000000L;
        while(true) {
            atomicReference0 = acaf0.b;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object3 = iterator1.next();
            Map.Entry map$Entry0 = (Map.Entry)object3;
            acae acae0 = (acae)map$Entry0.getKey();
            if(hfuf0.contains(Integer.valueOf(acae0.c))) {
                Map map0 = DesugarCollections.unmodifiableMap(acab0.c);
                String s = acae0.a;
                acac acac0 = (acac)map0.get(s);
                if(acac0 == null) {
                    acab3 = acab0;
                    hyle1 = hyle0;
                }
                else {
                    int v3 = acae0.b;
                    if(acac0.c == v3) {
                        ArrayList arrayList1 = new ArrayList();
                        acac acac1 = (acac)DesugarCollections.unmodifiableMap(acab0.d).get(s);
                        acab3 = acab0;
                        if(acac1 != null && acac1.c == v3) {
                            Iterator iterator2 = acac1.d.iterator();
                            while(iterator2.hasNext()) {
                                Object object4 = iterator2.next();
                                hfwn hfwn2 = (hfwn)object4;
                                if(hfym.a(hfwn2, hfyn.m(hfyn.h(v1), hfyf.n(hyle0.b().a()))) > 0) {
                                    arrayList1.add(hfwn2);
                                }
                                iterator2 = iterator2;
                                hyle0 = hyle0;
                            }
                            hyle1 = hyle0;
                            if(((long)arrayList1.size()) < hyle1.b().b()) {
                                iterator3 = ((List)map$Entry0.getValue()).iterator();
                                goto label_71;
                            }
                        }
                        else {
                            hyle1 = hyle0;
                            iterator3 = ((List)map$Entry0.getValue()).iterator();
                        label_71:
                            while(iterator3.hasNext()) {
                                Object object5 = iterator3.next();
                                hlwj hlwj0 = (hlwj)object5;
                                if(hlwj0.e > v2) {
                                    gged0 = gged_interceptors.i(arrayList1);
                                    v2 = hlwj0.e;
                                    atomicReference0.set(new PlayAppFilteredError(s, v3, v2));
                                }
                                iterator1 = iterator1;
                            }
                            acaf0 = this;
                            acab0 = acab3;
                            goto label_94;
                        }
                    }
                    else {
                        acab3 = acab0;
                        hyle1 = hyle0;
                    }
                }
            }
            else {
                acab3 = acab0;
                hyle1 = hyle0;
            }
            acaf0 = this;
            acab0 = acab3;
            iterator1 = iterator1;
        label_94:
            hyle0 = hyle1;
        }
        PlayAppFilteredError playAppFilteredError0 = (PlayAppFilteredError)atomicReference0.get();
        if(playAppFilteredError0 != null) {
            hfwn hfwn3 = hfyn.h(v1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            acab acab4 = (acab)hftp0.b_message;
            hfwn3.getClass();
            acab4.d();
            acab4.g.add(hfwn3);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acac.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            acac acac2 = (acac)hftp1.b_message;
            acac2.b();
            hfrj.E(gged0, acac2.d);
            hfwn hfwn4 = hfyn.h(v1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            acac acac3 = (acac)hftp1.b_message;
            hfwn4.getClass();
            acac3.b();
            acac3.d.add(hfwn4);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            String s1 = playAppFilteredError0.a;
            s1.getClass();
            ((acac)hftv0).b = s1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((acac)hftp1.b_message).c = playAppFilteredError0.b;
            acac acac4 = (acac)hftp1.N_build();
            s1.getClass();
            acac4.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((acab)hftp0.b_message).c().put(s1, acac4);
        }
        return (acab)hftp0.N_build();
    }
}

