import com.google.android.wallet.bender3.impl.ui.common.glif.gliflayout.Bender3GlifLayout;
import j..util.Map.-EL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class gasc implements lqj {
    public gast a;
    public gbfv b;
    public boolean c;
    public final bxf d;
    ggft e;
    ggft f;
    public final ggcx g;
    public final ArrayList h;
    private boolean i;
    private final ArrayDeque j;

    public gasc() {
        this.c = true;
        this.d = new bxf();
        this.e = ggbz.a;
        this.f = ggbz.a;
        this.g = ggcx.l();
        this.h = new ArrayList(1);
        this.j = new ArrayDeque();
    }

    public final void b(hcsi hcsi0) {
        this.c(hcsi0, 0L);
    }

    public final void c(hcsi hcsi0, long v) {
        ArrayDeque arrayDeque1;
        int v21;
        int v4;
        byi byi0;
        gasb gasb0 = new gasb(hcsi0, v);
        ArrayDeque arrayDeque0 = this.j;
        arrayDeque0.push(gasb0);
        if(!this.i) {
            while(!arrayDeque0.isEmpty()) {
                this.i = true;
                gasb gasb1 = (gasb)arrayDeque0.pop();
                hcsi hcsi1 = gasb1.a;
                ArrayList arrayList0 = this.h;
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    gbvl gbvl0 = (gbvl)arrayList0.get(v2);
                }
                this.a.a.f("Start resolving TriggerId %d {", new Object[]{((int)hcsi1.d)});
                ArrayList arrayList1 = new ArrayList(hcsi1.c.size());
                ggor ggor0 = new ggor(this.g, ((long)gasb1.b));
                for(Object object0: hcsi1.c) {
                    Long long0 = (Long)object0;
                    Long long1 = (Long)Map.-EL.getOrDefault(ggor0, long0, long0);
                    long v3 = (long)long1;
                    gaxl.a();
                    ggft ggft0 = this.e;
                    if(ggft0 != null) {
                        for(Object object1: ggft0.e(long1)) {
                            garp garp0 = this.a.b.i(((Long)object1).longValue(), "BE_ERM_02");
                            if(garp0.f == null) {
                                hfuo hfuo0 = garp0.b.g;
                                if(hfuo0 == null) {
                                    byi0 = new byi();
                                }
                                else {
                                    byi byi1 = new byi(hfuo0.size());
                                    for(Object object2: hfuo0) {
                                        garp.y(((MessageLite)(((hcqv)object2))), ((hcqv)object2).c, byi1);
                                    }
                                    byi0 = byi1;
                                }
                                garp0.f = byi0;
                            }
                            if(garp0.w(v3) == null) {
                                v4 = 0;
                            }
                            else {
                                v4 = 0;
                                for(Object object3: garp0.w(v3)) {
                                    hcqv hcqv0 = (hcqv)object3;
                                    int v5 = garp0.aj(hcqv0);
                                    if(hcqv0.f) {
                                        v5 ^= 1;
                                    }
                                    if(v5 == 0) {
                                        v4 = hcqv0.e;
                                        break;
                                    }
                                }
                                if(v4 == 0) {
                                    v4 = 0;
                                }
                            }
                            if(v4 == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                    }
                    v4 = 0;
                label_64:
                    if(v4 == 0) {
                        arrayList1.add(long1);
                        this.a.a.f("TriggerId %d, executing event rule: %d", new Object[]{((int)hcsi1.d), long1});
                        v4 = 0;
                    }
                    if(this.d.contains(long1)) {
                        int v6 = hcsi1.d;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxu.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gkxu)hftv0).b |= 1;
                        ((gkxu)hftv0).c = v3;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gkxu)hftv1).b |= 2;
                        ((gkxu)hftv1).d = v6;
                        if(((long)v4) != 0L) {
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gkxu gkxu0 = (gkxu)hftp0.b_message;
                            gkxu0.b |= 4;
                            gkxu0.e = v4;
                        }
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
                        gkwx gkwx0 = gkwx.h;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp1.b_message;
                        ((gkxt)hftv2).g = gkwx0.G;
                        ((gkxt)hftv2).b |= 4;
                        if(!hftv2.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gkxt gkxt0 = (gkxt)hftp1.b_message;
                        gkxu gkxu1 = (gkxu)hftp0.N_build();
                        gkxu1.getClass();
                        gkxt0.d = gkxu1;
                        gkxt0.c = 7;
                        this.a.a.g.f(hftp1);
                    }
                }
                if(!arrayList1.isEmpty()) {
                    this.a.e.h(arrayList1);
                }
                int v7 = arrayList1.size();
                for(int v8 = 0; v8 < v7; ++v8) {
                    Long long2 = (Long)arrayList1.get(v8);
                    long v9 = (long)long2;
                    gaxl.a();
                    ggft ggft1 = this.f;
                    if(ggft1 != null) {
                        for(Object object4: ggft1.e(long2)) {
                            long v10 = (long)(((Long)object4));
                            garp garp1 = this.a.b.i(v10, "BE_ERM_03");
                            gavs.b("BE_ERM_01", this.a.a.g, new gayw(v10), new gasa(garp1, v9));
                        }
                    }
                }
                if(!arrayList1.isEmpty()) {
                    this.a.e.c();
                    ArrayList arrayList2 = this.a.c.c.f;
                    gged_interceptors gged0 = arrayList2.isEmpty() ? ggna.a : gged_interceptors.i(arrayList2);
                    int v11 = gged0.size();
                    for(int v12 = 0; v12 < v11; ++v12) {
                        gbxd gbxd0 = (gbxd)gged0.get(v12);
                        if(gbxd0.w) {
                            Bender3GlifLayout bender3GlifLayout0 = gbxd0.u;
                            if(bender3GlifLayout0 == null) {
                                ibuq.j("glifLayoutView");
                                bender3GlifLayout0 = null;
                            }
                            bender3GlifLayout0.c();
                            gbxd0.w = false;
                            gbxd0.a.c.c.f.remove(gbxd0);
                        }
                    }
                }
                this.a.a.f("} Finish resolving TriggerId %d", new Object[]{((int)hcsi1.d)});
                this.i = false;
                int v13 = arrayList0.size();
                int v14 = 0;
                while(v14 < v13) {
                    gbvm gbvm0 = (gbvm)((gbvl)arrayList0.get(v14)).t;
                    byi byi2 = gbvm0.e;
                    int v15 = byi2.b();
                    if(v15 > 0) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hdfa.a).v_newBuilder();
                        int v16 = 0;
                    label_151:
                        while(v16 < v15) {
                            long v17 = byi2.c(v16);
                            int v18 = (int)(((Integer)byi2.f(v16)));
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hdez.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp3.b_message;
                            ((hdez)hftv3).b |= 1;
                            ((hdez)hftv3).c = v17;
                            if(!hftv3.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            hdez hdez0 = (hdez)hftp3.b_message;
                            hdez0.b |= 4;
                            hdez0.e = v18;
                            int v19 = gbvm0.g;
                            while(v19 >= 0) {
                                Iterator iterator5 = ((hdfa)gbvm0.f.get(v19)).b.iterator();
                            label_168:
                                if(iterator5.hasNext()) {
                                    Object object5 = iterator5.next();
                                    hdez hdez1 = (hdez)object5;
                                    if(hdez1.c == v17) {
                                        int v20 = hdez1.e;
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        hdez hdez2 = (hdez)hftp3.b_message;
                                        hdez2.b |= 2;
                                        hdez2.d = v20;
                                        hdez hdez3 = (hdez)hftp3.N_build();
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        hdfa hdfa0 = (hdfa)hftp2.b_message;
                                        hdez3.getClass();
                                        hfuo hfuo1 = hdfa0.b;
                                        if(!hfuo1.c()) {
                                            hdfa0.b = ProtoLiteMessage.E(hfuo1);
                                        }
                                        hdfa0.b.add(hdez3);
                                        ++v16;
                                        arrayDeque0 = arrayDeque0;
                                        v13 = v13;
                                        continue label_151;
                                    }
                                    else {
                                        arrayDeque0 = arrayDeque0;
                                        v19 = v19;
                                        goto label_168;
                                    }
                                    break;
                                }
                                --v19;
                            }
                            throw new IllegalArgumentException(String.format(Locale.US, "Failed to find activeOptionId for dataReference: %d", v17));
                        }
                        v21 = v13;
                        arrayDeque1 = arrayDeque0;
                        gbvm0.f.subList(gbvm0.g + 1, gbvm0.f.size()).clear();
                        hdfa hdfa1 = (hdfa)hftp2.N_build();
                        gbvm0.f.add(hdfa1);
                        ++gbvm0.g;
                        byi2.g();
                        gbvm0.n(null);
                    }
                    else {
                        v21 = v13;
                        arrayDeque1 = arrayDeque0;
                    }
                    ++v14;
                    arrayDeque0 = arrayDeque1;
                    v13 = v21;
                }
            }
            gaxl.a();
            if(hzih.d()) {
                this.a.j.h();
            }
        }
    }

    public final void d(gbfv gbfv0) {
        this.b = gbfv0;
        gbfv0.f.ih(this);
    }

    private static void e(long v, List list0, ggfq ggfq0) {
        for(Object object0: list0) {
            ggfq0.b(((Long)object0), Long.valueOf(v));
        }
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gbfr gbfr0 = (gbfr)object0;
        Collection collection0 = this.b.b.values();
        gaxl.a();
        ggfq ggfq0 = new ggfq();
        ggfq ggfq1 = new ggfq();
        for(Object object1: collection0) {
            hcos hcos0 = ((hcnu)object1).c;
            if(hcos0 == null) {
                hcos0 = hcos.a;
            }
            long v = hcos0.c;
            hfuo hfuo0 = ((hcnu)object1).g;
            gaxl.a();
            for(Object object2: hfuo0) {
                gasc.e(v, ((hcqv)object2).c, ggfq0);
            }
            hfuo hfuo1 = ((hcnu)object1).h;
            gaxl.a();
            for(Object object3: hfuo1) {
                gasc.e(v, ((hcrz)object3).c, ggfq1);
            }
        }
        this.e = ggfq0.a();
        this.f = ggfq1.a();
    }
}

