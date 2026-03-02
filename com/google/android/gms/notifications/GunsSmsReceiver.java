package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import hvsk;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GunsSmsReceiver extends TracingBroadcastReceiver {
    private final WebView a;

    public GunsSmsReceiver(WebView webView0) {
        super("notifications");
        this.a = webView0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ArrayList arrayList0 = new ArrayList();
        SmsMessage[] arr_smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent0);
        Pattern pattern0 = Pattern.compile(hvsk.a.b().e());
        for(int v1 = 0; v1 < arr_smsMessage.length; ++v1) {
            Matcher matcher0 = pattern0.matcher(arr_smsMessage[v1].getDisplayMessageBody());
            while(matcher0.find()) {
                arrayList0.add(matcher0.group(1));
            }
        }
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            String s = (String)arrayList0.get(v);
            this.a.loadUrl("javascript:onSmsReceived(\'" + s + "\')");
        }
    }
}

