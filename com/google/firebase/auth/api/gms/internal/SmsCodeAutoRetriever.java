package com.google.firebase.auth.api.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import baun;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gost;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmsCodeAutoRetriever extends TracingBroadcastReceiver {
    public final Context a;
    public boolean b;
    private static final baun c;
    private final gost d;

    static {
        SmsCodeAutoRetriever.c = new baun("FirebaseAuth", new String[]{"SmsCodeAutoRetriever"});
    }

    public SmsCodeAutoRetriever(Context context0, gost gost0) {
        super("firebase_auth");
        this.b = false;
        this.a = context0;
        this.d = gost0;
    }

    public final void b(List list0) {
        if(this.b) {
            this.a.unregisterReceiver(this);
            this.b = false;
        }
        else {
            SmsCodeAutoRetriever.c.o("Trying to unregister for sms broadcast receiving, but no receiver isregistered", new Object[0]);
        }
        if(list0 != null) {
            Object object0 = list0.get(0);
            Message message0 = this.d.b.b.obtainMessage(2, new Object[]{this.d.a, object0});
            this.d.b.b.sendMessage(message0);
        }
    }

    public static boolean c() {
        return "unknown".equals(Build.BOARD) && ("generic".equals(Build.BRAND) || "generic_x86".equals(Build.BRAND) || "google".equals(Build.BRAND)) && ("generic".equals(Build.DEVICE) || "generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE));
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ArrayList arrayList0 = new ArrayList();
        SmsMessage[] arr_smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent0);
        if(arr_smsMessage != null) {
            Pattern pattern0 = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)");
            for(int v = 0; v < arr_smsMessage.length; ++v) {
                Matcher matcher0 = pattern0.matcher(arr_smsMessage[v].getDisplayMessageBody());
                while(matcher0.find()) {
                    arrayList0.add(matcher0.group());
                }
                if(!arrayList0.isEmpty()) {
                    break;
                }
            }
            if(!arrayList0.isEmpty()) {
                this.b(arrayList0);
            }
        }
    }
}

