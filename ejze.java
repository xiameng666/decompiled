import java.util.Random;

public final class ejze {
    final Random a;
    private static ejze b;

    static {
        bboh.b("ROM_AnalyticsLog", bbcu.bN);
    }

    public ejze() {
        this.a = new Random();
    }

    private final void A(giug giug0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        giug0.getClass();
        ((giui)hftv0).e = giug0;
        ((giui)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giui)hftp0.b_message).t = z;
        this.t(hftp0);
    }

    private final void B(int v, boolean z, String s, boolean z1, boolean z2) {
        int v2;
        int[] arr_v = gith.c();
        int v1 = 0;
        while(v1 < 10) {
            v2 = arr_v[v1];
            String s1 = gith.a(v2);
            if(v2 == 0) {
                throw null;
            }
            if(s1.equals(s)) {
                goto label_11;
            }
            ++v1;
            continue;
        }
        v2 = 2;
    label_11:
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giug.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giug)hftv0).b = false;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug.b(((giug)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giug)hftv1).c = v - 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giug)hftv2).d = z;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug.c(((giug)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug giug0 = (giug)hftp0.b_message;
        giug0.h = gith.b(v2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giug)hftp0.b_message).i = z1;
        this.A(((giug)hftp0.N_build()), z2);
    }

    public static ejze a() {
        synchronized(ejze.class) {
            if(ejze.b == null) {
                ejze.b = new ejze();
            }
        }
        return ejze.b;
    }

    public final void b(int v, int v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giug.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giug)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giug)hftv1).f = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giug)hftp0.b_message).g = v2;
        giug giug0 = (giug)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        giug0.getClass();
        giui0.e = giug0;
        giui0.b |= 2;
        this.t(hftp1);
    }

    public final void c(String s, boolean z, boolean z1) {
        this.B(2, true, s, z, z1);
    }

    public final void d(String s) {
        this.n(s, 2, 2, "");
    }

    public final void e(boolean z) {
        this.x(false, 2, z);
    }

    public final void f(int v, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gitq)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitq)hftp0.b_message).c = z;
        gitq gitq0 = (gitq)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gitq0.getClass();
        giui0.u = gitq0;
        giui0.b |= 0x10000;
        this.t(hftp1);
    }

    public final void g(int v, int v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gitr)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gitr)hftv1).e = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitr)hftp0.b_message).f = v2;
        gitr gitr0 = (gitr)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gitr0.getClass();
        giui0.r = gitr0;
        giui0.b |= 0x4000;
        this.t(hftp1);
    }

    public final void h(gitu gitu0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        gitu0.getClass();
        giui0.p = gitu0;
        giui0.b |= 0x1000;
        this.t(hftp0);
    }

    public final void i(gitx gitx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        gitx0.getClass();
        giui0.q = gitx0;
        giui0.b |= 0x2000;
        this.t(hftp0);
    }

    public final void j(int v, int v1) {
        this.k(false, v, v1);
    }

    public final void k(boolean z, int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gito.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gito)hftv0).b = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gito)hftv1).c = false;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gito)hftv2).d = v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gito)hftp0.b_message).e = v1;
        gito gito0 = (gito)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gito0.getClass();
        giui0.h = gito0;
        giui0.b |= 16;
        this.t(hftp1);
    }

    public final void l(int v) {
        if((this.a.nextDouble() >= 0.0001)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gitf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gitf)hftp1.b_message).c = v - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        gitf gitf0 = (gitf)hftp1.N_build();
        gitf0.getClass();
        giui0.m = gitf0;
        giui0.b |= 0x200;
        this.t(hftp0);
    }

    public final void m(int v, ekau ekau0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gitf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gitf)hftv0).b = v - 2;
        int v1 = ekau0.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gitf)hftp1.b_message).d = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        gitf gitf0 = (gitf)hftp1.N_build();
        gitf0.getClass();
        giui0.m = gitf0;
        giui0.b |= 0x200;
        this.t(hftp0);
    }

    public final void n(String s, int v, int v1, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giuh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giuh)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giuh)hftv1).c = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giuh)hftv2).e = v1 - 2;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giuh)hftp0.b_message).d = v - 2;
        giuh giuh0 = (giuh)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        giuh0.getClass();
        giui0.g = giuh0;
        giui0.b |= 8;
        this.t(hftp1);
    }

    public final void o(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitr)hftp0.b_message).c = v - 2;
        gitr gitr0 = (gitr)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gitr0.getClass();
        giui0.r = gitr0;
        giui0.b |= 0x4000;
        this.t(hftp1);
    }

    public final void p(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitr)hftp0.b_message).b = v - 2;
        gitr gitr0 = (gitr)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gitr0.getClass();
        giui0.r = gitr0;
        giui0.b |= 0x4000;
        this.t(hftp1);
    }

    public final void q(int v, boolean z, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giud.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giud)hftv0).b = v - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giud)hftv1).c = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giud)hftp0.b_message).d = v1 - 2;
        giud giud0 = (giud)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        giud0.getClass();
        giui0.k = giud0;
        giui0.b |= 0x80;
        this.t(hftp1);
    }

    public final void r(int v, String s, boolean z, boolean z1) {
        this.B(v, false, s, z, z1);
    }

    public final void s(boolean z, int v, String s, boolean z1) {
        int v2;
        int[] arr_v = gith.c();
        int v1 = 0;
        while(v1 < 10) {
            v2 = arr_v[v1];
            String s1 = gith.a(v2);
            if(v2 == 0) {
                throw null;
            }
            if(s1.equals(s)) {
                goto label_11;
            }
            ++v1;
            continue;
        }
        v2 = 2;
    label_11:
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giug.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giug)hftv0).b = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug.b(((giug)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giug)hftv1).c = v - 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giug)hftv2).d = false;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug.c(((giug)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giug giug0 = (giug)hftp0.b_message;
        giug0.h = gith.b(v2);
        this.A(((giug)hftp0.N_build()), z1);
    }

    public final void t(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gits.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gits)hftp1.b_message).b = "25.34.34 (190400-{{cl}})";
        long v = bbrc.h();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gits)hftp1.b_message).c = v;
        gits gits0 = (gits)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giui)hftp0.b_message).c = 18;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        gits0.getClass();
        giui0.d = gits0;
        giui0.b |= 1;
        chuu.v().c(((ProtoLiteMessage)(((giui)hftp0.N_build())))).a();
        hftp0.N_build();
    }

    public final void u(ProtoLiteBuilder hftp0, int v) {
        giub giub0 = ((giui)hftp0.b_message).s;
        if(giub0 == null) {
            giub0 = giub.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)giub0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)giub0));
        ((gity)hftp1).a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        giub giub1 = (giub)((ProtoLiteBuilder)(((gity)hftp1))).N_build();
        giub1.getClass();
        giui0.s = giub1;
        giui0.b |= 0x8000;
    }

    public static void v(ProtoLiteBuilder hftp0, int v, Integer integer0, hfwn hfwn0) {
        giub giub0 = ((giui)hftp0.b_message).s;
        if(giub0 == null) {
            giub0 = giub.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)giub0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)giub0));
        ((gity)hftp1).a(3);
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        ((giub)((gity)hftp1).b_message).d = v - 2;
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        giub giub1 = (giub)((gity)hftp1).b_message;
        hfwn0.getClass();
        giub1.e = hfwn0;
        giub1.b |= 1;
        if(v == 4) {
            int v1 = (int)integer0;
            if(!((gity)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
            }
            giub giub2 = (giub)((gity)hftp1).b_message;
            giub2.b |= 0x80;
            giub2.l = v1;
            if(!((gity)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
            }
            ((giub)((gity)hftp1).b_message).d = 1;
        }
        else {
            int v2 = (int)integer0;
            if(!((gity)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
            }
            giub giub3 = (giub)((gity)hftp1).b_message;
            giub3.b |= 2;
            giub3.f = v2;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        giub giub4 = (giub)((ProtoLiteBuilder)(((gity)hftp1))).N_build();
        giub4.getClass();
        giui0.s = giub4;
        giui0.b |= 0x8000;
    }

    public static void w(ProtoLiteBuilder hftp0, int v, Integer integer0, hfwn hfwn0, int v1, String s) {
        giub giub0 = ((giui)hftp0.b_message).s;
        if(giub0 == null) {
            giub0 = giub.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)giub0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)giub0));
        ((gity)hftp1).a(4);
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        ((giub)((gity)hftp1).b_message).d = v - 2;
        int v2 = (int)integer0;
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        giub giub1 = (giub)((gity)hftp1).b_message;
        giub1.b |= 2;
        giub1.f = v2;
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        giub giub2 = (giub)((gity)hftp1).b_message;
        hfwn0.getClass();
        giub2.e = hfwn0;
        giub2.b |= 1;
        if(!((gity)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
        }
        ((giub)((gity)hftp1).b_message).g = v1 - 2;
        ((giub)((gity)hftp1).b_message).b |= 4;
        if(s != null) {
            if(!((gity)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gity)hftp1))).ensureMutable();
            }
            giub giub3 = (giub)((gity)hftp1).b_message;
            giub3.b |= 8;
            giub3.i = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giui giui0 = (giui)hftp0.b_message;
        giub giub4 = (giub)((ProtoLiteBuilder)(((gity)hftp1))).N_build();
        giub4.getClass();
        giui0.s = giub4;
        giui0.b |= 0x8000;
    }

    public final void x(boolean z, int v, boolean z1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gitp)hftv0).b = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gitp)hftv1).c = 0;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gitp)hftv2).d = v - 2;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gitp)hftv3).e = 0;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitp)hftp0.b_message).f = z1;
        gitp gitp0 = (gitp)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        gitp0.getClass();
        giui0.n = gitp0;
        giui0.b |= 0x400;
        this.t(hftp1);
    }

    public final void y() {
        this.s(false, 20, "UNKNOWN_ENTRY_POINT", false);
    }

    public final void z(String s, long v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giuj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giuj)hftv0).b = 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giuj)hftv1).c = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giuj)hftv2).e = v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giuj)hftp0.b_message).d = v1 - 2;
        giuj giuj0 = (giuj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giui.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giui giui0 = (giui)hftp1.b_message;
        giuj0.getClass();
        giui0.f = giuj0;
        giui0.b |= 4;
        this.t(hftp1);
    }
}

