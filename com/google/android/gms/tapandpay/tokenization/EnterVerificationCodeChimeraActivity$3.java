package com.google.android.gms.tapandpay.tokenization;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class EnterVerificationCodeChimeraActivity.3 extends TracingBroadcastReceiver {
    final EnterVerificationCodeChimeraActivity a;

    public EnterVerificationCodeChimeraActivity.3(EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity0) {
        Objects.requireNonNull(enterVerificationCodeChimeraActivity0);
        this.a = enterVerificationCodeChimeraActivity0;
        super("tapandpay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        EnterVerificationCodeChimeraActivity enterVerificationCodeChimeraActivity0 = this.a;
        if(!enterVerificationCodeChimeraActivity0.isFinishing()) {
            SmsMessage[] arr_smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent0);
            for(int v = 0; v < arr_smsMessage.length; ++v) {
                if(enterVerificationCodeChimeraActivity0.B(arr_smsMessage[v].getMessageBody())) {
                    enterVerificationCodeChimeraActivity0.o(enterVerificationCodeChimeraActivity0.u.getText().toString());
                    return;
                }
            }
        }
    }
}

