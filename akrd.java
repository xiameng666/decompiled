import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import j..time.Duration;

public final class akrd {
    public final ayvm a;
    private static akrd b;
    private final ayud c;
    private final faik d;
    private final cdyh e;
    private final Context f;

    private akrd(Context context0) {
        ayud ayud0 = new aytt(context0, "AUTH_MANAGED").a();
        faik faik0 = faih.a(context0);
        super();
        this.f = context0;
        this.c = ayud0;
        this.d = faik0;
        this.e = cdyh.v();
        this.a = fhbe.b(context0, new icwv());
    }

    public static akrd a(Context context0) {
        synchronized(akrd.class) {
            if(akrd.b == null) {
                akrd.b = new akrd(context0.getApplicationContext());
            }
        }
        return akrd.b;
    }

    public static icxn b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxn icxn0 = (icxn)hftp0.b_message;
        icxn0.b |= 1;
        icxn0.c = 0L;
        return (icxn)hftp0.N_build();
    }

    public final void c(aksb aksb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        icxn icxn0 = akrd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        icxn0.getClass();
        ((icxv)hftv0).c = icxn0;
        ((icxv)hftv0).b |= 1;
        aksa aksa0 = aksb0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = aksa0.b;
        ((icxv)hftp0.b_message).d = v - 1;
        ((icxv)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icxm.a).v_newBuilder();
        int v1 = aksb0.e;
        if(v1 != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((icxm)hftp1.b_message).c = v1 - 1;
            ((icxm)hftp1.b_message).b |= 1;
        }
        Duration duration0 = aksb0.c;
        if(duration0 != null) {
            hfst hfst0 = hfyg.a(duration0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            icxm icxm0 = (icxm)hftp1.b_message;
            hfst0.getClass();
            icxm0.e = hfst0;
            icxm0.b |= 4;
        }
        Boolean boolean0 = aksb0.b;
        if(boolean0 != null) {
            int v2 = boolean0.booleanValue() ? 3 : 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((icxm)hftp1.b_message).d = v2 - 1;
            ((icxm)hftp1.b_message).b |= 2;
        }
        icxm icxm1 = (icxm)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxv icxv0 = (icxv)hftp0.b_message;
        icxm1.getClass();
        icxv0.m = icxm1;
        icxv0.b |= 0x800;
        aksn aksn0 = aksb0.d;
        if(aksn0 != null) {
            icxt icxt0 = aksn0.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            icxv icxv1 = (icxv)hftp0.b_message;
            icxt0.getClass();
            icxv1.n = icxt0;
            icxv1.b |= 0x1000;
        }
        this.k(((icxv)hftp0.N_build()), this.a, v);
    }

    public static void d(ayuc ayuc0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
        bbed bbed0 = bbed.gn;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv0 = (bbdv)hftp0.b_message;
        bbdv0.b = bbed0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bbdv)hftv0).c = 1;
        bbdz bbdz0 = bbdz.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        bbdv bbdv1 = (bbdv)hftp0.b_message;
        bbdv1.d = bbdz0.a();
        ayuc0.l = (bbdv)hftp0.N_build();
        ayuc0.d();
    }

    public final void e(akse akse0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        icxn icxn0 = akrd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        icxn0.getClass();
        ((icxv)hftv0).c = icxn0;
        ((icxv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((icxv)hftp0.b_message).d = 44;
        ((icxv)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icxp.a).v_newBuilder();
        int v = akse0.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((icxp)hftp1.b_message).c = v - 1;
        ((icxp)hftp1.b_message).b |= 1;
        Duration duration0 = akse0.b;
        if(duration0 != null) {
            hfst hfst0 = hfyg.a(duration0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            icxp icxp0 = (icxp)hftp1.b_message;
            hfst0.getClass();
            icxp0.d = hfst0;
            icxp0.b |= 2;
        }
        try {
            int v1 = bbms.b(this.f, "com.google.android.apps.work.clouddpc");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            icxp icxp1 = (icxp)hftp1.b_message;
            icxp1.b |= 4;
            icxp1.e = v1;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        boolean z = akse0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        icxp icxp2 = (icxp)hftp1.b_message;
        icxp2.b |= 8;
        icxp2.f = z;
        icxp icxp3 = (icxp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxv icxv0 = (icxv)hftp0.b_message;
        icxp3.getClass();
        icxv0.p = icxp3;
        icxv0.b |= 0x4000;
        this.k(((icxv)hftp0.N_build()), this.a, 45);
    }

    public final void f(aksh aksh0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        icxn icxn0 = akrd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        icxn0.getClass();
        ((icxv)hftv0).c = icxn0;
        ((icxv)hftv0).b |= 1;
        aksk aksk0 = aksh0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = aksk0.b;
        ((icxv)hftp0.b_message).d = v - 1;
        ((icxv)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icxs.a).v_newBuilder();
        icxq icxq0 = aksh0.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        icxq0.getClass();
        ((icxs)hftv1).c = icxq0;
        ((icxs)hftv1).b |= 2;
        icxr icxr0 = aksh0.c;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        icxs icxs0 = (icxs)hftp1.b_message;
        icxr0.getClass();
        icxs0.d = icxr0;
        icxs0.b |= 4;
        Duration duration0 = aksh0.d;
        if(duration0 != null) {
            hfst hfst0 = hfyg.a(duration0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            icxs icxs1 = (icxs)hftp1.b_message;
            hfst0.getClass();
            icxs1.e = hfst0;
            icxs1.b |= 8;
        }
        Duration duration1 = aksh0.e;
        if(duration1 != null) {
            hfst hfst1 = hfyg.a(duration1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            icxs icxs2 = (icxs)hftp1.b_message;
            hfst1.getClass();
            icxs2.f = hfst1;
            icxs2.b |= 16;
        }
        icxs icxs3 = (icxs)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxv icxv0 = (icxv)hftp0.b_message;
        icxs3.getClass();
        icxv0.o = icxs3;
        icxv0.b |= 0x2000;
        this.k(((icxv)hftp0.N_build()), this.a, v);
    }

    public static int g(int v) {
        switch(v) {
            case -1: {
                return 2;
            }
            case 0: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 6;
            }
            case 5: {
                return 7;
            }
            case 6: {
                return 8;
            }
            case 7: {
                return 9;
            }
            case 8: {
                return 10;
            }
            case 9: {
                return 11;
            }
            case 10: {
                return 12;
            }
            default: {
                return 1;
            }
        }
    }

    public final void h(aksd aksd0, int v) {
        icxv icxv0;
        if(aksd0 == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
            icxn icxn0 = akrd.b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            icxn0.getClass();
            ((icxv)hftv0).c = icxn0;
            ((icxv)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((icxv)hftp1.b_message).d = v - 1;
            ((icxv)hftp1.b_message).b |= 2;
            icxv0 = (icxv)hftp1.N_build();
        }
        else {
            ProtoLiteBuilder hftp0 = akrd.m(aksd0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((icxv)hftp0.b_message).d = v - 1;
            ((icxv)hftp0.b_message).b |= 2;
            icxv0 = (icxv)hftp0.N_build();
        }
        this.k(icxv0, this.a, v);
    }

    public final void i(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        icxn icxn0 = akrd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        icxn0.getClass();
        ((icxv)hftv0).c = icxn0;
        ((icxv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((icxv)hftp0.b_message).d = v - 1;
        ((icxv)hftp0.b_message).b |= 2;
        this.k(((icxv)hftp0.N_build()), this.a, v);
    }

    public final void j(int v, hlxd hlxd0) {
        if(hlxd0 != null && (hlxd0.b & 1) != 0) {
            String s = hlxd0.c;
            int v1 = hlxd0.h;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
            icxn icxn0 = akrd.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            icxn0.getClass();
            ((icxv)hftv0).c = icxn0;
            ((icxv)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((icxv)hftv1).d = v - 1;
            ((icxv)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s.getClass();
            ((icxv)hftv2).b |= 16;
            ((icxv)hftv2).g = s;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            icxv icxv0 = (icxv)hftp0.b_message;
            icxv0.b |= 0x20;
            icxv0.h = v1;
            this.k(((icxv)hftp0.N_build()), this.a, v);
            return;
        }
        this.i(v);
    }

    public final void k(icxv icxv0, ayvm ayvm0, int v) {
        if(hpxn.d()) {
            cczb cczb0 = this.e.c(((ProtoLiteMessage)icxv0));
            cczb0.c = (int)(v - 1);
            if(hpwj.c()) {
                this.d.cp().b(new akrb(cczb0, v));
                return;
            }
            cczb0.a();
            return;
        }
        ayuc ayuc0 = this.c.j(((MessageLite)icxv0), ayvm0);
        ayuc0.k(v - 1);
        if(hpwj.c()) {
            this.d.cp().b(new akrc(ayuc0, v));
            return;
        }
        akrd.d(ayuc0);
    }

    public final void l(int v, icxo icxo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        icxn icxn0 = akrd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        icxn0.getClass();
        ((icxv)hftv0).c = icxn0;
        ((icxv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((icxv)hftv1).d = v - 1;
        ((icxv)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxv icxv0 = (icxv)hftp0.b_message;
        icxo0.getClass();
        icxv0.e = icxo0;
        icxv0.b |= 4;
        this.k(((icxv)hftp0.N_build()), this.a, v);
    }

    public static ProtoLiteBuilder m(aksd aksd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
        int v = aksd0.a;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((icxv)hftv0).i = v1 - 1;
        ((icxv)hftv0).b |= 0x40;
        boolean z = aksd0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((icxv)hftv1).b |= 0x80;
        ((icxv)hftv1).j = z;
        icxk icxk0 = aksd0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((icxv)hftv2).k = icxk0.g;
        ((icxv)hftv2).b |= 0x200;
        boolean z1 = aksd0.g;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        icxv icxv0 = (icxv)hftp0.b_message;
        icxv0.b |= 0x8000;
        icxv0.q = z1;
        aksn aksn0 = aksd0.d;
        if(aksn0 != null) {
            icxt icxt0 = aksn0.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            icxv icxv1 = (icxv)hftp0.b_message;
            icxt0.getClass();
            icxv1.n = icxt0;
            icxv1.b |= 0x1000;
        }
        String s = aksd0.e;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((icxv)hftv3).b |= 16;
            ((icxv)hftv3).g = s;
            int v2 = aksd0.f;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            icxv icxv2 = (icxv)hftp0.b_message;
            icxv2.b |= 0x20;
            icxv2.h = v2;
        }
        return hftp0;
    }
}

