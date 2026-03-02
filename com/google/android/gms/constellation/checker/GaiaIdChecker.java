package com.google.android.gms.constellation.checker;

import adqe;
import android.content.Context;
import android.content.Intent;
import baun;
import bbdg;
import bblf;
import bblg;
import bbvl;
import bbxc;
import bbxd;
import bbzu;
import bcah;
import bcai;
import bcak;
import bcal;
import bcam;
import bcba;
import bcbe;
import bcpv;
import bcqx;
import bcrc;
import bcrd;
import bcrh;
import cclw;
import ccmp;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.constellation.storage.gaialifecycle.ConstellationRoomDatabase;
import gmfx;
import hreb;
import hrfi;
import iccl;
import j..util.Objects;
import java.util.List;
import java.util.UUID;

public class GaiaIdChecker extends IntentOperation {
    protected bcah a;
    private static final baun b;
    private long c;

    static {
        GaiaIdChecker.b = bcrh.a("gaia_id_checker");
    }

    public GaiaIdChecker() {
        this.c = 0L;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!hrfi.a.e().p()) {
            GaiaIdChecker.b.h("GAIA id checker has been disabled.", new Object[0]);
            return;
        }
        boolean z = hreb.d();
        boolean z1 = Objects.equals(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        boolean z2 = intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        boolean z3 = intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        if(z1) {
            if(z2) {
                goto label_11;
            }
            if(z && z3) {
                z = true;
            label_11:
                UUID uUID0 = UUID.randomUUID();
                Context context0 = this.getApplicationContext();
                if(hreb.d()) {
                    this.a = new bcah(new bcba(context0, ConstellationRoomDatabase.m.a(context0).u()), iccl.b(cclw.d));
                }
                bcqx bcqx0 = bcqx.a(context0);
                this.c = System.currentTimeMillis();
                bbxc bbxc0 = new bbxc(bcqx0);
                bcrd bcrd0 = new bcrd(uUID0.toString());
                bcai bcai0 = new bcai(bcqx0);
                if(z) {
                    if(intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                        List list0 = adqe.a(intent0);
                        if(list0 != null && !list0.isEmpty()) {
                            bbzu bbzu0 = new bbzu(list0, bcrd0, context0, iccl.b(cclw.d));
                            bcam bcam0 = this.a.c(bbzu0);
                            bcai0.c(bcrd0, bcam0);
                            if(!(bcam0 instanceof bcal)) {
                                if((bcam0 instanceof bcak)) {
                                    GaiaIdChecker.b.f("Failed to validate gaia change event: " + ((bcak)bcam0).d + " " + ((bcak)bcam0).e, new Object[0]);
                                }
                            }
                            else if(((Boolean)((bcal)bcam0).c).booleanValue()) {
                                this.a.i(this.getApplicationContext(), bcrd0.a, bbzu0);
                                GaiaIdChecker.b.d("GaiaLifecycleManagement is enabled and we could process the added accounts.", new Object[0]);
                                goto label_36;
                            }
                        }
                        GaiaIdChecker.b.d("GaiaLifecycleManagement is enabled but we could not process the added accounts.", new Object[0]);
                        return;
                    }
                label_36:
                    if(intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                        List list1 = adqe.d(intent0);
                        if(list1 != null && !list1.isEmpty()) {
                            bcbe bcbe0 = new bcbe(list1, context0);
                            bcam bcam1 = this.a.c(bcbe0);
                            if((bcam1 instanceof bcal)) {
                                bcai0.c(bcrd0, bcam1);
                                if(((Boolean)((bcal)bcam1).c).booleanValue()) {
                                    this.a.i(this.getApplicationContext(), bcrd0.a, bcbe0);
                                    GaiaIdChecker.b.d("GaiaLifecycleManagement is enabled and we could process the removed accounts.", new Object[0]);
                                    goto label_51;
                                }
                            }
                            else if((bcam1 instanceof bcak)) {
                                GaiaIdChecker.b.f("Failed to validate gaia change event: " + ((bcak)bcam1).d + " " + ((bcak)bcam1).e, new Object[0]);
                            }
                        }
                        GaiaIdChecker.b.d("GaiaLifecycleManagement is enabled but we could not process the removed accounts.", new Object[0]);
                        return;
                    }
                }
            label_51:
                bcpv.a(context0);
                if(!bcpv.b(context0)) {
                    bbxc0.a(uUID0, 8, new bcrc(gmfx.u, false), this.c);
                }
                bbxc0.b(uUID0, 8, this.c);
                bblg bblg0 = new bblg(10);
                new ccmp().a(bbdg.eq);
                bbvl.h();
                bblf bblf0 = new bblf(bblg0);
                bbvl.g(context0, uUID0, 4, new bbxd(bbxc0, GaiaIdChecker.b, uUID0, 6, bblf0, false, this.c, this.a, bcai0));
                return;
            }
        }
        GaiaIdChecker.b.m("Get an unexpected intent:" + intent0, new Object[0]);
    }
}

