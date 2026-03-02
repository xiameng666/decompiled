package com.google.android.gms.auth.uiflows.addaccount;

import amez;
import android.os.Bundle;
import bagv;
import bagy;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import gaff;
import gafg;
import gaga;
import gajv;
import hoxb;

@GmsCoreVeId(257090)
public class AccountAddedChimeraActivity extends amez implements gajv {
    @Override  // gajv
    public final void gB() {
    }

    @Override  // amdx
    protected final String gQ() {
        return "AccountAddedActivity";
    }

    // Detected as a lambda impl.
    @Override  // gajv
    public final void ku() {
        this.gN(-1, null);
    }

    private final void l() {
        gaga.f(this.getWindow(), false);
    }

    @Override  // xnz
    public final void onBackPressed() {
    }

    @Override  // amez
    protected final void onCreate(Bundle bundle0) {
        int v;
        super.onCreate(bundle0);
        if(!bagv.i(this.y().a)) {
            v = 0x7F0E00F7;  // layout:auth_account_added_activity
        }
        else if(hoxb.d()) {
            v = 0x7F0E00F9;  // layout:auth_account_added_glif_activity_v2
        }
        else {
            v = 0x7F0E00F8;  // layout:auth_account_added_glif_activity
        }
        bagy bagy0 = bagy.f(this, v);
        this.setContentView(bagy0.a());
        bagy0.c(this.getTitle());
        if((bagy0.a() instanceof SetupWizardLayout)) {
            SetupWizardLayout setupWizardLayout0 = (SetupWizardLayout)bagy0.a();
            setupWizardLayout0.p().a(this);
            setupWizardLayout0.p().b.setVisibility(4);
            this.l();
        }
        else {
            gaff gaff0 = (gaff)((GlifLayout)bagy0.a().findViewById(0x7F0B2009)).t(gaff.class);  // id:setup_wizard_layout
            gafg gafg0 = new gafg(this);
            gafg0.b(0x7F152F99);  // string:sud_next_button_label "Next"
            gafg0.b = (/* MISSING LAMBDA PARAMETER */) -> this.gN(-1, null);
            gafg0.c = 5;
            gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
            gaff0.c(gafg0.a());
        }
        bagv.e(bagy0.a());
    }

    @Override  // amdx
    public final void onResume() {
        super.onResume();
        this.l();
    }

    @Override  // xjb, android.view.Window$Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.l();
    }
}

