import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public final class tqd extends twf {
    static {
    }

    @Override  // twf
    public final sxm a(sxm sxm0) {
        return new sxs(sxm0.f());
    }

    @Override  // twf
    public final sxn b(ttv ttv0, sxm sxm0) {
        byte[] arr_b14;
        byte[] arr_b9;
        tuf tuf0;
        tuj tuj2;
        if((((sxs)sxm0).a() & 16) == 16) {
            throw new sxp("CDA Requested - CDA not supported by cMDA", sxr.e);
        }
        if(!ttv0.h) {
            throw new sxp("Invalid state - GPO must be performed", sxr.c);
        }
        if(ttv0.d()) {
            throw new sxp("Invalid state - GEN AC already performed", sxr.c);
        }
        if(((sxs)sxm0).a[0] != 0xFFFFFF80) {
            throw new sxp("incorrect CLA", sxr.b);
        }
        if((((sxs)sxm0).a() & 0xC0) == 0xC0) {
            throw new sxp("incorrect P1", sxr.f);
        }
        if(((sxs)sxm0).b() != 0) {
            throw new sxp("incorrect P2", sxr.f);
        }
        if(!((sxs)sxm0).e()) {
            throw new sxp("Le absent", sxr.k);
        }
        if(((sxs)sxm0).d() != 0x100) {
            throw new sxp("Le required and is non-zero", sxr.k);
        }
        ((sxs)sxm0).g();
        ttt ttt0 = ttv0.l;
        tto tto0 = ttv0.d;
        tor tor0 = (tor)tto0.b().f(tor.a);
        ttx ttx0 = ttt0.t();
        tny tny0 = ttt0.z();
        ((tnn)tto0.b()).a();
        new tug();
        tor0.c();
        tnx tnx0 = ttt0.y();
        ttt ttt1 = ttv0.k;
        ttt1.r();
        tqa tqa0 = ttt1.s();
        ttt1.q();
        tor0.d();
        tof tof0 = ttt0.B();
        tue tue0 = new tue(((tpc)tto0.b().f(tpc.a)).k(tue.a));
        tue0.fu();
        byte[] arr_b = tue0.r();
        int v = tue0.d.f;
        switch(tue0.d.f - 1) {
            case 0: {
                twz.c(arr_b, false);
                break;
            }
            case 1: {
                twz.c(arr_b, false);
                break;
            }
            case 2: {
                twz.c(arr_b, false);
                break;
            }
            case 4: {
                twz.c(arr_b, false);
                break;
            }
            case 5: {
                twz.c(arr_b, false);
                break;
            }
            case 6: {
                twz.c(arr_b, false);
                break;
            }
            default: {
                throw new IllegalStateException("Unsupported format " + tvs.a(v));
            }
        }
        byte[] arr_b1 = ((sxs)sxm0).b.d();
        twz.b(arr_b1);
        syc syc0 = tue0.b(arr_b1);
        byte[] arr_b2 = ttt1.g().r();
        byte[] arr_b3 = tvt.a;
        if(Arrays.equals(arr_b2, syc0.c(new syf(arr_b3)).d())) {
            byte[] arr_b4 = ttt1.m().r();
            byte[] arr_b5 = tvy.a;
            if(!Arrays.equals(arr_b4, syc0.c(new syf(arr_b5)).d())) {
                throw new sxp("Invalid dol data - transaction currency does not match pdol", sxr.c);
            }
            ttt1.e(syc0);
            int v1 = ((sxs)sxm0).a() & 0xC0;
            tuj[] arr_tuj = tuj.values();
            int v2 = arr_tuj.length;
            int v3 = 0;
            while(v3 < v2) {
                tuj tuj0 = arr_tuj[v3];
                if(v1 >> 6 == tuj0.e) {
                    tuj tuj1 = tuj.a;
                    if(tuj0.equals(tuj1)) {
                        tuj2 = tuj1;
                    }
                    else {
                        tny tny1 = ttt0.z();
                        tnu tnu0 = tor0.a();
                        tnv tnv0 = tor0.b();
                        tny1.r();
                        tnu0.r();
                        tnv0.r();
                        boolean z = tnu0.a(tny1);
                        boolean z1 = tnv0.a(tny1);
                        tuj2 = (!tny1.h() || !z1) && !z ? tuj.c : tuj1;
                    }
                    if(tuj2 == tuj1) {
                        tuf0 = new tuf(0);
                        tnx0.a();
                        tnx0.e();
                        tof0.a();
                    }
                    else {
                        tuf0 = new tuf((byte)0x80);
                        tnx0.b();
                        tnx0.e();
                        if(!tqa0.q(0, 0) && tny0.q(3, 6)) {
                            tnx0.q(0, 2);
                        }
                    }
                    ttt0.d(tuf0);
                    ttt0.d(tnx0);
                    ttt0.d(tof0);
                    tob tob0 = ((tnp)ttv0).b();
                    ttt0.d(tob0);
                    tnm tnm0 = ttv0.e();
                    byte[] arr_b6 = tnm0 == null ? null : tnm0.b;
                    tug tug0 = new tug(new byte[]{ttt0.A().r()[2]}, true);
                    if(tug0.r()[0] == 0xFFFFFF81) {
                        try {
                            twh.a(ttv0.k, (byte)0x81, new byte[][]{twb.a, tvt.a, tvu.a, tvv.a, tvx.a, tvy.a, tvz.a, twa.a});
                            twh.a(ttv0.l, (byte)0x81, new byte[][]{ttx.a, ttz.b, tns.a});
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            ttv0.k.g().o(byteArrayOutputStream6);
                            ttv0.k.h().o(byteArrayOutputStream6);
                            ttv0.k.i().o(byteArrayOutputStream6);
                            ttv0.k.l().o(byteArrayOutputStream6);
                            ttv0.k.m().o(byteArrayOutputStream6);
                            ttv0.k.n().o(byteArrayOutputStream6);
                            ttv0.k.o().o(byteArrayOutputStream6);
                            ttv0.k.p().o(byteArrayOutputStream6);
                            ttv0.l.x().o(byteArrayOutputStream6);
                            ttv0.l.t().o(byteArrayOutputStream6);
                            byteArrayOutputStream6.write(ttv0.l.A().r());
                            byteArrayOutputStream6.write(0x80);
                            while(byteArrayOutputStream6.size() % 8 != 0) {
                                byteArrayOutputStream6.write(0);
                            }
                            arr_b9 = byteArrayOutputStream6.toByteArray();
                        }
                        catch(IOException iOException6) {
                            throw new RuntimeException(iOException6);
                        }
                    }
                    else {
                        switch(tug0.r()[0]) {
                            case 10: {
                                try {
                                    twh.a(ttt1, 10, new byte[][]{twb.a, arr_b3, tvu.a, tvv.a, tvx.a, arr_b5, tvz.a, twa.a});
                                    twh.a(ttt0, 10, new byte[][]{ttx.a, ttz.b});
                                    tns tns0 = ((tnn)tto0.b()).c();
                                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                    byteArrayOutputStream0.write(ttt1.g().r());
                                    byteArrayOutputStream0.write(ttt1.h().r());
                                    byteArrayOutputStream0.write(ttt1.i().r());
                                    byteArrayOutputStream0.write(ttt1.l().r());
                                    byteArrayOutputStream0.write(ttt1.m().r());
                                    byteArrayOutputStream0.write(ttt1.n().r());
                                    byteArrayOutputStream0.write(ttt1.o().r());
                                    byteArrayOutputStream0.write(ttt1.p().r());
                                    byteArrayOutputStream0.write(tns0.r());
                                    byteArrayOutputStream0.write(ttt0.t().r());
                                    byte[] arr_b7 = ttt0.A().r();
                                    byte[] arr_b8 = new byte[4];
                                    System.arraycopy(arr_b7, 3, arr_b8, 0, 4);
                                    byteArrayOutputStream0.write(new tny(arr_b8).r());
                                    while(byteArrayOutputStream0.size() % 8 != 0) {
                                        byteArrayOutputStream0.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream0.toByteArray();
                                    break;
                                }
                                catch(IOException iOException0) {
                                    throw new RuntimeException(iOException0);
                                }
                            }
                            case 17: {
                                try {
                                    twh.a(ttv0.k, 17, new byte[][]{twb.a, tvt.a});
                                    twh.a(ttv0.l, 17, new byte[][]{ttx.a, ttz.b});
                                    ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                                    byteArrayOutputStream1.write(ttv0.k.g().r());
                                    byteArrayOutputStream1.write(ttv0.k.p().r());
                                    byteArrayOutputStream1.write(ttv0.l.t().r());
                                    byteArrayOutputStream1.write(((int)ttv0.l.A().r()[4]));
                                    while(byteArrayOutputStream1.size() % 8 != 0) {
                                        byteArrayOutputStream1.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream1.toByteArray();
                                    break;
                                }
                                catch(IOException iOException1) {
                                    throw new RuntimeException(iOException1);
                                }
                            }
                            case 18: {
                                try {
                                    twh.a(ttv0.k, 18, new byte[][]{twb.a, tvt.a, tvu.a, tvv.a, tvx.a, tvy.a, tvz.a, twa.a});
                                    twh.a(ttv0.l, 18, new byte[][]{ttx.a, ttz.b});
                                    ttm ttm0 = ttv0.d.b();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    byteArrayOutputStream2.write(ttv0.k.g().r());
                                    byteArrayOutputStream2.write(ttv0.k.h().r());
                                    byteArrayOutputStream2.write(ttv0.k.i().r());
                                    byteArrayOutputStream2.write(ttv0.k.l().r());
                                    byteArrayOutputStream2.write(ttv0.k.m().r());
                                    byteArrayOutputStream2.write(ttv0.k.n().r());
                                    byteArrayOutputStream2.write(ttv0.k.o().r());
                                    byteArrayOutputStream2.write(ttv0.k.p().r());
                                    byteArrayOutputStream2.write(((tnn)ttm0).c().r());
                                    byteArrayOutputStream2.write(ttv0.l.t().r());
                                    byteArrayOutputStream2.write(ttv0.l.A().r());
                                    byteArrayOutputStream2.write(0x80);
                                    while(byteArrayOutputStream2.size() % 8 != 0) {
                                        byteArrayOutputStream2.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream2.toByteArray();
                                    break;
                                }
                                catch(IOException iOException2) {
                                    throw new RuntimeException(iOException2);
                                }
                            }
                            case 20: {
                                try {
                                    twh.a(ttv0.k, 20, new byte[][]{twb.a, tvt.a, tvu.a, tvv.a, tvx.a, tvy.a, tvz.a, twa.a});
                                    twh.a(ttv0.l, 20, new byte[][]{ttx.a, ttz.b});
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    ttv0.k.g().o(byteArrayOutputStream3);
                                    ttv0.k.h().o(byteArrayOutputStream3);
                                    ttv0.k.i().o(byteArrayOutputStream3);
                                    ttv0.k.l().o(byteArrayOutputStream3);
                                    ttv0.k.m().o(byteArrayOutputStream3);
                                    ttv0.k.n().o(byteArrayOutputStream3);
                                    ttv0.k.o().o(byteArrayOutputStream3);
                                    ttv0.k.p().o(byteArrayOutputStream3);
                                    ttv0.l.x().o(byteArrayOutputStream3);
                                    ttv0.l.t().o(byteArrayOutputStream3);
                                    byte[] arr_b10 = ttv0.l.A().r();
                                    byte[] arr_b11 = new byte[6];
                                    System.arraycopy(arr_b10, 2, arr_b11, 0, 6);
                                    byteArrayOutputStream3.write(arr_b11);
                                    byteArrayOutputStream3.write(0x80);
                                    while(byteArrayOutputStream3.size() % 8 != 0) {
                                        byteArrayOutputStream3.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream3.toByteArray();
                                    break;
                                }
                                catch(IOException iOException3) {
                                    throw new RuntimeException(iOException3);
                                }
                            }
                            case 21: {
                                try {
                                    twh.a(ttv0.k, 21, new byte[][]{tvt.a, tvy.a, twb.a});
                                    twh.a(ttv0.l, 17, new byte[][]{ttx.a, ttz.b});
                                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    byteArrayOutputStream4.write(ttv0.k.g().r());
                                    byteArrayOutputStream4.write(ttv0.k.m().r());
                                    byteArrayOutputStream4.write(ttv0.k.p().r());
                                    byteArrayOutputStream4.write(ttv0.l.t().r());
                                    byteArrayOutputStream4.write(ttv0.l.A().r());
                                    byteArrayOutputStream4.write(0x80);
                                    while(byteArrayOutputStream4.size() % 8 != 0) {
                                        byteArrayOutputStream4.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream4.toByteArray();
                                    break;
                                }
                                catch(IOException iOException4) {
                                    throw new RuntimeException(iOException4);
                                }
                            }
                            case 22: {
                                try {
                                    twh.a(ttv0.k, 21, new byte[][]{tvt.a, tvy.a, twb.a});
                                    twh.a(ttv0.l, 17, new byte[][]{ttx.a, ttz.b});
                                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                    byteArrayOutputStream5.write(ttv0.k.g().r());
                                    byteArrayOutputStream5.write(ttv0.k.m().r());
                                    byteArrayOutputStream5.write(ttv0.k.p().r());
                                    byteArrayOutputStream5.write(ttv0.l.t().r());
                                    byte[] arr_b12 = ttv0.l.A().r();
                                    byte[] arr_b13 = new byte[8];
                                    System.arraycopy(arr_b12, 2, arr_b13, 0, 8);
                                    byteArrayOutputStream5.write(arr_b13);
                                    byteArrayOutputStream5.write(0x80);
                                    while(byteArrayOutputStream5.size() % 8 != 0) {
                                        byteArrayOutputStream5.write(0);
                                    }
                                    arr_b9 = byteArrayOutputStream5.toByteArray();
                                    break;
                                }
                                catch(IOException iOException5) {
                                    throw new RuntimeException(iOException5);
                                }
                            }
                            default: {
                                throw new sxp("Unsupported CVN: " + tug0.toString(), sxr.i);
                            }
                        }
                    }
                    ttt0.d(new tua(tws.a(arr_b9, arr_b6), false));
                    ttk[] arr_ttk = {tuf0, ttx0, ttt0.u(), tob0};
                    try {
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        for(int v4 = 0; v4 < 4; ++v4) {
                            arr_ttk[v4].s().b(byteArrayOutputStream7);
                        }
                        arr_b14 = byteArrayOutputStream7.toByteArray();
                    }
                    catch(sxu sxu0) {
                        throw new RuntimeException(sxu0);
                    }
                    sxn sxn0 = new sxn(new ttk(arr_b14, tuv.b).s().c(), sxr.g);
                    tof0.c(false);
                    tof0.l(1, 0, true);
                    ttt0.d(tof0);
                    ttt ttt2 = ttv0.l;
                    byte[] arr_b15 = tuf.a;
                    if(!ttt2.j(arr_b15)) {
                        throw new RuntimeException("CID is missing");
                    }
                    if(ttt2.v().r()[0] == 0xFFFFFF80) {
                        ttv0.e = ttw.b;
                        tof0.toString();
                        tnx0.toString();
                        tny0.toString();
                        return sxn0;
                    }
                    if(!ttt2.j(arr_b15)) {
                        throw new RuntimeException("CID is missing");
                    }
                    if(ttt2.v().r()[0] == 0) {
                        ttv0.e = ttw.c;
                    }
                    tof0.toString();
                    tnx0.toString();
                    tny0.toString();
                    return sxn0;
                }
                ++v3;
                arr_tuj = arr_tuj;
                arr_b3 = arr_b3;
                v1 = v1;
                v2 = v2;
                arr_b5 = arr_b5;
            }
            throw new IllegalArgumentException();
        }
        ttt1.g().r();
        syc0.c(new syf(arr_b3)).d();
        throw new sxp("Invalid dol data - amount authorized does not match pdol", sxr.c);
    }
}

