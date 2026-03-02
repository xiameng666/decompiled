import android.accounts.Account;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.DisplayMetrics;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class gbhf implements gbhh {
    private final boolean a;
    private final boolean b;
    private final gepa c;
    private final gesv d;
    private final hhdb e;
    private final boolean f;
    private final ProtoLiteBuilder g;
    private final ProtoLiteBuilder h;

    public gbhf() {
        this(false, false);
    }

    public gbhf(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
        gepa gepa0 = (gepa)((ProtoLiteMessage)gepm.b).v_newBuilder();
        ibuq.e(gepa0, "newBuilder(...)");
        this.c = gepa0;
        gesv gesv0 = (gesv)((ProtoLiteMessage)gesx.a).v_newBuilder();
        ibuq.e(gesv0, "newBuilder(...)");
        this.d = gesv0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhdg.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        this.g = hftp0;
        hhdb hhdb0 = (hhdb)((ProtoLiteMessage)hhdf.a).v_newBuilder();
        ibuq.e(hhdb0, "newBuilder(...)");
        this.e = hhdb0;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhda.a).v_newBuilder();
        ibuq.e(hftp1, "newBuilder(...)");
        this.h = hftp1;
        gaxl.a();
        this.f = gaxm.s();
    }

    @Override  // gbiw
    public final void A(String s) {
        ibuq.f(s, "modelName");
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x800;
        gepm0.q = s;
    }

    @Override  // gbic
    public final void B(long v) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x10000000;
        ((gepm)gepa0.b_message).G = v;
    }

    @Override  // gbhs
    public final void C(long v) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x80000000;
        ((gepm)gepa0.b_message).L = v;
    }

    @Override  // gbhs
    public final void D(boolean z) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).d |= 2;
        ((gepm)gepa0.b_message).N = z;
    }

    @Override  // gbhs
    public final void E(long v) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).d |= 1;
        ((gepm)gepa0.b_message).M = v;
    }

    @Override  // gbis
    public final void F(boolean z) {
        hhdb hhdb0 = this.e;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf0 = (hhdf)hhdb0.b_message;
        hhdf0.b |= 0x40;
        hhdf0.i = z;
    }

    @Override  // gbic
    public final void G(String s) {
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gesx0.b |= 0x20;
        gesx0.j = s;
    }

    @Override  // gbic
    public final void H(long v) {
        gavr.e("BE_O1RCB_01", null, null, "O1RequestContextBuilder cannot set o2ClientSessionId", null, 20);
        throw new ibnm();
    }

    @Override  // gbiw
    public final void I(int v) {
        gepa gepa0 = this.c;
        String s = String.valueOf(v);
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x200;
        gepm0.o = s;
    }

    @Override  // gbia
    public final void J(String s) {
        ibuq.f(s, "packageName");
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x400000;
        gepm0.A = s;
    }

    @Override  // gbia
    public final void K(long v) {
        gepa gepa0 = this.c;
        String s = String.valueOf(v);
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x800000;
        gepm0.B = s;
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gesx0.b |= 8;
        gesx0.h = v;
    }

    @Override  // gbia
    public final void L(String s) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x1000000;
        ((gepm)gepa0.b_message).C = s;
    }

    @Override  // gbio
    public final void M(boolean z) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).e = (z ? 2 : 3) - 1;
        ((gepm)gepa0.b_message).c |= 1;
    }

    @Override  // gbis
    public final void N(hhdd hhdd0) {
        if(hhdd0 != null) {
            hhdb hhdb0 = this.e;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            ((hhdf)hhdb0.b_message).g = hhdd0;
            ((hhdf)hhdb0.b_message).b |= 16;
        }
    }

    @Override  // gbif
    public final void O(hcjd hcjd0) {
        ibuq.f(hcjd0, "secureElementState");
        gepg gepg0 = gepg.b(hcjd0.d);
        ibuq.c(gepg0);
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).S = gepg0.d;
        ((gepm)gepa0.b_message).d |= 16;
    }

    @Override  // gbhs
    public final void P(String s) {
        ibuq.f(s, "serialNumber");
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhda hhda0 = (hhda)hftp0.b_message;
        s.getClass();
        hhda0.b |= 0x200000;
        hhda0.p = s;
    }

    @Override  // gbic
    public final void Q(ByteString hfsf0) {
        ibuq.f(hfsf0, "sessionData");
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        hfsf0.getClass();
        gesx0.b |= 1;
        gesx0.e = hfsf0;
    }

    @Override  // gbio
    public final void R(int v) {
        if(this.f) {
            gepa gepa0 = this.c;
            if(!gepa0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa0).ensureMutable();
            }
            ((gepm)gepa0.b_message).c |= 0x40000000;
            ((gepm)gepa0.b_message).K = v;
        }
    }

    @Override  // gbhs
    public final void S(List list0) {
        ibuq.f(list0, "supportedAuthTypes");
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).P = hfty.a;
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            geoz geoz0 = geoz.b(((hcix)object0).f);
            ibuq.c(geoz0);
            if(!gepa0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa0).ensureMutable();
            }
            gepm gepm0 = (gepm)gepa0.b_message;
            geoz0.getClass();
            gepm0.l();
            gepm0.P.i(geoz0.e);
        }
    }

    @Override  // gbis
    public final void T(Set set0) {
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gesx0.c();
        for(Object object0: set0) {
            gesx0.p.i(((hcin)object0).a());
        }
    }

    @Override  // gbhv
    public final void U(boolean z) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).d |= 0x20;
        ((gepm)gepa0.b_message).U = z;
    }

    @Override  // gbio
    public final void V(boolean z) {
        if(this.f) {
            gepa gepa0 = this.c;
            if(!gepa0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa0).ensureMutable();
            }
            ((gepm)gepa0.b_message).c |= 0x100;
            ((gepm)gepa0.b_message).n = z;
        }
    }

    @Override  // gbiw
    public final void W(int v) {
        gepl gepl0 = gepl.b(v - 1);
        ibuq.c(gepl0);
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).R = gepl0.d;
        ((gepm)gepa0.b_message).d |= 8;
    }

    @Override  // gbhs
    public final void X(int v) {
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hcjs)object0), "curAuthContext");
        if((((hcjs)object0).b & 1) == 0) {
            hfuo hfuo0 = ((hcjs)object0).c;
            ibuq.e(hfuo0, "getSignatureBasedAuthenticationKeyIdList(...)");
            if(!hfuo0.isEmpty() || (((hcjs)object0).b & 2) != 0) {
                goto label_5;
            }
        }
        else {
        label_5:
            gesv gesv0 = this.d;
            byte[] arr_b = ((hcjs)object0).toBytesArray();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gesu.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx0 = (gesx)gesv0.b_message;
            ((gesu)hftv0).getClass();
            gesx0.n = (gesu)hftv0;
            gesx0.b |= 0x800;
        }
        return ibom.a;
    }

    @Override  // gbhh
    public final MessageLite b() {
        if(this.b) {
            ProtoLiteBuilder hftp0 = this.h;
            gaxl.a();
            long v = gaxm.n();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda0 = (hhda)hftp0.b_message;
            hhda0.b |= 0x40;
            hhda0.h = v;
            String s = Build.BRAND;
            ibuq.e(s, "BRAND");
            if(s.length() > 0) {
                String s1 = Build.BRAND;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda1 = (hhda)hftp0.b_message;
                s1.getClass();
                hhda1.b |= 0x100000;
                hhda1.o = s1;
            }
            String s2 = Build.DEVICE;
            ibuq.e(s2, "DEVICE");
            if(s2.length() > 0) {
                String s3 = Build.DEVICE;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda2 = (hhda)hftp0.b_message;
                s3.getClass();
                hhda2.b |= 0x100;
                hhda2.i = s3;
            }
            String s4 = Build.FINGERPRINT;
            ibuq.e(s4, "FINGERPRINT");
            if(s4.length() > 0) {
                String s5 = Build.FINGERPRINT;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda3 = (hhda)hftp0.b_message;
                s5.getClass();
                hhda3.b |= 0x1000;
                hhda3.m = s5;
            }
            String s6 = Build.MANUFACTURER;
            ibuq.e(s6, "MANUFACTURER");
            if(s6.length() > 0) {
                String s7 = Build.MANUFACTURER;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda4 = (hhda)hftp0.b_message;
                s7.getClass();
                hhda4.b |= 0x800;
                hhda4.l = s7;
            }
            String s8 = Build.MODEL;
            ibuq.e(s8, "MODEL");
            if(s8.length() > 0) {
                String s9 = Build.MODEL;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda5 = (hhda)hftp0.b_message;
                s9.getClass();
                hhda5.b |= 0x400;
                hhda5.k = s9;
            }
            String s10 = Build.PRODUCT;
            ibuq.e(s10, "PRODUCT");
            if(s10.length() > 0) {
                String s11 = Build.PRODUCT;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda6 = (hhda)hftp0.b_message;
                s11.getClass();
                hhda6.b |= 0x200;
                hhda6.j = s11;
            }
            String s12 = Build.VERSION.RELEASE;
            ibuq.e(s12, "RELEASE");
            if(s12.length() > 0) {
                String s13 = Build.VERSION.RELEASE;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda7 = (hhda)hftp0.b_message;
                s13.getClass();
                hhda7.b |= 0x4000;
                hhda7.n = s13;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hhda)hftp0.b_message).c = 0;
            ((hhda)hftp0.b_message).b |= 1;
            gepa gepa0 = this.c;
            ProtoLiteBuilder hftp1 = this.g;
            hhdb hhdb0 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hhdg hhdg0 = (hhdg)hftp1.b_message;
            hhdf hhdf0 = (hhdf)((ProtoLiteBuilder)hhdb0).N_build();
            hhdf0.getClass();
            hhdg0.d = hhdf0;
            hhdg0.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hhdg hhdg1 = (hhdg)hftp1.b_message;
            hhda hhda8 = (hhda)hftp0.N_build();
            hhda8.getClass();
            hhdg1.c = hhda8;
            hhdg1.b |= 1;
            if(!gepa0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa0).ensureMutable();
            }
            gepm gepm0 = (gepm)gepa0.b_message;
            hhdg hhdg2 = (hhdg)hftp1.N_build();
            hhdg2.getClass();
            gepm0.O = hhdg2;
            gepm0.d |= 4;
        }
        gepa gepa1 = this.c;
        if(ibuq.m(((gepm)gepa1.b_message).D, "com.android.vending")) {
            if(!gepa1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa1).ensureMutable();
            }
            ((gepm)gepa1.b_message).z = 1;
        }
        else {
            if(!gepa1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gepa1).ensureMutable();
            }
            ((gepm)gepa1.b_message).z = 2;
        }
        ((gepm)gepa1.b_message).c |= 0x200000;
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gepm gepm1 = (gepm)((ProtoLiteBuilder)gepa1).N_build();
        gepm1.getClass();
        gesx0.d = gepm1;
        gesx0.c = 10;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        ((gesx)gesv0.b_message).g = 2;
        ((gesx)gesv0.b_message).b |= 4;
        String s14 = String.valueOf(UUID.randomUUID().getLeastSignificantBits());
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx1 = (gesx)gesv0.b_message;
        s14.getClass();
        gesx1.b |= 16;
        gesx1.i = s14;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gesv0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (gesx)hftv0;
    }

    @Override  // gbhv
    public final void c(List list0) {
        ibuq.f(list0, "inputTypeList");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(gepc.b(((hcja)object0).d));
        }
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        gepm0.m();
        for(Object object1: arrayList0) {
            gepm0.T.i(((gepc)object1).d);
        }
    }

    @Override  // gbio
    public final void d(gcvp gcvp0) {
        ibuq.f(gcvp0, "simCardValue");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geph.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        String s = gcvp0.b();
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geph geph0 = (geph)hftp0.b_message;
            geph0.b |= 1;
            geph0.c = s;
        }
        if(gcvp0.a() != -1L) {
            long v = gcvp0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geph geph1 = (geph)hftp0.b_message;
            geph1.b |= 4;
            geph1.e = v;
        }
        String s1 = gcvp0.c();
        if(s1 != null && s1.length() > 0) {
            String s2 = gcvp0.c();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geph geph2 = (geph)hftp0.b_message;
            s2.getClass();
            geph2.b |= 2;
            geph2.d = s2;
        }
        if(gcvp0.d != null && gcvp0.d.length() > 0) {
            String s3 = gcvp0.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geph geph3 = (geph)hftp0.b_message;
            s3.getClass();
            geph3.b |= 8;
            geph3.f = s3;
        }
        String s4 = gcvp0.g;
        ibuq.e(s4, "getGid1(...)");
        if(s4.length() > 0) {
            String s5 = gcvp0.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geph geph4 = (geph)hftp0.b_message;
            s5.getClass();
            geph4.b |= 16;
            geph4.g = s5;
        }
        int v1 = gcvp0.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((geph)hftv0).b |= 0x100;
        ((geph)hftv0).j = v1;
        int v2 = gcvp0.k;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((geph)hftv1).b |= 0x80;
        ((geph)hftv1).i = v2;
        boolean z = this.f;
        if(z) {
            String s6 = gcvp0.j;
            if(s6 != null) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geph geph5 = (geph)hftp0.b_message;
                geph5.b |= 0x20;
                geph5.h = s6;
            }
        }
        boolean z1 = this.b;
        if(z1) {
            String s7 = gcvp0.i;
            ibuq.e(s7, "getPhoneNumber(...)");
            if(s7.length() > 0) {
                String s8 = gcvp0.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geph geph6 = (geph)hftp0.b_message;
                s8.getClass();
                geph6.b |= 0x200;
                geph6.k = s8;
            }
            hhdb hhdb0 = this.e;
            int v3 = gcvp0.a;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf0 = (hhdf)hhdb0.b_message;
            hhdf0.b |= 0x20000;
            hhdf0.q = v3;
        }
        if(gcvp0.m) {
            String s9 = gcvp0.b();
            if(s9 != null) {
                gepa gepa0 = this.c;
                if(!gepa0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gepa0).ensureMutable();
                }
                ((gepm)gepa0.b_message).c |= 4;
                ((gepm)gepa0.b_message).h = s9;
            }
            if(gcvp0.a() != -1L) {
                gepa gepa1 = this.c;
                long v4 = gcvp0.a();
                if(!gepa1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gepa1).ensureMutable();
                }
                ((gepm)gepa1.b_message).c |= 0x40;
                ((gepm)gepa1.b_message).l = v4;
            }
            String s10 = gcvp0.c();
            if(s10 != null && s10.length() > 0) {
                gepa gepa2 = this.c;
                String s11 = gcvp0.c();
                if(!gepa2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gepa2).ensureMutable();
                }
                gepm gepm0 = (gepm)gepa2.b_message;
                s11.getClass();
                gepm0.c |= 8;
                gepm0.i = s11;
                hhdb hhdb1 = this.e;
                String s12 = gcvp0.c();
                if(!hhdb1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb1).ensureMutable();
                }
                hhdf hhdf1 = (hhdf)hhdb1.b_message;
                s12.getClass();
                hhdf1.b |= 0x4000;
                hhdf1.p = s12;
            }
            if(gcvp0.d != null && gcvp0.d.length() > 0) {
                gepa gepa3 = this.c;
                String s13 = gcvp0.d;
                if(!gepa3.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gepa3).ensureMutable();
                }
                gepm gepm1 = (gepm)gepa3.b_message;
                s13.getClass();
                gepm1.c |= 16;
                gepm1.j = s13;
            }
            String s14 = gcvp0.g;
            ibuq.e(s14, "getGid1(...)");
            if(s14.length() > 0) {
                gepa gepa4 = this.c;
                String s15 = gcvp0.g;
                if(!gepa4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gepa4).ensureMutable();
                }
                gepm gepm2 = (gepm)gepa4.b_message;
                s15.getClass();
                gepm2.c |= 0x20;
                gepm2.k = s15;
            }
            if(z) {
                String s16 = gcvp0.j;
                if(s16 != null) {
                    gepa gepa5 = this.c;
                    if(!gepa5.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gepa5).ensureMutable();
                    }
                    ((gepm)gepa5.b_message).c |= 0x80;
                    ((gepm)gepa5.b_message).m = s16;
                }
            }
            if(z1 && (gcvp0.f != null && gcvp0.f.length() > 0)) {
                hhdb hhdb2 = this.e;
                String s17 = gcvp0.f;
                if(!hhdb2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb2).ensureMutable();
                }
                hhdf hhdf2 = (hhdf)hhdb2.b_message;
                s17.getClass();
                hhdf2.b |= 0x2000;
                hhdf2.o = s17;
            }
            if(z1) {
                String s18 = gcvp0.h;
                ibuq.e(s18, "getDeviceId(...)");
                if(s18.length() > 0) {
                    String s19 = gcvp0.h;
                    switch(gcvp0.a) {
                        case 1: {
                            ProtoLiteBuilder hftp1 = this.h;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hhda hhda0 = (hhda)hftp1.b_message;
                            s19.getClass();
                            hhda0.b |= 2;
                            hhda0.d = s19;
                            break;
                        }
                        case 2: {
                            if(s19.length() <= 8) {
                                ProtoLiteBuilder hftp2 = this.h;
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                hhda hhda1 = (hhda)hftp2.b_message;
                                s19.getClass();
                                hhda1.b |= 16;
                                hhda1.f = s19;
                            }
                            else {
                                ProtoLiteBuilder hftp3 = this.h;
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                hhda hhda2 = (hhda)hftp3.b_message;
                                s19.getClass();
                                hhda2.b |= 4;
                                hhda2.e = s19;
                            }
                        }
                    }
                }
            }
            if(z1) {
                String s20 = gcvp0.i;
                ibuq.e(s20, "getPhoneNumber(...)");
                if(s20.length() > 0) {
                    ProtoLiteBuilder hftp4 = this.h;
                    String s21 = gcvp0.i;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hhda hhda3 = (hhda)hftp4.b_message;
                    s21.getClass();
                    hhda3.b |= 0x20;
                    hhda3.g = s21;
                }
            }
        }
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        this.c.n(((geph)hftv2));
    }

    @Override  // gbic
    public final void e(List list0, int v) {
        ibuq.f(list0, "accounts");
        int v1 = this.a || this.b ? list0.size() : -1;
        if(this.a) {
            gesv gesv0 = this.d;
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            ((gesx)gesv0.b_message).m = hfvv.a;
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(((Account)object0).name);
            }
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx0 = (gesx)gesv0.b_message;
            gesx0.b();
            hfrj.E(arrayList0, gesx0.m);
        }
        hhdb hhdb0 = this.e;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf0 = (hhdf)hhdb0.b_message;
        hhdf0.b |= 0x100000;
        hhdf0.t = v1;
    }

    @Override  // gbia
    public final void f(List list0) {
        ibuq.f(list0, "packageInfoList");
        hhdb hhdb0 = this.e;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        ((hhdf)hhdb0.b_message).c = hfvv.a;
        hhdb0.a(list0);
    }

    @Override  // gbiw
    public final void g(long v) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x1000;
        ((gepm)gepa0.b_message).r = v;
    }

    @Override  // gbio
    public final void h(heal heal0) {
        if(heal0 != null) {
            hhdb hhdb0 = this.e;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            ((hhdf)hhdb0.b_message).z = heal0;
            ((hhdf)hhdb0.b_message).b |= 0x4000000;
        }
    }

    @Override  // gbia
    public final void i(List list0) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).Q = hfvv.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            byte[] arr_b = ((hcit)object0).toBytesArray();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)geou.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            arrayList0.add(((geou)hftv0));
        }
        gepa0.a(arrayList0);
    }

    @Override  // gbhs
    public final void j(List list0) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).H = hfty.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            gepj gepj0 = gepj.b(((hcjg)object0).k);
            ibuq.c(gepj0);
            arrayList0.add(gepj0);
        }
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        gepm0.k();
        for(Object object1: arrayList0) {
            gepm0.H.i(((gepj)object1).k);
        }
    }

    @Override  // gbis
    public final void k(int v) {
        if(v != -1) {
            hhdb hhdb0 = this.e;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf0 = (hhdf)hhdb0.b_message;
            hhdf0.b |= 1;
            hhdf0.d = v;
        }
    }

    @Override  // gbiw
    public final void l(String s) {
        ibuq.f(s, "device");
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x400;
        gepm0.p = s;
    }

    @Override  // gbhs
    public final void m(gbho gbho0) {
        hhdb hhdb0 = this.e;
        String s = gbho0.i;
        if(s != null) {
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf0 = (hhdf)hhdb0.b_message;
            hhdf0.b |= 0x80;
            hhdf0.j = s;
        }
        hhdc hhdc0 = gbho0.k;
        if(hhdc0 != null) {
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            ((hhdf)hhdb0.b_message).y = hhdc0;
            ((hhdf)hhdb0.b_message).b |= 0x2000000;
        }
        Iterator iterator0 = gbho0.e.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ibuq.e(object0, "next(...)");
            String s1 = ((InetAddress)object0).getHostAddress();
            if(s1 != null) {
                hhdb0.k(s1);
            }
        }
        long v = gbho0.m;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf1 = (hhdf)hhdb0.b_message;
        hhdf1.b |= 4;
        hhdf1.f = v;
        boolean z = gbho0.d;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf2 = (hhdf)hhdb0.b_message;
        hhdf2.b |= 0x200000;
        hhdf2.u = z;
        boolean z1 = gbho0.f;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf3 = (hhdf)hhdb0.b_message;
        hhdf3.b |= 2;
        hhdf3.e = z1;
        boolean z2 = gbho0.g;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf4 = (hhdf)hhdb0.b_message;
        hhdf4.b |= 0x400000;
        hhdf4.v = z2;
        boolean z3 = gbho0.h;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf5 = (hhdf)hhdb0.b_message;
        hhdf5.b |= 0x800000;
        hhdf5.w = z3;
        String s2 = gbho0.a;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf6 = (hhdf)hhdb0.b_message;
        s2.getClass();
        hhdf6.b |= 0x200;
        hhdf6.m = s2;
        String s3 = gbho0.b;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf7 = (hhdf)hhdb0.b_message;
        s3.getClass();
        hhdf7.b |= 0x400;
        hhdf7.n = s3;
        String s4 = gbho0.c;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf8 = (hhdf)hhdb0.b_message;
        s4.getClass();
        hhdf8.b |= 0x100;
        hhdf8.k = s4;
        int v1 = gbho0.j;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf9 = (hhdf)hhdb0.b_message;
        hhdf9.b |= 0x1000000;
        hhdf9.x = v1;
        String s5 = gbho0.l;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf10 = (hhdf)hhdb0.b_message;
        s5.getClass();
        hhdf10.b |= 0x80000;
        hhdf10.s = s5;
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s5.getClass();
        gepm0.c |= 0x8000;
        gepm0.t = s5;
    }

    @Override  // gbiw
    public final void n(long v) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x4000;
        ((gepm)gepa0.b_message).s = v;
        hhdb hhdb0 = this.e;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf0 = (hhdf)hhdb0.b_message;
        hhdf0.b |= 0x40000;
        hhdf0.r = v;
    }

    @Override  // gbiw
    public final void o(DisplayMetrics displayMetrics0) {
        ibuq.f(displayMetrics0, "displayMetrics");
        gepa gepa0 = this.c;
        int v = displayMetrics0.widthPixels;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x10000;
        ((gepm)gepa0.b_message).u = v;
        int v1 = displayMetrics0.heightPixels;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x20000;
        ((gepm)gepa0.b_message).v = v1;
        float f = displayMetrics0.xdpi;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x40000;
        ((gepm)gepa0.b_message).w = f;
        float f1 = displayMetrics0.ydpi;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x80000;
        ((gepm)gepa0.b_message).x = f1;
        int v2 = displayMetrics0.densityDpi;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x100000;
        ((gepm)gepa0.b_message).y = v2;
    }

    @Override  // gbia
    public final void p(long v) {
        gepa gepa0 = this.c;
        String s = String.valueOf(v);
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x8000000;
        gepm0.F = s;
    }

    @Override  // gbio
    public final void q(boolean z) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).f = (z ? 2 : 3) - 1;
        ((gepm)gepa0.b_message).c |= 2;
    }

    @Override  // gbiw
    public final void r(List list0) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).J = hfvv.a;
        gepa0.k(list0);
    }

    @Override  // gbia
    public final void s(String s) {
        ibuq.f(s, "packageName");
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x2000000;
        gepm0.D = s;
    }

    @Override  // gbia
    public final void t(long v) {
        gepa gepa0 = this.c;
        String s = String.valueOf(v);
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        gepm gepm0 = (gepm)gepa0.b_message;
        s.getClass();
        gepm0.c |= 0x4000000;
        gepm0.E = s;
    }

    @Override  // gbiw
    public final void u(hcke hcke0) {
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        ((gesx)gesv0.b_message).o = hcke0;
        ((gesx)gesv0.b_message).b |= 0x1000;
    }

    @Override  // gbis
    public final void v(boolean z) {
        hhdb hhdb0 = this.e;
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf0 = (hhdf)hhdb0.b_message;
        hhdf0.b |= 0x20;
        hhdf0.h = z;
    }

    @Override  // gbhs
    public final void w(boolean z) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhda hhda0 = (hhda)hftp0.b_message;
        hhda0.b |= 0x800000;
        hhda0.q = z;
    }

    @Override  // gbic
    public final void x(boolean z) {
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gesx0.b |= 0x80;
        gesx0.l = z;
    }

    @Override  // gbhs
    public final void y(String s) {
        gesv gesv0 = this.d;
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx0 = (gesx)gesv0.b_message;
        gesx0.b |= 2;
        gesx0.f = s;
    }

    @Override  // gbiw
    public final void z(String s) {
        gepa gepa0 = this.c;
        if(!gepa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gepa0).ensureMutable();
        }
        ((gepm)gepa0.b_message).c |= 0x20000000;
        ((gepm)gepa0.b_message).I = s;
    }
}

