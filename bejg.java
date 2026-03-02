import com.google.android.gms.chromesync.zeroparty.ChromeSyncState;
import j..util.Objects;

public final class bejg extends lsb {
    public final becz a;
    public final becw b;
    public final String c;
    public boolean d;
    public Boolean e;
    public String f;
    public String g;
    public String h;
    private final beih i;
    private final beis j;
    private final beev k;
    private final beej l;
    private final boolean m;
    private gqsp n;
    private gged_interceptors o;
    private gged_interceptors p;
    private gged_interceptors q;
    private boolean r;
    private int s;
    private int t;
    private int u;

    public bejg(beih beih0, beis beis0, beev beev0, beej beej0, becz becz0, becw becw0, boolean z) {
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(beis0, "preferencesDataRepository");
        ibuq.f(beev0, "chromeSyncStateRepository");
        ibuq.f(beej0, "autofillServicesDataRepository");
        super();
        this.i = beih0;
        this.j = beis0;
        this.k = beev0;
        this.l = beej0;
        this.a = becz0;
        this.b = becw0;
        this.m = z;
        String s = beaw.a().toString();
        ibuq.e(s, "toString(...)");
        this.c = s;
        this.s = -1;
        this.t = -1;
    }

    public final void a(bgmk bgmk0) {
        ibuq.f(bgmk0, "startUpType");
        if(this.n == null) {
            this.n = bgmk0.ordinal() == 1 ? gqsp.cb : gqsp.ca;
            bejf bejf0 = new bejf(new beiw(this));
            this.i.f.ih(bejf0);
            bejf bejf1 = new bejf(new beix(this));
            this.i.l.ih(bejf1);
            bejf bejf2 = new bejf(new beiy(this));
            this.j.c.ih(bejf2);
            bejf bejf3 = new bejf(new beiz(this));
            this.k.a.ih(bejf3);
            evql evql0 = this.l.b.c(bdhr.f);
            ggch ggch0 = ggch.k(beej.a);
            Objects.requireNonNull(this.l.b);
            beeg beeg0 = new beeg(this.l.b);
            ggeo ggeo0 = ggkm.e(ggch0.q(), beeg0);
            ggdy ggdy0 = new ggdy();
            ggdy0.k(ggeo0.g());
            ggdy0.i(evql0);
            evrg.i(ggdy0.h()).g(new beeh(evql0, ggeo0)).b(new beiu(new beja(this)));
        }
    }

    public final void b(gqsm gqsm0) {
        ibuq.f(gqsm0, "action");
        this.a.c(gqsm0, gqsp.cf, this.c);
    }

