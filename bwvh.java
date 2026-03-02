import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import jeb.synthetic.FIN;

public final class bwvh extends bwzp {
    private final Context a;
    private final bwuj b;
    private final bwuc c;
    private final bwts d;
    private final bwtl e;
    private final NativeIndex f;
    private final AtomicBoolean n;
    private final bwtc o;
    private final Map p;
    private final Map q;
    private final Map r;
    private final bwrc s;
    private final bwmx t;

    public bwvh(Context context0, bwrc bwrc0, bwmx bwmx0, bwuj bwuj0, bwuc bwuc0, bwts bwts0, bwtl bwtl0, NativeIndex nativeIndex0, AtomicBoolean atomicBoolean0) {
        bxbi bxbi0 = bxbj.a(context0);
        super(gltq.aH, 2, 3, null, bxbi0);
        this.p = new HashMap();
        this.q = new HashMap();
        this.r = new HashMap();
        this.a = context0;
        this.s = bwrc0;
        this.t = bwmx0;
        this.b = bwuj0;
        this.c = bwuc0;
        this.d = bwts0;
        this.e = bwtl0;
        this.f = nativeIndex0;
        this.n = atomicBoolean0;
        this.o = bwtc.d(context0);
    }

    // This method was un-flattened
    @Override  // bwzp
    protected final Object a() {
        int v23;
        int v22;
        gged_interceptors gged2;
        int v17;
        bwlq bwlq0;
        Object object4;
        boolean z;
        Pair pair0;
        int v4;
        File file0;
        String s;
        bwqz bwqz0;
        Object object0;
        bwrb bwrb0;
        bwrc bwrc0;
        bwne.a("DrainRequestQueueTask starting");
        this.n.set(false);
        int v = Math.max(1, ((int)hubx.a.c().a()));
        long v1 = System.currentTimeMillis();
        int v2 = 0;
        while(true) {
            try {
            label_5:
                bwrc0 = this.s;
                bwrb0 = bwrc0.a;
                object0 = bwrb0.g;
                __monitor_enter(object0);
            }
            catch(IOException iOException0) {
                goto label_122;
            }
            try {
                while(true) {
                    bwqz0 = bwrb0.h;
                    if(bwqz0 != null) {
                        goto label_55;
                    }
                    TreeSet treeSet0 = bwrb0.b();
                    if(treeSet0.isEmpty()) {
                        goto label_53;
                    }
                    s = bwrb0.i == null ? ((String)treeSet0.first()) : ((String)treeSet0.higher(bwrb0.i));
                    if(s == null) {
                        goto label_51;
                    }
                    file0 = hrnt.i() ? new File(ccsb.a.b(bwrb0.a, s)) : new File(bwrb0.a, s);
                    if(bwrb.a(s) == null) {
                        bwne.t("Invalid shard name: %s. Shard will be skipped and deleted.", s);
                        bwrb0.d(3);
                        if(file0.delete()) {
                            continue;
                        }
                        bwrb0.d(4);
                        throw new IOException(a.ab(file0, "Failed to delete file: "));
                    }
                    try {
                        bwrb0.h = new bwqz(s, file0);
                        batl.s(bwrb0.h);
                        if(bwrb0.h.a.equals(bwrb0.j)) {
                            Object object1 = bwrb0.d;
                            __monitor_enter(object1);
                            int v3 = FIN.finallyOpen$NT();
                            if(bwrb0.h.a.equals(bwrb0.j)) {
                                v4 = bwrb0.h.d.g();
                                FIN.finallyCodeBegin$NT(v3);
                                goto label_36;
                            }
                            else {
                                FIN.finallyExec$NT(v3);
                            }
                        }
                        v4 = bwrb0.h.d.g();
                    label_36:
                        if(v4 == 1) {
                            continue;
                        }
                        bwne.u("Shard %s skipped due to invalid format (expected %d, got %d)", new Object[]{s, ((int)1), v4});
                        bwrb0.d(5);
                        bwrb0.c();
                        continue;
                    }
                    catch(IOException iOException1) {
                    }
                    break;
                }
                bwne.j(iOException1, "Failed to open shard %s for reading", new Object[]{s});
                bwrb0.d(6);
                if(bwrb0.h != null) {
                    bwrb0.c();
                }
                else if(!file0.delete()) {
                    bwne.t("Failed to delete file %s", file0);
                    bwrb0.d(4);
                }
                throw iOException1;
            }
            catch(Throwable throwable0) {
                goto label_117;
            }
            try {
            label_51:
                __monitor_exit(object0);
                goto label_114;
            label_53:
                __monitor_exit(object0);
                goto label_114;
            }
            catch(IOException iOException0) {
                goto label_122;
            }
            try {
                try {
                label_55:
                    String s1 = bwqz0.a;
                    if(s1.equals(bwrb0.j)) {
                        Object object2 = bwrb0.d;
                        __monitor_enter(object2);
                        int v5 = FIN.finallyOpen$NT();
                        if(s1.equals(bwrb0.j)) {
                            hfsl hfsl0 = bwqz0.d;
                            if(hfsl0.D()) {
                                pair0 = null;
                            }
                            else {
                                pair0 = new Pair(hfsl0.p(), hfsl0.H());
                                hfsl0.B();
                            }
                            z = true;
                            FIN.finallyCodeBegin$NT(v5);
                            __monitor_exit(object2);
                            FIN.finallyCodeEnd$NT(v5);
                            goto label_84;
                        }
                        else {
                            z = false;
                            FIN.finallyExec$NT(v5);
                        }
                    }
                    long v6 = bwqz0.d.p();
                    byte[] arr_b = bwqz0.d.H();
                    bwqz0.d.B();
                    pair0 = new Pair(v6, arr_b);
                }
                catch(IOException iOException2) {
                    bwne.j(iOException2, "Got IOException trying to read shard %s", new Object[]{bwqz0.b});
                    bwrb0.d(8);
                    bwrb0.c();
                    throw iOException2;
                }
            label_84:
                if(!z && bwqz0.d.D()) {
                    bwqz0.close();
                    bwrb0.i = bwqz0.a;
                    bwrb0.h = null;
                }
            }
            catch(Throwable throwable0) {
                goto label_117;
            }
            try {
                __monitor_exit(object0);
                if(pair0 != null) {
                    long v7 = (long)(((Long)pair0.first));
                    byte[] arr_b1 = (byte[])pair0.second;
                    CRC32 cRC320 = new CRC32();
                    cRC320.update(arr_b1);
                    if(v7 != cRC320.getValue()) {
                        bwrb0.d(7);
                        throw new IOException("CRC Mismatch");
                    }
                    Object object3 = bwrb0.b.parseFrom(arr_b1);
                    ProtoLiteBuilder hftp0 = bwrb0.k;
                    __monitor_enter(hftp0);
                    int v8 = FIN.finallyOpen$NT();
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    int v9 = ((glqk)hftv0).e + 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glqk glqk0 = (glqk)hftp0.b_message;
                    glqk0.b |= 2;
                    glqk0.e = v9;
                    FIN.finallyCodeBegin$NT(v8);
                    __monitor_exit(hftp0);
                    FIN.finallyCodeEnd$NT(v8);
                    object4 = object3;
                    goto label_119;
                }
            }
            catch(IOException iOException0) {
                goto label_122;
            }
            try {
            label_114:
                object4 = null;
                goto label_119;
            }
            catch(Throwable throwable0) {
                try {
                label_117:
                    __monitor_exit(object0);
                    throw throwable0;
                label_119:
                    bwlq0 = (bwlq)object4;
                    goto label_125;
                }
                catch(IOException iOException0) {
                }
            }
        label_122:
            bwrc0.b.d("rq_read_shard_failure");
            bwne.j(iOException0, "Failed to take from request queue", new Object[0]);
            bwlq0 = null;
        label_125:
            if(bwlq0 == null) {
                break;
            }
            bwne.p("RequestQueue processing mutation request, type: %s", bwlp.a(bwlq0.b));
            int v10 = bwlp.a(bwlq0.b).ordinal();
        alab1:
            switch(v10) {
                case 0: {
                    this.s((bwlq0.b == 1 ? ((bwlu)bwlq0.c) : bwlu.a), false);
                    long v11 = System.currentTimeMillis() - bwlq0.d;
                    String s2 = (bwlq0.b == 1 ? ((bwlu)bwlq0.c) : bwlu.a).c;
                    bwlu bwlu0 = bwlq0.b == 1 ? ((bwlu)bwlq0.c) : bwlu.a;
                    this.r(s2, glrq.a, 1, this.o((bwlu0.e == null ? hlne.a : bwlu0.e).c), ((int)v11), bwlq0.e);
                    break;
                }
                case 1: {
                    this.s((bwlq0.b == 2 ? ((bwlu)bwlq0.c) : bwlu.a), true);
                    long v12 = System.currentTimeMillis() - bwlq0.d;
                    String s3 = (bwlq0.b == 2 ? ((bwlu)bwlq0.c) : bwlu.a).c;
                    bwlu bwlu1 = bwlq0.b == 2 ? ((bwlu)bwlq0.c) : bwlu.a;
                    this.r(s3, glrq.i, 1, this.o((bwlu1.e == null ? hlne.a : bwlu1.e).c), ((int)v12), bwlq0.e);
                    break;
                }
                case 2: {
                    this.t((bwlq0.b == 3 ? ((bwls)bwlq0.c) : bwls.a).b, (bwlq0.b == 3 ? ((bwls)bwlq0.c) : bwls.a).c, null);
                    this.r((bwlq0.b == 3 ? ((bwls)bwlq0.c) : bwls.a).b, glrq.b, 1, null, ((int)(System.currentTimeMillis() - bwlq0.d)), bwlq0.e);
                    break;
                }
                case 3: {
                    bwlr bwlr0 = bwlq0.b == 4 ? ((bwlr)bwlq0.c) : bwlr.a;
                    long v13 = bwlq0.d;
                    int v14 = bwlq0.e;
                    gged_interceptors gged0 = this.n(bwlr0.b);
                    int v15 = ((ggna)gged0).c;
                    for(int v16 = 0; v16 < v15; v16 = v17 + 1) {
                        bwnr bwnr0 = this.d(((bwvl)gged0.get(v16)));
                        if(bwnr0 == null) {
                            v17 = v16;
                        }
                        else {
                            this.u(bwlr0.b, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
                            v17 = v16;
                            this.r((bwnr0.c == null ? bwnq.a : bwnr0.c).f, glrq.c, 0, null, ((int)(System.currentTimeMillis() - v13)), v14);
                        }
                    }
                    break;
                }
                case 4: {
                    bwlt bwlt0 = bwlq0.b == 5 ? ((bwlt)bwlq0.c) : bwlt.a;
                    long v18 = bwlq0.d;
                    int v19 = bwlq0.e;
                    gged_interceptors gged1 = this.n(bwlt0.b);
                    int v20 = ((ggna)gged1).c;
                    int v21 = 0;
                    while(true) {
                        if(v21 >= v20) {
                            break alab1;
                        }
                        bwvl bwvl0 = (bwvl)gged1.get(v21);
                        bwnr bwnr1 = this.d(bwvl0);
                        if(bwnr1 == null) {
                            gged2 = gged1;
                            v22 = v20;
                            v23 = v21;
                        }
                        else {
                            gged2 = gged1;
                            bwsa bwsa0 = bwsa.a((bwnr1.c == null ? bwnq.a : bwnr1.c).d, (bwnr1.c == null ? bwnq.a : bwnr1.c).f, bwtc.d(this.a));
                            if(bwsa0 == null) {
                                bwne.t("No AppIndexingCorpusConfig found for corpus %s", bwvl0.c());
                                v22 = v20;
                                v23 = v21;
                            }
                            else {
                                String s4 = bwsa0.a.b;
                                if(s4.equals(bwlt0.c)) {
                                    this.u(bwlt0.b, (bwnr1.c == null ? bwnq.a : bwnr1.c).d);
                                }
                                String s5 = (bwnr1.c == null ? bwnq.a : bwnr1.c).f;
                                v22 = v20;
                                ggfp ggfp0 = this.o(s4);
                                v23 = v21;
                                this.r(s5, glrq.k, 1, ggfp0, ((int)(System.currentTimeMillis() - v18)), v19);
                            }
                        }
                        v21 = v23 + 1;
                        v20 = v22;
                        gged1 = gged2;
                    }
                }
                default: {
                    if(v10 == 5) {
                        this.s((bwlq0.b == 6 ? ((bwlu)bwlq0.c) : bwlu.a), false);
                    }
                    else {
                        bwne.g("Unhandled mutation type %s", bwlp.a(bwlq0.b));
                        this.d.d("bad_mutation_type");
                    }
                }
            }
            ++v2;
            if(v2 % v != 0) {
                goto label_5;
            }
            this.f.v();
            this.s.b();
        }
        if(v2 % v != 0) {
            this.f.v();
            this.s.b();
        }
        for(Object object5: this.r.keySet()) {
            this.q(((bwvl)object5));
        }
        ProtoLiteBuilder hftp1 = this.s.a.k;
        __monitor_enter(hftp1);
        int v24 = FIN.finallyOpen$NT();
        glqk glqk1 = (glqk)hftp1.N_build();
        if(!hftp1.a_defaultInstance.isImmutable()) {
            hftp1.b_message = hftp1.P_newInstance();
            FIN.finallyCodeBegin$NT(v24);
            __monitor_exit(hftp1);
            FIN.finallyCodeEnd$NT(v24);
            long v25 = System.currentTimeMillis() - v1;
            bwts bwts0 = this.d;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)glqk1).jf(5, null);
            hftp2.X(((ProtoLiteMessage)glqk1));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            glqk glqk2 = (glqk)hftp2.b_message;
            glqk2.b |= 4;
            glqk2.f = v25;
            glqk glqk3 = (glqk)hftp2.N_build();
            long v26 = hubu.n() ? huax.d() : huax.c();
            if(bwts0.m(v26, false)) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                glnz glnz0 = (glnz)hftp3.b_message;
                glqk3.getClass();
                glnz0.K = glqk3;
                glnz0.c |= 0x200000;
                if(huae.g()) {
                    cdef cdef0 = hubu.n() ? cdef.dL : cdef.dJ;
                    bwts0.t(hftp3);
                    bwts0.a.d(cdef0, 6013, hftp3);
                }
                else {
                    bwts0.s(6013, hftp3, v26);
                }
            }
            bwne.d("Indexing done. Processed %d requests in %d ms", Integer.valueOf(v2), Long.valueOf(v25));
            return null;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private final long c(bwvl bwvl0, bwnr bwnr0) {
        bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
        Map map0 = this.p;
        Long long0 = (Long)map0.get(bwvl0);
        if(long0 == null) {
            long0 = this.f.f(bwnq0.c, false);
            map0.put(bwvl0, long0);
        }
        return (long)long0;
    }

