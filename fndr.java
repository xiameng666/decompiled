import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class fndr implements rpw {
    private static final ggsf a;
    private final cmec b;

    static {
        fndr.a = ggsf.b("fndr");
    }

    public fndr(cmec cmec0, rng rng0) {
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(rng0, "onboardingFlagsProvider");
        super();
        this.b = cmec0;
    }

    @Override  // rpw
    public final void a(rpu rpu0) {
        gkda gkda0 = null;
        if(!rng.c()) {
            return;
        }
        if((rpu0 instanceof rpj)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkda.a).v_newBuilder();
            ibuq.e(hftp0, "newBuilder(...)");
            if((((rpj)rpu0) instanceof ros)) {
                goto label_393;
            }
            if((((rpj)rpu0) instanceof rou)) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkcd.a).v_newBuilder();
                long v = ((rou)(((rpj)rpu0))).a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gkcd)hftv0).b |= 1;
                ((gkcd)hftv0).c = v;
                long v1 = ((rou)(((rpj)rpu0))).b;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkcd gkcd0 = (gkcd)hftp1.b_message;
                gkcd0.b |= 2;
                gkcd0.d = v1;
                String s = ((rpj)rpu0).fb();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkcd gkcd1 = (gkcd)hftp1.b_message;
                s.getClass();
                gkcd1.b |= 4;
                gkcd1.e = s;
                String s1 = ((rpj)rpu0).fa();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkcd gkcd2 = (gkcd)hftp1.b_message;
                s1.getClass();
                gkcd2.b |= 16;
                gkcd2.g = s1;
                hfwn hfwn0 = hfyo.b(((rou)(((rpj)rpu0))).d);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkcd gkcd3 = (gkcd)hftp1.b_message;
                hfwn0.getClass();
                gkcd3.f = hfwn0;
                gkcd3.b |= 8;
                gkcd gkcd4 = (gkcd)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkda gkda1 = (gkda)hftp0.b_message;
                gkcd4.getClass();
                gkda1.c = gkcd4;
                gkda1.b = 2;
            }
            else if((((rpj)rpu0) instanceof rph)) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkcn.a).v_newBuilder();
                long v2 = ((rph)(((rpj)rpu0))).a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkcn gkcn0 = (gkcn)hftp2.b_message;
                gkcn0.b |= 1;
                gkcn0.c = v2;
                String s2 = ((rpj)rpu0).fb();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkcn gkcn1 = (gkcn)hftp2.b_message;
                s2.getClass();
                gkcn1.b |= 2;
                gkcn1.d = s2;
                String s3 = ((rpj)rpu0).fa();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkcn gkcn2 = (gkcn)hftp2.b_message;
                s3.getClass();
                gkcn2.b |= 8;
                gkcn2.f = s3;
                hfwn hfwn1 = hfyo.b(((rph)(((rpj)rpu0))).b);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkcn gkcn3 = (gkcn)hftp2.b_message;
                hfwn1.getClass();
                gkcn3.e = hfwn1;
                gkcn3.b |= 4;
                gkcn gkcn4 = (gkcn)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkda gkda2 = (gkda)hftp0.b_message;
                gkcn4.getClass();
                gkda2.c = gkcn4;
                gkda2.b = 3;
            }
            else if((((rpj)rpu0) instanceof roy)) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkch.a).v_newBuilder();
                long v3 = ((roy)(((rpj)rpu0))).a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gkch gkch0 = (gkch)hftp3.b_message;
                gkch0.b |= 1;
                gkch0.c = v3;
                String s4 = ((rpj)rpu0).fb();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gkch gkch1 = (gkch)hftp3.b_message;
                s4.getClass();
                gkch1.b |= 2;
                gkch1.d = s4;
                String s5 = ((rpj)rpu0).fa();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gkch gkch2 = (gkch)hftp3.b_message;
                s5.getClass();
                gkch2.b |= 8;
                gkch2.f = s5;
                hfwn hfwn2 = hfyo.b(((roy)(((rpj)rpu0))).b);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gkch gkch3 = (gkch)hftp3.b_message;
                hfwn2.getClass();
                gkch3.e = hfwn2;
                gkch3.b |= 4;
                gkch gkch4 = (gkch)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkda gkda3 = (gkda)hftp0.b_message;
                gkch4.getClass();
                gkda3.c = gkch4;
                gkda3.b = 4;
            }
            else if((((rpj)rpu0) instanceof row)) {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gkcf.a).v_newBuilder();
                long v4 = ((row)(((rpj)rpu0))).a;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gkcf gkcf0 = (gkcf)hftp4.b_message;
                gkcf0.b |= 1;
                gkcf0.c = v4;
                String s6 = ((rpj)rpu0).fb();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gkcf gkcf1 = (gkcf)hftp4.b_message;
                s6.getClass();
                gkcf1.b |= 2;
                gkcf1.d = s6;
                String s7 = ((rpj)rpu0).fa();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gkcf gkcf2 = (gkcf)hftp4.b_message;
                s7.getClass();
                gkcf2.b |= 8;
                gkcf2.f = s7;
                hfwn hfwn3 = hfyo.b(((row)(((rpj)rpu0))).b);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gkcf gkcf3 = (gkcf)hftp4.b_message;
                hfwn3.getClass();
                gkcf3.e = hfwn3;
                gkcf3.b |= 4;
                gkcf gkcf4 = (gkcf)hftp4.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkda gkda4 = (gkda)hftp0.b_message;
                gkcf4.getClass();
                gkda4.c = gkcf4;
                gkda4.b = 5;
            }
            else if((((rpj)rpu0) instanceof ror)) {
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gkcb.a).v_newBuilder();
                long v5 = ((ror)(((rpj)rpu0))).a;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gkcb gkcb0 = (gkcb)hftp5.b_message;
                gkcb0.b |= 1;
                gkcb0.c = v5;
                String s8 = ((rpj)rpu0).fb();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gkcb gkcb1 = (gkcb)hftp5.b_message;
                s8.getClass();
                gkcb1.b |= 2;
                gkcb1.d = s8;
                String s9 = ((rpj)rpu0).fa();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gkcb gkcb2 = (gkcb)hftp5.b_message;
                s9.getClass();
                gkcb2.b |= 8;
                gkcb2.f = s9;
                hfwn hfwn4 = hfyo.b(((ror)(((rpj)rpu0))).b);
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gkcb gkcb3 = (gkcb)hftp5.b_message;
                hfwn4.getClass();
                gkcb3.e = hfwn4;
                gkcb3.b |= 4;
                gkcb gkcb4 = (gkcb)hftp5.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkda gkda5 = (gkda)hftp0.b_message;
                gkcb4.getClass();
                gkda5.c = gkcb4;
                gkda5.b = 6;
            }
            else {
                if((((rpj)rpu0) instanceof rpe)) {
                    goto label_390;
                }
                if((((rpj)rpu0) instanceof rox)) {
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gkcg.a).v_newBuilder();
                    long v6 = ((rox)(((rpj)rpu0))).a;
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gkcg gkcg0 = (gkcg)hftp6.b_message;
                    gkcg0.b |= 1;
                    gkcg0.c = v6;
                    hfwn hfwn5 = hfyo.b(((rox)(((rpj)rpu0))).b);
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gkcg gkcg1 = (gkcg)hftp6.b_message;
                    hfwn5.getClass();
                    gkcg1.d = hfwn5;
                    gkcg1.b |= 4;
                    gkcg gkcg2 = (gkcg)hftp6.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkda gkda6 = (gkda)hftp0.b_message;
                    gkcg2.getClass();
                    gkda6.c = gkcg2;
                    gkda6.b = 8;
                }
                else if((((rpj)rpu0) instanceof rpa)) {
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gkcj.a).v_newBuilder();
                    long v7 = ((rpa)(((rpj)rpu0))).a;
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gkcj gkcj0 = (gkcj)hftp7.b_message;
                    gkcj0.b |= 1;
                    gkcj0.c = v7;
                    String s10 = ((rpj)rpu0).fb();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gkcj gkcj1 = (gkcj)hftp7.b_message;
                    s10.getClass();
                    gkcj1.b |= 2;
                    gkcj1.d = s10;
                    String s11 = ((rpj)rpu0).fa();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gkcj gkcj2 = (gkcj)hftp7.b_message;
                    s11.getClass();
                    gkcj2.b |= 8;
                    gkcj2.f = s11;
                    hfwn hfwn6 = hfyo.b(((rpa)(((rpj)rpu0))).b);
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gkcj gkcj3 = (gkcj)hftp7.b_message;
                    hfwn6.getClass();
                    gkcj3.e = hfwn6;
                    gkcj3.b |= 4;
                    gkcj gkcj4 = (gkcj)hftp7.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkda gkda7 = (gkda)hftp0.b_message;
                    gkcj4.getClass();
                    gkda7.c = gkcj4;
                    gkda7.b = 9;
                }
                else if((((rpj)rpu0) instanceof rpg)) {
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gkcm.a).v_newBuilder();
                    long v8 = ((rpg)(((rpj)rpu0))).a;
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp8.b_message;
                    ((gkcm)hftv1).b |= 1;
                    ((gkcm)hftv1).c = v8;
                    long v9 = ((rpg)(((rpj)rpu0))).b;
                    if(!hftv1.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gkcm gkcm0 = (gkcm)hftp8.b_message;
                    gkcm0.b |= 2;
                    gkcm0.d = v9;
                    String s12 = ((rpj)rpu0).fb();
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gkcm gkcm1 = (gkcm)hftp8.b_message;
                    s12.getClass();
                    gkcm1.b |= 4;
                    gkcm1.e = s12;
                    String s13 = ((rpj)rpu0).fa();
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gkcm gkcm2 = (gkcm)hftp8.b_message;
                    s13.getClass();
                    gkcm2.b |= 16;
                    gkcm2.g = s13;
                    hfwn hfwn7 = hfyo.b(((rpg)(((rpj)rpu0))).d);
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gkcm gkcm3 = (gkcm)hftp8.b_message;
                    hfwn7.getClass();
                    gkcm3.f = hfwn7;
                    gkcm3.b |= 8;
                    gkcm gkcm4 = (gkcm)hftp8.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkda gkda8 = (gkda)hftp0.b_message;
                    gkcm4.getClass();
                    gkda8.c = gkcm4;
                    gkda8.b = 10;
                }
                else {
                    if((((rpj)rpu0) instanceof rov)) {
                        goto label_387;
                    }
                    if((((rpj)rpu0) instanceof roz)) {
                        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gkci.a).v_newBuilder();
                        long v10 = ((roz)(((rpj)rpu0))).a;
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gkci gkci0 = (gkci)hftp9.b_message;
                        gkci0.b |= 1;
                        gkci0.c = v10;
                        String s14 = ((rpj)rpu0).fb();
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gkci gkci1 = (gkci)hftp9.b_message;
                        s14.getClass();
                        gkci1.b |= 2;
                        gkci1.d = s14;
                        String s15 = ((rpj)rpu0).fa();
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gkci gkci2 = (gkci)hftp9.b_message;
                        s15.getClass();
                        gkci2.b |= 8;
                        gkci2.f = s15;
                        hfwn hfwn8 = hfyo.b(((roz)(((rpj)rpu0))).b);
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        gkci gkci3 = (gkci)hftp9.b_message;
                        hfwn8.getClass();
                        gkci3.e = hfwn8;
                        gkci3.b |= 4;
                        gkci gkci4 = (gkci)hftp9.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gkda gkda9 = (gkda)hftp0.b_message;
                        gkci4.getClass();
                        gkda9.c = gkci4;
                        gkda9.b = 12;
                    }
                    else if((((rpj)rpu0) instanceof rpd)) {
                        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gkck.a).v_newBuilder();
                        long v11 = ((rpd)(((rpj)rpu0))).a;
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp10.b_message;
                        ((gkck)hftv2).b |= 1;
                        ((gkck)hftv2).c = v11;
                        long v12 = ((rpd)(((rpj)rpu0))).b;
                        if(!hftv2.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        gkck gkck0 = (gkck)hftp10.b_message;
                        gkck0.b |= 2;
                        gkck0.d = v12;
                        String s16 = ((rpj)rpu0).fb();
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        gkck gkck1 = (gkck)hftp10.b_message;
                        s16.getClass();
                        gkck1.b |= 4;
                        gkck1.e = s16;
                        String s17 = ((rpj)rpu0).fa();
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        gkck gkck2 = (gkck)hftp10.b_message;
                        s17.getClass();
                        gkck2.b |= 16;
                        gkck2.g = s17;
                        hfwn hfwn9 = hfyo.b(((rpd)(((rpj)rpu0))).d);
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        gkck gkck3 = (gkck)hftp10.b_message;
                        hfwn9.getClass();
                        gkck3.f = hfwn9;
                        gkck3.b |= 8;
                        gkck gkck4 = (gkck)hftp10.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gkda gkda10 = (gkda)hftp0.b_message;
                        gkck4.getClass();
                        gkda10.c = gkck4;
                        gkda10.b = 13;
                    }
                    else {
                        hftp0 = null;
                    }
                }
            }
            if(hftp0 != null) {
                gkda0 = (gkda)hftp0.N_build();
                goto label_626;
            label_387:
                ((ProtoLiteMessage)gkce.a).v_newBuilder();
                rov rov0 = (rov)(((rpj)rpu0));
                throw null;
            label_390:
                ((ProtoLiteMessage)gkcl.a).v_newBuilder();
                rpe rpe0 = (rpe)(((rpj)rpu0));
                throw null;
            label_393:
                ((ProtoLiteMessage)gkcc.a).v_newBuilder();
                ros ros0 = (ros)(((rpj)rpu0));
                throw null;
            }
        }
        else if((rpu0 instanceof rpo)) {
            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gkda.a).v_newBuilder();
            ibuq.e(hftp11, "newBuilder(...)");
            if((((rpo)rpu0) instanceof rpq)) {
                ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gkcx.a).v_newBuilder();
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp12.b_message;
                ((gkcx)hftv3).b |= 1;
                ((gkcx)hftv3).c = -1L;
                long v13 = ((rpq)(((rpo)rpu0))).d;
                if(!hftv3.isImmutable()) {
                    hftp12.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp12.b_message;
                ((gkcx)hftv4).b |= 2;
                ((gkcx)hftv4).d = v13;
                String s18 = ((rpq)(((rpo)rpu0))).a;
                if(!hftv4.isImmutable()) {
                    hftp12.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp12.b_message;
                s18.getClass();
                ((gkcx)hftv5).b |= 4;
                ((gkcx)hftv5).e = s18;
                String s19 = ((rpq)(((rpo)rpu0))).b;
                if(!hftv5.isImmutable()) {
                    hftp12.ensureMutable();
                }
                gkcx gkcx0 = (gkcx)hftp12.b_message;
                s19.getClass();
                gkcx0.b |= 16;
                gkcx0.g = s19;
                hfwn hfwn10 = hfyo.b(((rpq)(((rpo)rpu0))).f);
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                gkcx gkcx1 = (gkcx)hftp12.b_message;
                hfwn10.getClass();
                gkcx1.f = hfwn10;
                gkcx1.b |= 8;
                Object object0 = ((rpq)(((rpo)rpu0))).e;
                if((object0 instanceof rnq)) {
                    gkct gkct0 = fndy.a(((rnq)object0).a());
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    gkcx gkcx2 = (gkcx)hftp12.b_message;
                    gkct0.getClass();
                    gkcx2.h = gkct0;
                    gkcx2.b |= 0x20;
                }
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                gkda gkda11 = (gkda)hftp11.b_message;
                gkcx gkcx3 = (gkcx)hftp12.N_build();
                gkcx3.getClass();
                gkda11.c = gkcx3;
                gkda11.b = 14;
                goto label_608;
            }
            else {
                if(!(((rpo)rpu0) instanceof rpn)) {
                    goto label_613;
                }
                scj scj0 = ((rpn)(((rpo)rpu0))).e;
                if((scj0 instanceof sci)) {
                    ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)gkcz.a).v_newBuilder();
                    long v14 = ((rpn)(((rpo)rpu0))).d;
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp13.b_message;
                    ((gkcz)hftv6).b |= 1;
                    ((gkcz)hftv6).c = v14;
                    String s20 = ((rpn)(((rpo)rpu0))).a;
                    if(!hftv6.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp13.b_message;
                    s20.getClass();
                    ((gkcz)hftv7).b |= 2;
                    ((gkcz)hftv7).d = s20;
                    String s21 = ((rpn)(((rpo)rpu0))).b;
                    if(!hftv7.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    gkcz gkcz0 = (gkcz)hftp13.b_message;
                    s21.getClass();
                    gkcz0.b |= 8;
                    gkcz0.f = s21;
                    hfwn hfwn11 = hfyo.b(((rpn)(((rpo)rpu0))).g);
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    gkcz gkcz1 = (gkcz)hftp13.b_message;
                    hfwn11.getClass();
                    gkcz1.e = hfwn11;
                    gkcz1.b |= 4;
                    gkct gkct1 = fndy.a(((rpn)(((rpo)rpu0))).f);
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    gkcz gkcz2 = (gkcz)hftp13.b_message;
                    gkct1.getClass();
                    gkcz2.g = gkct1;
                    gkcz2.b |= 16;
                    Object object1 = ((sci)scj0).a;
                    if((object1 instanceof rnq)) {
                        gkct gkct2 = fndy.a(((rnq)object1).a());
                        if(!hftp13.b_message.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        gkcz gkcz3 = (gkcz)hftp13.b_message;
                        gkct2.getClass();
                        gkcz3.h = gkct2;
                        gkcz3.b |= 0x20;
                    }
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gkda gkda12 = (gkda)hftp11.b_message;
                    gkcz gkcz4 = (gkcz)hftp13.N_build();
                    gkcz4.getClass();
                    gkda12.c = gkcz4;
                    gkda12.b = 15;
                    goto label_608;
                }
                else {
                    if(!(scj0 instanceof sch)) {
                        throw new ibnq();
                    }
                    ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)gkcu.a).v_newBuilder();
                    long v15 = ((rpn)(((rpo)rpu0))).d;
                    if(!hftp14.b_message.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp14.b_message;
                    ((gkcu)hftv8).b |= 1;
                    ((gkcu)hftv8).c = v15;
                    String s22 = ((rpn)(((rpo)rpu0))).a;
                    if(!hftv8.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp14.b_message;
                    s22.getClass();
                    ((gkcu)hftv9).b |= 2;
                    ((gkcu)hftv9).d = s22;
                    String s23 = ((rpn)(((rpo)rpu0))).b;
                    if(!hftv9.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    gkcu gkcu0 = (gkcu)hftp14.b_message;
                    s23.getClass();
                    gkcu0.b |= 8;
                    gkcu0.f = s23;
                    hfwn hfwn12 = hfyo.b(((rpn)(((rpo)rpu0))).g);
                    if(!hftp14.b_message.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    gkcu gkcu1 = (gkcu)hftp14.b_message;
                    hfwn12.getClass();
                    gkcu1.e = hfwn12;
                    gkcu1.b |= 4;
                    gkct gkct3 = fndy.a(((rpn)(((rpo)rpu0))).f);
                    if(!hftp14.b_message.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    gkcu gkcu2 = (gkcu)hftp14.b_message;
                    gkct3.getClass();
                    gkcu2.g = gkct3;
                    gkcu2.b |= 16;
                    ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)gkco.a).v_newBuilder();
                    ibuq.f(hftp15, "builder");
                    String s24 = ((sch)scj0).b.a().a;
                    if(!hftp15.b_message.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    gkco gkco0 = (gkco)hftp15.b_message;
                    gkco0.b |= 1;
                    gkco0.c = s24;
                    if(hoiy.a.d().c()) {
                        Throwable throwable0 = ((sch)scj0).a;
                        if(throwable0 != null) {
                            ProtoLiteBuilder hftp16 = glub.b(throwable0);
                            ibuq.e(hftp16, "encodeThrowable(...)");
                            List list0 = DesugarCollections.unmodifiableList(((glnd)hftp16.b_message).f);
                            ibuq.e(list0, "getCausesList(...)");
                            List list1 = ibpo.ap(list0, (hoiy.b() < 0L ? 0x7FFFFFFF : ((int)hoiy.b())));
                            ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
                            for(Object object2: list1) {
                                hfuo hfuo0 = ((glna)object2).f;
                                ibuq.e(hfuo0, "getStackTraceElementList(...)");
                                List list2 = ibpo.ap(hfuo0, (hoiy.c() < 0L ? 0x7FFFFFFF : ((int)hoiy.c())));
                                ProtoLiteBuilder hftp17 = (ProtoLiteBuilder)((ProtoLiteMessage)(((glna)object2))).jf(5, null);
                                hftp17.X(((ProtoLiteMessage)(((glna)object2))));
                                if(!hftp17.b_message.isImmutable()) {
                                    hftp17.ensureMutable();
                                }
                                ((glna)hftp17.b_message).f = hfvv.a;
                                if(!hftp17.b_message.isImmutable()) {
                                    hftp17.ensureMutable();
                                }
                                glna glna0 = (glna)hftp17.b_message;
                                glna0.b();
                                hfrj.E(list2, glna0.f);
                                arrayList0.add(((glna)hftp17.N_build()));
                            }
                            if(!hftp16.b_message.isImmutable()) {
                                hftp16.ensureMutable();
                            }
                            ((glnd)hftp16.b_message).f = hfvv.a;
                            if(!hftp16.b_message.isImmutable()) {
                                hftp16.ensureMutable();
                            }
                            glnd glnd0 = (glnd)hftp16.b_message;
                            glnd0.b();
                            hfrj.E(arrayList0, glnd0.f);
                            ProtoLiteMessage hftv10 = hftp16.N_build();
                            ibuq.e(hftv10, "build(...)");
                            ibuq.f(((glnd)hftv10), "value");
                            if(!hftp15.b_message.isImmutable()) {
                                hftp15.ensureMutable();
                            }
                            gkco gkco1 = (gkco)hftp15.b_message;
                            ((glnd)hftv10).getClass();
                            gkco1.d = (glnd)hftv10;
                            gkco1.b |= 2;
                        }
                    }
                    ProtoLiteMessage hftv11 = hftp15.N_build();
                    ibuq.e(hftv11, "build(...)");
                    if(!hftp14.b_message.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    gkcu gkcu3 = (gkcu)hftp14.b_message;
                    ((gkco)hftv11).getClass();
                    gkcu3.h = (gkco)hftv11;
                    gkcu3.b |= 0x20;
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gkda gkda13 = (gkda)hftp11.b_message;
                    gkcu gkcu4 = (gkcu)hftp14.N_build();
                    gkcu4.getClass();
                    gkda13.c = gkcu4;
                    gkda13.b = 16;
                label_608:
                    ProtoLiteMessage hftv12 = hftp11.N_build();
                    ibuq.e(hftv12, "build(...)");
                    gkda0 = (gkda)hftv12;
                    goto label_626;
                label_613:
                    if(!(((rpo)rpu0) instanceof rpr)) {
                        if(!(((rpo)rpu0) instanceof rpl)) {
                            if(!(((rpo)rpu0) instanceof rpm)) {
                                throw new ibnq();
                            }
                            ((ProtoLiteMessage)gkcw.a).v_newBuilder();
                            rpm rpm0 = (rpm)(((rpo)rpu0));
                            throw null;
                        }
                        ((ProtoLiteMessage)gkcv.a).v_newBuilder();
                        rpl rpl0 = (rpl)(((rpo)rpu0));
                        throw null;
                    }
                    ((ProtoLiteMessage)gkcy.a).v_newBuilder();
                    rpr rpr0 = (rpr)(((rpo)rpu0));
                    throw null;
                }
            }
        }
    label_626:
        if(gkda0 == null) {
            ((ggsc)fndr.a.j().ar(0x48CA)).x("Interaction metadata is null");
            return;
        }
        cmgo cmgo0 = cmgn.a(((ProtoLiteMessage)cmft.a).v_newBuilder());
        cmds cmds0 = cmdr.a(((ProtoLiteMessage)cmer.a).v_newBuilder());
        ProtoLiteBuilder hftp18 = cmds0.a;
        if(!hftp18.b_message.isImmutable()) {
            hftp18.ensureMutable();
        }
        ((cmer)hftp18.b_message).c = gkda0;
        ((cmer)hftp18.b_message).b |= 1;
        cmgo0.b(cmds0.a());
        cmft cmft0 = cmgo0.a();
        fhvq fhvq0 = fhwp.c();
        this.b.f(0x2EDE7, cmft0, fhvq0);
    }
}

