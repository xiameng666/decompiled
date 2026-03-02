package com.google.android.gms.wallet.common.ui;

import android.content.Intent;
import android.os.Bundle;
import batl;
import ca;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fbgn;
import gczl;
import gczm;
import xob;

public class ErrorChimeraActivity extends xob implements gczl {
    public static Intent a(BuyFlowConfig buyFlowConfig0, Intent intent0, String s) {
        Intent intent1 = new Intent();
        intent1.setClassName("com.google.android.gms", "com.google.android.gms.wallet.common.ui.ErrorActivity");
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent1.putExtra("resultCode", 0);
        intent1.putExtra("resultData", intent0);
        batl.s(s);
        intent1.putExtra("message", s);
        return intent1;
    }

    @Override  // gczl
    public final void aD(int v, int v1) {
        this.b();
    }

    private final void b() {
        Intent intent0 = this.getIntent();
        this.setResult(intent0.getIntExtra("resultCode", 0), ((Intent)intent0.getParcelableExtra("resultData")));
        this.finish();
    }

    @Override  // xnb
    public final void onBackPressed() {
        this.b();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        Intent intent0 = this.getIntent();
        fbgn.D(this, ((BuyFlowConfig)intent0.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig")), fbgn.a, false);
        super.onCreate(bundle0);
        gczm gczm0 = (gczm)this.getSupportFragmentManager().h("errorDialogFragment");
        if(bundle0 == null) {
            gczm0 = gczm.z(4, null, intent0.getStringExtra("message"), 0);
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.v(gczm0, "errorDialogFragment");
            ca0.a();
        }
        gczm0.ag = this;
    }
}

