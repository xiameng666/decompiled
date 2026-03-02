package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.os.UserHandle;
import android.util.Log;
import batl;
import bsln;
import bsma;
import bsmn;
import bsmy;
import bspf;
import bsqa;
import bsqb;
import bsru;
import btcq;
import btcu;
import com.google.android.chimera.IntentOperation;
import fhcd;
import j..util.Objects;
import java.util.Collections;

public final class GcmProxyIntentOperation extends IntentOperation {
    public static void a(Context context0, Intent intent0) {
        bsln.i(context0);
        if(bsln.d() == 0) {
            GcmProxyIntentOperation.b(intent0, 0);
            return;
        }
        Intent intent1 = new Intent("com.google.android.gcm.USER_FORWARD");
        intent1.setPackage("com.google.android.gms");
        intent1.putExtra("intent", intent0);
        intent1.putExtra("userSerial", bsln.d());
        intent1.addFlags(0x10000000);
        if(bsln.j() && bsln.a) {
            Object object0 = bsln.f(0);
            batl.s(object0);
            context0.sendBroadcastAsUser(intent1, ((UserHandle)object0));
            return;
        }
        context0.sendBroadcast(intent1);
    }

    private static void b(Intent intent0, int v) {
        batl.l(bsln.d() == 0);
        if(v < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String s = intent0.getAction();
        bsmy bsmy0 = bsmy.b();
        if(Objects.equals(s, "com.google.android.gcm.intent.SEND")) {
            bsmn bsmn0 = bsmy0.a();
            Context context0 = bsmn0.b;
            if(fhcd.g(context0)) {
                return;
            }
            GcmSenderChimeraProxy.a(context0);
            bsma bsma0 = new bsma(bsmn0, intent0, v);
            bsmn0.c.execute(bsma0);
            return;
        }
        if(Objects.equals(s, "com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD")) {
            bspf bspf0 = bsmy0.g();
            Parcelable parcelable0 = intent0.getParcelableExtra("msg");
            if(!(parcelable0 instanceof Message)) {
                Log.w("GCM", "Invalid forwarded request: " + intent0);
                return;
            }
            bspf0.a(((Message)parcelable0), v);
            return;
        }
        if(Objects.equals(s, "com.google.android.c2dm.intent.REGISTER")) {
            btcq btcq0 = bsmy0.m();
            btcu btcu0 = btcu.g(1, v, intent0, Collections.EMPTY_MAP);
            if(btcu0 == null) {
                return;
            }
            btcq0.f(btcu0);
            return;
        }
        if(Objects.equals(s, "com.google.android.c2dm.intent.UNREGISTER")) {
            btcq btcq1 = bsmy0.m();
            btcu btcu1 = btcu.g(2, v, intent0, btcu.i(0));
            if(btcu1 == null) {
                return;
            }
            btcq1.f(btcu1);
            return;
        }
        if(Objects.equals(s, "android.intent.action.PACKAGE_REPLACED")) {
            bsqb bsqb0 = GcmPackageIntentOperation.a(intent0, v);
            if(bsqb0 == null) {
                return;
            }
            bsmy.b().e().c(bsqb0);
            return;
        }
        if(Objects.equals(s, "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            bsqb bsqb1 = GcmPackageIntentOperation.a(intent0, v);
            if(bsqb1 == null) {
                return;
            }
            bsmy.b().e().d(bsqb1);
            return;
        }
        if(Objects.equals(s, "com.google.android.gms.gcm.CHECKBOX_EVENT")) {
            bsmy0.e().a();
            return;
        }
        if(Objects.equals(s, "com.google.android.gcm.intent.USER_UNLOCKED")) {
            bsmn bsmn1 = bsmy0.a();
            bsru bsru0 = (bsru)bsmn1.t.get();
            if(bsru0 != null) {
                bsqa bsqa0 = bsmn1.d;
                if(bsqa0 != null) {
                    bsqa0.a(intent0, bsru0);
                }
            }
            return;
        }
        Log.w("GCM", "Unexpected forwarded intent: " + intent0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!Objects.equals(intent0.getAction(), "com.google.android.gcm.USER_FORWARD")) {
            Log.w("GCM", "Unexpected intent: " + intent0);
            return;
        }
        Intent intent1 = (Intent)intent0.getParcelableExtra("intent");
        if(intent1 == null) {
            Log.w("GCM", "GcmProxyIntentOperation.onHandleIntent: dropping since KEY_ORIGINAL_INTENT isn\'t present in " + intent0);
            return;
        }
        GcmProxyIntentOperation.b(intent1, intent0.getIntExtra("userSerial", -1));
    }
}

