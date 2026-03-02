import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.FIN;

public final class fvqn implements fxzt {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public gged_interceptors i;
    public gged_interceptors j;
    public int k;
    private final byte[] l;
    private final File m;

    public fvqn(fwyk fwyk0, byte[] arr_b) {
        File file0 = fvqn.j(fwyk0);
        super();
        this.m = file0;
        this.l = arr_b;
        this.a = 0L;
        this.k = 1;
        this.b = 0L;
        this.g = 0x80000000;
        this.h = 0x80000000;
        this.c = 0L;
        this.d = 0L;
        this.f = 0;
        this.e = 0L;
        this.i = ggna.a;
        this.j = ggna.a;
    }

    public final int a() {
        synchronized(this) {
        }
        return this.g == 0x80000000 ? 1 : this.g;
    }

    public final int b() {
        synchronized(this) {
        }
        return this.h == 0x80000000 ? 1 : this.h;
    }

    public final int c() {
        synchronized(this) {
        }
        return this.f;
    }

    final long d() {
        long v2;
        synchronized(this) {
            int v1 = this.j.size();
            if(v1 == 0) {
                return 0L;
            }
            v2 = ((fvql)this.j.get(v1 - 1)).a;
        }
        return v2;
    }

    @Override  // fxzt
    public final void e() {
    }