    private final bwnr d(bwvl bwvl0) {
        Map map0 = this.q;
        bwnr bwnr0 = (bwnr)map0.get(bwvl0);
        if(bwnr0 == null) {
            bwnr bwnr1 = this.b.b.e(bwvl0);
            if(bwnr1 != null) {
                bwny bwny0 = bwnr1.d == null ? bwny.a : bwnr1.d;
                if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                    bwnq bwnq0 = bwnr1.c == null ? bwnq.a : bwnr1.c;
                    if(bwsa.i(bwnq0.d)) {
                        String s = bwnq0.f;
                        bwua bwua0 = this.c.f(s);
                        if(bwua0 != null && bwua0.s()) {
                            map0.put(bwvl0, bwnr1);
                            return bwnr1;
                        }
                        bwne.l("Not indexing corpus from package %s as it has never connected", s);
                    }
                    return null;
                }
            }
            bwne.b("Corpus no longer exists %s", bwvl0.c());
            return null;
        }
        return bwnr0;
    }

    private final bxgk m(bwvl bwvl0) {
        Map map0 = this.r;
        bxgk bxgk0 = (bxgk)map0.get(bwvl0);
        if(bxgk0 == null) {
            bxgk0 = new bxgk();
            map0.put(bwvl0, bxgk0);
        }
        return bxgk0;
    }

    private final gged_interceptors n(String s) {
        bwua bwua0 = this.c.f(s);
        if(bwua0 == null) {
            bwne.b("Package %s not found in client registry", s);
            return ggna.a;
        }
        return this.b.b.m(bwua0);
    }

    private final ggfp o(String s) {
        ggfn ggfn0 = new ggfn();
        ggfn0.i(bwqu.a(s, this.o));
        return ggfn0.h();
    }

    private final glte p(bwnr bwnr0, gloj gloj0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gloi.a).v_newBuilder();
        String s = (bwnr0.c == null ? bwnq.a : bwnr0.c).f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gloi gloi0 = (gloi)hftp0.b_message;
        s.getClass();
        gloi0.b |= 1;
        gloi0.c = s;
        String s1 = bxge.a((bwnr0.c == null ? bwnq.a : bwnr0.c));
        if(s1 != null && !TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gloi gloi1 = (gloi)hftp0.b_message;
            gloi1.b |= 2;
            gloi1.d = s1;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gloj0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gloj0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gloj gloj1 = (gloj)hftp1.b_message;
        gloi gloi2 = (gloi)hftp0.N_build();
        gloi2.getClass();
        gloj1.c = gloi2;
        gloj1.b |= 0x40;
        gloj gloj2 = (gloj)hftp1.N_build();
        this.d.g(gloj2);
        glte glte0 = glte.b(gloj0.d);
        return glte0 == null ? glte.a : glte0;
    }

    private final void q(bwvl bwvl0) {
        bxgk bxgk0 = (bxgk)this.r.get(bwvl0);
        if(bxgk0 != null) {
            bwnr bwnr0 = this.d(bwvl0);
            if(bwnr0 != null) {
                bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwny0));
                List list0 = bxgk0.a(DesugarCollections.unmodifiableList(((bwny)((bwnt)hftp0).b_message).c));
                if(!((bwnt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((bwnt)hftp0))).ensureMutable();
                }
                ((bwny)((bwnt)hftp0).b_message).c = hfvv.a;
                ((bwnt)hftp0).a(list0);
                this.b.a().z(bwvl0, ((bwny)((ProtoLiteBuilder)(((bwnt)hftp0))).N_build()));
            }
        }
    }

    private final void r(String s, glrq glrq0, int v, ggfp ggfp0, int v1, int v2) {
        bwry bwry0 = new bwry(s, v2, gltq.as, glrq0, v, ggfp0, v1);
        bwts bwts0 = this.d;
        glrs glrs0 = glrs.a;
        long v3 = huax.d();
        if(!bwts0.m(v3, true)) {
            return;
        }
        gloe gloe0 = (gloe)((ProtoLiteMessage)glof.a).v_newBuilder();
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        String s1 = bwry0.a;
        glof glof0 = (glof)gloe0.b_message;
        s1.getClass();
        glof0.b |= 1;
        glof0.c = s1;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof1 = (glof)gloe0.b_message;
        glof1.b |= 0x20;
        glof1.h = bwry0.b;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof2 = (glof)gloe0.b_message;
        glof2.d = bwry0.c.a();
        glof2.b |= 2;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof3 = (glof)gloe0.b_message;
        glof3.e = glrs0.a();
        glof3.b |= 4;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof4 = (glof)gloe0.b_message;
        glof4.b |= 16;
        glof4.g = bwry0.d;
        if(!gloe0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gloe0).ensureMutable();
        }
        glof glof5 = (glof)gloe0.b_message;
        glof5.b |= 0x40;
        glof5.j = bwry0.g;
        if(bwvu.g()) {
            ggfp ggfp1 = bwry0.f;
            if(ggfp1 != null) {
                gloe0.a(ggfp1);
            }
        }
        try {
            int v4 = bwts0.b.getPackageManager().getPackageInfo(s1, 0).versionCode;
            if(!gloe0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gloe0).ensureMutable();
            }
            glof glof6 = (glof)gloe0.b_message;
            glof6.b |= 8;
            glof6.f = v4;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            bwne.g("PackageInfo not found for package: %s", s1);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glog.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glog glog0 = (glog)hftp1.b_message;
        glof glof7 = (glof)((ProtoLiteBuilder)gloe0).N_build();
        glof7.getClass();
        glog0.c = glof7;
        glog0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glog glog1 = (glog)hftp1.N_build();
        glog1.getClass();
        glnz0.k = glog1;
        glnz0.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz1 = (glnz)hftp0.b_message;
        glnz1.b |= 0x80000;
        glnz1.s = v3;
        bwts0.r("iapitotallatencystats", hftp0);
    }

    private final void s(bwlu bwlu0, boolean z) {
        bwvl bwvl0 = new bwvl(bwlu0.c, bwlu0.d);
        bwnr bwnr0 = this.d(bwvl0);
        if(bwnr0 == null) {
            return;
        }
        long v = this.c(bwvl0, bwnr0);
        bwne.m("Indexing %s from %s using seqno %d", new Object[]{bwvl0.c(), bwlu0.c, v});
        bxgk bxgk0 = this.m(bwvl0);
        if(z) {
            hlne hlne0 = bwlu0.e == null ? hlne.a : bwlu0.e;
            if(!bwvu.c()) {
                bxgk0.b("patch disabled");
                return;
            }
            byte[] arr_b = hlne0.toBytesArray();
            bwwk bwwk0 = bwvm.a(bwnr0);
            gloj gloj0 = this.f.o(v, arr_b, bwwk0, (bwnr0.c == null ? bwnq.a : bwnr0.c), bwux.a());
            bxgk0.b("modify " + NativeIndex.t((gloj0 == null ? glte.f : this.p(bwnr0, gloj0))));
            return;
        }
        hlne hlne1 = bwlu0.e == null ? hlne.a : bwlu0.e;
        this.t(bwlu0.c, hlne1.d, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
        byte[] arr_b1 = hlne1.toBytesArray();
        bwwk bwwk1 = bwvm.a(bwnr0);
        gloj gloj1 = this.f.n(v, arr_b1, bwwk1, (bwnr0.c == null ? bwnq.a : bwnr0.c), bwux.a());
        glte glte0 = gloj1 == null ? glte.f : this.p(bwnr0, gloj1);
        bxgk0.b("index " + NativeIndex.t(glte0));
        bxgk0.b("index-thing " + NativeIndex.t(glte0));
    }

    private final void t(String s, String s1, String s2) {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = this.n(s);
        int v = ((ggna)gged0).c;
        boolean z = false;
        for(int v2 = 0; v2 < v; ++v2) {
            bwvl bwvl0 = (bwvl)gged0.get(v2);
            bwnr bwnr0 = this.d(bwvl0);
            if(bwnr0 != null && !(bwnr0.c == null ? bwnq.a : bwnr0.c).d.equals(s2)) {
                long v3 = this.c(bwvl0, bwnr0);
                bxgk bxgk0 = this.m(bwvl0);
                arrayList0.add(bxgk0);
                glte glte0 = this.f.q(v3, (bwnr0.c == null ? bwnq.a : bwnr0.c).c, s1);
                if(!glte.g.equals(glte0)) {
                    bxgk0.b("delete " + NativeIndex.t(glte0));
                    if(glte.a.equals(glte0)) {
                        this.e.d(s, (bwnr0.c == null ? bwnq.a : bwnr0.c).d, s1);
                    }
                    z = true;
                }
            }
        }
        if(s2 == null && !z) {
            int v4 = arrayList0.size();
            for(int v1 = 0; v1 < v4; ++v1) {
                ((bxgk)arrayList0.get(v1)).b("delete " + NativeIndex.t(glte.g));
            }
        }
    }

    private final void u(String s, String s1) {
        bwvl bwvl0 = new bwvl(s, s1);
        this.q(bwvl0);
        this.t.w(s, s1);
        this.p.remove(bwvl0);
        this.q.remove(bwvl0);
        this.r.remove(bwvl0);
    }
}

