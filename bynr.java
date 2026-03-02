import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

public final class bynr {
    public static final void a(byhi byhi0, byns byns0, acp acp0, acp acp1, goz goz0, int v) {
        ibuq.f(byhi0, "viewModel");
        ibuq.f(acp0, "providerActivityLauncher");
        ibuq.f(acp1, "remoteEntryLauncher");
        goz goz1 = goz0.ao(0xE07D204C);
        int v1 = (v & 6) == 0 ? (goz1.Z(byhi0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(byns0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(acp0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(acp1) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            bynx bynx0 = byns0.c;
            switch(byhi0.b().f.ordinal()) {
                case 0: {
                    goz1.M(0x118699D);
                    List list0 = byns0.a.a;
                    if(!list0.isEmpty() && bynx0 != null) {
                        goz1.M(0x1197253);
                        boolean z = false;
                        switch(byns0.b.ordinal()) {
                            case 0: {
                                goz1.M(0x11AE57A);
                                goz1.M(5004770);
                                boolean z1 = goz1.Z(byhi0);
                                Object object0 = goz1.j();
                                if(z1 || object0 == gop.a) {
                                    object0 = new bymy(byhi0);
                                    goz1.P(object0);
                                }
                                goz1.x();
                                if(list0.size() > 1) {
                                    z = true;
                                }
                                goz1.M(5004770);
                                boolean z2 = goz1.Z(byhi0);
                                Object object1 = goz1.j();
                                if(z2 || object1 == gop.a) {
                                    object1 = new bymz(byhi0);
                                    goz1.P(object1);
                                }
                                goz1.x();
                                goz1.M(5004770);
                                boolean z3 = goz1.Z(byhi0);
                                Object object2 = goz1.j();
                                if(z3 || object2 == gop.a) {
                                    object2 = new byna(byhi0);
                                    goz1.P(object2);
                                }
                                goz1.x();
                                bynr.b(bynx0, ((ibts)object0), z, ((ibth)object1), ((ibth)object2), goz1, 0);
                                goz1 = goz1;
                                goz1.x();
                                break;
                            }
                            case 1: {
                                goz1.M(19020925);
                                goz1.M(5004770);
                                boolean z4 = goz1.Z(byhi0);
                                Object object3 = goz1.j();
                                if(z4 || object3 == gop.a) {
                                    object3 = new bynb(byhi0);
                                    goz1.P(object3);
                                }
                                goz1.x();
                                goz1.M(5004770);
                                boolean z5 = goz1.Z(byhi0);
                                Object object4 = goz1.j();
                                if(z5 || object4 == gop.a) {
                                    object4 = new bync(byhi0);
                                    goz1.P(object4);
                                }
                                goz1.x();
                                bynr.d(list0, ((ibts)object3), ((ibth)object4), goz1, 0);
                                goz1.x();
                                break;
                            }
                            default: {
                                goz1.M(0xB5B680BD);
                                goz1.x();
                                throw new ibnq();
                            }
                        }
                    }
                    else {
                        goz1.M(19356190);
                        String s = isq.c(0x7F15199B, goz1);  // string:no_app_found_to_save_title "No app found to save this information"
                        String s1 = isq.c(0x7F15199C, goz1);  // string:no_app_found_to_save_title_body "No available app was found on the device 
                                                              // to save this information. You can download an app that accepts this type of information 
                                                              // and try again."
                        goz1.M(5004770);
                        boolean z6 = goz1.Z(byhi0);
                        Object object5 = goz1.j();
                        if(z6 || object5 == gop.a) {
                            object5 = new bynd(byhi0);
                            goz1.P(object5);
                        }
                        goz1.x();
                        goz1.M(-1633490746);
                        int v2 = goz1.Z(byhi0) | goz1.Z(byns0);
                        Object object6 = goz1.j();
                        if(v2 != 0 || object6 == gop.a) {
                            object6 = new byms(byhi0, byns0);
                            goz1.P(object6);
                        }
                        goz1.x();
                        bylg.a(s, s1, ((ibth)object5), ((ibth)object6), goz1, 0);
                    }
                    goz1.x();
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(19749022);
                    Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                    bxzz bxzz0 = byhi0.b().f;
                    goz1.M(-1224400529);
                    int v3 = goz1.Z(byhi0) | goz1.Z(context0) | goz1.Z(acp0) | goz1.Z(acp1);
                    Object object7 = goz1.j();
                    if(v3 != 0 || object7 == gop.a) {
                        byne byne0 = new byne(byhi0, context0, acp0, acp1, null);
                        goz1.P(byne0);
                        object7 = byne0;
                    }
                    goz1.x();
                    gqe.f(bxzz0, ((ibtw)object7), goz1);
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0x132FFCF);
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(0xB5B66DB9);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bymt(byhi0, byns0, acp0, acp1, v);
        }
    }

    public static final void b(bynx bynx0, ibts ibts0, boolean z, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibuq.f(ibts0, "onEntrySelected");
        ibuq.f(ibth0, "onMoreCreateOptions");
        ibuq.f(ibth1, "onCancel");
        goz goz1 = goz0.ao(0xEE599AD1);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.Z(bynx0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibth1) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0x8A582071, new bynf(bynx0, ibth1), goz1);
            goz1.M(-1224400529);
            int v3 = goz1.Z(bynx0);
            if((v2 & 0x1C00) != 0x800) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v1 | (((v2 & 0x70) == 0x20 ? 1 : 0) | v3 | ((v2 & 0x380) == 0x100 ? 1 : 0))) != 0 || object0 == gop.a) {
                object0 = new bymr(bynx0, ibts0, z, ibth0);
                goz1.P(object0);
            }
            goz1.x();
            byjd.a(null, gze0, null, ((ibts)object0), goz1, 0x30, 5);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bymv(bynx0, ibts0, z, ibth0, ibth1, v);
        }
    }

    public static final void c(bynx bynx0, ibth ibth0, goz goz0, int v) {
        ibuq.f(bynx0, "entry");
        ibuq.f(ibth0, "onEntrySelected");
        goz goz1 = goz0.ao(0x74276433);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(bynx0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            bykp.c(null, ibth0, bynx0.h, bynx0.i, null, bynx0.j, false, null, null, null, false, false, null, null, goz1, v1 & 0x70, 0, 0x3FD1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bymu(bynx0, ibth0, v);
        }
    }

    public static final void d(List list0, ibts ibts0, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibts0, "onEntrySelected");
        ibuq.f(ibth0, "onBackButtonSelected");
        goz goz1 = goz0.ao(0x47D5B0D3);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0x3179E73, new bynn(ibth0), goz1);
            goz1.M(-1633490746);
            int v3 = goz1.Z(list0);
            if((v2 & 0x70) != 0x20) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v1 | v3) != 0 || object0 == gop.a) {
                object0 = new bymw(list0, ibts0);
                goz1.P(object0);
            }
            goz1.x();
            byjd.a(null, gze0, null, ((ibts)object0), goz1, 0x30, 5);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bymx(list0, ibts0, ibth0, v);
        }
    }
}

