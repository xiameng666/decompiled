package com.google.android.gms.multidevice.service;

import ProtoLiteMessage;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import bbmq;
import bboh;
import cchj;
import cssn;
import csvh;
import csvi;
import cteu;
import ctfa;
import ctga;
import cume;
import cumf;
import evuh;
import ggtj;
import ghhe;
import ghjc;
import gyve;
import gyvu;
import gyvv;
import haav;
import hftc;
import ibnf;
import ibuk;
import ibuq;
import ibzk;
import icbb;
import icck;

public final class GcmChimeraIntentOperation extends ctfa {
    public icck a;
    public ibnf b;
    public ibnf c;
    public ctga d;
    private static final bboh e;

    static {
        GcmChimeraIntentOperation.e = cume.a(new ibuk(GcmChimeraIntentOperation.class));
    }

    public final ctga a() {
        ctga ctga0 = this.d;
        if(ctga0 != null) {
            return ctga0;
        }
        ibuq.j("invitationsManager");
        return null;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibnf ibnf0;
        Account account0;
        ibuq.f(intent0, "intent");
        bboh bboh0 = GcmChimeraIntentOperation.e;
        cumf.a(bboh0).B("Chime message received with intent: %s", intent0);
        if(bbmq.Q(this.getApplicationContext())) {
            return;
        }
        ((ggtj)bboh0.h()).x("Processing GCM chime message for device");
        String s = intent0.getStringExtra("accountid");
        String s1 = intent0.getStringExtra("deviceid");
        String s2 = intent0.getStringExtra("request");
        if(s != null && !ibzk.D(s)) {
            if(s1 != null && !ibzk.D(s1)) {
                if(s2 != null && !ibzk.D(s2)) {
                    byte[] arr_b = ghjc.e.q(s2);
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyvv.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    ibuq.e(((gyvv)hftv0), "parseFrom(...)");
                    gyve gyve0 = ((gyvv)hftv0).d;
                    if(gyve0 == null) {
                        gyve0 = gyve.a;
                    }
                    String s3 = gyve0.d;
                    ibuq.e(s3, "getDisplayName(...)");
                    Account[] arr_account = cchj.b(this.getApplicationContext()).o();
                    ibuq.e(arr_account, "getAccounts(...)");
                    for(int v = 0; true; ++v) {
                        account0 = null;
                        ibnf0 = null;
                        if(v >= arr_account.length) {
                            break;
                        }
                        account0 = arr_account[v];
                        String s4 = account0.name;
                        ibuq.e(s4, "name");
                        ibuq.f(s4, "<this>");
                        if(ibuq.m(ghhe.a.d(s4).toString(), s)) {
                            break;
                        }
                    }
                    if(account0 == null) {
                        ((ggtj)bboh0.j()).x("No account matching chime message found on device");
                        return;
                    }
                    gyvu gyvu0 = gyvu.b(((gyvv)hftv0).c);
                    if(gyvu0 == null) {
                        gyvu0 = gyvu.f;
                    }
                    switch(gyvu0.ordinal()) {
                        case 1: {
                            ((ggtj)bboh0.h()).x("Invitation received. Starting Invitation flow.");
                            ctga ctga0 = this.a();
                            String s5 = account0.name;
                            ibuq.e(s5, "name");
                            ctga0.d(s5, s3);
                            ctga ctga1 = this.a();
                            Intent intent1 = ctga1.a();
                            ctga1.b.startActivity(intent1);
                            return;
                        }
                        case 2: {
                            ((ggtj)bboh0.h()).x("New device added. Showing new device notification.");
                            icck icck0 = this.a;
                            if(icck0 == null) {
                                ibuq.j("scope");
                                icck0 = null;
                            }
                            icbb.b(icck0, null, null, new cteu(this, account0, null), 3);
                            ibnf ibnf1 = this.b;
                            if(ibnf1 == null) {
                                ibuq.j("notificationsRepository");
                            }
                            else {
                                ibnf0 = ibnf1;
                            }
                            csvh csvh0 = ((csvi)ibnf0).a();
                            ibuq.f(s3, "deviceName");
                            int v1 = s3.hashCode();
                            Intent intent2 = cssn.b().putExtra("EXTRA_SETTINGS_INTENT_SOURCE", "NEW_DEVICE_NOTIFICATION").putExtra("EXTRA_NOTIFICATION_ID", v1);
                            ibuq.e(intent2, "putExtra(...)");
                            PendingIntent pendingIntent0 = csvh0.a(intent2);
                            String s6 = csvh0.a.getString(0x7F15198D, new Object[]{s3});  // string:new_device_notification_title_updated "%1$s can now share with you"
                            ibuq.e(s6, "getString(...)");
                            String s7 = csvh0.a.getString(0x7F15198C, new Object[]{s3});  // string:new_device_notification_text "%1$s can now find this device and share things 
                                                                                          // like video calls"
                            ibuq.e(s7, "getString(...)");
                            csvh.d(csvh0, v1, "com.google.android.gms.multidevice.data.notifications.NEW_DEVICE_CHANNEL_ID", evuh.cl, s6, s7, null, pendingIntent0, null, 0x80);
                            csvh0.b.l(haav.d);
                            return;
                        }
                        default: {
                            ggtj ggtj0 = (ggtj)bboh0.j();
                            gyvu gyvu1 = gyvu.b(((gyvv)hftv0).c);
                            if(gyvu1 == null) {
                                gyvu1 = gyvu.f;
                            }
                            ggtj0.B("Unsupported notification type in Chime message: %s", gyvu1);
                            return;
                        }
                    }
                }
                ((ggtj)bboh0.h()).x("request is not set");
                return;
            }
            ((ggtj)bboh0.h()).x("deviceId is not set");
            return;
        }
        ((ggtj)bboh0.h()).x("accountId is not set");
    }
}

