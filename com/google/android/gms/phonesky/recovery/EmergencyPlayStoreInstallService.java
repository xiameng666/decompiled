package com.google.android.gms.phonesky.recovery;

import ProtoLiteMessage;
import abyp;
import abyq;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import bbdg;
import ccmq;
import cllr;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.phonesky.recovery.service.EmergencyPlayStoreInstallIntentOperation;
import eiup;
import gftb;
import hftc;
import hfur;

public class EmergencyPlayStoreInstallService extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        abyp abyp0;
        ccmq.a().a(bbdg.ui);
        Bundle bundle0 = cllr0.b;
        Context context0 = AppContextProvider.a();
        gftb.check(bundle0);
        String s = bundle0.getString("emergencyInstallConfig");
        if(s == null) {
            eiup.b("emergencyInstallConfigString is null", new Object[0]);
            return 2;
        }
        byte[] arr_b = Base64.decode(s, 2);
        Intent intent0 = null;
        if(arr_b == null) {
            eiup.b("Config is null", new Object[0]);
            goto label_19;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)abyp.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                abyp0 = (abyp)hftv0;
                goto label_20;
            }
            catch(hfur unused_ex) {
                eiup.b("Invalid protobuf", new Object[0]);
            }
        label_19:
            abyp0 = null;
        }
    label_20:
        int v = abyq.b(bundle0.getInt("packageChange"));
        String s1 = bundle0.getString("fixUuid");
        if(abyp0 != null && v != 0 && s1 != null) {
            Intent intent1 = IntentOperation.getStartIntent(context0, EmergencyPlayStoreInstallIntentOperation.class, "com.google.android.gms.phonesky.recovery.ACTION");
            if(intent1 != null) {
                intent0 = intent1.putExtra("fixUuid", s1).putExtra("packageChange", abyq.a(v)).putExtra("emergencyInstallConfig", abyp0.toBytesArray());
            }
            if(intent0 == null) {
                eiup.b("Intent is null", new Object[0]);
                return 2;
            }
            context0.startService(intent0);
            return 0;
        }
        eiup.b("Null variables", new Object[0]);
        return 2;
    }
}

