import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.Locale;

public class gawt extends garp {
    private SparseIntArray VX;
    public hcog p;
    int q;
    int r;
    public boolean s;
    private boolean t;

    protected gawt(gast gast0) {
        super(gast0);
    }

    @Override  // garp
    protected void C(hcrz hcrz0) {
        hfta hfta0 = hcrs.f;
        hcrz0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcrz0.s.m(hftu0)) {
            hcrz0.f(hfta0);
            Object object0 = hcrz0.s.k(hftu0);
            Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
            hcrr hcrr0 = hcrr.b(((hcrs)object1).e);
            if(hcrr0 == null) {
                hcrr0 = hcrr.a;
            }
            if(hcrr0 == hcrr.c) {
                if(((hcrs)object1).c == 3) {
                    hcog hcog0 = hcog.b(((Integer)((hcrs)object1).d).intValue());
                    if(hcog0 == null) {
                        hcog0 = hcog.a;
                    }
                    gftb.s(hcog0 != hcog.e && hcog0 != hcog.f, "Unsupported resulting action functional data execution state: %s.", hcog0.g);
                    this.J(hcog0);
                    return;
                }
                super.C(hcrz0);
                return;
            }
            super.C(hcrz0);
        }
    }

    private final void I(hcog hcog0, int v) {
        Integer integer0 = (int)this.p.g;
        this.a.a.f("Data %d transitioning functional data state (%d) -> (%d, %d)", new Object[]{this.nz(), integer0, ((int)hcog0.g), v});
        this.r = -1;
        this.q = -1;
        if(hcog0 == hcog.d) {
            this.r = v;
        }
        else if(hcog0 == hcog.f) {
            this.q = v;
        }
        if(this.J(hcog0)) {
            this.V(hcsf.d, 1);
        }
    }

    private final boolean J(hcog hcog0) {
        hcog hcog1 = this.p;
        int v = 0;
        if(hcog1 != hcog0) {
            this.p = hcog0;
            this.aC();
            gged_interceptors gged0 = this.l();
            int v1 = gged0.size();
            while(v < v1) {
                ((garx)gged0.get(v)).i();
                ++v;
            }
            v = 1;
            if(hcog1 != null && this.t) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxw.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gkxw)hftv0).b |= 1;
                ((gkxw)hftv0).c = hcog1.g;
                int v2 = hcog0.g;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gkxw)hftv1).b |= 2;
                ((gkxw)hftv1).d = v2;
                int v3 = this.q;
                if(v3 == -1) {
                    int v4 = this.r;
                    if(v4 != -1) {
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gkxw gkxw1 = (gkxw)hftp0.b_message;
                        gkxw1.b |= 4;
                        gkxw1.e = v4;
                    }
                }
                else {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkxw gkxw0 = (gkxw)hftp0.b_message;
                    gkxw0.b |= 4;
                    gkxw0.e = v3;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
                gkwx gkwx0 = gkwx.j;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gkxt)hftp1.b_message).g = gkwx0.G;
                ((gkxt)hftp1.b_message).b |= 4;
                long v5 = this.nz();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((gkxt)hftv2).b |= 0x20;
                ((gkxt)hftv2).l = v5;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkxt gkxt0 = (gkxt)hftp1.b_message;
                gkxw gkxw2 = (gkxw)hftp0.N_build();
                gkxw2.getClass();
                gkxt0.d = gkxw2;
                gkxt0.c = 9;
                this.a.a.g.f(hftp1);
            }
        }
        return v != 0;
    }

    @Override  // garp
    protected void T(Bundle bundle0) {
        super.T(bundle0);
        this.aa(new gawv(this.a));
        this.p = hcog.b;
        this.q = -1;
        this.r = -1;
        if(bundle0 != null) {
            this.s = bundle0.getBoolean("isWaitingForResult", false);
        }
    }

    @Override  // garp
    protected void W(hcnu hcnu0, hcnu hcnu1) {
        this.t = this.al(gkwx.j);
    }

    @Override  // garp
    protected final void X(hcoj hcoj0, hcoj hcoj1) {
        super.X(hcoj0, hcoj1);
        int v = hcoj1.b;
        if((v & 2) != 0) {
            this.p = hcog.b(hcoj1.d) == null ? hcog.a : hcog.b(hcoj1.d);
        }
        if((v & 4) != 0) {
            this.q = hcoj1.e;
        }
        if((v & 8) != 0) {
            this.r = hcoj1.f;
        }
        if(this.VX == null && !hcoj1.g.isEmpty()) {
            this.VX = new SparseIntArray();
        }
        for(Object object0: hcoj1.g) {
            SparseIntArray sparseIntArray0 = this.VX;
            gftb.check(sparseIntArray0);
            sparseIntArray0.put(((hcno)object0).c, ((hcno)object0).d);
        }
    }

    public final void aA() {
        this.aB(-1);
    }

    public final void aB(int v) {
        this.I(hcog.f, v);
    }

    public final void aC() {
        switch(this.p.ordinal()) {
            case 0: {
                this.K(String.format(Locale.US, "Unsupported functional data execution state: %s", ((int)this.p.g)));
                return;
            }
            case 2: {
                this.aG();
                return;
            }
            case 3: {
                this.aD();
                return;
            }
            case 4: {
                this.aE();
                return;
            }
            case 5: {
                this.aF();
            }
        }
    }

    protected void aD() {
    }

    protected void aE() {
    }

    protected void aF() {
    }

    protected void aG() {
    }

    public final void aH(int v, int v1) {
        if(this.VX == null) {
            this.VX = new SparseIntArray();
        }
        if(this.VX.get(v, -1) != v1) {
            this.VX.put(v, v1);
            this.V(hcsf.d, 4);
        }
    }

    public final void aI() {
        this.nC(hcog.c);
    }

    @Override  // garp
    protected boolean aj(hcqv hcqv0) {
        hfta hfta0 = hcrd.f;
        hcqv0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hcqv0.s.m(hftu0)) {
            hcqv0.f(hfta0);
            Object object0 = hcqv0.s.k(hftu0);
            Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
            hcqz hcqz0 = hcqz.b(((hcrd)object1).e);
            if(hcqz0 == null) {
                hcqz0 = hcqz.a;
            }
            int v = hcqz0.ordinal();
            switch(v) {
                case 1: {
                    if(((hcrd)object1).c == 2) {
                        hcog hcog0 = hcog.b(((Integer)((hcrd)object1).d).intValue());
                        if(hcog0 == null) {
                            hcog0 = hcog.a;
                        }
                        return hcog0 == this.p;
                    }
                    this.K("Should provide a value match state for value match condition.");
                    return true;
                }
                case 2: {
                    if(((hcrd)object1).c == 3) {
                        return hcog.f == this.p && ((int)(((Integer)((hcrd)object1).d))) == this.q;
                    }
                    this.K("Should provide a error code match state for error code match condition.");
                    return true;
                }
                case 3: {
                    if(((hcrd)object1).c == 4) {
                        return hcog.d == this.p && ((int)(((Integer)((hcrd)object1).d))) == this.r;
                    }
                    this.K("Should provide a cancel code match state for cancel code match condition.");
                    return true;
                }
                case 4: {
                    return ((hcrd)object1).c == 5 ? new hfuh(((hcrc)((hcrd)object1).d).c, hcrc.a).contains(this.m()) : new hfuh(hcrc.b.c, hcrc.a).contains(this.m());
                }
                default: {
                    if(v != 6) {
                        return super.aj(hcqv0);
                    }
                    hcno hcno0 = ((hcrd)object1).c == 7 ? ((hcno)((hcrd)object1).d) : hcno.a;
                    return this.VX != null && this.VX.get(hcno0.c, -1) == hcno0.d;
                }
            }
        }
        return super.aj(hcqv0);
    }

    @Override  // garp
    protected final ProtoLiteBuilder au() {
        ProtoLiteBuilder hftp0 = super.au();
        hcog hcog0 = this.p;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcoj)hftp0.b_message).d = hcog0.g;
        ((hcoj)hftp0.b_message).b |= 2;
        int v = this.q;
        if(v != -1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcoj hcoj0 = (hcoj)hftp0.b_message;
            hcoj0.b |= 4;
            hcoj0.e = v;
        }
        int v1 = this.r;
        if(v1 != -1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcoj hcoj1 = (hcoj)hftp0.b_message;
            hcoj1.b |= 8;
            hcoj1.f = v1;
        }
        for(int v2 = 0; this.VX != null && v2 < this.VX.size(); ++v2) {
            int v3 = this.VX.keyAt(v2);
            int v4 = this.VX.get(v3);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcno.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hcno)hftv0).b |= 1;
            ((hcno)hftv0).c = v3;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcno hcno0 = (hcno)hftp1.b_message;
            hcno0.b |= 2;
            hcno0.d = v4;
            hcno hcno1 = (hcno)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcoj hcoj2 = (hcoj)hftp0.b_message;
            hcno1.getClass();
            hfuo hfuo0 = hcoj2.g;
            if(!hfuo0.c()) {
                hcoj2.g = ProtoLiteMessage.E(hfuo0);
            }
            hcoj2.g.add(hcno1);
        }
        return hftp0;
    }

    public final void ay(int v) {
        this.I(hcog.d, v);
    }

    @Override  // gaxs
    protected void lw() {
        this.aC();
    }

    @Override  // garp
    protected void lx(Bundle bundle0) {
        super.lx(bundle0);
        bundle0.putBoolean("isWaitingForResult", this.s);
    }

    private final void nC(hcog hcog0) {
        this.I(hcog0, -1);
    }

    public final void nS() {
        this.nC(hcog.e);
    }

    public final void ng() {
        this.ay(-1);
    }
}

