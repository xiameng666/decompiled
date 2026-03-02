import android.content.SyncResult;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ehiv implements ehim {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public gfsx G;
    public gfsx H;
    public gfsx I;
    public gfsx J;
    public final Map K;
    public int L;
    private final List M;
    public final SyncResult a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final List g;
    public final List h;
    public final Set i;
    public final List j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final long r;
    public int s;
    public int t;
    public long u;
    public String v;
    public ehiu w;
    public boolean x;
    public boolean y;
    public girq z;

    public ehiv() {
        this(new SyncResult());
    }

    public ehiv(SyncResult syncResult0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.M = new ArrayList();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.k = false;
        this.l = false;
        this.m = false;
        this.L = 1;
        this.p = 0;
        this.q = 0;
        this.r = SystemClock.elapsedRealtime();
        this.t = 0;
        this.u = 0L;
        this.v = null;
        this.x = false;
        this.y = false;
        this.z = null;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = gfqx.a;
        this.H = gfqx.a;
        this.I = gfqx.a;
        this.J = gfqx.a;
        this.K = new HashMap();
        this.a = syncResult0;
        this.s = 101;
    }

    @Override  // ehim
    public final long a() {
        return this.a.stats.numIoExceptions + this.a.stats.numParseExceptions + this.a.stats.numAuthExceptions;
    }

    @Override  // ehim
    public final girg b() {
        return (girg)this.H.g();
    }

    @Override  // ehim
    public final void c(girw girw0) {
        this.g.add(girw0);
    }

    @Override  // ehim
    public final void d(girx girx0) {
        this.h.add(girx0);
    }

    @Override  // ehim
    public final void e(gipd gipd0) {
        this.M.add(gipd0);
    }

    @Override  // ehim
    public final void f(int v, String s, girs girs0) {
        ehis ehis0 = new ehis(v, s);
        Map map0 = this.K;
        if(!map0.containsKey(ehis0)) {
            map0.put(ehis0, new ArrayList());
        }
        ((List)map0.get(ehis0)).add(girs0);
    }

    @Override  // ehim
    public final void g(String s) {
        this.i.add(s);
    }

    @Override  // ehim
    public final void h(girk girk0, gjgi gjgi0, boolean z, int v, int v1) {
        ProtoLiteBuilder hftp0;
        if(v1 <= 0) {
            return;
        }
        ehiq ehiq0 = new ehiq(girk0, gjgi0, z);
        Map map0 = this.b;
        if(map0.containsKey(ehiq0)) {
            girn girn0 = (girn)map0.get(ehiq0);
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)girn0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)girn0));
        }
        else {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)girn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((girn)hftv0).c = girk0.j;
            ((girn)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((girn)hftv1).d = gjgi0.k;
            ((girn)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            girn girn1 = (girn)hftp1.b_message;
            girn1.b |= 4;
            girn1.e = z;
            hftp0 = hftp1;
        }
        int v2 = (int)hwzc.a.c().p();
        switch(v) {
            case 1: {
                int v3 = Math.min(((girn)hftp0.b_message).f + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn2 = (girn)hftp0.b_message;
                girn2.b |= 8;
                girn2.f = v3;
                break;
            }
            case 2: {
                int v4 = Math.min(((girn)hftp0.b_message).g + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn3 = (girn)hftp0.b_message;
                girn3.b |= 16;
                girn3.g = v4;
                break;
            }
            case 3: {
                int v5 = Math.min(((girn)hftp0.b_message).h + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn4 = (girn)hftp0.b_message;
                girn4.b |= 0x20;
                girn4.h = v5;
                break;
            }
            case 4: {
                int v6 = Math.min(((girn)hftp0.b_message).i + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn5 = (girn)hftp0.b_message;
                girn5.b |= 0x40;
                girn5.i = v6;
                break;
            }
            case 7: {
                int v7 = Math.min(((girn)hftp0.b_message).m + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn6 = (girn)hftp0.b_message;
                girn6.b |= 0x800;
                girn6.m = v7;
                break;
            }
            case 8: {
                int v8 = Math.min(((girn)hftp0.b_message).n + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn7 = (girn)hftp0.b_message;
                girn7.b |= 0x1000;
                girn7.n = v8;
                break;
            }
            case 9: {
                int v9 = Math.min(((girn)hftp0.b_message).o + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn8 = (girn)hftp0.b_message;
                girn8.b |= 0x2000;
                girn8.o = v9;
                break;
            }
            case 10: {
                int v10 = Math.min(((girn)hftp0.b_message).j + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn9 = (girn)hftp0.b_message;
                girn9.b |= 0x200;
                girn9.j = v10;
                break;
            }
            case 11: {
                int v11 = Math.min(((girn)hftp0.b_message).k + v1, v2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                girn girn10 = (girn)hftp0.b_message;
                girn10.b |= 0x400;
                girn10.k = v11;
            }
        }
        map0.put(ehiq0, ((girn)hftp0.N_build()));
    }

    @Override  // ehim
    public final void i(gjhb gjhb0) {
        Map map0 = this.e;
        if(map0.containsKey(gjhb0)) {
            map0.put(gjhb0, Integer.valueOf(((int)(((Integer)map0.get(gjhb0)))) + 1));
            return;
        }
        map0.put(gjhb0, Integer.valueOf(1));
    }

    @Override  // ehim
    public final void j() {
        ++this.t;
    }

    @Override  // ehim
    public final void k(girg girg0) {
        this.H = gfsx.m(girg0);
    }

    @Override  // ehim
    public final void l(girh girh0) {
        this.G = gfsx.m(girh0);
    }

    @Override  // ehim
    public final void m(boolean z, long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((girp)hftv0).c = (z ? 2 : 3) - 1;
        ((girp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        girp girp0 = (girp)hftp0.b_message;
        girp0.b |= 2;
        girp0.d = v;
        this.J = gfsx.m(((girp)hftp0.N_build()));
    }

    @Override  // ehim
    public final void n() {
        this.y = true;
    }

    @Override  // ehim
    public final void o() {
        this.D = true;
    }

    @Override  // ehim
    public final void p() {
        this.C = true;
    }

    @Override  // ehim
    public final void q() {
        this.E = true;
    }

    @Override  // ehim
    public final void r(gjgi gjgi0, girk girk0, String s, Exception exception0) {
        String s2;
        String s1 = "UNKNOWN_";
        if(gjgi0 == gjgi.b) {
            s2 = "CONTACT_";
        }
        else if(gjgi0 == gjgi.c) {
            s2 = "GROUP_";
        }
        else if(gjgi0 == gjgi.d) {
            s2 = "PHOTO_";
        }
        else {
            s2 = gjgi0 == gjgi.j ? "CC_PHOTO_" : "UNKNOWN_";
        }
        if(girk0 == girk.b) {
            s1 = "INSERT_";
        }
        else if(girk0 == girk.c) {
            s1 = "UPDATE_";
        }
        else if(girk0 == girk.d) {
            s1 = "DELETE_";
        }
        this.w = new ehiu(TextUtils.concat(new CharSequence[]{s2, s1, s}).toString(), exception0);
    }

    @Override  // ehim
    public final gipd[] s() {
        return (gipd[])this.M.toArray(new gipd[this.M.size()]);
    }

    @Override  // ehim
    public final void t(girk girk0, gjgi gjgi0, boolean z, ehil ehil0, int v) {
        ehiq ehiq0 = new ehiq(girk0, gjgi0, z);
        Map map0 = this.d;
        if(!map0.containsKey(ehiq0)) {
            map0.put(ehiq0, new HashMap());
        }
        Map map1 = (Map)map0.get(ehiq0);
        if(!map1.containsKey(ehil0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girm.a).v_newBuilder();
            int v1 = ehil0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((girm)hftv0).c = v1 - 1;
            ((girm)hftv0).b |= 1;
            gjhf gjhf0 = ehil0.a;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((girm)hftv1).f = gjhf0.x;
            ((girm)hftv1).b |= 8;
            int v2 = ehil0.c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((girm)hftp0.b_message).g = v2 - 1;
            ((girm)hftp0.b_message).b |= 16;
            map1.put(ehil0, hftp0);
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)map1.get(ehil0);
        if(v == 1) {
            ProtoLiteMessage hftv2 = hftp1.b_message;
            int v3 = ((girm)hftv2).d + 1;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            girm girm0 = (girm)hftp1.b_message;
            girm0.b |= 2;
            girm0.d = v3;
        }
        if(v == 2) {
            ProtoLiteMessage hftv3 = hftp1.b_message;
            int v4 = ((girm)hftv3).e + 1;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            girm girm1 = (girm)hftp1.b_message;
            girm1.b |= 4;
            girm1.e = v4;
        }
        if(v == 3) {
            ProtoLiteMessage hftv4 = hftp1.b_message;
            int v5 = ((girm)hftv4).h + 1;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            girm girm2 = (girm)hftp1.b_message;
            girm2.b |= 0x20;
            girm2.h = v5;
            ++this.F;
        }
    }

    @Override  // ehim
    public final gfsx u(gjgi gjgi0, int v, int v1) {
        ehir ehir0 = new ehir(gjgi0, v, v1);
        girz girz0 = (girz)this.c.get(ehir0);
        return girz0 == null ? gfqx.a : gfsx.m(Integer.valueOf(girz0.d));
    }

    @Override  // ehim
    public final void v(gjgi gjgi0, int v, int v1, int v2) {
        if(v2 < 0) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((girz)hftv0).c = gjgi0.k;
        ((girz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((girz)hftv1).e = v - 1;
        ((girz)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((girz)hftv2).f = v1 - 1;
        ((girz)hftv2).b |= 8;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        girz girz0 = (girz)hftp0.b_message;
        girz0.b |= 2;
        girz0.d = v2;
        girz girz1 = (girz)hftp0.N_build();
        ehir ehir0 = new ehir(gjgi0, v, v1);
        this.c.put(ehir0, girz1);
    }
}

