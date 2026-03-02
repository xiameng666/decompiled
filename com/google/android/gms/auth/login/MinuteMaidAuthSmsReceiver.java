package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import hpfi;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinuteMaidAuthSmsReceiver extends TracingBroadcastReceiver {
    private final WebView a;

    public MinuteMaidAuthSmsReceiver(WebView webView0) {
        super("auth_account");
        this.a = webView0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ArrayList arrayList0 = new ArrayList();
        SmsMessage[] arr_smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent0);
        if(arr_smsMessage == null) {
            Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidAuthSmsReceiver] messages is null"));
            return;
        }
        Pattern pattern0 = Pattern.compile(hpfi.a.i().u());
        for(int v1 = 0; v1 < arr_smsMessage.length; ++v1) {
            String s = arr_smsMessage[v1].getDisplayMessageBody();
            if(s == null) {
                Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidAuthSmsReceiver] messageBody is null"));
            }
            else {
                Matcher matcher0 = pattern0.matcher(s);
                while(matcher0.find()) {
                    arrayList0.add(matcher0.group(1));
                }
            }
        }
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            String s1 = (String)arrayList0.get(v);
            this.a.loadUrl("javascript:onSmsReceived(\'" + s1 + "\')");
        }
    }
}

