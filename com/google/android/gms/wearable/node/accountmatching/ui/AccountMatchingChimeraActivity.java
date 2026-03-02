package com.google.android.gms.wearable.node.accountmatching.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import azts;
import azxq;
import azxs;
import azyd_linstner;
import azyf;
import azyg;
import azyq;
import batl;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import du;
import evql;
import evrg;
import fcei;
import fcej;
import fcfo;
import fczo;
import fdge;
import fdgf;
import fdlk;
import febs;
import febt;
import febw;
import febx;
import feby;
import febz;
import feck;
import fecn;
import gfqx;
import gfsx;
import gftb;
import hzyg;
import xni;

@GmsCoreVeId(0x3FEC4)
public final class AccountMatchingChimeraActivity extends xni implements fcei {
    public gfsx j;
    private fcej k;

    public AccountMatchingChimeraActivity() {
        this.k = null;
        this.j = gfqx.a;
    }

    @Override  // fcei
    public final void a(ConnectionStateEventParcelable connectionStateEventParcelable0) {
        int v = connectionStateEventParcelable0.a;
        if(v >= 0) {
            if(v != 5 && (!hzyg.a.b().e() || v != 0)) {
                if(Log.isLoggable("Wear_AccountMatching", 4)) {
                    Log.i("Wear_AccountMatching", "[Account Matching Activity] Ignored ConnectionStateEvent: " + v);
                }
                return;
            }
            this.setResult(-1);
            this.finish();
            return;
        }
        this.setResult(0);
        this.finish();
    }

    public static Intent g(String s, String s1, String s2) {
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.gms", "com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingActivity");
        intent0.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.FragmentTag", s);
        intent0.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress", s1);
        intent0.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage", s2);
        return intent0;
    }

    // Detected as a lambda impl.
    public final evql l() {
        String s = this.getIntent().getStringExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress");
        if(s == null) {
            return evrg.c(new IllegalStateException("EXTRA_DEVICE_ADDRESS is required"));
        }
        if(s.equals(this.j.g())) {
            return evrg.d(null);
        }
        if(this.j.i()) {
            return this.o().e(new febs(this));
        }
        if(Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "Registering OnConnectionStateChangeListener for " + s);
        }
        fcej fcej0 = this.k;
        gftb.check(fcej0);
        IntentFilter[] arr_intentFilter = {fdlk.b("com.google.android.gms.wearable.CONNECTION_STATE_CHANGED", new Uri.Builder().scheme("wear").authority(s).path("connection-state").build(), 0)};
        azyf azyf0 = azyg.b(this, fcej0.B, "OnConnectionSetupStateChangedListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new fdge(this, azyf0, arr_intentFilter);
        azyq0.b = new fdgf(this);
        azyq0.e = 24036;
        evql evql0 = fcej0.iH(azyq0.a());
        evql0.z(new febt(this, s));
        return evql0;
    }

