import android.os.health.HealthStats;
import j..util.DesugarCollections;
import java.util.Map;

public final class forv {
    static final fosn a(Long long0, Long long1, HealthStats healthStats0, forw forw0, int v) {
        fose fose0;
        iczn iczn0 = (iczn)((ProtoLiteMessage)iczo.a).v_newBuilder();
        long v1 = fosl.a(healthStats0, 10001);
        if(Long.compare(v1, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo0 = (iczo)iczn0.b_message;
            iczo0.b |= 1;
            iczo0.d = v1;
        }
        long v2 = fosl.a(healthStats0, 10002);
        if(Long.compare(v2, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo1 = (iczo)iczn0.b_message;
            iczo1.b |= 2;
            iczo1.e = v2;
        }
        long v3 = fosl.a(healthStats0, 10003);
        if(v3 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo2 = (iczo)iczn0.b_message;
            iczo2.b |= 4;
            iczo2.f = v3;
        }
        long v4 = fosl.a(healthStats0, 10004);
        if(v4 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo3 = (iczo)iczn0.b_message;
            iczo3.b |= 8;
            iczo3.g = v4;
        }
        iczn0.dm(fosl.b(healthStats0, 10005));
        iczn0.dn(fosl.b(healthStats0, 10006));
        iczn0.do(fosl.b(healthStats0, 10007));
        iczn0.dl(fosl.b(healthStats0, 10008));
        iczn0.u(fosl.b(healthStats0, 10009));
        iczn0.q(fosl.b(healthStats0, 10010));
        iczm iczm0 = fosl.e(healthStats0, 10011);
        if(iczm0 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).n = iczm0;
            ((iczo)iczn0.b_message).b |= 16;
        }
        iczn0.r(fosl.b(healthStats0, 10012));
        Map map0 = fosl.c(healthStats0, 10014);
        iczn0.t(fosh.a.d(map0));
        Map map1 = fosl.c(healthStats0, 10015);
        iczn0.s(fosg.a.d(map1));
        long v5 = fosl.a(healthStats0, 10016);
        if(v5 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo4 = (iczo)iczn0.b_message;
            iczo4.b |= 0x20;
            iczo4.s = v5;
        }
        long v6 = fosl.a(healthStats0, 10017);
        if(v6 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo5 = (iczo)iczn0.b_message;
            iczo5.b |= 0x40;
            iczo5.t = v6;
        }
        long v7 = fosl.a(healthStats0, 10018);
        if(v7 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo6 = (iczo)iczn0.b_message;
            iczo6.b |= 0x80;
            iczo6.u = v7;
        }
        long v8 = fosl.a(healthStats0, 10019);
        if(v8 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo7 = (iczo)iczn0.b_message;
            iczo7.b |= 0x100;
            iczo7.v = v8;
        }
        long v9 = fosl.a(healthStats0, 10020);
        if(v9 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo8 = (iczo)iczn0.b_message;
            iczo8.b |= 0x200;
            iczo8.w = v9;
        }
        long v10 = fosl.a(healthStats0, 10021);
        if(v10 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo9 = (iczo)iczn0.b_message;
            iczo9.b |= 0x400;
            iczo9.x = v10;
        }
        long v11 = fosl.a(healthStats0, 10022);
        if(v11 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo10 = (iczo)iczn0.b_message;
            iczo10.b |= 0x800;
            iczo10.y = v11;
        }
        long v12 = fosl.a(healthStats0, 10023);
        if(v12 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo11 = (iczo)iczn0.b_message;
            iczo11.b |= 0x1000;
            iczo11.z = v12;
        }
        long v13 = fosl.a(healthStats0, 10024);
        if(v13 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo12 = (iczo)iczn0.b_message;
            iczo12.b |= 0x2000;
            iczo12.A = v13;
        }
        long v14 = fosl.a(healthStats0, 10025);
        if(v14 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo13 = (iczo)iczn0.b_message;
            iczo13.b |= 0x4000;
            iczo13.B = v14;
        }
        long v15 = fosl.a(healthStats0, 10026);
        if(Long.compare(v15, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo14 = (iczo)iczn0.b_message;
            iczo14.b |= 0x8000;
            iczo14.C = v15;
        }
        long v16 = fosl.a(healthStats0, 10027);
        if(Long.compare(v16, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo15 = (iczo)iczn0.b_message;
            iczo15.b |= 0x10000;
            iczo15.D = v16;
        }
        long v17 = fosl.a(healthStats0, 10028);
        if(Long.compare(v17, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo16 = (iczo)iczn0.b_message;
            iczo16.b |= 0x20000;
            iczo16.E = v17;
        }
        long v18 = fosl.a(healthStats0, 10029);
        if(Long.compare(v18, 0L) != 0) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo17 = (iczo)iczn0.b_message;
            iczo17.b |= 0x40000;
            iczo17.F = v18;
        }
        iczm iczm1 = fosl.e(healthStats0, 10030);
        if(iczm1 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).G = iczm1;
            ((iczo)iczn0.b_message).b |= 0x80000;
        }
        long v19 = fosl.a(healthStats0, 10031);
        if(v19 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            iczo iczo18 = (iczo)iczn0.b_message;
            iczo18.b |= 0x100000;
            iczo18.H = v19;
        }
        iczm iczm2 = fosl.e(healthStats0, 10032);
        if(iczm2 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).I = iczm2;
            ((iczo)iczn0.b_message).b |= 0x200000;
        }
        iczm iczm3 = fosl.e(healthStats0, 10033);
        if(iczm3 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).J = iczm3;
            ((iczo)iczn0.b_message).b |= 0x400000;
        }
        iczm iczm4 = fosl.e(healthStats0, 10034);
        if(iczm4 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).K = iczm4;
            ((iczo)iczn0.b_message).b |= 0x800000;
        }
        iczm iczm5 = fosl.e(healthStats0, 10035);
        if(iczm5 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).L = iczm5;
            ((iczo)iczn0.b_message).b |= 0x1000000;
        }
        iczm iczm6 = fosl.e(healthStats0, 10036);
        if(iczm6 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).M = iczm6;
            ((iczo)iczn0.b_message).b |= 0x2000000;
        }
        iczm iczm7 = fosl.e(healthStats0, 10037);
        if(iczm7 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).N = iczm7;
            ((iczo)iczn0.b_message).b |= 0x4000000;
        }
        iczm iczm8 = fosl.e(healthStats0, 10038);
        if(iczm8 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).O = iczm8;
            ((iczo)iczn0.b_message).b |= 0x8000000;
        }
        iczm iczm9 = fosl.e(healthStats0, 10039);
        if(iczm9 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).P = iczm9;
            ((iczo)iczn0.b_message).b |= 0x10000000;
        }
        iczm iczm10 = fosl.e(healthStats0, 10040);
        if(iczm10 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).Q = iczm10;
            ((iczo)iczn0.b_message).b |= 0x20000000;
        }
        iczm iczm11 = fosl.e(healthStats0, 10041);
        if(iczm11 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).R = iczm11;
            ((iczo)iczn0.b_message).b |= 0x40000000;
        }
        iczm iczm12 = fosl.e(healthStats0, 10042);
        if(iczm12 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).S = iczm12;
            ((iczo)iczn0.b_message).b |= 0x80000000;
        }
        iczm iczm13 = fosl.e(healthStats0, 10043);
        if(iczm13 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).T = iczm13;
            ((iczo)iczn0.b_message).c |= 1;
        }
        iczm iczm14 = fosl.e(healthStats0, 10044);
        if(iczm14 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).U = iczm14;
            ((iczo)iczn0.b_message).c |= 2;
        }
        long v20 = fosl.a(healthStats0, 10045);
        if(v20 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 4;
            ((iczo)iczn0.b_message).V = v20;
        }
        long v21 = fosl.a(healthStats0, 10046);
        if(v21 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 8;
            ((iczo)iczn0.b_message).W = v21;
        }
        long v22 = fosl.a(healthStats0, 10047);
        if(v22 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 16;
            ((iczo)iczn0.b_message).X = v22;
        }
        long v23 = fosl.a(healthStats0, 10048);
        if(v23 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x20;
            ((iczo)iczn0.b_message).Y = v23;
        }
        long v24 = fosl.a(healthStats0, 10049);
        if(v24 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x40;
            ((iczo)iczn0.b_message).Z = v24;
        }
        long v25 = fosl.a(healthStats0, 10050);
        if(v25 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x80;
            ((iczo)iczn0.b_message).aa = v25;
        }
        long v26 = fosl.a(healthStats0, 10051);
        if(v26 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x100;
            ((iczo)iczn0.b_message).ab = v26;
        }
        long v27 = fosl.a(healthStats0, 10052);
        if(v27 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x200;
            ((iczo)iczn0.b_message).ac = v27;
        }
        long v28 = fosl.a(healthStats0, 10053);
        if(v28 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x400;
            ((iczo)iczn0.b_message).ad = v28;
        }
        long v29 = fosl.a(healthStats0, 10054);
        if(v29 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x800;
            ((iczo)iczn0.b_message).ae = v29;
        }
        long v30 = fosl.a(healthStats0, 10055);
        if(v30 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x1000;
            ((iczo)iczn0.b_message).af = v30;
        }
        long v31 = fosl.a(healthStats0, 10056);
        if(v31 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x2000;
            ((iczo)iczn0.b_message).ag = v31;
        }
        long v32 = fosl.a(healthStats0, 10057);
        if(v32 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x4000;
            ((iczo)iczn0.b_message).ah = v32;
        }
        long v33 = fosl.a(healthStats0, 10058);
        if(v33 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x8000;
            ((iczo)iczn0.b_message).ai = v33;
        }
        long v34 = fosl.a(healthStats0, 10059);
        if(v34 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x10000;
            ((iczo)iczn0.b_message).aj = v34;
        }
        iczm iczm15 = fosl.e(healthStats0, 10061);
        if(iczm15 != null) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).ak = iczm15;
            ((iczo)iczn0.b_message).c |= 0x20000;
        }
        long v35 = fosl.a(healthStats0, 10062);
        if(v35 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x40000;
            ((iczo)iczn0.b_message).al = v35;
        }
        long v36 = fosl.a(healthStats0, 10063);
        if(v36 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x80000;
            ((iczo)iczn0.b_message).am = v36;
        }
        long v37 = fosl.a(healthStats0, 10064);
        if(v37 != 0L) {
            if(!iczn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczn0).ensureMutable();
            }
            ((iczo)iczn0.b_message).c |= 0x100000;
            ((iczo)iczn0.b_message).an = v37;
        }
        iczo iczo19 = (iczo)((ProtoLiteBuilder)iczn0).N_build();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)iczo19).jf(5, null);
        hftp0.X(((ProtoLiteMessage)iczo19));
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).h);
        for(int v39 = 0; true; ++v39) {
            fose0 = forw0.a.b;
            if(v39 >= ((iczo)((iczn)hftp0).b_message).h.size()) {
                break;
            }
            ((iczn)hftp0).dt(v39, fose0.c(1, ((iczn)hftp0).n(v39)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).i);
        for(int v40 = 0; v40 < ((iczo)((iczn)hftp0).b_message).i.size(); ++v40) {
            ((iczn)hftp0).du(v40, fose0.c(1, ((iczn)hftp0).o(v40)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).j);
        for(int v41 = 0; v41 < ((iczo)((iczn)hftp0).b_message).j.size(); ++v41) {
            ((iczn)hftp0).dv(v41, fose0.c(1, ((iczn)hftp0).p(v41)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).k);
        for(int v42 = 0; v42 < ((iczo)((iczn)hftp0).b_message).k.size(); ++v42) {
            ((iczn)hftp0).ds(v42, fose0.c(1, ((iczn)hftp0).m(v42)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).l);
        for(int v43 = 0; v43 < ((iczo)((iczn)hftp0).b_message).l.size(); ++v43) {
            ((iczn)hftp0).dr(v43, fose0.c(2, ((iczn)hftp0).l(v43)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).m);
        for(int v44 = 0; v44 < ((iczo)((iczn)hftp0).b_message).m.size(); ++v44) {
            ((iczn)hftp0).dp(v44, fose0.c(3, ((iczn)hftp0).a(v44)));
        }
        DesugarCollections.unmodifiableList(((iczo)((iczn)hftp0).b_message).o);
        for(int v38 = 0; v38 < ((iczo)((iczn)hftp0).b_message).o.size(); ++v38) {
            ((iczn)hftp0).dq(v38, fose0.c(5, ((iczn)hftp0).k(v38)));
        }
        iczo iczo20 = (iczo)((ProtoLiteBuilder)(((iczn)hftp0))).N_build();
        Long long2 = (long)0x2F7C1ACDL;
        return forw0.c == null ? new fosn(iczo20, long0, long1, long2, ((long)0L), v, null, null, null) : new fosn(iczo20, long0, long1, long2, ((long)forw0.c.hashCode()), v, null, null, null);
    }
}

