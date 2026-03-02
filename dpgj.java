import android.content.Context;
import j..util.Objects;

final class dpgj {
    public final Context a;
    public final dmhi b;
    public final long c;

    public dpgj(Context context0, String s, String s1, String s2, long v) {
        this.a = context0;
        this.b = new dmhi(s1, s, s2, context0);
        this.c = v;
    }

    final evql a(String s, long v, ByteString hfsf0) {
        evqp evqp0 = new evqp();
        dpuj dpuj0 = dpuj.by;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtir.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gtir)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtir gtir0 = (gtir)hftp0.b_message;
        hfsf0.getClass();
        gtir0.c = hfsf0;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        Objects.requireNonNull(evqp0);
        dpgf dpgf0 = new dpgf(evqp0);
        Objects.requireNonNull(evqp0);
        dpud dpud0 = new dpud(new dpgd(evqp0), dpgf0);
        dptv.o(this.b, dpuj0, ((MessageLite)hftv1), ((MessageLite)gtis.a), dpud0, v, gtmu.c);
        return evqp0.a;
    }

    final gged_interceptors b(String s, gtfc gtfc0, long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtho.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gtho)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtho gtho0 = (gtho)hftp0.b_message;
        gtfc0.getClass();
        gtho0.c = gtfc0;
        gtho0.b |= 1;
        gtho gtho1 = (gtho)hftp0.N_build();
        return gged_interceptors.i(((gthp)dptv.j(this.b, dpuj.bu, ((MessageLite)gtho1), ((MessageLite)gthp.a), v, gtmu.c)).b);
    }

    final gtja c(String s, ByteString hfsf0, String s1, ByteString hfsf1, ByteString hfsf2, long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtix.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtfc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gtfc)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtfc gtfc0 = (gtfc)hftp1.b_message;
        hfsf0.getClass();
        gtfc0.c = hfsf0;
        gtfc gtfc1 = (gtfc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gtfc1.getClass();
        ((gtix)hftv1).c = gtfc1;
        ((gtix)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s1.getClass();
        ((gtix)hftv2).e = s1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        hfsf1.getClass();
        ((gtix)hftv3).d = hfsf1;
        gtnq gtnq0 = gtnq.c;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtix gtix0 = (gtix)hftp0.b_message;
        gtix0.g = gtnq0.a();
        if(!hfsf2.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtix gtix1 = (gtix)hftp0.b_message;
            hfsf2.getClass();
            gtix1.f = hfsf2;
        }
        ProtoLiteMessage hftv4 = hftp0.N_build();
        return (gtja)dptv.j(this.b, dpuj.bz, ((MessageLite)hftv4), ((MessageLite)gtja.a), v, gtmu.c);
    }

    final hjzc d(long v, dpfa dpfa0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjza.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hjza)hftv0).b = v;
        String s = dpfa0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((hjza)hftv1).c = s;
        String s1 = dpfa0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s1.getClass();
        ((hjza)hftv2).d = s1;
        String s2 = dpfa0.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjza hjza0 = (hjza)hftp0.b_message;
        s2.getClass();
        hjza0.e = s2;
        hjza hjza1 = (hjza)hftp0.N_build();
        return (hjzc)dptv.j(this.b, dpuj.ab, ((MessageLite)hjza1), ((MessageLite)hjzc.b), v, gtmu.c);
    }

    final hksr e(String s, long v, hjyk hjyk0, ByteString hfsf0) {
        if(hfsf0.isEmpty()) {
            return hksr.a;
        }
        dmhi dmhi0 = this.b;
        dpuj dpuj0 = dpuj.T;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjxp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hjxp)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hfsf0.getClass();
        ((hjxp)hftv1).c = hfsf0;
        String s1 = hjyk0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s1.getClass();
        ((hjxp)hftv2).d = s1;
        hktu hktu0 = hktu.b(hjyk0.d) == null ? hktu.D : hktu.b(hjyk0.d);
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjxp hjxp0 = (hjxp)hftp0.b_message;
        hjxp0.e = hktu0.a();
        hksr hksr0 = ((hjxs)dptv.j(dmhi0, dpuj0, ((MessageLite)hftp0.N_build()), ((MessageLite)hjxs.a), v, gtmu.c)).b;
        return hksr0 == null ? hksr.a : hksr0;
    }

    final void f(String s, long v, gtfc gtfc0, ftdd ftdd0) {
        gtfz gtfz0 = (gtfz)((ProtoLiteMessage)gtga.a).v_newBuilder();
        if(!gtfz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gtfz0).ensureMutable();
        }
        gtga gtga0 = (gtga)gtfz0.b_message;
        gtfc0.getClass();
        gtga0.c = gtfc0;
        gtga0.b |= 1;
        if(!gtfz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gtfz0).ensureMutable();
        }
        gtga gtga1 = (gtga)gtfz0.b_message;
        s.getClass();
        gtga1.d = s;
        gtfz0.a(gggq.j(ftdd0.b, new dpgh()));
        gtga gtga2 = (gtga)((ProtoLiteBuilder)gtfz0).N_build();
        gtgb gtgb0 = (gtgb)dptv.j(this.b, dpuj.br, ((MessageLite)gtga2), ((MessageLite)gtgb.a), v, gtmu.c);
    }

    final void g(long v, hksq hksq0) {
        dpuj dpuj0 = dpuj.X;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjyn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjyn hjyn0 = (hjyn)hftp0.b_message;
        hjyn0.b = hksq0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        hjyo hjyo0 = (hjyo)dptv.j(this.b, dpuj0, ((MessageLite)hftv0), ((MessageLite)hjyo.a), v, gtmu.c);
    }

    final void h(long v, hjqn hjqn0, hjwt hjwt0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkih.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkih hkih0 = (hkih)hftp0.b_message;
        s.getClass();
        hkih0.e = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkhx.a).v_newBuilder();
        hkid hkid0 = hkid.r;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkhx hkhx0 = (hkhx)hftp1.b_message;
        hkhx0.c = hkid0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hjqn0.getClass();
        ((hkhx)hftv0).e = hjqn0;
        ((hkhx)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkhx hkhx1 = (hkhx)hftp1.b_message;
        hjwt0.getClass();
        hkhx1.d = hjwt0;
        hkhx1.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkih hkih1 = (hkih)hftp0.b_message;
        hkhx hkhx2 = (hkhx)hftp1.N_build();
        hkhx2.getClass();
        hkih1.c = hkhx2;
        hkih1.b |= 1;
        hkih hkih2 = (hkih)hftp0.N_build();
        hkii hkii0 = (hkii)dptv.j(this.b, dpuj.as, ((MessageLite)hkih2), ((MessageLite)hkii.a), v, gtmu.c);
    }
}

