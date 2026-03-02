package com.google.android.gms.auth.uiflows.common;

import a;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import bbcu;
import bbmq;
import bboh;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gagb;
import ggtj;
import hoxf;
import xnz;

@GmsCoreVeId(257099)
public class UnpackingRedirectChimeraActivity extends xnz {
    private static final bboh h;

    static {
        UnpackingRedirectChimeraActivity.h = bboh.b("UnpackingRedirectAct", bbcu.cf);
    }

    @Override  // xnz
    public final void onCreate(Bundle bundle0) {
        UnpackingRedirectChimeraActivity unpackingRedirectChimeraActivity0;
        super.onCreate(bundle0);
        if(this.isFinishing()) {
            ((ggtj)UnpackingRedirectChimeraActivity.h.j()).x("Restarted UnpackingRedirectChimeraActivity.");
            if(hoxf.a.b().z()) {
                return;
            }
        }
        PendingIntent pendingIntent0 = (PendingIntent)this.getIntent().getParcelableExtra("target");
        if(pendingIntent0 != null) {
            Intent intent0 = new Intent();
            AccountAuthenticatorResponse accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)this.getIntent().getParcelableExtra("response");
            if(accountAuthenticatorResponse0 != null) {
                intent0.putExtra("response", accountAuthenticatorResponse0);
            }
            String s = bbmq.o(this);
            if(s != null) {
                intent0.putExtra("caller", s);
            }
            gagb.a(this.getIntent(), intent0);
            try {
                unpackingRedirectChimeraActivity0 = this;
                unpackingRedirectChimeraActivity0.startIntentSender(pendingIntent0.getIntentSender(), intent0, 0x2000000, 0x2000000, 0);
                unpackingRedirectChimeraActivity0.finish();
                return;
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                a.ae(UnpackingRedirectChimeraActivity.h.i(), "Unable to start unpacked pending intent!", intentSender$SendIntentException0);
                goto label_23;
            }
        }
        unpackingRedirectChimeraActivity0 = this;
    label_23:
        unpackingRedirectChimeraActivity0.setResult(0);
        unpackingRedirectChimeraActivity0.finish();
    }
}

