import java.util.Iterator;
import java.util.Set;

public final class zhp {
    public static final grxw a;
    public static final grul b;
    public static final grxw c;
    public static final grul d;

    static {
        grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        if(!grxu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu0).ensureMutable();
        }
        grxw grxw0 = (grxw)grxu0.b_message;
        grxw0.b |= 1;
        grxw0.c = 90000;
        zhp.a = (grxw)((ProtoLiteBuilder)grxu0).N_build();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grul.a).v_newBuilder();
        grxd grxd0 = grxd.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grul grul0 = (grul)hftp0.b_message;
        grxd0.getClass();
        grul0.j = grxd0;
        grul0.b |= 0x800;
        zhp.b = (grul)hftp0.N_build();
        grxu grxu1 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        if(!grxu1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu1).ensureMutable();
        }
        grxw grxw1 = (grxw)grxu1.b_message;
        grxw1.b |= 1;
        grxw1.c = 0;
        zhp.c = (grxw)((ProtoLiteBuilder)grxu1).N_build();
        zhp.d = grul.a;
    }

    public static grxw a(grul grul0) {
        if(((grul0.g == null ? grvg.a : grul0.g).b & 0x1000) != 0) {
            grxw grxw0 = (grul0.g == null ? grvg.a : grul0.g).j;
            return grxw0 == null ? grxw.a : grxw0;
        }
        return null;
    }

    public static grxw b(grul grul0) {
        if(!hoju.l() && grul0 != null && (grul0.b & 0x20) != 0 && ((grul0.g == null ? grvg.a : grul0.g).b & 0x4000) != 0) {
            grxw grxw0 = (grul0.g == null ? grvg.a : grul0.g).k;
            return grxw0 == null ? grxw.a : grxw0;
        }
        return null;
    }

    public static grxw c(grul grul0) {
        if(((grul0.g == null ? grvg.a : grul0.g).b & 2) != 0) {
            grxw grxw0 = (grul0.g == null ? grvg.a : grul0.g).d;
            return grxw0 == null ? grxw.a : grxw0;
        }
        return null;
    }

    public static grxw d(grul grul0) {
        if(((grul0.g == null ? grvg.a : grul0.g).b & 4) != 0) {
            grxw grxw0 = (grul0.g == null ? grvg.a : grul0.g).e;
            return grxw0 == null ? grxw.a : grxw0;
        }
        return null;
    }

    public static grxw e(grul grul0) {
        if(((grul0.g == null ? grvg.a : grul0.g).b & 1) != 0) {
            grxw grxw0 = (grul0.g == null ? grvg.a : grul0.g).c;
            return grxw0 == null ? grxw.a : grxw0;
        }
        return null;
    }

    public static grxw f(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grxw.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (grxw)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalStateException(hfur0);
        }
    }

    public static grxw g(byte[] arr_b) {
        return arr_b == null ? zhp.a : zhp.f(arr_b);
    }

    public static grxw h(byte[] arr_b) {
        return arr_b == null ? null : zhp.f(arr_b);
    }

    public static Set i(grxr grxr0) {
        ggdy ggdy0 = new ggdy();
        int v = grxr0.c;
        if(v == 3) {
            for(Object object0: ((gryc)grxr0.d).b) {
                grul grul0 = (grul)object0;
                ggdy ggdy1 = new ggdy();
                int v1 = grul0.b;
                if((v1 & 0x20) != 0) {
                    grvg grvg0 = grul0.g == null ? grvg.a : grul0.g;
                    if((grvg0.b & 4) != 0) {
                        ggdy1.i((grvg0.e == null ? grxw.a : grvg0.e));
                    }
                    if((grvg0.b & 1) != 0) {
                        ggdy1.i((grvg0.c == null ? grxw.a : grvg0.c));
                    }
                    if((grvg0.b & 2) != 0) {
                        ggdy1.i((grvg0.d == null ? grxw.a : grvg0.d));
                    }
                    if((grvg0.b & 0x40) != 0) {
                        ggdy1.i((grvg0.f == null ? grxw.a : grvg0.f));
                    }
                    if(!hoju.l() && (grvg0.b & 0x4000) != 0) {
                        ggdy1.i((grvg0.k == null ? grxw.a : grvg0.k));
                    }
                    if((grvg0.b & 0x20000) != 0) {
                        ggdy1.i((grvg0.l == null ? grxw.a : grvg0.l));
                    }
                    if(((grvg0.n == null ? grwp.a : grvg0.n).b & 1) != 0) {
                        grwp grwp0 = grvg0.n == null ? grwp.a : grvg0.n;
                        ggdy1.i((grwp0.c == null ? grxw.a : grwp0.c));
                    }
                    if((grvg0.b & 0x1000) != 0) {
                        ggdy1.i((grvg0.j == null ? grxw.a : grvg0.j));
                    }
                    if((grvg0.b & 0x400) != 0) {
                        ggdy1.i((grvg0.h == null ? grxw.a : grvg0.h));
                    }
                }
                else if((v1 & 0x80) != 0) {
                    gryd gryd0 = grul0.h == null ? gryd.a : grul0.h;
                    if((gryd0.b & 16) != 0) {
                        ggdy1.i((gryd0.d == null ? grxw.a : gryd0.d));
                    }
                }
                ggdy0.k(ggdy1.h());
            }
            return ggfp.G(ggdy0.h());
        }
        switch(v) {
            case 6: {
                ggdy0.k(((grve)grxr0.d).c);
                return ggfp.G(ggdy0.h());
            }
            case 8: {
                grvb grvb0 = (grvb)grxr0.d;
                if(grvb0.b == 2) {
                    ggdy0.k(((grxm)grvb0.c).c);
                }
                return ggfp.G(ggdy0.h());
            }
            default: {
                return ggfp.G(ggdy0.h());
            }
        }
    }

    public static Set j(grxr grxr0) {
        ggdy ggdy0 = new ggdy();
        int v = grxr0.c;
        if(v == 8) {
            if(hoju.j() && (grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a).b == 12) {
                grvb grvb0 = grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a;
                grvn grvn0 = grvb0.b == 12 ? ((grvn)grvb0.c) : grvn.a;
                ggdy ggdy1 = new ggdy();
                if(((grvn0.e == null ? grwp.a : grvn0.e).b & 1) != 0) {
                    grwp grwp0 = grvn0.e == null ? grwp.a : grvn0.e;
                    ggdy1.i((grwp0.c == null ? grxw.a : grwp0.c));
                }
                for(Object object0: grvn0.f) {
                    for(Object object1: ((grzd)object0).b) {
                        grwp grwp1 = ((grzj)object1).f;
                        if(((grwp1 == null ? grwp.a : grwp1).b & 1) != 0) {
                            if(grwp1 == null) {
                                grwp1 = grwp.a;
                            }
                            ggdy1.i((grwp1.c == null ? grxw.a : grwp1.c));
                        }
                    }
                    for(Object object2: ((grzd)object0).c) {
                        grwp grwp2 = ((grze)object2).d;
                        if(((grwp2 == null ? grwp.a : grwp2).b & 1) != 0) {
                            if(grwp2 == null) {
                                grwp2 = grwp.a;
                            }
                            ggdy1.i((grwp2.c == null ? grxw.a : grwp2.c));
                        }
                        for(Object object3: ((grze)object2).f) {
                            grzg grzg0 = (grzg)object3;
                            for(Object object4: (grzg0.b == 1 ? ((grui)grzg0.c) : grui.a).b) {
                                grwp grwp3 = ((grug)object4).e;
                                if(((grwp3 == null ? grwp.a : grwp3).b & 1) != 0) {
                                    if(grwp3 == null) {
                                        grwp3 = grwp.a;
                                    }
                                    ggdy1.i((grwp3.c == null ? grxw.a : grwp3.c));
                                }
                            }
                        }
                    }
                }
                ggdy0.k(ggdy1.h());
                return ggfp.G(ggdy0.h());
            }
            if((grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a).b == 1) {
                grvb grvb1 = grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a;
                grzs grzs0 = grvb1.b == 1 ? ((grzs)grvb1.c) : grzs.a;
                ggdy ggdy2 = new ggdy();
                if(((grzs0.f == null ? grwp.a : grzs0.f).b & 1) != 0) {
                    grwp grwp4 = grzs0.f == null ? grwp.a : grzs0.f;
                    ggdy2.i((grwp4.c == null ? grxw.a : grwp4.c));
                }
                for(Object object5: grzs0.c) {
                    gruw gruw0 = (gruw)object5;
                    grwp grwp5 = gruw0.e;
                    if(((grwp5 == null ? grwp.a : grwp5).b & 1) != 0) {
                        if(grwp5 == null) {
                            grwp5 = grwp.a;
                        }
                        ggdy2.i((grwp5.c == null ? grxw.a : grwp5.c));
                    }
                    int v1 = gruw0.c;
                    if(v1 == 1) {
                        grwp grwp6 = ((grvo)gruw0.d).h;
                        if(((grwp6 == null ? grwp.a : grwp6).b & 1) == 0) {
                            continue;
                        }
                        if(grwp6 == null) {
                            grwp6 = grwp.a;
                        }
                        ggdy2.i((grwp6.c == null ? grxw.a : grwp6.c));
                    }
                    else {
                        grvh grvh0 = v1 == 6 ? ((grvh)gruw0.d) : grvh.a;
                        if(((grvh0.g == null ? grwp.a : grvh0.g).b & 1) == 0) {
                            int v2 = gruw0.c;
                            if(v2 == 9) {
                                for(Object object7: ((gruh)gruw0.d).b) {
                                    grwp grwp9 = ((grug)object7).e;
                                    if(((grwp9 == null ? grwp.a : grwp9).b & 1) != 0) {
                                        if(grwp9 == null) {
                                            grwp9 = grwp.a;
                                        }
                                        ggdy2.i((grwp9.c == null ? grxw.a : grwp9.c));
                                    }
                                }
                            }
                            else {
                                grxf grxf0 = v2 == 10 ? ((grxf)gruw0.d) : grxf.a;
                                if(((grxf0.f == null ? grwp.a : grxf0.f).b & 1) == 0) {
                                    continue;
                                }
                                grxf grxf1 = gruw0.c == 10 ? ((grxf)gruw0.d) : grxf.a;
                                grwp grwp10 = grxf1.f == null ? grwp.a : grxf1.f;
                                ggdy2.i((grwp10.c == null ? grxw.a : grwp10.c));
                            }
                        }
                        else {
                            grvh grvh1 = gruw0.c == 6 ? ((grvh)gruw0.d) : grvh.a;
                            grwp grwp7 = grvh1.g == null ? grwp.a : grvh1.g;
                            ggdy2.i((grwp7.c == null ? grxw.a : grwp7.c));
                            for(Object object6: (gruw0.c == 6 ? ((grvh)gruw0.d) : grvh.a).b) {
                                grwp grwp8 = ((grvi)object6).k;
                                if(((grwp8 == null ? grwp.a : grwp8).b & 1) != 0) {
                                    if(grwp8 == null) {
                                        grwp8 = grwp.a;
                                    }
                                    ggdy2.i((grwp8.c == null ? grxw.a : grwp8.c));
                                }
                            }
                        }
                    }
                }
                ggdy0.k(ggdy2.h());
                return ggfp.G(ggdy0.h());
            }
            int v3 = grxr0.c;
            if((v3 == 8 ? ((grvb)grxr0.d) : grvb.a).b == 2) {
                grvb grvb2 = v3 == 8 ? ((grvb)grxr0.d) : grvb.a;
                for(Object object8: (grvb2.b == 2 ? ((grxm)grvb2.c) : grxm.a).b) {
                    grxo grxo0 = (grxo)object8;
                    if(((grxo0.h == null ? grwp.a : grxo0.h).b & 1) != 0) {
                        grwp grwp11 = grxo0.h == null ? grwp.a : grxo0.h;
                        ggdy0.i((grwp11.c == null ? grxw.a : grwp11.c));
                    }
                }
                return ggfp.G(ggdy0.h());
            }
        }
        else {
        alab1:
            switch(v) {
                case 4: {
                    grwp grwp12 = ((gsak)grxr0.d).g;
                    if(grwp12 == null) {
                        grwp12 = grwp.a;
                    }
                    if((grwp12.b & 1) != 0) {
                        gsak gsak0 = grxr0.c == 4 ? ((gsak)grxr0.d) : gsak.a;
                        grwp grwp13 = gsak0.g == null ? grwp.a : gsak0.g;
                        ggdy0.i((grwp13.c == null ? grxw.a : grwp13.c));
                    }
                    gsak gsak1 = grxr0.c == 4 ? ((gsak)grxr0.d) : gsak.a;
                    grug grug0 = gsak1.e == null ? grug.a : gsak1.e;
                    if(((grug0.e == null ? grwp.a : grug0.e).b & 1) != 0) {
                        gsak gsak2 = grxr0.c == 4 ? ((gsak)grxr0.d) : gsak.a;
                        grug grug1 = gsak2.e == null ? grug.a : gsak2.e;
                        grwp grwp14 = grug1.e == null ? grwp.a : grug1.e;
                        ggdy0.i((grwp14.c == null ? grxw.a : grwp14.c));
                        return ggfp.G(ggdy0.h());
                    }
                    break;
                }
                case 5: {
                    for(Object object9: ((gsag)grxr0.d).b) {
                        gsah gsah0 = (gsah)object9;
                        if(((gsah0.d == null ? grwp.a : gsah0.d).b & 1) != 0) {
                            grwp grwp15 = gsah0.d == null ? grwp.a : gsah0.d;
                            ggdy0.i((grwp15.c == null ? grxw.a : grwp15.c));
                        }
                    }
                    return ggfp.G(ggdy0.h());
                }
                case 17: {
                    grxo grxo1 = (grxo)grxr0.d;
                    if(((grxo1.h == null ? grwp.a : grxo1.h).b & 1) != 0) {
                        grwp grwp16 = grxo1.h == null ? grwp.a : grxo1.h;
                        ggdy0.i((grwp16.c == null ? grxw.a : grwp16.c));
                        return ggfp.G(ggdy0.h());
                    }
                    break;
                }
                case 26: {
                    for(Object object10: ((grwh)grxr0.d).b) {
                        for(Object object11: ((gryj)object10).d) {
                            gryi gryi0 = (gryi)object11;
                            if(((gryi0.g == null ? grwp.a : gryi0.g).b & 1) != 0) {
                                grwp grwp17 = gryi0.g == null ? grwp.a : gryi0.g;
                                ggdy0.i((grwp17.c == null ? grxw.a : grwp17.c));
                            }
                        }
                    }
                    return ggfp.G(ggdy0.h());
                }
                case 27: {
                    Iterator iterator12 = ((grzb)grxr0.d).c.iterator();
                    while(true) {
                        if(!iterator12.hasNext()) {
                            break alab1;
                        }
                        Object object12 = iterator12.next();
                        gruj gruj0 = (gruj)object12;
                        if(((gruj0.e == null ? grwp.a : gruj0.e).b & 1) != 0) {
                            grwp grwp18 = gruj0.e == null ? grwp.a : gruj0.e;
                            ggdy0.i((grwp18.c == null ? grxw.a : grwp18.c));
                        }
                    }
                }
                default: {
                    return ggfp.G(ggdy0.h());
                }
            }
        }
        return ggfp.G(ggdy0.h());
    }

    public static boolean k(grul grul0) {
        return zhp.a(grul0) != null;
    }

    public static boolean l(grul grul0) {
        return zhp.d(grul0) != null;
    }

    public static byte[] m(grxw grxw0) {
        return grxw0 == null ? null : grxw0.toBytesArray();
    }

    public static int n(grul grul0) {
        boolean z;
        int v = grul0.b;
        if((v & 4) != 0) {
            z = true;
        }
        else if((v & 16) == 0 && (v & 0x100) == 0) {
            z = false;
        }
        else {
            z = true;
        }
        if((v & 0x800) != 0) {
            return 3;
        }
        if(z) {
            return 4;
        }
        return zhp.e(grul0) == null ? 2 : 1;
    }
}