    @Override  // fxzt
    public final void f(ProtoLiteBuilder hftp0, long v) {
        ArrayList arrayList0 = new ArrayList();
        synchronized(this) {
            ggqk ggqk0 = this.j.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                fvql fvql0 = (fvql)object0;
                if(fvql0.b >= v) {
                    arrayList0.add(fvql0);
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxmz.a).v_newBuilder();
        for(Object object1: arrayList0) {
            int v2 = ((fvql)object1).e;
            int v3 = v2 == 0 ? 1 : gxnc.a(v2);
            int v4 = (int)fvsl.b(((fvql)object1).b);
            int v5 = ((fvql)object1).c;
            if(v5 == 0) {
                throw null;
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxnf.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            int v6 = gxne.a(v5);
            ProtoLiteMessage hftv0 = hftp2.b_message;
            if(v6 == 0) {
                throw null;
            }
            ((gxnf)hftv0).c = v6;
            ((gxnf)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((gxnf)hftv1).b |= 4;
            ((gxnf)hftv1).e = v4;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            gxnf gxnf0 = (gxnf)hftp2.b_message;
            if(v3 == 0) {
                throw null;
            }
            gxnf0.d = v3;
            gxnf0.b |= 2;
            gxnf gxnf1 = (gxnf)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gxmz gxmz0 = (gxmz)hftp1.b_message;
            gxnf1.getClass();
            hfuo hfuo0 = gxmz0.b;
            if(!hfuo0.c()) {
                gxmz0.b = ProtoLiteMessage.E(hfuo0);
            }
            gxmz0.b.add(gxnf1);
            continue;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxng gxng0 = (gxng)hftp0.b_message;
        gxmz gxmz1 = (gxmz)hftp1.N_build();
        gxmz1.getClass();
        gxng0.e = gxmz1;
        gxng0.b |= 0x200;
    }

    public final long g() {
        synchronized(this) {
        }
        return this.e;
    }

    public final fvur h() {
        return new fvur(this.l, this.m);
    }

    final gwvr i() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvr.a).v_newBuilder();
        int v1 = this.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v1 != 0) {
            ((gwvr)hftv0).m = v1;
            ((gwvr)hftv0).b |= 0x100;
            long v2 = this.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gwvr)hftv1).b |= 2;
            ((gwvr)hftv1).e = v2;
            int v3 = this.f;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gwvr)hftv2).b |= 0x20;
            ((gwvr)hftv2).i = v3;
            long v4 = this.a;
            if(v4 != 0L) {
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr0 = (gwvr)hftp0.b_message;
                gwvr0.b |= 1;
                gwvr0.d = v4;
            }
            long v5 = this.c;
            if(v5 != 0L) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr1 = (gwvr)hftp0.b_message;
                gwvr1.b |= 16;
                gwvr1.h = v5;
            }
            long v6 = this.d;
            if(v6 != 0L) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr2 = (gwvr)hftp0.b_message;
                gwvr2.b |= 0x80;
                gwvr2.k = v6;
            }
            long v7 = this.e;
            if(v7 != 0L) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr3 = (gwvr)hftp0.b_message;
                gwvr3.b |= 0x40;
                gwvr3.j = v7;
            }
            int v8 = this.g;
            if(v8 != 0x80000000) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr4 = (gwvr)hftp0.b_message;
                gwvr4.b |= 8;
                gwvr4.g = v8;
            }
            int v9 = this.h;
            if(v9 != 0x80000000) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr5 = (gwvr)hftp0.b_message;
                gwvr5.b |= 4;
                gwvr5.f = v9;
            }
            gged_interceptors gged0 = this.i;
            int v10 = gged0.size();
            for(int v11 = 0; v11 < v10; ++v11) {
                fvqm fvqm0 = (fvqm)gged0.get(v11);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwvu.a).v_newBuilder();
                String s = fvqm0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwvu gwvu0 = (gwvu)hftp1.b_message;
                s.getClass();
                gwvu0.b |= 1;
                gwvu0.c = s;
                gged_interceptors gged1 = fvqm0.b;
                int v12 = gged1.size();
                int v13 = 0;
                while(v13 < v12) {
                    fvsl fvsl0 = (fvsl)gged1.get(v13);
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwwb.a).v_newBuilder();
                    int v14 = (int)fvsl0.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    ((gwwb)hftv3).b |= 1;
                    ((gwwb)hftv3).c = v14;
                    int v15 = (int)fvsl0.c;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gwwb gwwb0 = (gwwb)hftp2.b_message;
                    gwwb0.b |= 2;
                    gwwb0.d = v15;
                    gwwb gwwb1 = (gwwb)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwvu gwvu1 = (gwvu)hftp1.b_message;
                    gwwb1.getClass();
                    hfuo hfuo0 = gwvu1.d;
                    if(!hfuo0.c()) {
                        gwvu1.d = ProtoLiteMessage.E(hfuo0);
                    }
                    gwvu1.d.add(gwwb1);
                    ++v13;
                    v11 = v11;
                }
                gwvu gwvu2 = (gwvu)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwvr gwvr6 = (gwvr)hftp0.b_message;
                gwvu2.getClass();
                hfuo hfuo1 = gwvr6.l;
                if(!hfuo1.c()) {
                    gwvr6.l = ProtoLiteMessage.E(hfuo1);
                }
                gwvr6.l.add(gwvu2);
            }
            gged_interceptors gged2 = this.j;
            int v16 = gged2.size();
            int v17 = 0;
            while(v17 < v16) {
                fvql fvql0 = (fvql)gged2.get(v17);
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwwa.a).v_newBuilder();
                long v18 = fvql0.a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp3.b_message;
                ((gwwa)hftv4).b |= 1;
                ((gwwa)hftv4).c = v18;
                long v19 = fvql0.b;
                if(!hftv4.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp3.b_message;
                ((gwwa)hftv5).b |= 2;
                ((gwwa)hftv5).d = v19;
                int v20 = fvql0.c;
                if(!hftv5.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp3.b_message;
                if(v20 != 0) {
                    ((gwwa)hftv6).e = v20;
                    ((gwwa)hftv6).b |= 8;
                    int v21 = fvql0.d;
                    if(v21 != 0) {
                        if(!hftv6.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gwwa)hftp3.b_message).g = v21;
                        ((gwwa)hftp3.b_message).b |= 0x20;
                    }
                    int v22 = fvql0.e;
                    if(v22 != 0) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gwwa)hftp3.b_message).f = v22;
                        ((gwwa)hftp3.b_message).b |= 16;
                    }
                    gwwa gwwa0 = (gwwa)hftp3.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvr gwvr7 = (gwvr)hftp0.b_message;
                    gwwa0.getClass();
                    hfuo hfuo2 = gwvr7.c;
                    if(!hfuo2.c()) {
                        gwvr7.c = ProtoLiteMessage.E(hfuo2);
                    }
                    gwvr7.c.add(gwwa0);
                    ++v17;
                    continue;
                }
                throw null;
            }
            gwvr gwvr8 = (gwvr)hftp0.N_build();
            FIN.finallyCodeBegin$NT(v);
            return gwvr8;
        }
        throw null;
    }

    public static File j(fwyk fwyk0) {
        File file0 = fwyk0.b();
        if(file0 == null) {
            return null;
        }
        return huqs.c() ? new File(ccsb.a.b(file0, "nlp_clts")) : new File(file0, "nlp_clts");
    }

    public final Date k() {
        Date date0;
        synchronized(this) {
            long v1 = this.c;
            if(v1 == 0L) {
                return null;
            }
            date0 = new Date(v1);
        }
        return date0;
    }

    public final Map l() {
        Map map0;
        synchronized(this) {
            if(this.d == 0L) {
                map0 = null;
            }
            else {
                map0 = new HashMap();
                gged_interceptors gged0 = this.i;
                int v1 = gged0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    fvqm fvqm0 = (fvqm)gged0.get(v2);
                    ((HashMap)map0).put(fvqm0.a, fvqm0.b);
                }
            }
        }
        return map0;
    }

    final void m() {
        synchronized(this) {
            this.e = 0L;
        }
    }

    public final void n() {
        synchronized(this) {
            ++this.f;
        }
    }

    public final void o(Calendar calendar0) {
        synchronized(this) {
            if(calendar0 != null) {
                this.c = calendar0.getTimeInMillis();
                this.f = 0;
            }
        }
    }

    public final void p() {
        try {
            fvur fvur0 = this.h();
            fvur0.b(fvur0.c(((MessageLite)this.i())));
        }
        catch(IOException unused_ex) {
        }
    }

    public final void q(long v) {
        synchronized(this) {
            this.b = v;
        }
    }

    public final void r(long v) {
        synchronized(this) {
            this.e = v;
        }
    }

    public final void s() {
        synchronized(this) {
            this.g = 20000;
        }
    }

    public final void t() {
        synchronized(this) {
            this.h = 10000;
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0;
        synchronized(this) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(String.format("NextSensorCollectionTimeSinceEpoch: %s", (this.a == 0L ? "none" : new Date(this.a).toString())));
            gged_interceptors gged0 = this.j;
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fvql fvql0 = (fvql)gged0.get(v2);
                stringBuilder0.append(String.format(", [start: %s, end: %s]", new Date(fvql0.a), new Date(fvql0.b)));
            }
        }
        return stringBuilder0.toString();
    }

    final long u(int v) {
        synchronized(this) {
            int v2 = this.j.size();
            while(true) {
                --v2;
                if(v2 < 0) {
                    break;
                }
                fvql fvql0 = (fvql)this.j.get(v2);
                if(fvql0.d == v) {
                    return fvql0.a;
                }
            }
        }
        return 0L;
    }

    public final void v(long v, long v1, int v2, int v3, fvrb fvrb0) {
        int v7;
        synchronized(this) {
            long v5 = Math.min(v, v1);
            long v6 = Math.max(v, v1);
            if(fvrb0 == null) {
                v7 = 0;
            }
            else if(fvrb0 == fvrb.b) {
                v7 = 2;
            }
            else {
                v7 = 1;
            }
            List list0 = new ArrayList(this.j);
            list0.add((huvd.r() ? new fvql(v5, v6, v2, v3, v7) : new fvql(v5, v6, v2, v7)));
            Collections.sort(list0);
            int v8 = list0.size();
            if(v8 > 20) {
                list0 = list0.subList(v8 - 20, v8);
            }
            this.j = gged_interceptors.i(list0);
        }
    }
}

