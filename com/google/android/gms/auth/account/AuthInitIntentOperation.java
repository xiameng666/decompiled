package com.google.android.gms.auth.account;

import a;
import aczh;
import adae;
import addx;
import adiu;
import adja;
import adsk;
import adsm;
import akez;
import alwr;
import android.content.Intent;
import avzf;
import bbcu;
import bbmq;
import bboh;
import bbpz;
import com.google.android.chimera.IntentOperation;
import fphq;
import fpib;
import gfsp;
import gfss;
import gged_interceptors;
import ggna;
import hoxm;
import hoyc;
import j..util.Objects;

public class AuthInitIntentOperation extends avzf {
    public static final String a;
    protected static final String[] b;
    protected static final String[] c;
    protected static final gged_interceptors d;
    private static final bboh e;
    private static final addx[] f;

    static {
        AuthInitIntentOperation.e = bboh.b("AuthInitIntentOperation", bbcu.cf);
        AuthInitIntentOperation.a = bbpz.f("com.google.android.gms.auth_account");
        AuthInitIntentOperation.b = new String[]{"com.google.android.gms.auth.setup.devicesignals.LockScreenReceiver", "com.google.android.gms.auth.account.accounttransfer.AccountTransferReceiver", "com.google.android.gms.auth.account.data.WorkAccountStoreReceiver", "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity", "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity", "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity", "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity", "com.google.android.gms.auth.uiflows.factoryreset.PreFactoryResetActivity", "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity", "com.google.android.gms.auth.account.mdm.GcmReceiverService", "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity"};
        AuthInitIntentOperation.c = new String[0];
        AuthInitIntentOperation.d = gged_interceptors.l("com.google.android.gms.auth.uiflows.addaccount.GoogleServicesActivity");
        AuthInitIntentOperation.f = new addx[]{alwr.a, akez.a, adiu.a, adsm.a, adja.a, adae.a, adsk.a, aczh.a};
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        gfss gfss0 = new gfss("; ");
        gfsp gfsp0 = new gfsp(gfss0, gfss0);
        String[] arr_s = AuthInitIntentOperation.b;
        gfsp0.f(arr_s);
        for(int v1 = 0; v1 < 11; ++v1) {
            bbmq.G(this, arr_s[v1], true);
        }
        gfsp0.f(AuthInitIntentOperation.c);
        gged_interceptors gged0 = AuthInitIntentOperation.d;
        int v2 = ((ggna)gged0).c;
        for(int v = 0; v < v2; ++v) {
            String s = (String)gged0.get(v);
            try {
                this.e(s);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        if(hoyc.c()) {
            try {
                this.e("com.google.android.gms.auth.aang.impl.deeplink.DeepLinkActivity");
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(AuthInitIntentOperation.e.i(), "Failed to disable DeepLinkActivity", illegalArgumentException0);
            }
        }
        if(!z) {
            Intent intent1 = IntentOperation.getStartIntent(this, PhenotypeConfigSyncIntentOperation.class, "com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC");
            if(intent1 != null) {
                this.startService(intent1);
            }
        }
    }

    // This method was un-flattened
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        addx[] arr_addx = AuthInitIntentOperation.f;
        intent0.getAction();
        for(int v1 = 0; v1 < 8; ++v1) {
            addx addx0 = arr_addx[v1];
            if((v & 2) > 0) {
                addx0.a(this);
            }
            if((v & 12) > 0) {
                addx0.d(this);
            }
            addx0.b(this);
        }
    }

    private final void e(String s) {
        bbmq.G(this, s, false);
    }

    @Override  // avzf
    public void onHandleIntent(Intent intent0) {
        addx[] arr_addx = AuthInitIntentOperation.f;
        if(hoxm.a.c().i() && Objects.equals(intent0.getAction(), AuthInitIntentOperation.a)) {
            fphq.d(fpib.a("com.google.android.gms.auth_account"));
            for(int v = 0; v < 8; ++v) {
                arr_addx[v].c(this);
            }
            return;
        }
        super.onHandleIntent(intent0);
    }
}

