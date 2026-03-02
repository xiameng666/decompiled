public final class dxtg {
    public static final int a;
    private static final gged_interceptors b;
    private static final gged_interceptors c;

    static {
        Long long0 = (long)10000000L;
        Long long1 = (long)20000000L;
        Long long2 = (long)30000000L;
        Long long3 = (long)40000000L;
        Long long4 = (long)50000000L;
        dxtg.b = gged_interceptors.p(long0, long1, long2, long3, long4);
        dxtg.c = gged_interceptors.r(long0, Long.valueOf(15000000L), long1, Long.valueOf(25000000L), long2, long3, long4);
    }

    public static ftei a(fsyk fsyk0, gtsq gtsq0, hkua hkua0, gfsx gfsx0) {
        gfsx gfsx1;
        gtkg gtkg0 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtkb gtkb0 = gtkg0.v == null ? gtkb.b : gtkg0.v;
        gtsx gtsx0 = gtkg0.h == null ? gtsx.a : gtkg0.h;
        ftei ftei0 = dxtg.b(gtsq0, hkua0, gfsx0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ftei0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ftei0));
        long v = dxtg.p(fsyk0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei1 = (ftei)hftp0.b_message;
        ftei1.b |= 0x800;
        ftei1.n = v;
        long v1 = gtkg0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ftei)hftv0).b |= 16;
        ((ftei)hftv0).g = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ftei)hftv1).b |= 0x100;
        ((ftei)hftv1).k = true;
        long v2 = gtsq0.p;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((ftei)hftv2).b |= 0x20;
        ((ftei)hftv2).h = v2;
        gtlq gtlq0 = gtlq.b(gtsq0.t) == null ? gtlq.f : gtlq.b(gtsq0.t);
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei2 = (ftei)hftp0.b_message;
        ftei2.u = gtlq0.a();
        ftei2.b |= 0x80000;
        gtps gtps0 = gtps.b(gtsx0.l) == null ? gtps.i : gtps.b(gtsx0.l);
        int v3 = ftqn.a(gtps.class, gtps0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei3 = (ftei)hftp0.b_message;
        ftei3.b |= 0x400;
        ftei3.m = v3;
        hkua hkua1 = hkua.b;
        if(hkua0.equals(hkua1)) {
            switch((gtlq.b(gtkb0.c) == null ? gtlq.f : gtlq.b(gtkb0.c)).ordinal()) {
                case 1: {
                    for(Object object0: gtsx0.f) {
                        gttd gttd0 = (gttd)object0;
                        if((hkua.b(gttd0.q) == null ? hkua.h : hkua.b(gttd0.q)) != hkua1) {
                            continue;
                        }
                        gfsx1 = gfsx.m(Long.valueOf(gttd0.c));
                        goto label_63;
                    }
                    for(Object object1: gtsx0.e) {
                        gttd gttd1 = ((gtqa)object1).d;
                        if(gttd1 == null) {
                            gttd1 = gttd.a;
                        }
                        if((hkua.b(gttd1.q) == null ? hkua.h : hkua.b(gttd1.q)) != hkua1) {
                            continue;
                        }
                        gfsx1 = gfsx.m(Long.valueOf(gttd1.c));
                        goto label_63;
                    }
                    gfsx1 = gfqx.a;
                label_63:
                    if(gfsx1.i()) {
                        long v4 = (long)(((Long)gfsx1.d()));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ftei ftei4 = (ftei)hftp0.b_message;
                        ftei4.b |= 2;
                        ftei4.d = v4;
                        return (ftei)hftp0.N_build();
                    }
                    break;
                }
                case 2: {
                    gfsx gfsx2 = gfqx.a;
                    gfsx gfsx3 = dqjj.u(fsyk0, gfsx2);
                    if(gfsx3.i()) {
                        String s = ((ftji)gfsx3.d()).c;
                        gfsx gfsx4 = gggq.c((fsyk0.e == null ? gtkg.a : fsyk0.e).A, new dqix(s));
                        if(gfsx4.i()) {
                            gfsx2 = gfsx.m(Long.valueOf(((gtkc)gfsx4.d()).c));
                        }
                    }
                    if(gfsx2.i()) {
                        long v5 = (long)(((Long)gfsx2.d()));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ftei ftei5 = (ftei)hftp0.b_message;
                        ftei5.b |= 4;
                        ftei5.e = v5;
                        return (ftei)hftp0.N_build();
                    }
                    break;
                }
                default: {
                    return (ftei)hftp0.N_build();
                }
            }
        }
        return (ftei)hftp0.N_build();
    }

    public static ftei b(gtsq gtsq0, hkua hkua0, gfsx gfsx0) {
        ProtoLiteBuilder hftp0 = dxtg.s((gtsq0.c == null ? hkug.a : gtsq0.c));
        String s = gtsq0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei0 = (ftei)hftp0.b_message;
        s.getClass();
        ftei0.b |= 0x1000;
        ftei0.o = s;
        String s1 = gtsq0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((ftei)hftv0).b |= 0x2000;
        ((ftei)hftv0).p = s1;
        String s2 = gtsq0.g;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei1 = (ftei)hftp0.b_message;
        s2.getClass();
        ftei1.b |= 0x4000;
        ftei1.q = s2;
        String s3 = (String)gfsx0.f("");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei2 = (ftei)hftp0.b_message;
        ftei2.b |= 0x8000;
        ftei2.r = s3;
        boolean z = hkua0.equals(hkua.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ftei)hftv1).b |= 0x200;
        ((ftei)hftv1).l = z;
        gtlq gtlq0 = gtlq.b(gtsq0.t) == null ? gtlq.f : gtlq.b(gtsq0.t);
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei3 = (ftei)hftp0.b_message;
        ftei3.u = gtlq0.a();
        ftei3.b |= 0x80000;
        long v = gtsq0.p;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei4 = (ftei)hftp0.b_message;
        ftei4.b |= 0x20;
        ftei4.h = v;
        return (ftei)hftp0.N_build();
    }

    public static ftej c(fsyk fsyk0, gtum gtum0, gtlg gtlg0) {
        ftea ftea0 = dxtg.q(fsyk0, gtlg0);
        if(dxtg.j(gtum0)) {
            long v = (gtum0.e == null ? gtui.a : gtum0.e).c;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej0 = (ftej)ftea0.b_message;
            ftej0.b |= 2;
            ftej0.d = v;
            long v1 = (gtum0.d == null ? gtlg.a : gtum0.d).b;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej1 = (ftej)ftea0.b_message;
            ftej1.b |= 0x40;
            ftej1.j = v1;
            gtui gtui0 = gtum0.e == null ? gtui.a : gtum0.e;
            long v2 = (gtui0.d == null ? gtlg.a : gtui0.d).b;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej2 = (ftej)ftea0.b_message;
            ftej2.b |= 4;
            ftej2.e = v2;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fteh.a).v_newBuilder();
            boolean z = gtul.a(gtum0.g) == 3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fteh fteh0 = (fteh)hftp0.b_message;
            fteh0.b |= 1;
            fteh0.c = z;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej3 = (ftej)ftea0.b_message;
            fteh fteh1 = (fteh)hftp0.N_build();
            fteh1.getClass();
            ftej3.m = fteh1;
            ftej3.b |= 0x200;
        }
        return (ftej)((ProtoLiteBuilder)ftea0).N_build();
    }

    public static ftej d(fsyk fsyk0, gtum gtum0, gtlg gtlg0) {
        ftea ftea0 = dxtg.q(fsyk0, gtlg0);
        if(dxtg.m(gtum0)) {
            long v = (gtum0.d == null ? gtlg.a : gtum0.d).b;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej0 = (ftej)ftea0.b_message;
            ftej0.b |= 0x40;
            ftej0.j = v;
        }
        return (ftej)((ProtoLiteBuilder)ftea0).N_build();
    }

    public static ftej e(gtsq gtsq0, ftei ftei0, fton fton0, String s, String s1) {
        if(!hwue.e()) {
            hkug hkug0 = gtsq0.c == null ? hkug.a : gtsq0.c;
            if((hkue.b(hkug0.b) == null ? hkue.A : hkue.b(hkug0.b)).equals(hkue.d) && !hwgq.h()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fteb.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((fteb)hftv0).b |= 2;
                ((fteb)hftv0).d = 10000000L;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fteb fteb0 = (fteb)hftp0.b_message;
                fteb0.b |= 1;
                fteb0.c = 50000000L;
                fteb fteb1 = (fteb)hftp0.N_build();
                ftea ftea0 = (ftea)((ProtoLiteMessage)ftej.a).v_newBuilder();
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej0 = (ftej)ftea0.b_message;
                ftej0.b |= 1;
                ftej0.c = 5;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej1 = (ftej)ftea0.b_message;
                ftej1.b |= 4;
                ftej1.e = 10000000L;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej2 = (ftej)ftea0.b_message;
                ftej2.b |= 16;
                ftej2.g = "AUD";
                long v = ftei0.n;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej3 = (ftej)ftea0.b_message;
                ftej3.b |= 8;
                ftej3.f = v;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej4 = (ftej)ftea0.b_message;
                ftej4.b |= 0x20;
                ftej4.h = true;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ((ftej)ftea0.b_message).n = 2;
                ((ftej)ftea0.b_message).b |= 0x400;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej5 = (ftej)ftea0.b_message;
                ftei0.getClass();
                ftej5.o = ftei0;
                ftej5.b |= 0x800;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej6 = (ftej)ftea0.b_message;
                fton0.getClass();
                ftej6.u = fton0;
                ftej6.b |= 0x80000;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej7 = (ftej)ftea0.b_message;
                fteb1.getClass();
                ftej7.p = fteb1;
                ftej7.b |= 0x1000;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej8 = (ftej)ftea0.b_message;
                s1.getClass();
                ftej8.b |= 0x4000;
                ftej8.r = s1;
                if(!ftea0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea0).ensureMutable();
                }
                ftej ftej9 = (ftej)ftea0.b_message;
                s.getClass();
                ftej9.b |= 0x80;
                ftej9.l = s;
                return (ftej)((ProtoLiteBuilder)ftea0).N_build();
            }
        }
        gtsl gtsl0 = gtsq0.s == null ? gtsl.a : gtsq0.s;
        ftea ftea1 = (ftea)((ProtoLiteMessage)ftej.a).v_newBuilder();
        int v1 = gtsl0.c;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej10 = (ftej)ftea1.b_message;
        ftej10.b |= 1;
        ftej10.c = v1;
        String s2 = gtsl0.e;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej11 = (ftej)ftea1.b_message;
        s2.getClass();
        ftej11.b |= 16;
        ftej11.g = s2;
        long v2 = ftei0.n;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej12 = (ftej)ftea1.b_message;
        ftej12.b |= 8;
        ftej12.f = v2;
        long v3 = gtsl0.d;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej13 = (ftej)ftea1.b_message;
        ftej13.b |= 4;
        ftej13.e = v3;
        int v4 = fted.a(gtsl0.i);
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej14 = (ftej)ftea1.b_message;
        if(v4 == 0) {
            throw null;
        }
        ftej14.n = v4 - 1;
        ftej14.b |= 0x400;
        String s3 = gtsl0.h;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej15 = (ftej)ftea1.b_message;
        s3.getClass();
        ftej15.b |= 0x80;
        ftej15.l = s3;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej16 = (ftej)ftea1.b_message;
        ftei0.getClass();
        ftej16.o = ftei0;
        ftej16.b |= 0x800;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej17 = (ftej)ftea1.b_message;
        fton0.getClass();
        ftej17.u = fton0;
        ftej17.b |= 0x80000;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej18 = (ftej)ftea1.b_message;
        s1.getClass();
        ftej18.b |= 0x4000;
        ftej18.r = s1;
        gtsi gtsi0 = gtsl0.f == null ? gtsi.a : gtsl0.f;
        if(hwue.e()) {
            if((gtsl0.b & 2) != 0) {
                ftea1.k((gtsl0.g == null ? gtsj.a : gtsl0.g).b);
            }
            if((gtsl0.b & 1) != 0) {
                if(!ftea1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea1).ensureMutable();
                }
                ftej ftej19 = (ftej)ftea1.b_message;
                ftej19.b |= 0x20;
                ftej19.h = true;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fteb.a).v_newBuilder();
                long v5 = gtsi0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((fteb)hftv1).b |= 2;
                ((fteb)hftv1).d = v5;
                long v6 = gtsi0.b;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fteb fteb2 = (fteb)hftp1.b_message;
                fteb2.b |= 1;
                fteb2.c = v6;
                if(!ftea1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)ftea1).ensureMutable();
                }
                ftej ftej20 = (ftej)ftea1.b_message;
                fteb fteb3 = (fteb)hftp1.N_build();
                fteb3.getClass();
                ftej20.p = fteb3;
                ftej20.b |= 0x1000;
            }
            return (ftej)((ProtoLiteBuilder)ftea1).N_build();
        }
        if((gtsl0.b & 2) != 0) {
            gtsj gtsj0 = gtsl0.g == null ? gtsj.a : gtsl0.g;
            if(!ftea1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea1).ensureMutable();
            }
            ftej ftej21 = (ftej)ftea1.b_message;
            ftej21.b |= 0x20;
            ftej21.h = false;
            ftea1.k(gtsj0.b);
            return (ftej)((ProtoLiteBuilder)ftea1).N_build();
        }
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej22 = (ftej)ftea1.b_message;
        ftej22.b |= 0x20;
        ftej22.h = true;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fteb.a).v_newBuilder();
        long v7 = gtsi0.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((fteb)hftv2).b |= 2;
        ((fteb)hftv2).d = v7;
        long v8 = gtsi0.b;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        fteb fteb4 = (fteb)hftp2.b_message;
        fteb4.b |= 1;
        fteb4.c = v8;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej23 = (ftej)ftea1.b_message;
        fteb fteb5 = (fteb)hftp2.N_build();
        fteb5.getClass();
        ftej23.p = fteb5;
        ftej23.b |= 0x1000;
        return (ftej)((ProtoLiteBuilder)ftea1).N_build();
    }

    public static ftej f(ftei ftei0, fton fton0) {
        ftea ftea0 = (ftea)((ProtoLiteMessage)ftej.a).v_newBuilder();
        if(!ftea0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea0).ensureMutable();
        }
        ftej ftej0 = (ftej)ftea0.b_message;
        ftei0.getClass();
        ftej0.o = ftei0;
        ftej0.b |= 0x800;
        if(!ftea0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea0).ensureMutable();
        }
        ftej ftej1 = (ftej)ftea0.b_message;
        fton0.getClass();
        ftej1.u = fton0;
        ftej1.b |= 0x80000;
        return (ftej)((ProtoLiteBuilder)ftea0).N_build();
    }

    public static ftem g(gtsq gtsq0, ftei ftei0, fton fton0, String s) {
        gtsl gtsl0 = gtsq0.s == null ? gtsl.a : gtsq0.s;
        ProtoLiteBuilder hftp0 = dxtg.o(gtsl0.c, ftei0, fton0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtlg.a).v_newBuilder();
        String s1 = gtsl0.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtlg gtlg0 = (gtlg)hftp1.b_message;
        s1.getClass();
        gtlg0.c = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftem ftem0 = (ftem)hftp0.b_message;
        gtlg gtlg1 = (gtlg)hftp1.N_build();
        gtlg1.getClass();
        ftem0.j = gtlg1;
        ftem0.b |= 0x80;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtrc.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtrc gtrc0 = (gtrc)hftp2.b_message;
        s.getClass();
        gtrc0.b = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftem ftem1 = (ftem)hftp0.b_message;
        gtrc gtrc1 = (gtrc)hftp2.N_build();
        gtrc1.getClass();
        ftem1.t = gtrc1;
        ftem1.b |= 0x20000;
        long v = gtsl0.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftem ftem2 = (ftem)hftp0.b_message;
        ftem2.b |= 4;
        ftem2.e = v;
        return (ftem)hftp0.N_build();
    }

    public static gtla h(int v) {
        gtla gtla0 = gtla.b(v);
        return gtla0 == null ? gtla.a : gtla0;
    }

    public static void i(xob xob0, Runnable runnable0) {
        if(xob0 != null && !xob0.isFinishing()) {
            runnable0.run();
        }
    }

    public static boolean j(gtum gtum0) {
        return gtum0 != null && gtuk.b(gtum0.c) == 4;
    }

    public static boolean k(gtlg gtlg0, gtum gtum0) {
        return gtlg0.b >= (gtum0.d == null ? gtlg.a : gtum0.d).b;
    }

    public static boolean l(gtkc gtkc0) {
        gtum gtum0 = gtkc0.h == null ? gtum.a : gtkc0.h;
        return dxtg.j(gtum0) || dxtg.m(gtum0);
    }

    public static boolean m(gtum gtum0) {
        return gtum0 != null && gtuk.b(gtum0.c) == 3;
    }

    public static boolean n(gtqa gtqa0) {
        gttd gttd0 = gtqa0.d == null ? gttd.a : gtqa0.d;
        gtum gtum0 = gttd0.t == null ? gtum.a : gttd0.t;
        return (hkua.b(gttd0.q) == null ? hkua.h : hkua.b(gttd0.q)).equals(hkua.b) && gtpz.a(gtqa0.g) == 3 && (gtum0.b & 1) != 0 && gtuk.b(gtum0.c) != 2;
    }

    public static ProtoLiteBuilder o(int v, ftei ftei0, fton fton0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftem.a).v_newBuilder();
        long v1 = ftei0.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ftem)hftv0).b |= 0x4000;
        ((ftem)hftv0).q = v1;
        long v2 = ftei0.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ftem)hftv1).b |= 8;
        ((ftem)hftv1).f = v2;
        long v3 = ftei0.e;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((ftem)hftv2).b |= 16;
        ((ftem)hftv2).g = v3;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((ftem)hftv3).b |= 1;
        ((ftem)hftv3).c = v;
        String s = ftei0.q;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        s.getClass();
        ((ftem)hftv4).b |= 0x200000;
        ((ftem)hftv4).x = s;
        long v4 = ftei0.g;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((ftem)hftv5).b |= 0x2000;
        ((ftem)hftv5).p = v4;
        String s1 = ftei0.o;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        s1.getClass();
        ((ftem)hftv6).b |= 0x80000;
        ((ftem)hftv6).v = s1;
        int v5 = ftei0.m;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        ((ftem)hftv7).b |= 0x40000;
        ((ftem)hftv7).u = v5;
        String s2 = ftei0.c;
        if(!hftv7.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp0.b_message;
        s2.getClass();
        ((ftem)hftv8).b |= 0x20;
        ((ftem)hftv8).h = s2;
        boolean z = ftei0.k;
        if(!hftv8.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv9 = hftp0.b_message;
        ((ftem)hftv9).b |= 0x10000;
        ((ftem)hftv9).s = z;
        String s3 = ftei0.p;
        if(!hftv9.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv10 = hftp0.b_message;
        s3.getClass();
        ((ftem)hftv10).b |= 0x100000;
        ((ftem)hftv10).w = s3;
        String s4 = ftei0.r;
        if(!hftv10.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp0.b_message;
        s4.getClass();
        ((ftem)hftv11).b |= 0x400000;
        ((ftem)hftv11).y = s4;
        if(!hftv11.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftem ftem0 = (ftem)hftp0.b_message;
        fton0.getClass();
        ftem0.z = fton0;
        ftem0.b |= 0x800000;
        hkug hkug0 = dqjj.G(ftei0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv12 = hftp0.b_message;
        hkug0.getClass();
        ((ftem)hftv12).r = hkug0;
        ((ftem)hftv12).b |= 0x8000;
        gtlq gtlq0 = gtlq.b(ftei0.u) == null ? gtlq.a : gtlq.b(ftei0.u);
        if(!hftv12.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftem ftem1 = (ftem)hftp0.b_message;
        ftem1.B = gtlq0.a();
        ftem1.b |= 0x2000000;
        if((ftei0.b & 8) != 0) {
            gfnh gfnh0 = ftei0.f == null ? gfnh.a : ftei0.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftem ftem2 = (ftem)hftp0.b_message;
            gfnh0.getClass();
            ftem2.i = gfnh0;
            ftem2.b |= 0x40;
        }
        return hftp0;
    }

    private static long p(fsyk fsyk0) {
        return ((gtlg)dqjj.o(fsyk0).f(gtlg.a)).b;
    }

    private static ftea q(fsyk fsyk0, gtlg gtlg0) {
        gtkg gtkg0 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtkb gtkb0 = gtkg0.v == null ? gtkb.b : gtkg0.v;
        if((gtlq.b(gtkb0.c) == null ? gtlq.f : gtlq.b(gtkb0.c)).equals(gtlq.b) && !hwgq.h()) {
            gtkg gtkg1 = fsyk0.e == null ? gtkg.a : fsyk0.e;
            String s = (gtkg1.h == null ? gtsx.a : gtkg1.h).g;
            ftea ftea0 = (ftea)((ProtoLiteMessage)ftej.a).v_newBuilder();
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej0 = (ftej)ftea0.b_message;
            ftej0.b |= 1;
            ftej0.c = 5;
            ftei ftei0 = dxtg.r(fsyk0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ftei0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ftei0));
            long v = gtlg0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftei ftei1 = (ftei)hftp0.b_message;
            ftei1.b |= 0x800;
            ftei1.n = v;
            ftei ftei2 = (ftei)hftp0.N_build();
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej1 = (ftej)ftea0.b_message;
            ftei2.getClass();
            ftej1.o = ftei2;
            ftej1.b |= 0x800;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ((ftej)ftea0.b_message).n = 2;
            ((ftej)ftea0.b_message).b |= 0x400;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej2 = (ftej)ftea0.b_message;
            s.getClass();
            ftej2.b |= 0x80;
            ftej2.l = s;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej3 = (ftej)ftea0.b_message;
            ftej3.b |= 0x20;
            ftej3.h = false;
            String s1 = gtlg0.c;
            if(!ftea0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ftea0).ensureMutable();
            }
            ftej ftej4 = (ftej)ftea0.b_message;
            s1.getClass();
            ftej4.b |= 16;
            ftej4.g = s1;
            ftea0.a(dxtg.b);
            ftea0.k(dxtg.c);
            return ftea0;
        }
        gtkg gtkg2 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtsl gtsl0 = gtkg2.B == null ? gtsl.a : gtkg2.B;
        ftea ftea1 = (ftea)((ProtoLiteMessage)ftej.a).v_newBuilder();
        int v1 = gtsl0.c;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej5 = (ftej)ftea1.b_message;
        ftej5.b |= 1;
        ftej5.c = v1;
        int v2 = fted.a(gtsl0.i);
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej6 = (ftej)ftea1.b_message;
        if(v2 == 0) {
            throw null;
        }
        ftej6.n = v2 - 1;
        ftej6.b |= 0x400;
        String s2 = gtsl0.h;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej7 = (ftej)ftea1.b_message;
        s2.getClass();
        ftej7.b |= 0x80;
        ftej7.l = s2;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej8 = (ftej)ftea1.b_message;
        ftej8.b |= 0x20;
        ftej8.h = false;
        String s3 = gtsl0.e;
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej9 = (ftej)ftea1.b_message;
        s3.getClass();
        ftej9.b |= 16;
        ftej9.g = s3;
        ftei ftei3 = dxtg.r(fsyk0);
        if(!ftea1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ftea1).ensureMutable();
        }
        ftej ftej10 = (ftej)ftea1.b_message;
        ftei3.getClass();
        ftej10.o = ftei3;
        ftej10.b |= 0x800;
        if(hwgq.f() && (gtsl0.k == null ? gtsk.a : gtsl0.k).c.size() > 0) {
            ftea1.a((gtsl0.k == null ? gtsk.a : gtsl0.k).c);
        }
        else {
            ftea1.a(dxtg.b);
        }
        if(hwgq.f() && (gtsl0.k == null ? gtsk.a : gtsl0.k).b.size() > 0) {
            ftea1.k((gtsl0.k == null ? gtsk.a : gtsl0.k).b);
            return ftea1;
        }
        if((gtsl0.g == null ? gtsj.a : gtsl0.g).b.size() > 0) {
            ftea1.k((gtsl0.g == null ? gtsj.a : gtsl0.g).b);
            return ftea1;
        }
        ftea1.k(dxtg.c);
        return ftea1;
    }

    private static ftei r(fsyk fsyk0) {
        gtkg gtkg0 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtsl gtsl0 = gtkg0.B == null ? gtsl.a : gtkg0.B;
        ProtoLiteBuilder hftp0 = dxtg.s((gtsl0.j == null ? hkug.a : gtsl0.j));
        long v = dxtg.p(fsyk0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei0 = (ftei)hftp0.b_message;
        ftei0.b |= 0x800;
        ftei0.n = v;
        String s = gtsl0.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((ftei)hftv0).b |= 0x4000;
        ((ftei)hftv0).q = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei1 = (ftei)hftp0.b_message;
        ftei1.b |= 0x200;
        ftei1.l = true;
        gtkg gtkg1 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtkb gtkb0 = gtkg1.v == null ? gtkb.b : gtkg1.v;
        gtlq gtlq0 = gtlq.b(gtkb0.c) == null ? gtlq.f : gtlq.b(gtkb0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei2 = (ftei)hftp0.b_message;
        ftei2.u = gtlq0.a();
        ftei2.b |= 0x80000;
        long v1 = (fsyk0.e == null ? gtkg.a : fsyk0.e).G;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei3 = (ftei)hftp0.b_message;
        ftei3.b |= 0x20;
        ftei3.h = v1;
        return (ftei)hftp0.N_build();
    }

    private static ProtoLiteBuilder s(hkug hkug0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftei.a).v_newBuilder();
        hkue hkue0 = hkue.b(hkug0.b) == null ? hkue.A : hkue.b(hkug0.b);
        int v = ftqn.a(hkue.class, hkue0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei0 = (ftei)hftp0.b_message;
        ftei0.b |= 0x80;
        ftei0.j = v;
        hkui hkui0 = hkui.b(hkug0.c) == null ? hkui.w : hkui.b(hkug0.c);
        int v1 = ftqn.a(hkui.class, hkui0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ftei)hftv0).b |= 0x40;
        ((ftei)hftv0).i = v1;
        long v2 = hkug0.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ftei)hftv1).b |= 0x10000;
        ((ftei)hftv1).s = v2;
        long v3 = hkug0.e;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftei ftei1 = (ftei)hftp0.b_message;
        ftei1.b |= 0x20000;
        ftei1.t = v3;
        return hftp0;
    }
}

