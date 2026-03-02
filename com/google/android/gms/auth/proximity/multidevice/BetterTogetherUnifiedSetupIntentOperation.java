package com.google.android.gms.auth.proximity.multidevice;

import akwr;
import akws;
import akww;
import alfr;
import algg;
import aliu;
import aljb;
import allr;
import android.accounts.Account;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import avyq;
import baun;
import bayn;
import bbmq;
import cjok;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import evuh;
import ggia;
import gqus;
import hpyw;
import hpyz;
import hpzt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import juk;
import juo;

public class BetterTogetherUnifiedSetupIntentOperation extends IntentOperation {
    public static final int a;
    private static final baun b;
    private final aliu c;

    static {
        BetterTogetherUnifiedSetupIntentOperation.b = new baun("ProximityAuth", new String[]{"BetterTogetherSetup"});
    }

    public BetterTogetherUnifiedSetupIntentOperation() {
        this.c = new aliu();
    }

    public BetterTogetherUnifiedSetupIntentOperation(Context context0) {
        this.c = new aliu();
        this.attachBaseContext(context0);
    }

    public static Intent a(Context context0) {
        return IntentOperation.getStartIntent(context0, BetterTogetherUnifiedSetupIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 == null) {
            BetterTogetherUnifiedSetupIntentOperation.b.m("Better Together setup was started with a null intent.", new Object[0]);
            return;
        }
        if(hpzt.a.b().k() && !akww.g(this, false)) {
            bbmq.J("com.google.android.gms.auth.proximity.multidevice.SettingsActivity", false);
            bbmq.J("com.google.android.gms.auth.proximity.multidevice.SettingsContentProvider", false);
            bbmq.J("com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextActivity", false);
            return;
        }
        if("com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP".equals(intent0.getAction())) {
            bbmq.G(this, "com.google.android.gms.auth.proximity.multidevice.SettingsActivity", true);
            bbmq.G(this, "com.google.android.gms.auth.proximity.multidevice.SettingsContentProvider", true);
            bbmq.G(this, "com.google.android.gms.auth.proximity.multidevice.SettingsMaterialNextActivity", allr.c());
            return;
        }
        if("com.google.android.gms.auth.proximity.multidevice.UNIFIED_SETUP_REQUESTED".equals(intent0.getAction())) {
            String s = intent0.getStringExtra("EXTRA_ACCOUNT_NAME_FOR_SETUP");
            if(s != null && !s.isEmpty()) {
                SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(this, s);
                akws akws0 = akwr.a(this);
                if(syncedCryptauthDevice0 == null) {
                    this.c.g(3);
                    return;
                }
                Account account0 = new Account(s, "com.google");
                boolean z = akws0.d(account0, gqus.b);
                HashSet hashSet0 = new HashSet(syncedCryptauthDevice0.m);
                BetterTogetherUnifiedSetupIntentOperation.b.h("Trying to " + (z ? "enable" : "disable"), new Object[0]);
                if(!z) {
                    ArrayList arrayList0 = new ArrayList();
                    int v = 0;
                    int v1 = 0;
                    for(Object object0: hashSet0) {
                        String s1 = (String)object0;
                        if(new HashSet(Arrays.asList(TextUtils.split(hpzt.a.b().c(), ","))).contains(s1)) {
                            BetterTogetherUnifiedSetupIntentOperation.b.h("Not disabling enabled feature %s since it is blocklisted for disabling", new Object[]{s1});
                        }
                        else {
                            baun baun0 = BetterTogetherUnifiedSetupIntentOperation.b;
                            baun0.h("Attempting to disable enabled feature %s", new Object[]{s1});
                            ++v;
                            if(hpyz.f()) {
                                arrayList0.add(s1);
                            }
                            else if(algg.b(ggia.d(new String[]{s1}), s, this)) {
                                ++v1;
                            }
                            else {
                                baun0.m("Failed to disable feature: " + s1, new Object[0]);
                            }
                        }
                    }
                    if(hpyz.f() && !arrayList0.isEmpty()) {
                        if(algg.b(arrayList0, s, this)) {
                            v1 = arrayList0.size();
                        }
                        else {
                            BetterTogetherUnifiedSetupIntentOperation.b.m("Failed to disable features: " + arrayList0.toString(), new Object[0]);
                        }
                    }
                    if(v == 0) {
                        this.c.e(1);
                    }
                    else if(v1 == 0) {
                        this.c.e(2);
                    }
                    else if(v > v1) {
                        this.c.e(3);
                    }
                    else {
                        this.c.e(0);
                    }
                    aljb.b(this, false);
                    return;
                }
                HashSet hashSet1 = new HashSet();
                if(hpyw.h()) {
                    try {
                        hashSet1 = new HashSet(new akww(this).d(account0));
                    }
                    catch(IOException iOException0) {
                        BetterTogetherUnifiedSetupIntentOperation.b.n("Couldn\'t retrieve supported features", iOException0, new Object[0]);
                    }
                }
                else {
                    hashSet1 = new HashSet(new akww(this).e(account0, new ArrayList()));
                }
                ArrayList arrayList1 = new ArrayList();
                int v2 = 0;
                int v3 = 0;
                for(Object object1: syncedCryptauthDevice0.l) {
                    String s2 = (String)object1;
                    boolean z1 = hashSet1.contains(gqus.b(s2));
                    boolean z2 = hashSet0.contains(s2);
                    boolean z3 = new HashSet(Arrays.asList(TextUtils.split(hpzt.a.b().d(), ","))).contains(s2);
                    if(z1 && !z2 && !z3) {
                        baun baun1 = BetterTogetherUnifiedSetupIntentOperation.b;
                        baun1.h("Enabling disabled feature %s", new Object[]{s2});
                        ++v2;
                        if(hpyz.f()) {
                            arrayList1.add(s2);
                        }
                        else if(algg.c(ggia.d(new String[]{s2}), account0.name, this)) {
                            ++v3;
                        }
                        else {
                            baun1.m("Failed to enable feature: " + s2, new Object[0]);
                        }
                    }
                    else {
                        BetterTogetherUnifiedSetupIntentOperation.b.h("Not enabling feature %s. isLocallySupported: %s isFeatureAlreadyEnabled: %s isFeatureSupportBlocklisted: %s", new Object[]{s2, Boolean.valueOf(z1), Boolean.valueOf(z2), Boolean.valueOf(z3)});
                    }
                }
                if(hpyz.f() && !arrayList1.isEmpty()) {
                    if(algg.c(arrayList1, account0.name, this)) {
                        v3 = arrayList1.size();
                    }
                    else {
                        BetterTogetherUnifiedSetupIntentOperation.b.m("Failed to enable features: " + arrayList1.toString(), new Object[0]);
                    }
                }
                if(v2 == 0) {
                    this.c.g(1);
                }
                else {
                    if(v3 == 0) {
                        this.c.g(4);
                        return;
                    }
                    if(v2 > v3) {
                        this.c.g(5);
                    }
                    else {
                        this.c.g(0);
                    }
                }
                if(v3 > 0 && !this.getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", 0).getBoolean("SETUP_COMPLETE_NOTIFICATION", false)) {
                    bayn bayn0 = bayn.f(this);
                    Resources resources0 = this.getResources();
                    aljb.a(bayn0, resources0);
                    String s3 = resources0.getString(0x7F152A57, new Object[]{SettingsChimeraContentProvider.a(this, s), ""});  // string:settings_subhead_enabled "Your %1$s and Chromebook will connect automatically. 
                                                                                                                                // %2$s"
                    juo juo0 = new juo(this, "better-together-notification-channel-id");
                    juo0.s(avyq.a(this, 0x7F080CFA));
                    juo0.D = resources0.getColor(0x7F060E76);  // color:quantum_googblue
                    juo0.m = 0;
                    juo0.D("Linked to Chromebook");
                    juo0.k(s3);
                    juk juk0 = new juk();
                    juk0.e(s3);
                    juo0.v(juk0);
                    juo0.h = cjok.a(this, 0, allr.a(this).putExtra("FROM_BETTER_TOGETHER_NOTIFICATION", true), 0xA000000);
                    juo0.h(true);
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("android.substName", "System");
                    juo0.e(bundle0);
                    if(hpzt.d()) {
                        Notification notification0 = juo0.a();
                        bayn0.y("better-together-setup-complete-tag", 1, evuh.bM, notification0);
                    }
                    else {
                        bayn0.x("better-together-setup-complete-tag", 1, juo0.a());
                    }
                    aljb.b(this, true);
                }
            }
            else {
                BetterTogetherUnifiedSetupIntentOperation.b.m("No accounts for Better Together setup", new Object[0]);
                this.c.g(2);
            }
        }
    }
}

