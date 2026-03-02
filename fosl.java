import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class fosl {
    public static long a(HealthStats healthStats0, int v) {
        return healthStats0 == null || !healthStats0.hasMeasurement(v) ? 0L : healthStats0.getMeasurement(v);
    }

    public static List b(HealthStats healthStats0, int v) {
        if(healthStats0 != null && healthStats0.hasTimers(v)) {
            Map map0 = healthStats0.getTimers(v);
            return fosk.a.d(map0);
        }
        return Collections.EMPTY_LIST;
    }

    public static Map c(HealthStats healthStats0, int v) {
        return healthStats0 == null || !healthStats0.hasStats(v) ? Collections.EMPTY_MAP : healthStats0.getStats(v);
    }

    public static iczg d(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczg iczg0 = (iczg)hftp0.b_message;
        iczg0.b |= 2;
        iczg0.d = s;
        return (iczg)hftp0.N_build();
    }

    public static iczm e(HealthStats healthStats0, int v) {
        return healthStats0 == null || !healthStats0.hasTimer(v) ? null : fosl.g(null, healthStats0.getTimer(v));
    }

    static iczm f(iczm iczm0, iczm iczm1) {
        if(iczm0 != null && iczm1 != null) {
            int v = iczm0.c - iczm1.c;
            long v1 = iczm0.d - iczm1.d;
            if(v == 0) {
                if(v1 != 0L) {
                    v = 0;
                    goto label_8;
                }
                return null;
            }
        label_8:
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczm.a).v_newBuilder();
            if((iczm0.b & 4) != 0) {
                iczg iczg0 = iczm0.e == null ? iczg.a : iczm0.e;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                iczm iczm2 = (iczm)hftp0.b_message;
                iczg0.getClass();
                iczm2.e = iczg0;
                iczm2.b |= 4;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((iczm)hftv0).b |= 1;
            ((iczm)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczm iczm3 = (iczm)hftp0.b_message;
            iczm3.b |= 2;
            iczm3.d = v1;
            return (iczm)hftp0.N_build();
        }
        return iczm0;
    }

    public static iczm g(String s, TimerStat timerStat0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczm.a).v_newBuilder();
        int v = timerStat0.getCount();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iczm iczm0 = (iczm)hftp0.b_message;
        iczm0.b |= 1;
        iczm0.c = v;
        long v1 = timerStat0.getTime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((iczm)hftv0).b |= 2;
        ((iczm)hftv0).d = v1;
        if(((iczm)hftv0).c < 0) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczm iczm1 = (iczm)hftp0.b_message;
            iczm1.b |= 1;
            iczm1.c = 0;
        }
        if(s != null) {
            iczg iczg0 = fosl.d(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczm iczm2 = (iczm)hftp0.b_message;
            iczg0.getClass();
            iczm2.e = iczg0;
            iczm2.b |= 4;
        }
        iczm iczm3 = (iczm)hftp0.b_message;
        return iczm3.c != 0 || iczm3.d != 0L ? ((iczm)hftp0.N_build()) : null;
    }

    static iczo h(iczo iczo0, iczo iczo1) {
        iczm iczm46;
        iczm iczm45;
        iczm iczm43;
        iczm iczm42;
        iczm iczm40;
        iczm iczm39;
        iczm iczm37;
        iczm iczm36;
        iczm iczm34;
        iczm iczm33;
        iczm iczm31;
        iczm iczm30;
        iczm iczm28;
        iczm iczm27;
        iczm iczm25;
        iczm iczm24;
        iczm iczm22;
        iczm iczm21;
        iczm iczm19;
        iczm iczm18;
        iczm iczm16;
        iczm iczm15;
        iczm iczm13;
        iczm iczm12;
        iczm iczm10;
        iczm iczm9;
        iczm iczm7;
        iczm iczm6;
        iczm iczm4;
        iczm iczm3;
        iczm iczm1;
        iczm iczm0;
        if(iczo0 != null && iczo1 != null) {
            iczn iczn0 = (iczn)((ProtoLiteMessage)iczo.a).v_newBuilder();
            if((iczo0.b & 1) != 0) {
                long v = iczo0.d - iczo1.d;
                if(v != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo2 = (iczo)iczn0.b_message;
                    iczo2.b |= 1;
                    iczo2.d = v;
                }
            }
            if((iczo0.b & 2) != 0) {
                long v1 = iczo0.e - iczo1.e;
                if(v1 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo3 = (iczo)iczn0.b_message;
                    iczo3.b |= 2;
                    iczo3.e = v1;
                }
            }
            if((iczo0.b & 4) != 0) {
                long v2 = iczo0.f - iczo1.f;
                if(v2 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo4 = (iczo)iczn0.b_message;
                    iczo4.b |= 4;
                    iczo4.f = v2;
                }
            }
            if((iczo0.b & 8) != 0) {
                long v3 = iczo0.g - iczo1.g;
                if(v3 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo5 = (iczo)iczn0.b_message;
                    iczo5.b |= 8;
                    iczo5.g = v3;
                }
            }
            fosk fosk0 = fosk.a;
            iczn0.dm(fosk0.e(iczo0.h, iczo1.h));
            iczn0.dn(fosk0.e(iczo0.i, iczo1.i));
            iczn0.do(fosk0.e(iczo0.j, iczo1.j));
            iczn0.dl(fosk0.e(iczo0.k, iczo1.k));
            iczn0.u(fosk0.e(iczo0.l, iczo1.l));
            iczn0.q(fosk0.e(iczo0.m, iczo1.m));
            if((iczo0.b & 16) == 0) {
                iczm0 = null;
            }
            else {
                iczm0 = iczo0.n;
                if(iczm0 == null) {
                    iczm0 = iczm.a;
                }
            }
            if((iczo1.b & 16) == 0) {
                iczm1 = null;
            }
            else {
                iczm1 = iczo1.n;
                if(iczm1 == null) {
                    iczm1 = iczm.a;
                }
            }
            iczm iczm2 = fosl.f(iczm0, iczm1);
            if(iczm2 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).n = iczm2;
                ((iczo)iczn0.b_message).b |= 16;
            }
            iczn0.r(fosk0.e(iczo0.o, iczo1.o));
            iczn0.t(fosh.a.e(iczo0.q, iczo1.q));
            iczn0.s(fosg.a.e(iczo0.r, iczo1.r));
            if((iczo0.b & 0x20) != 0) {
                long v4 = iczo0.s - iczo1.s;
                if(v4 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo6 = (iczo)iczn0.b_message;
                    iczo6.b |= 0x20;
                    iczo6.s = v4;
                }
            }
            if((iczo0.b & 0x40) != 0) {
                long v5 = iczo0.t - iczo1.t;
                if(v5 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo7 = (iczo)iczn0.b_message;
                    iczo7.b |= 0x40;
                    iczo7.t = v5;
                }
            }
            if((iczo0.b & 0x80) != 0) {
                long v6 = iczo0.u - iczo1.u;
                if(v6 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo8 = (iczo)iczn0.b_message;
                    iczo8.b |= 0x80;
                    iczo8.u = v6;
                }
            }
            if((iczo0.b & 0x100) != 0) {
                long v7 = iczo0.v - iczo1.v;
                if(v7 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo9 = (iczo)iczn0.b_message;
                    iczo9.b |= 0x100;
                    iczo9.v = v7;
                }
            }
            if((iczo0.b & 0x200) != 0) {
                long v8 = iczo0.w - iczo1.w;
                if(v8 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo10 = (iczo)iczn0.b_message;
                    iczo10.b |= 0x200;
                    iczo10.w = v8;
                }
            }
            if((iczo0.b & 0x400) != 0) {
                long v9 = iczo0.x - iczo1.x;
                if(v9 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo11 = (iczo)iczn0.b_message;
                    iczo11.b |= 0x400;
                    iczo11.x = v9;
                }
            }
            if((iczo0.b & 0x800) != 0) {
                long v10 = iczo0.y - iczo1.y;
                if(v10 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo12 = (iczo)iczn0.b_message;
                    iczo12.b |= 0x800;
                    iczo12.y = v10;
                }
            }
            if((iczo0.b & 0x1000) != 0) {
                long v11 = iczo0.z - iczo1.z;
                if(v11 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo13 = (iczo)iczn0.b_message;
                    iczo13.b |= 0x1000;
                    iczo13.z = v11;
                }
            }
            if((iczo0.b & 0x2000) != 0) {
                long v12 = iczo0.A - iczo1.A;
                if(v12 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo14 = (iczo)iczn0.b_message;
                    iczo14.b |= 0x2000;
                    iczo14.A = v12;
                }
            }
            if((iczo0.b & 0x4000) != 0) {
                long v13 = iczo0.B - iczo1.B;
                if(v13 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo15 = (iczo)iczn0.b_message;
                    iczo15.b |= 0x4000;
                    iczo15.B = v13;
                }
            }
            if((iczo0.b & 0x8000) != 0) {
                long v14 = iczo0.C - iczo1.C;
                if(v14 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo16 = (iczo)iczn0.b_message;
                    iczo16.b |= 0x8000;
                    iczo16.C = v14;
                }
            }
            if((iczo0.b & 0x10000) != 0) {
                long v15 = iczo0.D - iczo1.D;
                if(v15 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo17 = (iczo)iczn0.b_message;
                    iczo17.b |= 0x10000;
                    iczo17.D = v15;
                }
            }
            if((iczo0.b & 0x20000) != 0) {
                long v16 = iczo0.E - iczo1.E;
                if(v16 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo18 = (iczo)iczn0.b_message;
                    iczo18.b |= 0x20000;
                    iczo18.E = v16;
                }
            }
            if((iczo0.b & 0x40000) != 0) {
                long v17 = iczo0.F - iczo1.F;
                if(v17 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo19 = (iczo)iczn0.b_message;
                    iczo19.b |= 0x40000;
                    iczo19.F = v17;
                }
            }
            if((iczo0.b & 0x80000) == 0) {
                iczm3 = null;
            }
            else {
                iczm3 = iczo0.G;
                if(iczm3 == null) {
                    iczm3 = iczm.a;
                }
            }
            if((iczo1.b & 0x80000) == 0) {
                iczm4 = null;
            }
            else {
                iczm4 = iczo1.G;
                if(iczm4 == null) {
                    iczm4 = iczm.a;
                }
            }
            iczm iczm5 = fosl.f(iczm3, iczm4);
            if(iczm5 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).G = iczm5;
                ((iczo)iczn0.b_message).b |= 0x80000;
            }
            if((iczo0.b & 0x100000) != 0) {
                long v18 = iczo0.H - iczo1.H;
                if(v18 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    iczo iczo20 = (iczo)iczn0.b_message;
                    iczo20.b |= 0x100000;
                    iczo20.H = v18;
                }
            }
            if((iczo0.b & 0x200000) == 0) {
                iczm6 = null;
            }
            else {
                iczm6 = iczo0.I;
                if(iczm6 == null) {
                    iczm6 = iczm.a;
                }
            }
            if((iczo1.b & 0x200000) == 0) {
                iczm7 = null;
            }
            else {
                iczm7 = iczo1.I;
                if(iczm7 == null) {
                    iczm7 = iczm.a;
                }
            }
            iczm iczm8 = fosl.f(iczm6, iczm7);
            if(iczm8 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).I = iczm8;
                ((iczo)iczn0.b_message).b |= 0x200000;
            }
            if((iczo0.b & 0x400000) == 0) {
                iczm9 = null;
            }
            else {
                iczm9 = iczo0.J;
                if(iczm9 == null) {
                    iczm9 = iczm.a;
                }
            }
            if((iczo1.b & 0x400000) == 0) {
                iczm10 = null;
            }
            else {
                iczm10 = iczo1.J;
                if(iczm10 == null) {
                    iczm10 = iczm.a;
                }
            }
            iczm iczm11 = fosl.f(iczm9, iczm10);
            if(iczm11 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).J = iczm11;
                ((iczo)iczn0.b_message).b |= 0x400000;
            }
            if((iczo0.b & 0x800000) == 0) {
                iczm12 = null;
            }
            else {
                iczm12 = iczo0.K;
                if(iczm12 == null) {
                    iczm12 = iczm.a;
                }
            }
            if((iczo1.b & 0x800000) == 0) {
                iczm13 = null;
            }
            else {
                iczm13 = iczo1.K;
                if(iczm13 == null) {
                    iczm13 = iczm.a;
                }
            }
            iczm iczm14 = fosl.f(iczm12, iczm13);
            if(iczm14 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).K = iczm14;
                ((iczo)iczn0.b_message).b |= 0x800000;
            }
            if((iczo0.b & 0x1000000) == 0) {
                iczm15 = null;
            }
            else {
                iczm15 = iczo0.L;
                if(iczm15 == null) {
                    iczm15 = iczm.a;
                }
            }
            if((iczo1.b & 0x1000000) == 0) {
                iczm16 = null;
            }
            else {
                iczm16 = iczo1.L;
                if(iczm16 == null) {
                    iczm16 = iczm.a;
                }
            }
            iczm iczm17 = fosl.f(iczm15, iczm16);
            if(iczm17 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).L = iczm17;
                ((iczo)iczn0.b_message).b |= 0x1000000;
            }
            if((iczo0.b & 0x2000000) == 0) {
                iczm18 = null;
            }
            else {
                iczm18 = iczo0.M;
                if(iczm18 == null) {
                    iczm18 = iczm.a;
                }
            }
            if((iczo1.b & 0x2000000) == 0) {
                iczm19 = null;
            }
            else {
                iczm19 = iczo1.M;
                if(iczm19 == null) {
                    iczm19 = iczm.a;
                }
            }
            iczm iczm20 = fosl.f(iczm18, iczm19);
            if(iczm20 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).M = iczm20;
                ((iczo)iczn0.b_message).b |= 0x2000000;
            }
            if((iczo0.b & 0x4000000) == 0) {
                iczm21 = null;
            }
            else {
                iczm21 = iczo0.N;
                if(iczm21 == null) {
                    iczm21 = iczm.a;
                }
            }
            if((iczo1.b & 0x4000000) == 0) {
                iczm22 = null;
            }
            else {
                iczm22 = iczo1.N;
                if(iczm22 == null) {
                    iczm22 = iczm.a;
                }
            }
            iczm iczm23 = fosl.f(iczm21, iczm22);
            if(iczm23 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).N = iczm23;
                ((iczo)iczn0.b_message).b |= 0x4000000;
            }
            if((iczo0.b & 0x8000000) == 0) {
                iczm24 = null;
            }
            else {
                iczm24 = iczo0.O;
                if(iczm24 == null) {
                    iczm24 = iczm.a;
                }
            }
            if((iczo1.b & 0x8000000) == 0) {
                iczm25 = null;
            }
            else {
                iczm25 = iczo1.O;
                if(iczm25 == null) {
                    iczm25 = iczm.a;
                }
            }
            iczm iczm26 = fosl.f(iczm24, iczm25);
            if(iczm26 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).O = iczm26;
                ((iczo)iczn0.b_message).b |= 0x8000000;
            }
            if((iczo0.b & 0x10000000) == 0) {
                iczm27 = null;
            }
            else {
                iczm27 = iczo0.P;
                if(iczm27 == null) {
                    iczm27 = iczm.a;
                }
            }
            if((iczo1.b & 0x10000000) == 0) {
                iczm28 = null;
            }
            else {
                iczm28 = iczo1.P;
                if(iczm28 == null) {
                    iczm28 = iczm.a;
                }
            }
            iczm iczm29 = fosl.f(iczm27, iczm28);
            if(iczm29 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).P = iczm29;
                ((iczo)iczn0.b_message).b |= 0x10000000;
            }
            if((iczo0.b & 0x20000000) == 0) {
                iczm30 = null;
            }
            else {
                iczm30 = iczo0.Q;
                if(iczm30 == null) {
                    iczm30 = iczm.a;
                }
            }
            if((iczo1.b & 0x20000000) == 0) {
                iczm31 = null;
            }
            else {
                iczm31 = iczo1.Q;
                if(iczm31 == null) {
                    iczm31 = iczm.a;
                }
            }
            iczm iczm32 = fosl.f(iczm30, iczm31);
            if(iczm32 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).Q = iczm32;
                ((iczo)iczn0.b_message).b |= 0x20000000;
            }
            if((iczo0.b & 0x40000000) == 0) {
                iczm33 = null;
            }
            else {
                iczm33 = iczo0.R;
                if(iczm33 == null) {
                    iczm33 = iczm.a;
                }
            }
            if((iczo1.b & 0x40000000) == 0) {
                iczm34 = null;
            }
            else {
                iczm34 = iczo1.R;
                if(iczm34 == null) {
                    iczm34 = iczm.a;
                }
            }
            iczm iczm35 = fosl.f(iczm33, iczm34);
            if(iczm35 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).R = iczm35;
                ((iczo)iczn0.b_message).b |= 0x40000000;
            }
            if((iczo0.b & 0x80000000) == 0) {
                iczm36 = null;
            }
            else {
                iczm36 = iczo0.S;
                if(iczm36 == null) {
                    iczm36 = iczm.a;
                }
            }
            if((iczo1.b & 0x80000000) == 0) {
                iczm37 = null;
            }
            else {
                iczm37 = iczo1.S;
                if(iczm37 == null) {
                    iczm37 = iczm.a;
                }
            }
            iczm iczm38 = fosl.f(iczm36, iczm37);
            if(iczm38 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).S = iczm38;
                ((iczo)iczn0.b_message).b |= 0x80000000;
            }
            if((iczo0.c & 1) == 0) {
                iczm39 = null;
            }
            else {
                iczm39 = iczo0.T;
                if(iczm39 == null) {
                    iczm39 = iczm.a;
                }
            }
            if((iczo1.c & 1) == 0) {
                iczm40 = null;
            }
            else {
                iczm40 = iczo1.T;
                if(iczm40 == null) {
                    iczm40 = iczm.a;
                }
            }
            iczm iczm41 = fosl.f(iczm39, iczm40);
            if(iczm41 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).T = iczm41;
                ((iczo)iczn0.b_message).c |= 1;
            }
            if((iczo0.c & 2) == 0) {
                iczm42 = null;
            }
            else {
                iczm42 = iczo0.U;
                if(iczm42 == null) {
                    iczm42 = iczm.a;
                }
            }
            if((iczo1.c & 2) == 0) {
                iczm43 = null;
            }
            else {
                iczm43 = iczo1.U;
                if(iczm43 == null) {
                    iczm43 = iczm.a;
                }
            }
            iczm iczm44 = fosl.f(iczm42, iczm43);
            if(iczm44 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).U = iczm44;
                ((iczo)iczn0.b_message).c |= 2;
            }
            if((iczo0.c & 4) != 0) {
                long v19 = iczo0.V - iczo1.V;
                if(v19 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 4;
                    ((iczo)iczn0.b_message).V = v19;
                }
            }
            if((iczo0.c & 8) != 0) {
                long v20 = iczo0.W - iczo1.W;
                if(v20 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 8;
                    ((iczo)iczn0.b_message).W = v20;
                }
            }
            if((iczo0.c & 16) != 0) {
                long v21 = iczo0.X - iczo1.X;
                if(v21 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 16;
                    ((iczo)iczn0.b_message).X = v21;
                }
            }
            if((iczo0.c & 0x20) != 0) {
                long v22 = iczo0.Y - iczo1.Y;
                if(v22 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x20;
                    ((iczo)iczn0.b_message).Y = v22;
                }
            }
            if((iczo0.c & 0x40) != 0) {
                long v23 = iczo0.Z - iczo1.Z;
                if(v23 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x40;
                    ((iczo)iczn0.b_message).Z = v23;
                }
            }
            if((iczo0.c & 0x80) != 0) {
                long v24 = iczo0.aa - iczo1.aa;
                if(v24 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x80;
                    ((iczo)iczn0.b_message).aa = v24;
                }
            }
            if((iczo0.c & 0x100) != 0) {
                long v25 = iczo0.ab - iczo1.ab;
                if(v25 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x100;
                    ((iczo)iczn0.b_message).ab = v25;
                }
            }
            if((iczo0.c & 0x200) != 0) {
                long v26 = iczo0.ac - iczo1.ac;
                if(v26 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x200;
                    ((iczo)iczn0.b_message).ac = v26;
                }
            }
            if((iczo0.c & 0x400) != 0) {
                long v27 = iczo0.ad - iczo1.ad;
                if(v27 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x400;
                    ((iczo)iczn0.b_message).ad = v27;
                }
            }
            if((iczo0.c & 0x800) != 0) {
                long v28 = iczo0.ae - iczo1.ae;
                if(v28 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x800;
                    ((iczo)iczn0.b_message).ae = v28;
                }
            }
            if((iczo0.c & 0x1000) != 0) {
                long v29 = iczo0.af - iczo1.af;
                if(v29 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x1000;
                    ((iczo)iczn0.b_message).af = v29;
                }
            }
            if((iczo0.c & 0x2000) != 0) {
                long v30 = iczo0.ag - iczo1.ag;
                if(v30 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x2000;
                    ((iczo)iczn0.b_message).ag = v30;
                }
            }
            if((iczo0.c & 0x4000) != 0) {
                long v31 = iczo0.ah - iczo1.ah;
                if(v31 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x4000;
                    ((iczo)iczn0.b_message).ah = v31;
                }
            }
            if((iczo0.c & 0x8000) != 0) {
                long v32 = iczo0.ai - iczo1.ai;
                if(v32 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x8000;
                    ((iczo)iczn0.b_message).ai = v32;
                }
            }
            if((iczo0.c & 0x10000) != 0) {
                long v33 = iczo0.aj - iczo1.aj;
                if(v33 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x10000;
                    ((iczo)iczn0.b_message).aj = v33;
                }
            }
            if((iczo0.c & 0x20000) == 0) {
                iczm45 = null;
            }
            else {
                iczm45 = iczo0.ak;
                if(iczm45 == null) {
                    iczm45 = iczm.a;
                }
            }
            if((iczo1.c & 0x20000) == 0) {
                iczm46 = null;
            }
            else {
                iczm46 = iczo1.ak;
                if(iczm46 == null) {
                    iczm46 = iczm.a;
                }
            }
            iczm iczm47 = fosl.f(iczm45, iczm46);
            if(iczm47 != null) {
                if(!iczn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)iczn0).ensureMutable();
                }
                ((iczo)iczn0.b_message).ak = iczm47;
                ((iczo)iczn0.b_message).c |= 0x20000;
            }
            if((iczo0.c & 0x40000) != 0) {
                long v34 = iczo0.al - iczo1.al;
                if(v34 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x40000;
                    ((iczo)iczn0.b_message).al = v34;
                }
            }
            if((iczo0.c & 0x80000) != 0) {
                long v35 = iczo0.am - iczo1.am;
                if(v35 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x80000;
                    ((iczo)iczn0.b_message).am = v35;
                }
            }
            if((iczo0.c & 0x100000) != 0) {
                long v36 = iczo0.an - iczo1.an;
                if(v36 != 0L) {
                    if(!iczn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)iczn0).ensureMutable();
                    }
                    ((iczo)iczn0.b_message).c |= 0x100000;
                    ((iczo)iczn0.b_message).an = v36;
                }
            }
            iczo0 = (iczo)((ProtoLiteBuilder)iczn0).N_build();
            return fosl.l(iczo0) ? null : iczo0;
        }
        return iczo0;
    }

    static boolean i(iczi iczi0) {
        return iczi0 == null ? true : iczi0.c.size() == 0 && iczi0.d.size() == 0;
    }

    static boolean j(iczk iczk0) {
        return iczk0 == null ? true : Long.compare(iczk0.c, 0L) <= 0 && iczk0.d <= 0L && iczk0.e <= 0L && iczk0.f <= 0L && iczk0.g <= 0L && iczk0.h <= 0L;
    }

    static boolean k(iczl iczl0) {
        return iczl0 == null ? true : Long.compare(iczl0.c, 0L) <= 0 && ((long)iczl0.d) <= 0L;
    }

    static boolean l(iczo iczo0) {
        return iczo0 == null ? true : Long.compare(iczo0.d, 0L) <= 0 && iczo0.e <= 0L && iczo0.f <= 0L && iczo0.g <= 0L && iczo0.h.size() == 0 && iczo0.i.size() == 0 && iczo0.j.size() == 0 && iczo0.k.size() == 0 && iczo0.l.size() == 0 && iczo0.m.size() == 0 && iczo0.o.size() == 0 && iczo0.p.size() == 0 && iczo0.q.size() == 0 && iczo0.r.size() == 0 && iczo0.s <= 0L && iczo0.t <= 0L && iczo0.u <= 0L && iczo0.v <= 0L && iczo0.w <= 0L && iczo0.x <= 0L && iczo0.y <= 0L && iczo0.z <= 0L && iczo0.A <= 0L && iczo0.B <= 0L && iczo0.C <= 0L && iczo0.D <= 0L && iczo0.E <= 0L && iczo0.F <= 0L && iczo0.H <= 0L && iczo0.V <= 0L && iczo0.W <= 0L && iczo0.X <= 0L && iczo0.Y <= 0L && iczo0.Z <= 0L && iczo0.aa <= 0L && iczo0.ab <= 0L && iczo0.ac <= 0L && iczo0.ad <= 0L && iczo0.ae <= 0L && iczo0.af <= 0L && iczo0.ag <= 0L && iczo0.ah <= 0L && iczo0.ai <= 0L && iczo0.aj <= 0L && iczo0.al <= 0L && iczo0.am <= 0L && iczo0.an <= 0L;
    }
}

