import android.os.Bundle;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class gawy extends gawt implements gawp {
    private boolean A;
    public gawq t;

    protected gawy(gast gast0) {
        super(gast0);
    }

    @Override  // gawt
    protected void C(hcrz hcrz0) {
        hfta hfta0 = hcrs.f;
        hcrz0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcrz0.s.m(hftu0)) {
            hcrz0.f(hfta0);
            Object object0 = hcrz0.s.k(hftu0);
            Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
            int v = ((hcrs)object1).e;
            if((hcrr.b(v) == null ? hcrr.a : hcrr.b(v)) == hcrr.e) {
                if(((hcrs)object1).c == 4) {
                    hcru hcru0 = (hcru)((hcrs)object1).d;
                    int v1 = hcru0.b & 16;
                    if((hcru0.b & 1) == 0 && v1 == 0) {
                        this.K("SetValueByReference does not contain data reference.");
                        return;
                    }
                    if(this.a.b.q((v1 == 0 ? hcru0.c : (hcru0.g == null ? hcol.a : hcru0.g).c))) {
                        this.aL(hcru0);
                        return;
                    }
                    this.K(String.format(Locale.US, "Cannot get component with data reference: %s.", ((long)hcru0.c)));
                    return;
                }
                this.K("ResultingAction with type SET_VALUE_BY_REFERENCE does not contain setValueByReference data");
                return;
            }
            if((hcrr.b(v) == null ? hcrr.a : hcrr.b(v)) == hcrr.g) {
                this.t.nE((((hcrs)object1).c == 5 ? ((hcrt)((hcrs)object1).d) : hcrt.a).b);
                this.ap();
                return;
            }
            super.C(hcrz0);
        }
    }

    @Override  // garp
    protected void S(hcnu hcnu0, Bundle bundle0) {
        super.S(hcnu0, bundle0);
        if(bundle0 != null) {
            this.t.e(bundle0);
        }
    }

    @Override  // gawt
    protected void T(Bundle bundle0) {
        super.T(bundle0);
        this.aa(new gawx(this.a));
    }

    @Override  // gawt
    protected void W(hcnu hcnu0, hcnu hcnu1) {
        super.W(hcnu0, hcnu1);
        gawq gawq0 = this.aJ(hcnu1);
        this.t = gawq0;
        gawq0.d = this.a.a.g;
        this.A = this.al(gkwx.i);
    }

    @Override  // garp
    protected void Y(hcos hcos0, hcos hcos1, boolean z) {
        MessageLite hfvm0;
        super.Y(hcos0, hcos1, z);
        this.t.nE(hcos1.i);
        if(hcos0 == null || !this.aN(hcos0) && !z) {
            gawq gawq0 = this.t;
            hfta hfta0 = gawq0.a;
            hcos1.f(hfta0);
            hftu hftu0 = hfta0.d;
            if(hcos1.s.m(hftu0)) {
                hcos1.f(hfta0);
                Object object0 = hcos1.s.k(hftu0);
                hfvm0 = (MessageLite)(object0 == null ? hfta0.b : hfta0.d(object0));
            }
            else {
                hfvm0 = (MessageLite)hfta0.b;
            }
            gawq0.h(hfvm0);
        }
        this.t.c = this;
    }

    private static final Object a(garp garp0, List list0) {
        gaxl.a();
        return gaxm.x() ? garp0.r(gaws.a(list0)) : garp0.s(list0);
    }

    protected abstract gawq aJ(hcnu arg1);

    protected void aK(garx garx0, gkwv gkwv0) {
        ProtoLiteBuilder hftp0 = this.aO(garx0, gkwv0);
        this.a.a.g.f(hftp0);
    }

    protected void aL(hcru hcru0) {
        if((hcru0.b & 16) != 0) {
            hcol hcol0 = hcru0.g == null ? hcol.a : hcru0.g;
            hfuf hfuf0 = hcru0.h;
            hfuf hfuf1 = hcol0.d;
            hfuo hfuo0 = hcol0.e;
            garp garp0 = this.a.b.i(hcol0.c, "BE_VDC_02");
            this.t.j(hfuf0, (hfuo0.isEmpty() ? gawy.a(garp0, hfuf1) : garp0.r(hfuo0)));
            return;
        }
        long v = hcru0.c;
        int v1 = hcru0.f;
        gged_interceptors gged0 = gged_interceptors.m(Integer.valueOf(hcru0.d), Integer.valueOf(hcru0.e));
        Object object0 = gawy.a(this.a.b.i(v, "BE_VDC_01"), gged0);
        this.t.i(v1, object0);
    }

    protected boolean aM() {
        return true;
    }

    protected boolean aN(hcos hcos0) {
        return false;
    }

    protected final ProtoLiteBuilder aO(garx garx0, gkwv gkwv0) {
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkxt)hftp0.b_message).g = gkwx0.G;
        ((gkxt)hftp0.b_message).b |= 4;
        long v = this.nz();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkxt0.b |= 0x20;
        gkxt0.l = v;
        if(gkwv0 == gkwv.a) {
            hftp1 = ((ProtoLiteMessage)gkxr.a).v_newBuilder();
        }
        else {
            hftp1 = ((ProtoLiteMessage)gkxr.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gkxr)hftp1.b_message).c = gkwv0.g;
            ((gkxr)hftp1.b_message).b |= 1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt1 = (gkxt)hftp0.b_message;
        gkxr gkxr0 = (gkxr)hftp1.N_build();
        gkxr0.getClass();
        gkxt1.d = gkxr0;
        gkxt1.c = 6;
        if(garx0 != null) {
            long v1 = garx0.no();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkxt gkxt2 = (gkxt)hftp0.b_message;
            gkxt2.b |= 8;
            gkxt2.h = v1;
            int v2 = garx0.nn();
            if(v2 != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkxt gkxt3 = (gkxt)hftp0.b_message;
                gkxt3.b |= 16;
                gkxt3.i = v2;
            }
        }
        this.aw(hftp0);
        return hftp0;
    }

    @Override  // garp
    protected final void ab(hcos hcos0) {
        MessageLite hfvm0;
        super.ab(hcos0);
        this.t.nE(hcos0.i);
        gawq gawq0 = this.t;
        hfta hfta0 = gawq0.a;
        hcos0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcos0.s.m(hftu0)) {
            hcos0.f(hfta0);
            Object object0 = hcos0.s.k(hftu0);
            hfvm0 = (MessageLite)(object0 == null ? hfta0.b : hfta0.d(object0));
        }
        else {
            hfvm0 = (MessageLite)hfta0.b;
        }
        gawq0.h(hfvm0);
        gawq0.n(null);
    }

    @Override  // garp
    public boolean ai() {
        return this.t.q();
    }

    @Override  // garp
    public final hftr av(int v) {
        int v2;
        hftr hftr0 = super.av(v);
        if(v == 0) {
            this.t.s(hftr0);
        }
        else {
            if(((this.b.c == null ? hcos.a : this.b.c).b & 0x40) == 0) {
                hcos hcos2 = this.b.c;
                if(((hcos2 == null ? hcos.a : hcos2).b & 0x20) == 0) {
                    v2 = 1;
                }
                else {
                    if(hcos2 == null) {
                        hcos2 = hcos.a;
                    }
                    v2 = hcos2.g ^ 1;
                }
            }
            else {
                hcos hcos0 = this.b.c;
                hcos hcos1 = hcos0 == null ? hcos.a : hcos0;
                if(hcor.a(hcos1.h) != 0 && hcor.a(hcos1.h) != 1) {
                    if(hcos0 == null) {
                        hcos0 = hcos.a;
                    }
                    switch(hcor.a(hcos0.h)) {
                        case 0: {
                            v2 = 0;
                            break;
                        }
                        case 2: {
                            v2 = 1;
                            break;
                        }
                        default: {
                            v2 = 0;
                        }
                    }
                }
                else {
                    this.K("Unknown ExtensionSubmitConfig type");
                    v2 = 1;
                }
            }
            if(v2 != 0 && this.t.p()) {
                this.t.s(hftr0);
            }
            if(hcor.a((this.b.c == null ? hcos.a : this.b.c).h) == 4) {
                List list0 = DesugarCollections.unmodifiableList(((hcos)hftr0.b_message).j);
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    hcov hcov0 = (hcov)list0.get(v1);
                    hcoy hcoy0 = hcov0.d == null ? hcoy.a : hcov0.d;
                    hfuf hfuf0 = hcoy0.c;
                    gaxl.a();
                    Object object0 = gaxm.x() ? this.r(gaws.a(hfuf0)) : this.s(hfuf0);
                    if(object0 != null) {
                        if((object0 instanceof String)) {
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcov0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)hcov0));
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hcoy0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)hcoy0));
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hcoy hcoy1 = (hcoy)hftp1.b_message;
                            hcoy1.b |= 1;
                            hcoy1.d = (String)object0;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hcov hcov1 = (hcov)hftp0.b_message;
                            hcoy hcoy2 = (hcoy)hftp1.N_build();
                            hcoy2.getClass();
                            hcov1.d = hcoy2;
                            hcov1.b |= 2;
                            hcov hcov2 = (hcov)hftp0.N_build();
                            if(!hftr0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hftr0).ensureMutable();
                            }
                            hcos hcos3 = (hcos)hftr0.b_message;
                            hcov2.getClass();
                            hcos3.b();
                            hcos3.j.set(v1, hcov2);
                        }
                        else {
                            this.K("Unsupported field type for encryption.");
                        }
                    }
                }
            }
        }
        gaxl.a();
        if(hzjc.a.b().c()) {
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((hcos)hftr0.b_message).i = hfty.a;
            List list1 = this.t.b;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hcos hcos4 = (hcos)hftr0.b_message;
            hfuf hfuf1 = hcos4.i;
            if(!hfuf1.c()) {
                hcos4.i = ProtoLiteMessage.C(hfuf1);
            }
            hfrj.E(list1, hcos4.i);
        }
        return hftr0;
    }

    @Override  // garp
    public int ax(int v) {
        return this.t.r(v);
    }

    @Override  // gawt
    protected void lx(Bundle bundle0) {
        super.lx(bundle0);
        this.t.nD(bundle0);
    }

    @Override  // gawp
    public void nG(garx garx0, gkwv gkwv0) {
        if(this.aM()) {
            this.ap();
        }
        this.P(garx0);
        this.M(gkwv0);
        if(this.a.d.c) {
            this.V(hcsj.b, 0);
        }
        if(this.A) {
            this.aK(garx0, gkwv0);
        }
    }

    @Override  // garp
    public final Object r(List list0) {
        return this.t.c(list0);
    }

    @Override  // garp
    public final Object s(List list0) {
        return this.t.d(list0);
    }

    @Override  // garp
    protected final List v() {
        List list0 = this.t.b;
        if(list0.isEmpty()) {
            return super.v();
        }
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            garo garo0 = this.j == null ? null : ((garo)this.j.get(((Integer)object0)));
            if(garo0 != null) {
                list1.add(garo0);
            }
        }
        return list1;
    }
}

