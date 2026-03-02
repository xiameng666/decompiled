package com.google.android.gms.chimera.container;

import ProtoLiteMessage;
import android.content.Intent;
import android.util.Log;
import awaf;
import awbp;
import awdn;
import cljp;
import clkm;
import clkq;
import clks;
import clkz;
import com.google.android.chimera.IntentOperation;
import gfuy;
import gged_interceptors;
import ggna;
import hftc;
import hfur;
import hriv;
import hrjr;
import hrwa;
import wyl;
import wyn;
import xde;
import xdk;
import xis;

public final class InitConfigOperation extends IntentOperation {
    private final void a(Intent intent0) {
        gged_interceptors gged0;
        String s = intent0.getStringExtra("chimera.CLIENT_SESSION_ID");
        xdk xdk0 = xis.a(intent0, "progressListener");
        awdn awdn0 = xdk0 == null ? null : new awdn(xdk0, hrjr.g());
        byte[] arr_b = intent0.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES");
        if(arr_b == null) {
            gged0 = ggna.a;
        }
        else {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)xde.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gged0 = gged_interceptors.i(((xde)hftv0).b);
            }
            catch(hfur hfur0) {
                Log.w("FeatureMgr", "Ignoring corrupt urgent features list: " + hfur0.toString());
                gged0 = ggna.a;
            }
        }
        awaf.a(this).g(5, awdn0, s, gged0);
        if(awdn0 != null && (!hrjr.g() || awdn0.a != null)) {
            Intent intent1 = IntentOperation.getStartIntent(this, WaitUpdateCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_UPDATE_COMPLETE");
            gfuy.e(intent1);
            xis.c(intent1, "liveListener", awdn0);
            WaitUpdateCompleteOperation.a(intent0, intent1, false);
            this.startService(intent1);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        gfuy.e(s);
        switch(s.hashCode()) {
            case 0xA79B695A: {
                if(s.equals("com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED")) {
                    this.a(intent0);
                    return;
                }
                break;
            }
            case -500294787: {
                if(s.equals("com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK")) {
                    this.a(intent0);
                    return;
                }
                break;
            }
            case 0xE583B177: {
                if(s.equals("com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN")) {
                    goto label_14;
                }
                break;
            }
            case 0x1A29CB45: {
                if(s.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                    this.a(wyl.a(this, wyn.d().f(), new awbp(this), null));
                label_14:
                    ConfigChimeraService.d().e(this);
                    cljp cljp0 = cljp.a(this);
                    if(hrwa.a.b().r()) {
                        clks clks0 = new clks();
                        clks0.t("AppModuleManagemntSrvce");
                        clks0.w(AppModuleManagementService.class.getName());
                        clks0.l(false);
                        clks0.a = clkz.n;
                        clks0.p = false;
                        clks0.j();
                        clks0.e();
                        cljp0.f(clks0.a());
                        return;
                    }
                    clkq clkq0 = new clkq();
                    clkq0.j(clkm.a(hriv.a.c().b()));
                    clkq0.w(AppModuleManagementService.class.getName());
                    clkq0.v(1);
                    clkq0.g(2);
                    clkq0.r(true);
                    clkq0.i(true);
                    clkq0.p = false;
                    clkq0.t("AppModuleManagemntSrvce");
                    cljp0.f(clkq0.a());
                    return;
                }
                break;
            }
        }
    }
}

