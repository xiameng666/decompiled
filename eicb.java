import android.content.Context;
import java.util.List;

public final class eicb {
    public final eici a;
    public final bbng b;
    private static eicb c;

    private eicb(Context context0) {
        eici eici0 = eici.a(context0);
        super();
        this.a = eici0;
        this.b = bbnk.a;
    }

    public static eicb a(Context context0) {
        if(eicb.c == null) {
            eicb.c = new eicb(context0);
        }
        return eicb.c;
    }

    public static gwme b(gwgx gwgx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwme.a).v_newBuilder();
        String s = gwgx0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gwme)hftv0).b |= 2;
        ((gwme)hftv0).d = s;
        int v = gwgx0.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwme)hftv1).b |= 4;
        ((gwme)hftv1).e = v;
        long v1 = gwgx0.f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwme)hftv2).b |= 1;
        ((gwme)hftv2).c = v1;
        int v2 = gwgx0.h;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gwme)hftv3).b |= 0x40;
        ((gwme)hftv3).g = v2;
        int v3 = gwgx0.i;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwme gwme0 = (gwme)hftp0.b_message;
        gwme0.b |= 0x80;
        gwme0.h = v3;
        int v4 = eicb.n((gwgu.b(gwgx0.g) == null ? gwgu.a : gwgu.b(gwgx0.g)));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwme)hftp0.b_message).f = v4 - 1;
        ((gwme)hftp0.b_message).b |= 16;
        return (gwme)hftp0.N_build();
    }

    public static gwmk c(ehup ehup0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwmk)hftv0).b |= 1;
        ((gwmk)hftv0).c = ehup0.a;
        long v = ehup0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwmk)hftv1).b |= 0x100;
        ((gwmk)hftv1).k = v;
        long v1 = ehup0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwmk)hftv2).b |= 0x80;
        ((gwmk)hftv2).j = v1;
        long v2 = ehup0.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gwmk)hftv3).b |= 0x40;
        ((gwmk)hftv3).i = v2;
        double f = ehup0.f * 10000000.0;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gwmk)hftv4).b |= 2;
        ((gwmk)hftv4).d = (int)f;
        double f1 = ehup0.g * 10000000.0;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gwmk)hftv5).b |= 4;
        ((gwmk)hftv5).e = (int)f1;
        int v3 = (int)ehup0.h;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwmk gwmk0 = (gwmk)hftp0.b_message;
        gwmk0.b |= 8;
        gwmk0.f = v3;
        Double double0 = ehup0.i;
        if(double0 != null) {
            int v4 = double0.intValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwmk gwmk1 = (gwmk)hftp0.b_message;
            gwmk1.b |= 16;
            gwmk1.g = v4;
        }
        Float float0 = ehup0.j;
        if(float0 != null) {
            int v5 = float0.intValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwmk gwmk2 = (gwmk)hftp0.b_message;
            gwmk2.b |= 0x20;
            gwmk2.h = v5;
        }
        return (gwmk)hftp0.N_build();
    }

    public final void d(long v, gwmw gwmw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwns)hftv0).b |= 0x20;
        ((gwns)hftv0).g = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwns gwns0 = (gwns)hftp0.b_message;
        gwmw0.getClass();
        gwns0.m = gwmw0;
        gwns0.b |= 0x800;
        this.h(((gwns)hftp0.N_build()));
    }

    public final void e(ehup ehup0) {
        if(!eicb.m()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
        gwmk gwmk0 = eicb.c(ehup0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gwmk0.getClass();
        ((gwns)hftv0).f = gwmk0;
        ((gwns)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwns)hftp0.b_message).d = 2;
        ((gwns)hftp0.b_message).b |= 2;
        this.h(((gwns)hftp0.N_build()));
    }

    public final void f(gwoh gwoh0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwoh0.getClass();
        gwik0.I = gwoh0;
        gwik0.b |= 0x80000000;
        this.o(((gwik)hftp0.N_build()), 34);
    }

    public final void g(gwni gwni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwnj)hftp0.b_message).c = gwni0.l;
        ((gwnj)hftp0.b_message).b |= 1;
        gwnj gwnj0 = (gwnj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwnj0.getClass();
        gwik0.S = gwnj0;
        gwik0.c |= 0x200;
        this.o(((gwik)hftp1.N_build()), 44);
    }

    public final void h(gwns gwns0) {
        this.i(gwns0, ggna.a, ggna.a);
    }

    public final void i(gwns gwns0, List list0, List list1) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gwns0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gwns0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwns gwns1 = (gwns)hftp0.b_message;
        gwns1.b |= 0x4000;
        gwns1.p = 20230314;
        if((((gwns)hftp0.b_message).b & 1) == 0) {
            int v = hrtd.ar() ? 4 : 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gwns)hftp0.b_message).c = v - 1;
            ((gwns)hftp0.b_message).b |= 1;
        }
        if(!list0.isEmpty() || !list1.isEmpty()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwno.a).v_newBuilder();
            for(Object object0: list0) {
                gwmk gwmk0 = eicb.c(((ehup)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwno gwno0 = (gwno)hftp1.b_message;
                gwmk0.getClass();
                hfuo hfuo0 = gwno0.b;
                if(!hfuo0.c()) {
                    gwno0.b = ProtoLiteMessage.E(hfuo0);
                }
                gwno0.b.add(gwmk0);
            }
            for(Object object1: list1) {
                gwme gwme0 = eicb.b(((gwgx)object1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwno gwno1 = (gwno)hftp1.b_message;
                gwme0.getClass();
                hfuo hfuo1 = gwno1.c;
                if(!hfuo1.c()) {
                    gwno1.c = ProtoLiteMessage.E(hfuo1);
                }
                gwno1.c.add(gwme0);
            }
            gwno gwno2 = (gwno)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwns gwns2 = (gwns)hftp0.b_message;
            gwno2.getClass();
            gwns2.h = gwno2;
            gwns2.b |= 0x40;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        gwns gwns3 = (gwns)hftp0.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp2.b_message;
        gwns3.getClass();
        gwik0.E = gwns3;
        gwik0.b |= 0x8000000;
        this.o(((gwik)hftp2.N_build()), 30);
    }

    public final void j(long v, gwok gwok0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwns)hftv0).b |= 0x20;
        ((gwns)hftv0).g = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwns)hftv1).d = 2;
        ((gwns)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwns gwns0 = (gwns)hftp0.b_message;
        gwok0.getClass();
        gwns0.k = gwok0;
        gwns0.b |= 0x200;
        this.h(((gwns)hftp0.N_build()));
    }

    public final void k(gwgx gwgx0, ehup ehup0) {
        if(eicb.m()) {
            switch(gwgx0.i) {
                case 101: {
                    goto label_4;
                }
                case 102: {
                    goto label_3;
                }
            }
            return;
        label_3:
            if(hrtd.a.I().bq()) {
            label_4:
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
                gwme gwme0 = eicb.b(gwgx0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwns gwns0 = (gwns)hftp0.b_message;
                gwme0.getClass();
                gwns0.e = gwme0;
                gwns0.b |= 4;
                gwmk gwmk0 = eicb.c(ehup0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                gwmk0.getClass();
                ((gwns)hftv0).f = gwmk0;
                ((gwns)hftv0).b |= 8;
                long v = gwgx0.f;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gwns)hftv1).b |= 0x20;
                ((gwns)hftv1).g = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gwns)hftp0.b_message).d = 2;
                ((gwns)hftp0.b_message).b |= 2;
                this.h(((gwns)hftp0.N_build()));
            }
        }
    }

    public final void l(long v, gwop gwop0) {
        if(!eicb.m()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwns.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwns)hftv0).b |= 0x20;
        ((gwns)hftv0).g = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwns gwns0 = (gwns)hftp0.b_message;
        gwop0.getClass();
        gwns0.o = gwop0;
        gwns0.b |= 0x2000;
        this.h(((gwns)hftp0.N_build()));
    }

    public static final boolean m() {
        return hrtd.X() && hrtd.Z();
    }

    public static int n(gwgu gwgu0) {
        switch(gwgu0.ordinal()) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 1;
            }
        }
    }

    public final void o(gwik gwik0, int v) {
        if(!hrtd.X()) {
            return;
        }
        this.a.c(gwik0, v - 1);
    }

    public final void p(int v, long v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwnz)hftv0).b |= 2;
        ((gwnz)hftv0).d = 20230314;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwnz)hftv1).c = v2 - 1;
        ((gwnz)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwnz)hftp0.b_message).e = v - 1;
        ((gwnz)hftp0.b_message).b |= 4;
        long v3 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwnz)hftv2).b |= 16;
        ((gwnz)hftv2).g = v3;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwnz gwnz0 = (gwnz)hftp0.b_message;
        gwnz0.b |= 8;
        gwnz0.f = v1;
        gwnz gwnz1 = (gwnz)hftp0.N_build();
        if(hrtd.a.I().bw()) {
            chll chll0 = chll.v();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwik gwik0 = (gwik)hftp1.b_message;
            gwnz1.getClass();
            gwik0.F = gwnz1;
            gwik0.b |= 0x10000000;
            cczb cczb0 = chll0.c(((ProtoLiteMessage)(((gwik)hftp1.N_build()))));
            cczb0.c = (int)30;
            cczb0.a();
            return;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwik gwik1 = (gwik)hftp2.b_message;
        gwnz1.getClass();
        gwik1.F = gwnz1;
        gwik1.b |= 0x10000000;
        this.o(((gwik)hftp2.N_build()), 0x1F);
    }

    public final void q(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwnu)hftp0.b_message).c = v - 1;
        ((gwnu)hftp0.b_message).b |= 1;
        gwnu gwnu0 = (gwnu)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwnu0.getClass();
        gwik0.N = gwnu0;
        gwik0.c |= 16;
        this.o(((gwik)hftp1.N_build()), 39);
    }

    public final void r(int v) {
        this.s(v, null);
    }

    public final void s(int v, Integer integer0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwon.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwon)hftp0.b_message).c = v - 1;
        ((gwon)hftp0.b_message).b |= 1;
        if(integer0 != null) {
            int v1 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwon gwon0 = (gwon)hftp0.b_message;
            gwon0.b |= 4;
            gwon0.e = v1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        gwon gwon1 = (gwon)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp1.b_message;
        gwon1.getClass();
        gwik0.H = gwon1;
        gwik0.b |= 0x40000000;
        this.o(((gwik)hftp1.N_build()), 33);
    }
}

