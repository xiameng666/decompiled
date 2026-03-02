package com.google.android.gms.tapandpay.tokenization;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import batl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import j..util.Objects;

class EnterVerificationCodeChimeraActivity.4 extends TracingBroadcastReceiver {
    final EnterVerificationCodeChimeraActivity a;

    public EnterVerificationCodeChimeraActivity.4(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity0) {
        Objects.requireNonNull(enterVerificationCodeChimeraActivity0);
        this.a = enterVerificationCodeChimeraActivity0;
        super("tapandpay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity0 = this.a;
        if(!enterVerificationCodeChimeraActivity0.isFinishing() && intent0 != null) {
            String s = intent0.getAction();
            batl.s(s);
            if(s.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED") && intent0.hasExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 != null) {
                    Status status0 = (Status)bundle0.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    if(status0 != null) {
                        switch(status0.i) {
                            case 0: {
                                goto label_11;
                            }
                            case 15: {
                                goto label_15;
                            }
                        }
                        return;
                    label_11:
                        Intent intent1 = (Intent)bundle0.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                        if(intent1 != null) {
                            enterVerificationCodeChimeraActivity0.startActivityForResult(intent1, 200);
                            return;
                        label_15:
                            ((ggtj)EnterVerificationCodeChimeraActivity.j.i()).x("Timeout catching OTP SMS");
                        }
                    }
                }
            }
        }
    }
}

