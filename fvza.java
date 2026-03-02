import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import j..time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class fvza implements Runnable {
    public final fvzk a;
    public final long b;
    public final Collection c;
    public final long d;

    public fvza(fvzk fvzk0, long v, Collection collection0, long v1) {
        this.a = fvzk0;
        this.b = v;
        this.c = collection0;
        this.d = v1;
    }

    @Override
    public final void run() {
        icvk icvk2;
        fvzh fvzh1;
        fvzh fvzh0;
        gfsz gfsz0;
        icvl icvl1;
        fvzk fvzk0 = this.a;
        fvzn fvzn0 = fvzk0.b;
        if(!fvzn0.h()) {
            synchronized(fvzk0) {
                fvzk0.a = null;
            }
            return;
        }
        long v = this.d;
        Collection collection0 = this.c;
        long v1 = Duration.ofMillis(v).toDays();
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = collection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fvzg fvzg0 = (fvzg)object0;
            ggqk ggqk0 = ((gged_interceptors)fvzg0.d).E();
            while(ggqk0.hasNext()) {
                Object object1 = ggqk0.next();
                int v2 = fvzn0.a(((fvzf)object1).a);
                float f = fvzg0.c;
                Integer integer0 = v2;
                icvl icvl0 = (icvl)hashMap0.get(integer0);
                Integer integer1 = integer0;
                double f1 = fvzm.b(fvzk0.i, 0L, ((fvzf)object1).b, ((double)f));
                fvzf fvzf0 = (fvzf)object1;
                int v3 = ((fvzf)object1).b;
                if(fvzl.e(fvzk0.i, f1, icvl0, v1)) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icvl.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((icvl)hftv0).b = v1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((icvl)hftp0.b_message).c = v3;
                    double f2 = fvzg0.a - ((double)fvzg0.b) * Math.exp(fvzf0.c * -0.283412 / 2437.342857);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((icvl)hftv1).d = (float)f2;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((icvl)hftp0.b_message).e = f;
                    hashMap0.put(integer1, ((icvl)hftp0.N_build()));
                }
                iterator0 = iterator0;
                collection0 = collection0;
            }
        }
        ggdy ggdy0 = new ggdy();
        ggdy ggdy1 = new ggdy();
        Iterator iterator1 = hashMap0.entrySet().iterator();
        while(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            Map.Entry map$Entry0 = (Map.Entry)object2;
            int v4 = (int)(((Integer)map$Entry0.getKey()));
            gftb.check(fvzn0.f);
            try {
                LevelDb levelDb0 = fvzn0.f;
                gftb.check(levelDb0);
                byte[] arr_b = levelDb0.get(fvzn.i(v4));
                if(arr_b == null) {
                    goto label_68;
                }
                else {
                    icvl1 = fvzn0.d(arr_b);
                }
            }
            catch(LevelDbException levelDbException0) {
                ggrv ggrv0 = fvzn0.d;
                if(ggrv0 != null) {
                    ggrv0.i().s(levelDbException0).ar(19107).z("LevelDB read failed, mac: %d", v4);
                }
                icvl1 = null;
            }
            goto label_69;
        label_68:
            icvl1 = null;
        label_69:
            int v5 = ((icvl)map$Entry0.getValue()).c;
            double f3 = (double)((icvl)map$Entry0.getValue()).e;
            double f4 = fvzm.b(fvzk0.i, 0L, v5, f3);
            if(fvzl.e(fvzk0.i, f4, icvl1, v1)) {
                ggdy0.i(Double.valueOf(((icvl)map$Entry0.getValue()).d));
                ggdy1.i(Double.valueOf(f4));
                iterator1 = iterator1;
            }
            else {
                iterator1.remove();
            }
        }
        fvzn fvzn1 = fvzk0.b;
        gftb.check(fvzn1.f);
        WriteBatch writeBatch0 = WriteBatch.create();
        for(Object object3: hashMap0.entrySet()) {
            writeBatch0.put(fvzn.i(((Integer)((Map.Entry)object3).getKey()).intValue()), ((icvl)((Map.Entry)object3).getValue()).toBytesArray());
        }
        try {
            try {
                LevelDb levelDb1 = fvzn1.f;
                gftb.check(levelDb1);
                levelDb1.write(writeBatch0);
            }
            catch(LevelDbException levelDbException1) {
                ggrv ggrv1 = fvzn1.d;
                if(ggrv1 != null) {
                    ggrv1.i().s(levelDbException1).ar(19109).x("LevelDB write failed.");
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(writeBatch0, throwable0);
            throw throwable0;
        }
        writeBatch0.close();
        if(!hashMap0.isEmpty()) {
            synchronized(fvzk0) {
                ObserverRegistry gpyo0 = fvzk0.f;
            }
            if(gpyo0 != null) {
                ggdy0.h();
                ggdy1.h();
                for(Object object4: gpyo0.a) {
                    ((IFilterObserver)object4).aA();
                }
            }
        }
        int v6 = hashMap0.size();
        if(v6 != 0) {
            long v7 = TimeUnit.MILLISECONDS.toDays(v);
            int v8 = collection0.size();
            ggdy ggdy2 = new ggdy();
            ggdy ggdy3 = new ggdy();
            Map map0 = fvzk0.b.c();
            __monitor_enter(fvzk0);
            icvk icvk0 = fvzk0.a == null ? null : fvzk0.a.a;
            __monitor_exit(fvzk0);
            huqn_elevationGraphOptimizerFlags huqn0 = fvzk0.i;
            gged_interceptors gged0 = gged_interceptors.i(map0.values());
            ggdy ggdy4 = new ggdy();
            for(Object object5: gged0) {
                gxjn gxjn0 = new gxjn(((double)((icvl)object5).d), fvzm.b(huqn0, v7 - ((icvl)object5).b, ((icvl)object5).c, ((double)((icvl)object5).e)));
                ggdy4.i(gxjn0);
                ggdy4 = ggdy4;
                v7 = v7;
                ggdy2 = gxjn0;
                ggdy3 = ggdy3;
            }
            gged_interceptors gged1 = ggdy4.h();
            gxjn gxjn1 = gxjo.a(gged1);
            if(gxjn1 == null) {
                gfsz0 = fvzm.a;
            }
            else {
                double f5 = huqn0.b();
                ggdy ggdy5 = new ggdy();
                ggqk ggqk1 = gged1.E();
                while(ggqk1.hasNext()) {
                    Object object6 = ggqk1.next();
                    gxjn gxjn2 = (gxjn)object6;
                    if((Math.abs(gxjn2.a - gxjn1.a) < f5)) {
                        ggdy5.i(gxjn2);
                    }
                }
                gxjn gxjn3 = gxjo.a(ggdy5.h());
                if(gxjn3 == null) {
                    gfsz0 = fvzm.a;
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object7: gged0) {
                        arrayList0.add(Float.valueOf(((icvl)object7).d));
                    }
                    double f6 = glup.a(1, 4).a(arrayList0);
                    double f7 = glup.a(3, 4).a(arrayList0);
                    gfsz0 = new gfsz(((double)gxjn3.a), Math.max((f7 - f6) / 2.0, 2.0 / Math.sqrt(arrayList0.size())));
                }
            }
            fvzk0.d(map0);
            if(gfsz0.equals(fvzm.a)) {
                synchronized(fvzk0) {
                    fvzh0 = fvzk0.a;
                }
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icvk.a).v_newBuilder();
                float f8 = ((Double)gfsz0.a).floatValue();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((icvk)hftp1.b_message).b = f8;
                float f9 = ((Double)gfsz0.b).floatValue();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((icvk)hftp1.b_message).c = f9;
                icvk icvk1 = (icvk)hftp1.N_build();
                if(icvk1 == null) {
                    fvzh0 = null;
                }
                else {
                    fvzn fvzn2 = fvzk0.b;
                    gftb.check(fvzn2.f);
                    try {
                        LevelDb levelDb2 = fvzn2.f;
                        byte[] arr_b1 = icvk1.toBytesArray();
                        levelDb2.put(fvzn.a, arr_b1);
                    }
                    catch(LevelDbException levelDbException2) {
                        ggrv ggrv2 = fvzn2.d;
                        if(ggrv2 != null) {
                            ggrv2.i().s(levelDbException2).ar(19110).x("Writing device bias failed.");
                        }
                    }
                    if(huxn.d()) {
                        cczf cczf0 = fvzk0.g;
                        if(ccze.b(cczf0)) {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cnzq.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            cnzq cnzq0 = (cnzq)hftp2.b_message;
                            cnzq0.b |= 1;
                            cnzq0.c = v6;
                            if(fvzk0.i.Z()) {
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                cnzq cnzq1 = (cnzq)hftp2.b_message;
                                cnzq1.b |= 0x2000;
                                cnzq1.p = v8;
                            }
                            if(icvk0 != null) {
                                float f10 = fvzl.a(icvk1.b) - fvzl.a(icvk0.b);
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                cnzq cnzq2 = (cnzq)hftp2.b_message;
                                cnzq2.b |= 16;
                                cnzq2.g = f10;
                                float f11 = fvzl.b(icvk1.c) - fvzl.b(icvk0.c);
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                cnzq cnzq3 = (cnzq)hftp2.b_message;
                                cnzq3.b |= 0x100;
                                cnzq3.k = f11;
                            }
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
                            ((cnzg)cnze0.b_message).c = 4;
                            ((cnzg)cnze0.b_message).b |= 1;
                            if(!cnze0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)cnze0).ensureMutable();
                            }
                            cnzg cnzg0 = (cnzg)cnze0.b_message;
                            cnzq cnzq4 = (cnzq)hftp2.N_build();
                            cnzq4.getClass();
                            cnzg0.b();
                            cnzg0.g.add(cnzq4);
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            gixy gixy0 = (gixy)hftp3.b_message;
                            cnzg cnzg1 = (cnzg)((ProtoLiteBuilder)cnze0).N_build();
                            cnzg1.getClass();
                            gixy0.v = cnzg1;
                            gixy0.b |= 0x40000;
                            ((cdgb)cczf0).j(((ProtoLiteMessage)(((gixy)hftp3.N_build()))));
                        }
                    }
                    huqn_elevationGraphOptimizerFlags huqn1 = fvzk0.i;
                    if(huqn1.X()) {
                        for(Object object8: map0.values()) {
                            ggdy2.i(Double.valueOf(((icvl)object8).d));
                            ggdy3.i(Double.valueOf(fvzm.b(huqn1, v7 - ((icvl)object8).b, ((icvl)object8).c, ((double)((icvl)object8).e))));
                        }
                        fvzh1 = new fvzh(icvk1, ggdy2.h(), ggdy3.h());
                    }
                    else {
                        fvzh1 = new fvzh(icvk1, null, null);
                    }
                    fvzh0 = fvzh1;
                }
            }
            synchronized(fvzk0) {
                fvzk0.a = fvzh0;
                icvk2 = fvzk0.b();
                __monitor_enter(fvzk0);
                ObserverRegistry gpyo1 = fvzk0.f;
            }
            if(gpyo1 != null && icvk2 != null) {
                double f12 = (double)icvk2.b;
                double f13 = (double)icvk2.c;
                for(Object object9: gpyo1.a) {
                    ((IFilterObserver)object9).J(this.b, f12, f13);
                }
            }
        }
    }
}