    public final void m(AppTheme appTheme0, String s, Bundle bundle0) {
        fczo.g(appTheme0, this.getIntent(), this);
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[Account Matching Activity] Loading fragment: " + s);
        }
        du du0 = this.getSupportFragmentManager().h(s);
        if(du0 == null) {
            if(Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", "[Account Matching Activity] Target fragment does not exist; creating.");
            }
            du0 = null;
            switch(s) {
                case "loading_fragment": {
                    if(Log.isLoggable("Wear_AccountMatching", 3)) {
                        Log.d("Wear_AccountMatching", "[LoadingFragment] newInstance()");
                    }
                    du0 = new feck();
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable("theme", appTheme0);
                    du0.setArguments(bundle1);
                    break;
                }
                case "sign_in_fragment": {
                    if(hzyg.f()) {
                        AccountsMatcher.AccountsMatcherResult accountsMatcher$AccountsMatcherResult0 = (AccountsMatcher.AccountsMatcherResult)bundle0.getParcelable("com.google.android.gms.wearable.node.accountmatching.ui.SignInAccounts");
                        IBinder iBinder0 = bundle0.getBinder("com.google.android.gms.wearable.node.accountmatching.ui.CallbackBinder");
                        gftb.check(iBinder0);
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        azxs azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                        du0 = fecn.y(appTheme0, accountsMatcher$AccountsMatcherResult0, azxs0.asBinder());
                    }
                    else {
                        du0 = fecn.y(appTheme0, ((AccountsMatcher.AccountsMatcherResult)bundle0.getParcelable("com.google.android.gms.wearable.node.accountmatching.ui.SignInAccounts")), bundle0.getBinder("com.google.android.gms.wearable.node.accountmatching.ui.CallbackBinder"));
                    }
                    break;
                }
                default: {
                    if(Log.isLoggable("Wear_AccountMatching", 5)) {
                        Log.w("Wear_AccountMatching", "[Account Matching Activity] Unknown fragment requested: " + s);
                    }
                }
            }
        label_38:
            if(du0 != null) {
                Log.i("Wear_AccountMatching", "[Account Matching Activity] Starting " + s);
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.z(0x7F0B14C5, du0, s);  // id:fragment_container
                ca0.a();
            }
        }
        else if(!du0.isVisible()) {
            if(Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", "[Account Matching Activity] Target fragment already exists; attaching.");
            }
            goto label_38;
        }
        else if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[Account Matching Activity] Target fragment is already shown.");
        }
    }

    // Detected as a lambda impl.
    public final void n() {
        if(Log.isLoggable("Wear_AccountMatching", 5)) {
            Log.w("Wear_AccountMatching", "[Account Matching Activity] Aborting: Could not register listener for watch");
        }
        this.setResult(0);
        this.finish();
    }

    private final evql o() {
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "Unregistering OnConnectionStateChangeListener for " + this.j);
        }
        fcej fcej0 = this.k;
        gftb.check(fcej0);
        azyd_linstner azyd0 = azyg.b(this, fcej0.B, "OnConnectionSetupStateChangedListener").listener_;
        batl.s(azyd0);
        evql evql0 = fcej0.jm(azyd0, 0);
        evql0.b(new febz(this));
        return evql0;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Log.i("Wear_AccountMatching", "[Account Matching Activity] onCreate called!");
        this.setContentView(0x7F0E0EA7);  // layout:wearable_account_matching_activity
        this.k = fcfo.b(this);
        if(hzyg.c()) {
            this.l().A((/* MISSING LAMBDA PARAMETER */) -> {
                if(Log.isLoggable("Wear_AccountMatching", 5)) {
                    Log.w("Wear_AccountMatching", "[Account Matching Activity] Aborting: Could not register listener for watch");
                }
                this.setResult(0);
                this.finish();
            });
        }
        this.getWindow().addFlags(0x80);
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        this.o();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        if(Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[Account Matching Activity] New intent arrived: " + intent0);
        }
        super.onNewIntent(intent0);
        this.setIntent(intent0);
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        Bundle bundle0 = this.getIntent().getExtras();
        if(bundle0 == null) {
            throw new IllegalStateException("EXTRA_FRAGMENT_TAG is required");
        }
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[Account Matching Activity] Extras:\n");
            for(Object object0: bundle0.keySet()) {
                Log.d("Wear_AccountMatching", String.format("    %s: %s", ((String)object0), bundle0.get(((String)object0))));
            }
        }
        String s = bundle0.getString("com.google.android.gms.wearable.node.accountmatching.ui.FragmentTag");
        if(s == null) {
            throw new IllegalStateException("EXTRA_FRAGMENT_TAG is required");
        }
        azts azts0 = fcfo.f(this);
        String s1 = bundle0.getString("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage");
        if(s1 == null) {
            if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "No calling package, using default theme.");
            }
            this.m(fczo.d(), s, bundle0);
        }
        else {
            if(Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", "Calling package: " + s1);
            }
            evql evql0 = azts0.cl(s1);
            evql0.b(new febw(this, s, bundle0));
            evql0.A(new febx(this, s, bundle0));
            evql0.a(new feby(this, s, bundle0));
        }
        if(hzyg.c() && this.j.i()) {
            return;
        }
        this.l().A((/* MISSING LAMBDA PARAMETER */) -> {
            if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "[Account Matching Activity] Aborting: Could not register listener for watch");
            }
            this.setResult(0);
            this.finish();
        });
    }
}

