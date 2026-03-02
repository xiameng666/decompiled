package com.google.android.gms.backup.transport;

import android.accounts.Account;
import android.content.Intent;
import aqee;
import aqjj;
import aqjk;
import aqkt;
import aqql;
import aqzv;
import atdl;
import atex;
import atob;
import bbdg;
import ccmq;
import ggfp;
import giah;
import hqlt;
import hqmr;
import ref;

public class AccountChangedIntentOperation extends aqkt {
    private static final aqql a;
    private static final ggfp b;
    private ref c;
    private ref d;
    private aqee e;
    private aqjk f;

    static {
        AccountChangedIntentOperation.a = new aqql(new String[]{"AccountChangedIO"});
        AccountChangedIntentOperation.b = ggfp.L("android.accounts.LOGIN_ACCOUNTS_CHANGED", "android.intent.action.BOOT_COMPLETED", "com.google.android.gms.backup.BackupAccountChanged");
    }

    @Override  // aqkt
    public final void a(Intent intent0) {
        String s = intent0.getAction();
        aqql aqql0 = AccountChangedIntentOperation.a;
        aqql0.j("Received intent, action = %s", new Object[]{s});
        String s1 = intent0.getStringExtra("authAccount");
        String s2 = intent0.getStringExtra("accountType");
        if(hqlt.a.o().aN() && "android.accounts.action.ACCOUNT_REMOVED".equals(s) && s1 != null && s2 != null) {
            aqjj.a(this.getApplicationContext(), new Account(s1, s2)).edit().clear().apply();
            return;
        }
        if(AccountChangedIntentOperation.b.contains(s) && (hqmr.a.b().b() || aqzv.a()) && hqlt.v()) {
            this.c.b(0L);
            this.d.b(0L);
            this.e.a();
            this.f.l(BackupTransportChimeraService.b(), atex.a(this), atex.c(this, this.e.a()), atex.b(this, giah.l), atex.d(this, giah.l));
            return;
        }
        aqql0.j("Ignoring received intent", new Object[0]);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.mi);
        atdl atdl0 = new atdl(this);
        ref ref0 = atob.a(this);
        aqee aqee0 = new aqee(this);
        aqjk aqjk0 = new aqjk(this);
        ccmq.a().a(bbdg.mi);
        this.c = atdl0;
        this.d = ref0;
        this.e = aqee0;
        this.f = aqjk0;
    }
}