    public final void c(gqsm gqsm0) {
        ibuq.f(gqsm0, "action");
        gqsp gqsp0 = this.n;
        if(gqsp0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(gqsp0 == gqsp.cb) {
            this.a.c(gqsm0, gqsp0, this.c);
            return;
        }
        this.a.a(gqsm0, gqsp0);
    }

    public final void e(gqtg gqtg0) {
        ibuq.f(gqtg0, "action");
        gqsp gqsp0 = this.n;
        if(gqsp0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(gqsp0 == gqsp.cb) {
            becz becz0 = this.a;
            ibuq.f(gqtg0, "action");
            ibuq.f(this.c, "sessionId");
            gqwt gqwt0 = becy.a(gqsp0, this.c);
            if(gqwt0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqxt)hftp0.b_message).e = gqwt0;
                ((gqxt)hftp0.b_message).b |= 8;
                gqxs gqxs0 = becy.c(gqtg0, gqsp0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqxt gqxt0 = (gqxt)hftp0.b_message;
                gqxs0.getClass();
                gqxt0.c = gqxs0;
                gqxt0.b |= 1;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                becz0.d(((gqxt)hftv0));
            }
            return;
        }
        this.a.b(gqtg0, gqsp0);
    }

    public final void f() {
        if(!this.r && this.p != null && this.q != null && this.u != 0 && this.e != null) {
            beiv beiv0 = this.k();
            int v = beiv0.a;
            int v1 = beiv0.b;
            becz becz0 = this.a;
            String s = this.c;
            Boolean boolean0 = this.e;
            if(boolean0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean z = boolean0.booleanValue();
            ibuq.f(s, "passwordPickerSessionId");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxr.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqxr gqxr0 = (gqxr)hftp0.b_message;
            s.getClass();
            gqxr0.b |= 1;
            gqxr0.c = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxq.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gqxq)hftv0).b |= 2;
            ((gqxq)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gqxq)hftv1).b |= 4;
            ((gqxq)hftv1).d = v1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqxq gqxq0 = (gqxq)hftp1.b_message;
            gqxq0.b |= 8;
            gqxq0.e = z;
            gqxq gqxq1 = (gqxq)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqxr gqxr1 = (gqxr)hftp0.b_message;
            gqxq1.getClass();
            gqxr1.d = gqxq1;
            gqxr1.b |= 2;
            ProtoLiteMessage hftv2 = hftp0.N_build();
            ibuq.e(hftv2, "build(...)");
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gqwt gqwt0 = (gqwt)hftp3.b_message;
            ((gqxr)hftv2).getClass();
            gqwt0.e = (gqxr)hftv2;
            gqwt0.b |= 0x200;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gqxt gqxt0 = (gqxt)hftp2.b_message;
            gqwt gqwt1 = (gqwt)hftp3.N_build();
            gqwt1.getClass();
            gqxt0.e = gqwt1;
            gqxt0.b |= 8;
            ProtoLiteMessage hftv3 = hftp2.N_build();
            ibuq.e(hftv3, "build(...)");
            becz0.d(((gqxt)hftv3));
            this.b.a.a(bbdg.aj);
            this.r = true;
        }
    }

    public final void g(bedv bedv0) {
        if(bedv.d(bedv0)) {
            Object object0 = bedv0.b;
            if(object0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.p = (gged_interceptors)object0;
            if(this.n == gqsp.ca) {
                gged_interceptors gged0 = this.p;
                if(gged0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                int v = 0;
                int v1 = 0;
                while(ggqk0.hasNext()) {
                    ggqk ggqk1 = ((gqlt)ggqk0.next()).c.E();
                    ibuq.e(ggqk1, "iterator(...)");
                    while(ggqk1.hasNext()) {
                        v1 += ((ggna)((gqmd)ggqk1.next()).c()).c;
                    }
                }
                if(this.s > v1) {
                    this.c(gqsm.ME);
                    if(v1 == 0) {
                        this.c(gqsm.MG);
                    }
                    else {
                        v = v1;
                    }
                }
                else {
                    v = v1;
                }
                this.s = v;
                this.l();
                return;
            }
            this.l();
        }
    }

    public final void h(bedv bedv0) {
        if(bedv.d(bedv0)) {
            this.q = (gged_interceptors)bedv0.b;
            if(this.n == gqsp.ca) {
                gged_interceptors gged0 = this.q;
                if(gged0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int v = gged0.size();
                if(this.t > v) {
                    this.c(gqsm.MI);
                    if(v == 0) {
                        this.c(gqsm.MJ);
                        v = 0;
                    }
                }
                this.t = v;
            }
            this.l();
        }
    }

    public final void i(bedv bedv0) {
        if(bedv.d(bedv0)) {
            int v = 5;
            Object object0 = bedv0.b;
            if(object0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if(!this.m) {
                if(((ChromeSyncState)object0).a) {
                    int v1 = ((ChromeSyncState)object0).b;
                    switch(v1) {
                        case 1: {
                            v = 2;
                            break;
                        }
                        case 2: {
                            v = 1;
                            break;
                        }
                        default: {
                            if(v1 == 3) {
                                v = 2;
                                break;
                            }
                            else {
                                switch(v1) {
                                    case 4: {
                                        v = 2;
                                        break;
                                    }
                                    case 5: {
                                        v = 1;
                                        break;
                                    }
                                    default: {
                                        v = 3;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    v = 3;
                }
            }
            this.u = v;
            this.l();
        }
    }

    public final void j(bedv bedv0) {
        if(!bedv.d(bedv0)) {
            return;
        }
        this.o = (gged_interceptors)bedv0.b;
        this.l();
    }

    private final beiv k() {
        gged_interceptors gged0 = this.p;
        if(gged0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int v = 0;
        for(Object object0: gged0) {
            v += ((ggna)((gqlt)object0).c).c;
        }
        return new beiv(v, gged0.size());
    }

    @Override  // lsb
    protected final void km() {
        bejf bejf0 = new bejf(new bejb(this));
        this.i.f.j(bejf0);
        bejf bejf1 = new bejf(new bejc(this));
        this.i.l.j(bejf1);
        bejf bejf2 = new bejf(new bejd(this));
        this.j.c.j(bejf2);
        bejf bejf3 = new bejf(new beje(this));
        this.k.a.j(bejf3);
    }

    private final void l() {
        if(this.n != gqsp.cb) {
            if(!this.r && this.s != -1 && this.t != -1 && this.u != 0 && this.o != null) {
                int v = this.k().b;
                becz becz0 = this.a;
                String s = this.c;
                int v1 = this.s;
                int v2 = this.t;
                int v3 = this.u;
                if(v3 == 0) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z = bedt.e(this.o);
                boolean z1 = bedt.d(this.o);
                String s1 = this.f;
                String s2 = this.g;
                String s3 = this.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxp.a).v_newBuilder();
                gqsp gqsp0 = gqsp.ca;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gqxp)hftv0).d = gqsp0.fJ;
                ((gqxp)hftv0).b |= 2;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gqxp)hftv1).b |= 4;
                ((gqxp)hftv1).e = v1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gqxp)hftv2).b |= 0x20;
                ((gqxp)hftv2).f = v;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                ((gqxp)hftv3).b |= 0x40;
                ((gqxp)hftv3).g = v2;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp0.b_message;
                ((gqxp)hftv4).h = v3 - 1;
                ((gqxp)hftv4).b |= 0x200;
                if(!hftv4.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp0.b_message;
                ((gqxp)hftv5).b |= 0x400;
                ((gqxp)hftv5).i = z;
                if(!hftv5.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp0.b_message;
                ((gqxp)hftv6).b |= 0x800;
                ((gqxp)hftv6).j = z1;
                if(s != null) {
                    if(!hftv6.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxp gqxp0 = (gqxp)hftp0.b_message;
                    gqxp0.b |= 1;
                    gqxp0.c = s;
                }
                if(s1 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxp gqxp1 = (gqxp)hftp0.b_message;
                    gqxp1.b |= 0x1000;
                    gqxp1.k = s1;
                }
                if(s2 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxp gqxp2 = (gqxp)hftp0.b_message;
                    gqxp2.b |= 0x2000;
                    gqxp2.l = s2;
                }
                if(s3 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqxp gqxp3 = (gqxp)hftp0.b_message;
                    gqxp3.b |= 0x4000;
                    gqxp3.m = s3;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
                gqxp gqxp4 = (gqxp)hftp0.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gqwt gqwt0 = (gqwt)hftp2.b_message;
                gqxp4.getClass();
                gqwt0.d = gqxp4;
                gqwt0.b |= 0x40;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gqxt gqxt0 = (gqxt)hftp1.b_message;
                gqwt gqwt1 = (gqwt)hftp2.N_build();
                gqwt1.getClass();
                gqxt0.e = gqwt1;
                gqxt0.b |= 8;
                ProtoLiteMessage hftv7 = hftp1.N_build();
                ibuq.e(hftv7, "build(...)");
                becz0.d(((gqxt)hftv7));
                this.b.a.a(bbdg.al);
                this.r = true;
                return;
            }
            return;
        }
        this.f();
    }
}

