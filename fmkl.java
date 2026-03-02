import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fmkl {
    static final int a;
    public static final int b;

    static {
        fmkl.a = (int)iaea.a.g().g();
    }

    static hnux a(fmmo fmmo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnux.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnux)hftv0).e = fmmo0.b;
        int v = fmmo0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnux)hftv1).f = v;
        int v1 = fmmo0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hnux)hftv2).g = v1;
        int v2 = fmmo0.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hnux)hftv3).h = v2;
        boolean z = fmmo0.f;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnux)hftp0.b_message).i = z;
        switch(fmmo0.b().ordinal()) {
            case 0: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux0 = (hnux)hftp0.b_message;
                hnux0.d = hntf.a(3);
                hnve hnve0 = flxs.a(fmmo0.a.g());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux1 = (hnux)hftp0.b_message;
                hnve0.getClass();
                hnux1.c = hnve0;
                hnux1.b = 101;
                return (hnux)hftp0.N_build();
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux2 = (hnux)hftp0.b_message;
                hnux2.d = hntf.a(5);
                fmmf fmmf0 = fmmo0.a.h();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnuv.a).v_newBuilder();
                String s = fmmf0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnuv hnuv0 = (hnuv)hftp1.b_message;
                s.getClass();
                hnuv0.c = s;
                hjie hjie0 = flwp.b(fmmf0.b);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnuv hnuv1 = (hnuv)hftp1.b_message;
                hjie0.getClass();
                hnuv1.d = hjie0;
                hnuv1.b |= 1;
                hjie hjie1 = flwp.b(fmmf0.c);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnuv hnuv2 = (hnuv)hftp1.b_message;
                hjie1.getClass();
                hnuv2.e = hjie1;
                hnuv2.b |= 2;
                hnuv hnuv3 = (hnuv)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux3 = (hnux)hftp0.b_message;
                hnuv3.getClass();
                hnux3.c = hnuv3;
                hnux3.b = 103;
                return (hnux)hftp0.N_build();
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux4 = (hnux)hftp0.b_message;
                hnux4.d = hntf.a(7);
                fmgu fmgu0 = fmmo0.a.f();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnur.a).v_newBuilder();
                int v3 = fmgu0.c;
                switch(v3) {
                    case 1: {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((hnur)hftp2.b_message).c = 1;
                        break;
                    }
                    case 2: {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((hnur)hftp2.b_message).c = 2;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(a.f(v3, "Got unknown buttons orientation integer: ", "."));
                    }
                }
                fmkk fmkk0 = new fmkk();
                gged_interceptors gged0 = flbp.c(fmgu0.b, fmkk0);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hnur hnur0 = (hnur)hftp2.b_message;
                hfuo hfuo0 = hnur0.b;
                if(!hfuo0.c()) {
                    hnur0.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged0, hnur0.b);
                hnur hnur1 = (hnur)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux5 = (hnux)hftp0.b_message;
                hnur1.getClass();
                hnux5.c = hnur1;
                hnux5.b = 105;
                return (hnux)hftp0.N_build();
            }
            case 4: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux6 = (hnux)hftp0.b_message;
                hnux6.d = hntf.a(8);
                fmlp fmlp0 = fmmo0.a.c();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnul.a).v_newBuilder();
                hjie hjie2 = flwp.b(fmlp0.a);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp3.b_message;
                hjie2.getClass();
                ((hnul)hftv4).c = hjie2;
                ((hnul)hftv4).b |= 1;
                float f = fmlp0.b;
                if(!hftv4.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hnul)hftp3.b_message).d = f;
                hnul hnul0 = (hnul)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux7 = (hnux)hftp0.b_message;
                hnul0.getClass();
                hnux7.c = hnul0;
                hnux7.b = 106;
                return (hnux)hftp0.N_build();
            }
            case 5: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux8 = (hnux)hftp0.b_message;
                hnux8.d = hntf.a(9);
                fmln fmln0 = fmmo0.a.b();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hnuk.a).v_newBuilder();
                fmki fmki0 = new fmki();
                gged_interceptors gged1 = flbp.c(fmln0.a, fmki0);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hnuk hnuk0 = (hnuk)hftp4.b_message;
                hfuo hfuo1 = hnuk0.b;
                if(!hfuo1.c()) {
                    hnuk0.b = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(gged1, hnuk0.b);
                hnuk hnuk1 = (hnuk)hftp4.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux9 = (hnux)hftp0.b_message;
                hnuk1.getClass();
                hnux9.c = hnuk1;
                hnux9.b = 107;
                return (hnux)hftp0.N_build();
            }
            case 7: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux10 = (hnux)hftp0.b_message;
                hnux10.d = hntf.a(10);
                return (hnux)hftp0.N_build();
            }
            case 8: {
                if(!iaea.q()) {
                    throw new IllegalArgumentException("Media Element not supported; Please enable direct-download flag.");
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux11 = (hnux)hftp0.b_message;
                hnux11.d = hntf.a(11);
                fmlt fmlt0 = fmmo0.a.e();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hnup.a).v_newBuilder();
                fmlw fmlw0 = fmlt0.a;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hnts.a).v_newBuilder();
                switch(fmlw0.b().ordinal()) {
                    case 0: {
                        throw new IllegalArgumentException("Media ID is not yet supported: " + fmlw0.b());
                    }
                    case 1: {
                        String s1 = fmlw0.c();
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        hnts hnts0 = (hnts)hftp6.b_message;
                        s1.getClass();
                        hnts0.b = 11;
                        hnts0.c = s1;
                    }
                }
                hnts hnts1 = (hnts)hftp6.N_build();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp5.b_message;
                hnts1.getClass();
                ((hnup)hftv5).c = hnts1;
                ((hnup)hftv5).b |= 1;
                int v4 = fmkl.a;
                if(!hftv5.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((hnup)hftp5.b_message).e = v4;
                hnup hnup0 = (hnup)hftp5.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnux hnux12 = (hnux)hftp0.b_message;
                hnup0.getClass();
                hnux12.c = hnup0;
                hnux12.b = 109;
                return (hnux)hftp0.N_build();
            }
            default: {
                throw new IllegalArgumentException("Got unknown ui element model type: " + fmmo0.b());
            }
        }
    }

    // This method was un-flattened
    static fmmb b(AccountContext accountContext0, Context context0, hnus hnus0, String s, flsl flsl0) {
        fmmj fmmj0;
        int v1;
        ggdy ggdy0 = new ggdy();
        for(Object object0: hnus0.b) {
            hnuw hnuw0 = (hnuw)object0;
            int v = hnuw0.d;
            switch(v) {
                case 0: {
                    break;
                }
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
            switch(v1 - 2) {
                case 1: {
                    hnut hnut0 = hnuw0.b == 101 ? ((hnut)hnuw0.c) : hnut.a;
                    ggdy ggdy1 = new ggdy();
                    for(Object object1: hnut0.b) {
                        ggdy1.i(fmkl.c(accountContext0, context0, ((hnux)object1), s, flsl0));
                    }
                    fmmh fmmh0 = new fmmh();
                    fmmh0.b(ggdy1.h());
                    fmmj0 = fmky.a(fmmh0.a());
                    break;
                }
                case 2: {
                    fmmj0 = fmky.b(fmkl.c(accountContext0, context0, (hnuw0.b == 102 ? ((hnux)hnuw0.c) : hnux.a), s, flsl0));
                    break;
                }
                default: {
                    throw new flwq("Got unknown UI component: " + v, 0xDE);
                }
            }
            ggdy0.i(fmmj0);
        }
        fmma fmma0 = new fmma(null);
        fmma0.b(ggdy0.h());
        int v2 = hnus0.c;
        if(v2 > 0) {
            fmma0.c(v2);
        }
        return fmma0.a();
    }

    static fmmo c(AccountContext accountContext0, Context context0, hnux hnux0, String s, flsl flsl0) {
        fmmk fmmk0 = fmmo.a();
        fmmk0.d(hnux0.e);
        fmmk0.e(hnux0.f);
        fmmk0.c(hnux0.g);
        fmmk0.b(hnux0.h);
        fmmk0.f(hnux0.i);
        int v = hnux0.d;
        int v1 = hntf.b(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 2) {
            case 1: {
                fmmk0.m(flxs.b(accountContext0, context0, (hnux0.b == 101 ? ((hnve)hnux0.c) : hnve.a), s, flsl0));
                return fmmk0.a();
            }
            case 3: {
                hnuv hnuv0 = hnux0.b == 103 ? ((hnuv)hnux0.c) : hnuv.a;
                fmme fmme0 = new fmme();
                fmme0.c(hnuv0.c);
                fmme0.b(flwp.a((hnuv0.d == null ? hjie.a : hnuv0.d)));
                fmme0.d(flwp.a((hnuv0.e == null ? hjie.a : hnuv0.e)));
                fmmk0.n(fmme0.a());
                return fmmk0.a();
            }
            case 4: {
                hnum hnum0 = hnux0.b == 104 ? ((hnum)hnux0.c) : hnum.a;
                if((hnum0.b & 2) == 0) {
                    throw new flwq("Got invalid image proto.", 0xE4);
                }
                fmlq fmlq0 = fmlr.a();
                fmjl fmjl0 = new fmjl();
                hntr hntr0 = hnum0.c == null ? hntr.a : hnum0.c;
                fmjl0.b((hntr0.c == null ? hnxf.a : hntr0.c).c);
                hntr hntr1 = hnum0.c == null ? hntr.a : hnum0.c;
                hnxf hnxf0 = hntr1.c == null ? hnxf.a : hntr1.c;
                fmjl0.c((hnxf0.e == null ? hftw.a : hnxf0.e).b);
                fmlq0.a = fmjl0.a();
                fmlq0.e((hnum0.c == null ? hntr.a : hnum0.c).e.toByteArray());
                fmlq0.d(hnum0.d);
                fmlq0.b(hnum0.e);
                fmlq0.c(hnum0.f);
                fmmk0.j(fmlq0.a());
                return fmmk0.a();
            }
            case 5: {
                hnur hnur0 = hnux0.b == 105 ? ((hnur)hnux0.c) : hnur.a;
                fmgr fmgr0 = new fmgr(null);
                if(hnur0.c == 2) {
                    fmgr0.c(hnur0.d);
                }
                fmgr0.d(hnur0.c);
                fmgr0.b(flbp.b(hnur0.b, new fmkh(s)));
                fmmk0.l(fmgr0.a());
                return fmmk0.a();
            }
            case 6: {
                hnul hnul0 = hnux0.b == 106 ? ((hnul)hnux0.c) : hnul.a;
                fmlo fmlo0 = new fmlo();
                fmlo0.b(flwp.a((hnul0.c == null ? hjie.a : hnul0.c)));
                fmlo0.c(hnul0.d);
                fmmk0.i(fmlo0.a());
                return fmmk0.a();
            }
            case 7: {
                hnuk hnuk0 = hnux0.b == 107 ? ((hnuk)hnux0.c) : hnuk.a;
                fmlk fmlk0 = new fmlk();
                fmlk0.b(flbp.c(hnuk0.b, new fmkf(s)));
                fmmk0.h(fmlk0.a());
                return fmmk0.a();
            }
            case 8: {
                fmmk0.g();
                return fmmk0.a();
            }
            case 9: {
                if(!iaea.q()) {
                    throw new flwq("Media Element not supported, please enable direct-download flag.", 0xE5);
                }
                hnup hnup0 = hnux0.b == 109 ? ((hnup)hnux0.c) : hnup.a;
                if((hnup0.b & 1) == 0) {
                    throw new flwq("Got invalid media proto.", 0xE5);
                }
                if((hnup0.c == null ? hnts.a : hnup0.c).b == 11) {
                    hnts hnts0 = hnup0.c == null ? hnts.a : hnup0.c;
                    String s1 = "";
                    if(!(hnts0.b == 11 ? ((String)hnts0.c) : "").isEmpty()) {
                        fmls fmls0 = fmlt.a();
                        hnts hnts1 = hnup0.c == null ? hnts.a : hnup0.c;
                        if(hnts1.b == 11) {
                            s1 = (String)hnts1.c;
                        }
                        fmls0.a = fmkp.a(s1);
                        fmls0.e((hnup0.c == null ? hnts.a : hnup0.c).d.toByteArray());
                        fmls0.d(hnup0.d);
                        fmls0.b(hnup0.e);
                        fmls0.c(hnup0.f);
                        fmmk0.k(fmls0.a());
                        return fmmk0.a();
                    }
                }
                throw new flwq("URL must not be empty.", 0xE5);
            }
            default: {
                int v3 = hntf.b(v);
                if(v3 != 0) {
                    v2 = v3;
                }
                throw new flwq("Got unknown UI element: " + hntf.a(v2), 0xDF);
            }
        }
    }
}

