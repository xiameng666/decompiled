import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enbn implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hgur hgur0;
        enys enys0 = ((enyp)object0).c == 1 ? ((enys)((enyp)object0).d) : enys.a;
        gzqw gzqw0 = gzqw.b(enyq.a((enyq.b(enys0.i) == 0 ? 1 : enyq.b(enys0.i))));
        if(gzqw0 == null) {
            gzqw0 = gzqw.a;
        }
        hftr hftr0 = (hftr)((ProtoLiteMessage)gzrd.a).v_newBuilder();
        hfwn hfwn0 = enys0.e == null ? hfwn.a : enys0.e;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gzrd gzrd0 = (gzrd)hftr0.b_message;
        hfwn0.getClass();
        gzrd0.c = hfwn0;
        gzrd0.b |= 1;
        hfwn hfwn1 = enys0.f == null ? hfwn.a : enys0.f;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gzrd gzrd1 = (gzrd)hftr0.b_message;
        hfwn1.getClass();
        gzrd1.d = hfwn1;
        gzrd1.b |= 2;
        int v = enys0.g;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gzrd gzrd2 = (gzrd)hftr0.b_message;
        gzrd2.b |= 4;
        gzrd2.e = v;
        int v1 = enys0.h;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gzrd gzrd3 = (gzrd)hftr0.b_message;
        gzrd3.b |= 8;
        gzrd3.f = v1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gzrd)hftr0.b_message).k = gzqw0.f;
        ((gzrd)hftr0.b_message).b |= 0x100;
        int v2 = enyr.a(enys0.c);
        if(v2 == 0) {
            throw null;
        }
        switch(v2 - 1) {
            case 0: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzra.a).v_newBuilder();
                enzb enzb0 = enys0.c == 5 ? ((enzb)enys0.d) : enzb.a;
                hguu hguu0 = hguu.a;
                hftr hftr1 = (hftr)((ProtoLiteMessage)hguu0).v_newBuilder();
                hgun hgun0 = hgun.a;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgun0).v_newBuilder();
                long v3 = (enzb0.e == null ? enza.a : enzb0.e).c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hgun hgun1 = (hgun)hftp1.b_message;
                hgun1.b |= 1;
                hgun1.c = v3;
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hguu hguu1 = (hguu)hftr1.b_message;
                hgun hgun2 = (hgun)hftp1.N_build();
                hgun2.getClass();
                hguu1.c = hgun2;
                hguu1.b |= 1;
                enza enza0 = enzb0.e == null ? enza.a : enzb0.e;
                switch((enyz.a(enza0.d) == 0 ? 1 : enyz.a(enza0.d)) - 1) {
                    case 1: {
                        hgur0 = hgur.b;
                        break;
                    }
                    case 2: {
                        hgur0 = hgur.c;
                        break;
                    }
                    case 3: {
                        hgur0 = hgur.d;
                        break;
                    }
                    case 4: {
                        hgur0 = hgur.e;
                        break;
                    }
                    case 5: {
                        hgur0 = hgur.f;
                        break;
                    }
                    case 6: {
                        hgur0 = hgur.g;
                        break;
                    }
                    default: {
                        hgur0 = hgur.a;
                    }
                }
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                ((hguu)hftr1.b_message).d = hgur0.h;
                ((hguu)hftr1.b_message).b |= 2;
                float f = (enzb0.e == null ? enza.a : enzb0.e).f;
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hguu hguu2 = (hguu)hftr1.b_message;
                hguu2.b |= 8;
                hguu2.f = f;
                double f1 = (enzb0.e == null ? enza.a : enzb0.e).e;
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hguu hguu3 = (hguu)hftr1.b_message;
                hguu3.b |= 4;
                hguu3.e = f1;
                enza enza1 = enzb0.e == null ? enza.a : enzb0.e;
                hguv hguv0 = enza1.g == null ? hguv.a : enza1.g;
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hguu hguu4 = (hguu)hftr1.b_message;
                hguv0.getClass();
                hguu4.g = hguv0;
                hguu4.b |= 16;
                enza enza2 = enzb0.e == null ? enza.a : enzb0.e;
                hfta hfta0 = enym.a;
                enza2.f(hfta0);
                hftu hftu0 = hfta0.d;
                if(enza2.s.m(hftu0)) {
                    hfta hfta1 = gzov.l;
                    enza enza3 = enzb0.e == null ? enza.a : enzb0.e;
                    enza3.f(hfta0);
                    Object object1 = enza3.s.k(hftu0);
                    Object object2 = object1 == null ? hfta0.b : hfta0.d(object1);
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzov.a).v_newBuilder();
                    if((((enyl)object2).b & 1) != 0) {
                        boolean z = ((enyl)object2).c;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzov gzov0 = (gzov)hftp2.b_message;
                        gzov0.b |= 1;
                        gzov0.d = z;
                    }
                    if((((enyl)object2).b & 2) != 0) {
                        gzgf gzgf0 = ((enyl)object2).d;
                        if(gzgf0 == null) {
                            gzgf0 = gzgf.a;
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzov gzov1 = (gzov)hftp2.b_message;
                        gzgf0.getClass();
                        gzov1.e = gzgf0;
                        gzov1.b |= 2;
                    }
                    if((((enyl)object2).b & 4) != 0) {
                        boolean z1 = ((enyl)object2).e;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzov gzov2 = (gzov)hftp2.b_message;
                        gzov2.b |= 4;
                        gzov2.f = z1;
                    }
                    if((((enyl)object2).b & 8) != 0) {
                        int v4 = gzge.a(((enyl)object2).f);
                        if(v4 == 0) {
                            v4 = 1;
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gzov)hftp2.b_message).g = v4 - 1;
                        ((gzov)hftp2.b_message).b |= 0x40;
                    }
                    hftr1.n(hfta1, ((gzov)hftp2.N_build()));
                }
                hftr hftr2 = (hftr)((ProtoLiteMessage)hgvd.a).v_newBuilder();
                int v5 = enzb0.c;
                if(!hftr2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr2).ensureMutable();
                }
                hgvd hgvd0 = (hgvd)hftr2.b_message;
                hgvd0.b |= 1;
                hgvd0.c = v5;
                float f2 = enzb0.d;
                if(!hftr2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr2).ensureMutable();
                }
                hgvd hgvd1 = (hgvd)hftr2.b_message;
                hgvd1.b |= 2;
                hgvd1.d = f2;
                hguu hguu5 = (hguu)((ProtoLiteBuilder)hftr1).N_build();
                if(!hftr2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr2).ensureMutable();
                }
                hgvd hgvd2 = (hgvd)hftr2.b_message;
                hguu5.getClass();
                hgvd2.e = hguu5;
                hgvd2.b |= 4;
                if((enzb0.b & 8) != 0) {
                    hfta hfta2 = gzrj.c;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzrj.a).v_newBuilder();
                    hftr hftr3 = (hftr)((ProtoLiteMessage)hguu0).v_newBuilder();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hgun0).v_newBuilder();
                    long v6 = (enzb0.f == null ? enza.a : enzb0.f).c;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hgun hgun3 = (hgun)hftp4.b_message;
                    hgun3.b |= 1;
                    hgun3.c = v6;
                    if(!hftr3.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr3).ensureMutable();
                    }
                    hguu hguu6 = (hguu)hftr3.b_message;
                    hgun hgun4 = (hgun)hftp4.N_build();
                    hgun4.getClass();
                    hguu6.c = hgun4;
                    hguu6.b |= 1;
                    float f3 = (enzb0.f == null ? enza.a : enzb0.f).f;
                    if(!hftr3.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr3).ensureMutable();
                    }
                    hguu hguu7 = (hguu)hftr3.b_message;
                    hguu7.b |= 8;
                    hguu7.f = f3;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gzrj gzrj0 = (gzrj)hftp3.b_message;
                    hguu hguu8 = (hguu)((ProtoLiteBuilder)hftr3).N_build();
                    hguu8.getClass();
                    hfuo hfuo0 = gzrj0.b;
                    if(!hfuo0.c()) {
                        gzrj0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    gzrj0.b.add(hguu8);
                    hftr2.n(hfta2, ((gzrj)hftp3.N_build()));
                }
                hgvd hgvd3 = (hgvd)((ProtoLiteBuilder)hftr2).N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzra gzra0 = (gzra)hftp0.b_message;
                hgvd3.getClass();
                gzra0.c = hgvd3;
                gzra0.b = 1;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                gzrd gzrd4 = (gzrd)hftr0.b_message;
                gzra gzra1 = (gzra)hftp0.N_build();
                gzra1.getClass();
                gzrd4.g = gzra1;
                gzrd4.b |= 16;
                break;
            }
            case 1: {
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzra.a).v_newBuilder();
                enyo enyo0 = enys0.c == 6 ? ((enyo)enys0.d) : enyo.a;
                enyn enyn0 = enyo0.g == null ? enyn.a : enyo0.g;
                hguk hguk0 = hguk.b(enyn0.c) == null ? hguk.a : hguk.b(enyn0.c);
                hftr hftr4 = (hftr)((ProtoLiteMessage)hgum.a).v_newBuilder();
                hguv hguv1 = enyo0.c == null ? hguv.a : enyo0.c;
                if(!hftr4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr4).ensureMutable();
                }
                hgum hgum0 = (hgum)hftr4.b_message;
                hguv1.getClass();
                hgum0.c = hguv1;
                hgum0.b |= 1;
                hguv hguv2 = enyo0.d == null ? hguv.a : enyo0.d;
                if(!hftr4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr4).ensureMutable();
                }
                hgum hgum1 = (hgum)hftr4.b_message;
                hguv2.getClass();
                hgum1.d = hguv2;
                hgum1.b |= 2;
                float f4 = enyo0.e;
                if(!hftr4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr4).ensureMutable();
                }
                hgum hgum2 = (hgum)hftr4.b_message;
                hgum2.b |= 4;
                hgum2.e = f4;
                float f5 = enyo0.f;
                if(!hftr4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr4).ensureMutable();
                }
                hgum hgum3 = (hgum)hftr4.b_message;
                hgum3.b |= 8;
                hgum3.f = f5;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hgul.a).v_newBuilder();
                int v7 = hguk0.p;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp6.b_message;
                ((hgul)hftv0).b |= 1;
                ((hgul)hftv0).c = v7;
                float f6 = (enyo0.g == null ? enyn.a : enyo0.g).d;
                if(!hftv0.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hgul hgul0 = (hgul)hftp6.b_message;
                hgul0.b |= 2;
                hgul0.d = f6;
                if(!hftr4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr4).ensureMutable();
                }
                hgum hgum4 = (hgum)hftr4.b_message;
                hgul hgul1 = (hgul)hftp6.N_build();
                hgul1.getClass();
                hgum4.g = hgul1;
                hgum4.b |= 16;
                hgum hgum5 = (hgum)((ProtoLiteBuilder)hftr4).N_build();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gzra gzra2 = (gzra)hftp5.b_message;
                hgum5.getClass();
                gzra2.c = hgum5;
                gzra2.b = 2;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                gzrd gzrd5 = (gzrd)hftr0.b_message;
                gzra gzra3 = (gzra)hftp5.N_build();
                gzra3.getClass();
                gzrd5.g = gzra3;
                gzrd5.b |= 16;
            }
        }
        gzrd gzrd6 = (gzrd)((ProtoLiteBuilder)hftr0).N_build();
        ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)gzrd6).jf(5, null);
        hftp7.X(((ProtoLiteMessage)gzrd6));
        String s = ((enyp)object0).e;
        if(!((hftr)hftp7).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp7))).ensureMutable();
        }
        gzrd gzrd7 = (gzrd)((hftr)hftp7).b_message;
        s.getClass();
        gzrd7.b |= 0x200;
        gzrd7.l = s;
        return (gzrd)((ProtoLiteBuilder)(((hftr)hftp7))).N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

