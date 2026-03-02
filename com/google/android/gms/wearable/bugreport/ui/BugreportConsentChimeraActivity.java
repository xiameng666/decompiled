package com.google.android.gms.wearable.bugreport.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import bblp;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fcxk;
import fcxl;
import fcxm;
import fcxn;
import fcxo;
import fcxq;
import fcxs;
import fcxt;
import fcxu;
import fcxv;
import fcxw;
import fcxx;
import fcxy;
import fcyb;
import fcye;
import fcyi;
import fcyo;
import fcyp;
import fcyq;
import fcyr;
import fcyu;
import fcyw;
import ffej;
import gftb;
import hzuq;
import iw;
import j..util.Optional;
import lso;
import xob;

@GmsCoreVeId(0x3FEBE)
public final class BugreportConsentChimeraActivity extends xob {
    fcxx j;
    private fcyr k;

    public final fcyb a(boolean z) {
        fcyb fcyb0 = (fcyb)this.getSupportFragmentManager().h("BugreportConsentDialogFragment");
        return !z || fcyb0 != null ? fcyb0 : new fcyb();
    }

    public final fcyi b(boolean z) {
        fcyi fcyi0 = (fcyi)this.getSupportFragmentManager().h("RetryDialogFragment");
        if(z && fcyi0 == null) {
            fcyi fcyi1 = new fcyi();
            fcxl fcxl0 = new fcxl(this);
            fcxo fcxo0 = new fcxo(this);
            fcyi1.ag = Optional.of(fcxl0);
            fcyi1.ah = Optional.of(fcxo0);
            return fcyi1;
        }
        return fcyi0;
    }

    public final void c() {
        fcyb fcyb0 = (fcyb)this.getSupportFragmentManager().h("BugreportConsentDialogFragment");
        if(fcyb0 != null) {
            this.runOnUiThread(new fcxs(fcyb0));
        }
        this.h();
    }

    public final void f() {
        this.h();
        fcyb fcyb0 = this.a(true);
        gftb.check(fcyb0);
        if(fcyb0.isAdded()) {
            Dialog dialog0 = fcyb0.getDialog();
            if(dialog0 != null) {
                dialog0.show();
            }
            return;
        }
        fcyb0.show(this.getSupportFragmentManager(), "BugreportConsentDialogFragment");
    }

    public final void g(boolean z) {
        fcyb fcyb0 = this.a(false);
        if(fcyb0 != null) {
            Log.d("BugreportConsent", "showSnackbar");
            iw iw0 = (iw)fcyb0.getDialog();
            if(iw0 != null) {
                ViewGroup viewGroup0 = (ViewGroup)iw0.findViewById(0x1020002);
                if(viewGroup0 != null) {
                    fcyw fcyw0 = fcyb0.ah;
                    Context context0 = fcyb0.requireContext();
                    fcxy fcxy0 = new fcxy(fcyb0);
                    if(fcyw0.a.isPresent()) {
                        Log.d("SnackbarHandlerProvider", "showSnackbar: ignore since already shown");
                        return;
                    }
                    fcyu fcyu0 = new fcyu(fcyw0, context0, viewGroup0, z, (z ? 0x7F153626 : 0x7F153625), fcxy0);  // string:wearable_bugreport_connecting_status "Connecting to your watch..."
                    fcyw0.c.postDelayed(fcyu0, 500L);
                }
            }
        }
    }

    private final void h() {
        fcyi fcyi0 = this.b(false);
        if(fcyi0 != null) {
            this.runOnUiThread(new fcxq(fcyi0));
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(hzuq.c()) {
            String s = this.getCallingPackage();
            if(s == null) {
                Log.w("BugreportConsent", "Calling package is null");
            }
            else if(new ffej(this).c(s)) {
                Intent intent0 = this.getIntent();
                if(Log.isLoggable("BugreportConsent", 4)) {
                    Log.i("BugreportConsent", "Starting activity");
                    if(Log.isLoggable("BugreportConsent", 3)) {
                        Bundle bundle1 = intent0.getExtras();
                        if(bundle1 == null) {
                            Log.d("BugreportConsent", "Extras: null\n");
                        }
                        else {
                            Log.d("BugreportConsent", "Extras:\n");
                            for(Object object0: bundle1.keySet()) {
                                Log.d("BugreportConsent", String.format("%s: %s", ((String)object0), bundle1.get(((String)object0))));
                            }
                        }
                    }
                }
                fcyr fcyr0 = new fcyr(intent0);
                this.k = fcyr0;
                fcyp fcyp0 = new fcyp();
                Boolean boolean0 = Boolean.valueOf(false);
                if(((Boolean)fcyr0.a.map(fcyp0).orElse(boolean0)).booleanValue() && ((Boolean)this.k.b.map(new fcyo()).orElse(boolean0)).booleanValue()) {
                    if(!((Boolean)this.k.c.map(new fcyq()).orElse(boolean0)).booleanValue()) {
                        Log.w("BugreportConsent", "Peer id is empty");
                        this.setResult(1);
                        this.finish();
                        return;
                    }
                    if(this.j == null) {
                        this.j = new fcxx(this, new bblp(1, 9));
                    }
                    if(Log.isLoggable("BugreportConsent", 3)) {
                        Log.d("BugreportConsent", "BugreportConsentDialogViewModel: initialize");
                    }
                    fcye fcye0 = (fcye)new lso(this).a(fcye.class);
                    fcyr fcyr1 = this.k;
                    fcxt fcxt0 = new fcxt(this);
                    fcxu fcxu0 = new fcxu(this);
                    fcxv fcxv0 = new fcxv(this);
                    fcxw fcxw0 = new fcxw(this);
                    fcxm fcxm0 = new fcxm(this);
                    int v = Binder.getCallingUid();
                    PackageManager packageManager0 = this.getPackageManager();
                    String[] arr_s = packageManager0.getPackagesForUid(v);
                    String s1 = "bugreport";
                    if(arr_s != null && arr_s.length != 0) {
                        String s2 = arr_s[0];
                        try {
                            s1 = (String)packageManager0.getApplicationLabel(packageManager0.getApplicationInfo(s2, 0));
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            Log.w("BugreportConsent", "Failed to get application name for package: " + s2, packageManager$NameNotFoundException0);
                        }
                    }
                    fcye0.g = fcyr1;
                    fcye0.b = fcxt0;
                    fcye0.c = fcxu0;
                    fcye0.d = fcxv0;
                    fcye0.e = fcxw0;
                    fcye0.f = fcxm0;
                    fcye0.a = s1;
                    fcye0.h = this.j;
                    fcxn fcxn0 = new fcxn(this);
                    new bblp(1, 9).execute(new fcxk(this, fcxn0));
                    return;
                }
                Log.w("BugreportConsent", "Device name or OEM is empty");
                this.setResult(1);
                this.finish();
                return;
            }
            Log.w("BugreportConsent", "Activity invoked but not from OEM companion app.");
            this.setResult(1);
            this.finish();
            return;
        }
        Log.w("BugreportConsent", "Activity invoked but feature is disabled.");
        this.setResult(1);
        this.finish();
    }
}

