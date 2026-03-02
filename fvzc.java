import j..time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class fvzc implements Runnable {
    public final fvzk a;
    public final long b;

    public fvzc(fvzk fvzk0, long v) {
        this.a = fvzk0;
        this.b = v;
    }

    @Override
    public final void run() {
        cnzv cnzv0;
        cnzx cnzx0;
        cnzt cnzt0;
        long v1;
        icvk icvk0;
        fvzk fvzk0 = this.a;
        if(!fvzk0.e) {
            fvzn fvzn0 = fvzk0.b;
            if(fvzn0.h()) {
                Map map0 = fvzn0.c();
                synchronized(fvzk0) {
                    icvk0 = fvzk0.b();
                }
                if(!map0.isEmpty() && icvk0 != null) {
                    huqn_elevationGraphOptimizerFlags huqn0 = fvzk0.i;
                    Collection collection0 = map0.values();
                    double[] arr_f = new double[collection0.size()];
                    Iterator iterator0 = collection0.iterator();
                    double f = 0.0;
                    double f1 = 0.0;
                    for(int v = 0; true; ++v) {
                        v1 = this.b;
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        double f2 = fvzm.b(huqn0, TimeUnit.MILLISECONDS.toDays(v1) - ((icvl)object0).b, ((icvl)object0).c, ((double)((icvl)object0).e));
                        f += ((double)((icvl)object0).d) * f2;
                        f1 += f2;
                        arr_f[v] = f2;
                    }
                    int v2 = 0;
                    double f3 = 0.0;
                    for(Object object1: collection0) {
                        f3 += arr_f[v2] * Math.pow(((double)((icvl)object1).d) - f / f1, 2.0);
                        ++v2;
                    }
                    float f4 = (float)Math.sqrt(f3 / f1);
                    float f5 = fvzl.a(icvk0.b);
                    fvzk0.e = true;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cnzo.a).v_newBuilder();
                    long v3 = Duration.ofMillis(v1).toDays();
                    Collection collection1 = map0.values();
                    HashMap hashMap0 = new HashMap();
                    for(Object object2: collection1) {
                        long v4 = v3 - ((icvl)object2).b;
                        if(v4 < 7L) {
                            cnzt0 = cnzt.b;
                        }
                        else {
                            cnzt0 = v4 <= 30L ? cnzt.c : cnzt.d;
                        }
                        double f6 = (double)((icvl)object2).e;
                        if((f6 < 0.1)) {
                            cnzx0 = cnzx.b;
                        }
                        else {
                            cnzx0 = f6 > 0.13 ? cnzx.d : cnzx.c;
                        }
                        int v5 = ((icvl)object2).c;
                        if(v5 < -85) {
                            cnzv0 = cnzv.d;
                        }
                        else {
                            cnzv0 = v5 <= -70 ? cnzv.c : cnzv.b;
                        }
                        gfsz gfsz0 = new gfsz(cnzt0, new gfsz(cnzx0, cnzv0));
                        if(hashMap0.containsKey(gfsz0)) {
                            hashMap0.put(gfsz0, Integer.valueOf(((int)(((Integer)hashMap0.get(gfsz0)))) + 1));
                        }
                        else {
                            hashMap0.put(gfsz0, Integer.valueOf(1));
                        }
                    }
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cnzn.a).v_newBuilder();
                    for(Object object3: hashMap0.entrySet()) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cnzr.a).v_newBuilder();
                        cnzt cnzt1 = (cnzt)((gfsz)((Map.Entry)object3).getKey()).a;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((cnzr)hftp2.b_message).e = cnzt1.e;
                        ((cnzr)hftp2.b_message).b |= 4;
                        cnzx cnzx1 = (cnzx)((gfsz)((gfsz)((Map.Entry)object3).getKey()).b).a;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((cnzr)hftp2.b_message).c = cnzx1.e;
                        ((cnzr)hftp2.b_message).b |= 1;
                        cnzv cnzv1 = (cnzv)((gfsz)((gfsz)((Map.Entry)object3).getKey()).b).b;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((cnzr)hftp2.b_message).d = cnzv1.e;
                        ((cnzr)hftp2.b_message).b |= 2;
                        int v6 = (int)(((Integer)((Map.Entry)object3).getValue()));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        cnzr cnzr0 = (cnzr)hftp2.b_message;
                        cnzr0.b |= 8;
                        cnzr0.f = v6;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cnzn cnzn0 = (cnzn)hftp1.b_message;
                        cnzr cnzr1 = (cnzr)hftp2.N_build();
                        cnzr1.getClass();
                        hfuo hfuo0 = cnzn0.c;
                        if(!hfuo0.c()) {
                            cnzn0.c = ProtoLiteMessage.E(hfuo0);
                        }
                        cnzn0.c.add(cnzr1);
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((cnzn)hftv0).b |= 1;
                    ((cnzn)hftv0).d = f5;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    cnzn cnzn1 = (cnzn)hftp1.b_message;
                    cnzn1.b |= 2;
                    cnzn1.e = f4;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cnzo cnzo0 = (cnzo)hftp0.b_message;
                    cnzn cnzn2 = (cnzn)hftp1.N_build();
                    cnzn2.getClass();
                    cnzo0.c = cnzn2;
                    cnzo0.b |= 1;
                    cnzo cnzo1 = (cnzo)hftp0.N_build();
                    cczf cczf0 = fvzk0.h;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
                    gixx gixx0 = gixx.s;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((gixy)hftp3.b_message).d = gixx0.H;
                    ((gixy)hftp3.b_message).b |= 1;
                    cnze cnze0 = (cnze)((ProtoLiteMessage)cnzg.a).v_newBuilder();
                    if(!cnze0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)cnze0).ensureMutable();
                    }
                    ((cnzg)cnze0.b_message).c = 7;
                    ((cnzg)cnze0.b_message).b |= 1;
                    cnze0.a(cnzo1);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gixy gixy0 = (gixy)hftp3.b_message;
                    cnzg cnzg0 = (cnzg)((ProtoLiteBuilder)cnze0).N_build();
                    cnzg0.getClass();
                    gixy0.v = cnzg0;
                    gixy0.b |= 0x40000;
                    ((cdgb)cczf0).j(((ProtoLiteMessage)(((gixy)hftp3.N_build()))));
                }
            }
        }
    }
}

