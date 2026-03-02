package com.google.android.gms.auth.uiflows.addaccount;

import ajcn;
import ajes;
import alxn;
import alxo;
import alxp;
import alxq;
import alxr;
import alxs;
import amez;
import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import bagj;
import bagk;
import bagv;
import bagy;
import ca;
import clht;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import evql;
import gaff;
import gafg;
import gajv;
import hoxb;
import java.util.Arrays;
import java.util.List;
import jeb.synthetic.FIN;

@GmsCoreVeId(257096)
public class DmSetScreenlockChimeraActivity extends amez implements bagj, gajv {
    public static final ajcn h;
    bagk i;
    private final ajes j;
    private final alxn k;

    static {
        DmSetScreenlockChimeraActivity.h = new ajcn("account");
    }

    public DmSetScreenlockChimeraActivity() {
        this.j = new ajes(AppContextProvider.a());
        this.k = alxn.a();
    }

    @Override  // gajv
    public final void gB() {
        this.l();
    }

    @Override  // amdx
    protected final String gQ() {
        return "DmSetScreenlockActivity";
    }

    @Override  // gajv
    public final void ku() {
        this.startActivityForResult(new Intent("android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD"), 1);
    }

    public final void l() {
        bagk bagk0 = this.i;
        if(bagk0 != null) {
            bagk0.dismissAllowingStateLoss();
        }
        this.i = bagk.z("This account requires screenlock security. Would you like to start over with a different account?", "Switch Accounts", "Go Back", false);
        ca ca0 = new ca(this.gy());
        ca0.v(this.i, "skip dialog");
        ca0.b();
    }

    @Override  // xnz
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            this.gN(-1, null);
        }
    }

    @Override  // xnz
    public final void onBackPressed() {
        this.l();
    }

    @Override  // amez
    protected final void onCreate(Bundle bundle0) {
        int v2;
        super.onCreate(bundle0);
        new clht();
        if(((KeyguardManager)this.getSystemService("keyguard")).isDeviceSecure()) {
            alxn alxn0 = this.k;
            Object object0 = alxn0.c;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            long v1 = SystemClock.elapsedRealtime();
            if(alxn0.a != -1L && v1 <= alxn0.a + 30000L) {
                FIN.finallyExec$NT(v);
            }
            else {
                alxn0.a = v1;
                FIN.finallyCodeBegin$NT(v);
                List list0 = Arrays.asList(new String[]{"authzen", "PublicKey"});
                Account account0 = (Account)this.getIntent().getParcelableExtra(DmSetScreenlockChimeraActivity.h.a);
                evql evql0 = this.j.i(9, list0, "ForceRegistration", account0, null);
                evql0.b(new alxs(this));
                evql0.a(new alxr(this));
                evql0.A(new alxq(this));
            }
            this.gN(2, null);
        }
        if(!bagv.i(this.y().a)) {
            v2 = 0x7F0E0118;  // layout:auth_device_management_screenlock
        }
        else if(hoxb.d()) {
            v2 = 0x7F0E011A;  // layout:auth_device_management_screenlock_glif_v2
        }
        else {
            v2 = 0x7F0E0119;  // layout:auth_device_management_screenlock_glif
        }
        bagy bagy0 = bagy.f(this, v2);
        this.setContentView(bagy0.a());
        if((bagy0.a() instanceof SetupWizardLayout)) {
            NavigationBar navigationBar0 = ((SetupWizardLayout)bagy0.a()).p();
            navigationBar0.a(this);
            Button button0 = navigationBar0.b;
            button0.setCompoundDrawables(null, null, null, null);
            Button button1 = navigationBar0.a;
            button0.setText("Skip");
            button0.setContentDescription("Skip");
            button1.setText("Next");
            button1.setContentDescription("Next");
        }
        else {
            gaff gaff0 = (gaff)((GlifLayout)bagy0.a().findViewById(0x7F0B2009)).t(gaff.class);  // id:setup_wizard_layout
            gafg gafg0 = new gafg(this);
            gafg0.b(0x7F15089B);  // string:common_next "Next"
            gafg0.b = new alxo(this);
            gafg0.c = 5;
            gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
            gaff0.c(gafg0.a());
            gafg gafg1 = new gafg(this);
            gafg1.b(0x7F1508E0);  // string:common_skip "Skip"
            gafg1.b = new alxp(this);
            gafg1.c = 7;
            gafg1.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
            gaff0.d(gafg1.a());
        }
        this.setTitle(((Account)this.x().a(DmSetScreenlockChimeraActivity.h)).name);
        bagy0.c(this.getTitle());
        bagv.e(bagy0.a());
        this.i = (bagk)this.gy().h("skip dialog");
    }

    @Override  // bagj
    public final void p(bagk bagk0, int v) {
        if(v == 1 && this.i == bagk0) {
            this.gN(1, null);
        }
    }
}

