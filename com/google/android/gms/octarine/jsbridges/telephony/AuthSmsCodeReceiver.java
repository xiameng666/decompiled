package com.google.android.gms.octarine.jsbridges.telephony;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dlax;
import gftb;
import hvvz;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class AuthSmsCodeReceiver extends TracingBroadcastReceiver {
    private final dlax a;

    public AuthSmsCodeReceiver(dlax dlax0) {
        super("octarine");
        this.a = dlax0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ArrayList arrayList0 = new ArrayList();
        SmsMessage[] arr_smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent0);
        Pattern pattern0 = Pattern.compile(hvvz.a.b().a());
        for(int v1 = 0; v1 < arr_smsMessage.length; ++v1) {
            Matcher matcher0 = pattern0.matcher(arr_smsMessage[v1].getDisplayMessageBody());
            while(matcher0.find()) {
                String s = matcher0.group(1);
                gftb.check(s);
                arrayList0.add(s);
            }
        }
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            String s1 = (String)arrayList0.get(v);
            try {
                Long.parseLong(s1);
            }
            catch(NumberFormatException unused_ex) {
                continue;
            }
            String s2 = String.format("if (window.ocTelephonySmsCodeReceived) { window.ocTelephonySmsCodeReceived(%s); }", JSONObject.quote(s1));
            this.a.d(s2);
        }
    }
}

