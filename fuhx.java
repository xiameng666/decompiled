import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuhx {
    public static final void a(fuhy fuhy0, goz goz0, int v) {
        jbn jbn0;
        float f1;
        float f;
        goz goz2;
        goz goz1 = goz0.ao(0xF09C5825);
        if((((v & 6) == 0 ? (goz1.Z(fuhy0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            fryk fryk0 = fuhy0.f;
            goz1.M(0x3AE6F80E);
            hll hll0 = null;
            if(fryk0 != null) {
                hey hey0 = hfc.e;
                if(hyxx.c()) {
                    switch(fuhy0.h.ordinal()) {
                        case 0: {
                            f = fbz.f;
                            break;
                        }
                        case 1: {
                            f = fbz.g;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                else {
                    f = fbz.f;
                }
                hfc hfc0 = dls.k(hey0, f);
                goz1.M(0x984D0A95);
                hlm hlm0 = fuhy0.e == null ? null : fuhy0.e.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                goz1.x();
                goz1.M(0x984D08C1);
                if(hlm0 == null) {
                    hlm0 = new hlb(((hll)goz1.h(fft.a)).j, 5);
                }
                goz1.x();
                goz1.M(0x984D2133);
                CharSequence charSequence0 = fuhy0.i == null ? null : fuhy0.i.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                goz1.x();
                ftyy.b(fryk0, (charSequence0 == null ? null : charSequence0.toString()), hfc0, null, null, 0.0f, hlm0, goz1, 0, 56);
            }
            goz1.x();
            goz1.M(988235970);
            if(fryk0 != null && fuhy0.c != null) {
                hey hey1 = hfc.e;
                if(hyxx.c()) {
                    switch(fuhy0.h.ordinal()) {
                        case 0: {
                            f1 = fbz.h;
                            break;
                        }
                        case 1: {
                            f1 = fbz.i;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                else {
                    f1 = fbz.h;
                }
                dlv.a(dls.o(hey1, f1), goz1);
            }
            goz1.x();
            fryv fryv0 = fuhy0.c;
            goz1.M(0x3AE77A39);
            if(fryv0 == null) {
                goz2 = goz1;
            }
            else {
                frxs frxs0 = fuhy0.e;
                goz1.M(0x984D6438);
                if(frxs0 != null) {
                    hll0 = new hll(frxs0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))));
                }
                goz1.x();
                long v1 = hll0 == null ? hll.i : hll0.j;
                if(hyxx.c()) {
                    goz1.M(0xE503B283);
                    switch(fuhy0.h.ordinal()) {
                        case 0: {
                            goz1.M(0x286B8440);
                            jbn0 = fpu.d(goz1).m;
                            goz1.x();
                            break;
                        }
                        case 1: {
                            goz1.M(0x286B8D21);
                            jbn0 = fpu.d(goz1).h;
                            goz1.x();
                            break;
                        }
                        default: {
                            goz1.M(0x286B7B05);
                            goz1.x();
                            throw new ibnq();
                        }
                    }
                }
                else {
                    goz1.M(0xE506C3AF);
                    jbn0 = fpu.d(goz1).m;
                }
                goz1.x();
                goz2 = goz1;
                ftzd.a(fryv0, null, v1, 0L, null, 0L, fuhy0.d, 0L, 0, false, 0, 0, null, null, jbn0, goz2, 0, 0, 0x1FDFA);
            }
            goz2.x();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuhs(fuhy0, v);
        }
    }

    public static final void b(hfc hfc0, fuhy fuhy0, ibtw ibtw0, goz goz0, int v, int v1) {
        ibtw ibtw4;
        float f;
        float f3;
        float f2;
        float f1;
        ibtw ibtw2;
        hfc hfc2;
        ibtw ibtw1;
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(-600160035);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fuhy0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            ibtw1 = ibtw0;
        }
        else if((v & 0x180) == 0) {
            ibtw1 = ibtw0;
            v2 |= (goz1.Z(ibtw1) ? 0x100 : 0x80);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            ibtw2 = ibtw1;
        }
        else {
            hfc hfc3 = (v1 & 1) == 0 ? hfc1 : hfc.e;
            ibtw ibtw3 = (v1 & 4) == 0 ? ibtw1 : null;
            int v3 = fuhy0.a.ordinal();
            switch(v3) {
                case 0: {
                    ibtw4 = ibtw3;
                    goz1.M(1637530240);
                    hfc hfc6 = iqn.a(hfc3, "WalletButtonFilled");
                    if(hyxx.c()) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                f1 = fbz.d;
                                break;
                            }
                            case 1: {
                                f1 = fbz.e;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        f1 = fbz.d;
                    }
                    hfc hfc7 = dls.t(hfc6, 0.0f, f1, 1);
                    ibth ibth1 = fuhy0.j;
                    dld dld1 = fuhy0.g;
                    if(dld1 == null) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                dld1 = new dle(16.0f, 8.0f, 16.0f, 8.0f);
                                break;
                            }
                            case 1: {
                                dld1 = hyxx.c() ? new dle(24.0f, 16.0f, 24.0f, 16.0f) : fbz.a;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    gze gze1 = gzf.e(-2016103223, new fuht(ibtw4, fuhy0), goz1);
                    fcm.a(ibth1, hfc7, fuhy0.b, null, null, null, null, dld1, gze1, goz1, 0x30000000, 376);
                    goz1 = goz1;
                    goz1.x();
                    break;
                }
                case 1: {
                    ibtw4 = ibtw3;
                    goz1.M(0x61AC80D7);
                    hfc hfc8 = iqn.a(hfc3, "WalletButtonOutline");
                    if(hyxx.c()) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                f2 = fbz.d;
                                break;
                            }
                            case 1: {
                                f2 = fbz.e;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        f2 = fbz.d;
                    }
                    hfc hfc9 = dls.t(hfc8, 0.0f, f2, 1);
                    ibth ibth2 = fuhy0.j;
                    dld dld2 = fuhy0.g;
                    if(dld2 == null) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                dld2 = new dle(16.0f, 8.0f, 16.0f, 8.0f);
                                break;
                            }
                            case 1: {
                                dld2 = hyxx.c() ? new dle(24.0f, 16.0f, 24.0f, 16.0f) : fbz.a;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    gze gze2 = gzf.e(1650772862, new fuhu(ibtw4, fuhy0), goz1);
                    fcm.c(ibth2, hfc9, fuhy0.b, null, null, null, dld2, gze2, goz1, 0x30000000, 376);
                    goz1.x();
                    break;
                }
                case 2: {
                    ibtw4 = ibtw3;
                    goz1.M(1639865780);
                    hfc hfc10 = iqn.a(hfc3, "WalletButtonText");
                    if(hyxx.c()) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                f3 = fbz.d;
                                break;
                            }
                            case 1: {
                                f3 = fbz.e;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        f3 = fbz.d;
                    }
                    hfc hfc11 = dls.t(hfc10, 0.0f, f3, 1);
                    ibth ibth3 = fuhy0.j;
                    dld dld3 = fuhy0.g;
                    if(dld3 == null) {
                        switch(fuhy0.h.ordinal()) {
                            case 0: {
                                dld3 = new dle(16.0f, 8.0f, 16.0f, 8.0f);
                                break;
                            }
                            case 1: {
                                dld3 = hyxx.c() ? new dle(24.0f, 16.0f, 24.0f, 16.0f) : fbz.b;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                    }
                    gze gze3 = gzf.e(0x5563A954, new fuhv(ibtw4, fuhy0), goz1);
                    fcm.d(ibth3, hfc11, fuhy0.b, null, null, dld3, gze3, goz1, 0x30000000, 376);
                    goz1 = goz1;
                    goz1.x();
                    break;
                }
                default: {
                    if(v3 == 3) {
                        goz1.M(0x61D05516);
                        hfc hfc4 = iqn.a(hfc3, "WalletButtonElevated");
                        if(hyxx.c()) {
                            switch(fuhy0.h.ordinal()) {
                                case 0: {
                                    f = fbz.d;
                                    break;
                                }
                                case 1: {
                                    f = fbz.e;
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                        }
                        else {
                            f = fbz.d;
                        }
                        hfc hfc5 = dls.t(hfc4, 0.0f, f, 1);
                        ibth ibth0 = fuhy0.j;
                        dld dld0 = fuhy0.g;
                        if(dld0 == null) {
                            switch(fuhy0.h.ordinal()) {
                                case 0: {
                                    dld0 = new dle(16.0f, 8.0f, 16.0f, 8.0f);
                                    break;
                                }
                                case 1: {
                                    dld0 = hyxx.c() ? new dle(24.0f, 16.0f, 24.0f, 16.0f) : fbz.a;
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                        }
                        gze gze0 = gzf.e(-1020627272, new fuhw(ibtw3, fuhy0), goz1);
                        ibtw4 = ibtw3;
                        fcm.b(ibth0, hfc5, fuhy0.b, null, null, null, dld0, gze0, goz1, 0x30000000, 376);
                        goz1.x();
                        break;
                    }
                    goz1.M(0x7F050444);
                    goz1.x();
                    throw new ibnq();
                }
            }
            ibtw2 = ibtw4;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhr(hfc2, fuhy0, ibtw2, v, v1);
        }
    }

    public static final void c(fuhy fuhy0, goz goz0) {
        fuhx.a(fuhy0, goz0, 0);
    }
}

