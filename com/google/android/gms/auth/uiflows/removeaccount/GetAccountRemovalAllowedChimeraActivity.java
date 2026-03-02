package com.google.android.gms.auth.uiflows.removeaccount;

import amex;
import amez;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import xnz;

@GmsCoreVeId(257109)
public class GetAccountRemovalAllowedChimeraActivity extends xnz {
    public static final int h;

    @Override  // xnz
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        GetAccountRemovalAllowedController getAccountRemovalAllowedController0 = new GetAccountRemovalAllowedController(((AccountAuthenticatorResponse)intent0.getParcelableExtra("am_response")), ((Account)intent0.getParcelableExtra("account")), intent0.getBooleanExtra("show_lock_screen", false), intent0.getStringExtra("caller"));
        amex amex0 = getAccountRemovalAllowedController0.a(null);
        amez.D(amex0.b, getAccountRemovalAllowedController0, amex0.a);
        this.startActivity(amex0.b.addFlags(0x2000000));
        this.finish();
    }
}

