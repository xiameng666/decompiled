package com.google.android.gms.backup.transport;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acse;
import android.accounts.Account;
import android.accounts.AccountsException;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.os.SystemClock;
import aqet;
import aqfe;
import aqfo;
import aqjk;
import aqjv;
import aqle;
import aqlg;
import aqlj;
import aqql;
import aqwe;
import aqwg;
import aqwn;
import aqxr;
import aqxu;
import aqxv;
import aqxw;
import aqxy;
import aqyb;
import aqye;
import aqyf;
import aqyg;
import aqyh;
import aqym;
import aqyn;
import aqys;
import aqyu;
import atdl;
import atdm;
import atdn;
import atdo;
import atdp;
import atdx;
import ateb;
import atei;
import atew;
import atey;
import atez;
import atfa;
import atoa;
import atob;
import bakc;
import bbdg;
import bblp;
import bbmq;
import bbnk;
import bwjm;
import cchj;
import ccmq;
import clht;
import com.google.android.chimera.Service;
import gfsx;
import gifo;
import gluj;
import glun;
import hqhk;
import hqhn;
import hqlt;
import java.io.IOException;
import jwe;
import ree;
import ref;
import reg;

public class BackupTransportChimeraService extends Service implements atdx, atey {
    public static final aqql a;
    public atdl b;
    public atei c;
    public atew d;
    private ree e;
    private ree f;
    private ref g;
    private ref h;
    private aqjk i;
    private aqwn j;
    private bakc k;
    private bakc l;
    private aqys m;
    private final BroadcastReceiver n;

    static {
        BackupTransportChimeraService.a = new aqql(new String[]{"BackupTransportCS"});
    }

    public BackupTransportChimeraService() {
        this.e = null;
        this.f = null;
        this.b = null;
        this.g = null;
        this.h = null;
        this.i = null;
        aqxr.a();
        this.n = new BackupTransportChimeraService.1(this);
    }

    final Account a(ref ref0, gifo gifo0) {
        Account account0 = this.c.a();
        if(account0 != null) {
            return account0;
        }
        long v = System.currentTimeMillis() + 604800000L;
        ref0.b(v);
        BackupTransportChimeraService.a.m("Backup account missing, trying again later. Moratorium: %d", new Object[]{v});
        this.m.r(4, gifo0, 4);
        throw new aqyb();
    }

    public static ComponentName b() {
        return ComponentName.unflattenFromString("com.google.android.gms/.backup.BackupTransportService");
    }

    public final aqjk c() {
        synchronized(this) {
            if(this.i == null) {
                this.i = new aqjk(this);
            }
        }
        return this.i;
    }

    public final void d() {
        BackupTransportChimeraService.a.j("Accounts changed", new Object[0]);
        this.b.b(0L);
        this.g.b(0L);
        this.c.a();
    }

    public final boolean e() {
        return bbmq.a(this, "com.google.android.gms.backup.BackupTransportService") == 2;
    }

    public static final boolean f() {
        return !hqlt.v();
    }

    @Override  // atdx
    public final ProtoLiteBuilder g(String s, ref ref0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqet.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqet aqet0 = (aqet)hftp0.b_message;
        s.getClass();
        aqet0.b |= 1;
        aqet0.c = s;
        aqet aqet1 = (aqet)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp1.b_message;
        aqfe0.b |= 0x40;
        aqfe0.h = 3;
        hftp1.cM(aqet1);
        gfsx gfsx0 = this.j.b();
        if(gfsx0.i()) {
            String s1 = (String)gfsx0.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqfe aqfe1 = (aqfe)hftp1.b_message;
            aqfe1.b |= 0x400;
            aqfe1.j = s1;
        }
        gifo gifo0 = gifo.g;
        Account account0 = this.a(ref0, gifo0);
        this.k(hftp1, ref0, gifo0);
        boolean z = true;
        try {
            while((((aqfe)hftp1.b_message).b & 16) == 0) {
                z = this.l(hftp1, account0, ref0, gifo0, z);
                this = this;
                ref0 = ref0;
            }
            return hftp1;
        }
        catch(aqyh aqyh0) {
            throw BackupTransportChimeraService.i(new IOException(aqyh0));
        }
    }

    @Override  // atey
    public final aqfo h(gifo gifo0, ProtoLiteBuilder hftp0, ref ref0, boolean z, int v) {
        ProtoLiteBuilder hftp2;
        aqfo aqfo0;
        Account account1;
        aqwe aqwe1;
        BackupTransportChimeraService backupTransportChimeraService0 = this;
        gifo gifo1 = gifo0;
        ProtoLiteBuilder hftp1 = hftp0;
        ref ref1 = ref0;
        if(Thread.holdsLock(backupTransportChimeraService0.d)) {
            cchj cchj0 = cchj.b(backupTransportChimeraService0);
            Account account0 = backupTransportChimeraService0.a(ref1, gifo1);
            backupTransportChimeraService0.k(hftp1, ref1, gifo1);
            aqwe aqwe0 = aqwe.a(backupTransportChimeraService0);
            boolean z1 = true;
            boolean z2 = true;
            while(true) {
                int v1 = 0;
                if(!z && (((aqfe)hftp1.b_message).b & 0x2000) == 0 && ref1.a(backupTransportChimeraService0.f) > System.currentTimeMillis()) {
                    if((ref1 instanceof atdl)) {
                        v1 = ((atdl)ref1).b;
                    }
                    backupTransportChimeraService0.m.t(3, gifo1, 4, 0, v1);
                    throw new aqyf(ref1);
                }
                if((((aqfe)hftp1.b_message).b & 16) != 0) {
                    try {
                        aqwe1 = aqwe0;
                        account1 = account0;
                        aqfo0 = aqwe0.b(account0, hftp1, ref1, z, v);
                        aqwe1 = aqwe0;
                        account1 = account0;
                    }
                    catch(acse acse0) {
                        aqwe1 = aqwe0;
                        account1 = account0;
                        hftp2 = hftp1;
                        this.j(acse0, ref0, BackupTransportChimeraService.i(acse0), 7, gifo0, 0, 43200000L, false);
                        goto label_76;
                    }
                    catch(IOException iOException0) {
                        aqwe1 = aqwe0;
                        account1 = account0;
                        hftp2 = hftp1;
                        aqyh aqyh0 = new aqyh();
                        aqyh0.initCause(iOException0);
                        this.j(iOException0, ref0, aqyh0, 9, gifo0, 0, 0L, true);
                        goto label_76;
                    }
                    catch(aqxy aqxy0) {
                        hftp2 = hftp1;
                        this.j(aqxy0, ref0, aqxy0, 2, gifo0, aqxy0.a, 0L, true);
                        goto label_76;
                    }
                    try {
                        aqwg.b(aqfo0);
                        goto label_48;
                    }
                    catch(aqxv aqxv0) {
                        hftp2 = hftp0;
                        aqxv aqxv1 = aqxv0;
                        goto label_55;
                        try {
                        label_48:
                            reg.a(ref1.a.edit().remove("OperationScheduler_errorCount"));
                            reg.a(ref1.a.edit().remove("OperationScheduler_permanentError"));
                            reg.a(ref1.a.edit().remove("OperationScheduler_errorCount").remove("OperationScheduler_lastErrorTimeMillis").remove("OperationScheduler_permanentError").remove("OperationScheduler_triggerTimeMillis").putLong("OperationScheduler_lastSuccessTimeMillis", System.currentTimeMillis()));
                            return aqfo0;
                        }
                        catch(aqxv aqxv2) {
                        }
                        catch(IOException iOException1) {
                            goto label_71;
                        }
                        catch(aqye | aqyn | aqyg | aqym exception0) {
                            backupTransportChimeraService0.m.r(((aqxw)exception0).b(), gifo1, 4);
                            throw exception0;
                        }
                        aqxv1 = aqxv2;
                        hftp2 = hftp0;
                    label_55:
                        aqfe aqfe0 = (aqfe)hftp2.b_message;
                        if((aqfe0.b & 16) != 0) {
                            cchj0.i("com.google", aqfe0.f);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            aqfe aqfe1 = (aqfe)hftp2.b_message;
                            aqfe1.b &= -17;
                            aqfe1.f = aqfe.a.f;
                        }
                        BackupTransportChimeraService.a.m("Server returned error, invalidating auth token. This is retried once.", new Object[0]);
                        gifo1 = gifo0;
                        boolean z3 = z2;
                        z2 = false;
                        backupTransportChimeraService0 = this;
                        backupTransportChimeraService0.j(aqxv1, ref0, aqxv1, 8, gifo1, 0, 43200000L, z3);
                        goto label_78;
                    }
                    catch(IOException iOException1) {
                    label_71:
                        BackupTransportChimeraService.a.m("IOException when parsing response from server.", new Object[0]);
                        aqyh aqyh1 = new aqyh();
                        aqyh1.initCause(iOException1);
                        hftp2 = hftp0;
                        backupTransportChimeraService0.j(iOException1, ref1, aqyh1, 11, gifo0, 0, 0L, true);
                    label_76:
                        backupTransportChimeraService0 = this;
                        gifo1 = gifo0;
                    label_78:
                        ref1 = ref0;
                        hftp1 = hftp2;
                        account0 = account1;
                        aqwe0 = aqwe1;
                        continue;
                    }
                    catch(aqye | aqyn | aqyg | aqym exception0) {
                        backupTransportChimeraService0.m.r(((aqxw)exception0).b(), gifo1, 4);
                        throw exception0;
                    }
                }
                z1 = backupTransportChimeraService0.l(hftp1, account0, ref1, gifo1, z1);
                backupTransportChimeraService0 = this;
                gifo1 = gifo0;
                hftp1 = hftp0;
                ref1 = ref0;
                aqwe0 = aqwe0;
            }
        }
        throw new IllegalStateException("lock not held");
    }

    private static aqxu i(Exception exception0) {
        aqxu aqxu0 = new aqxu();
        aqxu0.initCause(exception0);
        return aqxu0;
    }

    private final void j(Exception exception0, ref ref0, Exception exception1, int v, gifo gifo0, int v1, long v2, boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = ref0.a.edit();
        sharedPreferences$Editor0.putLong("OperationScheduler_lastErrorTimeMillis", System.currentTimeMillis());
        sharedPreferences$Editor0.putInt("OperationScheduler_errorCount", ref0.a.getInt("OperationScheduler_errorCount", 0) + 1);
        reg.a(sharedPreferences$Editor0);
        long v3 = ref0.a(this.f);
        long v4 = v3 - System.currentTimeMillis();
        if(Long.compare(v4, 30000L) <= 0 && z) {
            BackupTransportChimeraService.a.m("Network error: waiting until time %d (delay of %dms) to retry: ", new Object[]{v3, v4, exception0});
            for(long v5 = 0L; true; v5 = v6) {
                long v6 = System.currentTimeMillis();
                if(v6 < v5 || v6 >= v3) {
                    break;
                }
                SystemClock.sleep(Math.min(v3 - v6, 1000L));
            }
            this.m.s(v, gifo0, 3, v1);
            return;
        }
        aqql aqql0 = BackupTransportChimeraService.a;
        aqql0.m("Network error: proposed backoff of %dms considered too large, not retrying. Exception that caused this: %s", new Object[]{v4, exception0.toString()});
        this.m.s(v, gifo0, 4, v1);
        if(v2 > 0L) {
            long v7 = System.currentTimeMillis() + v2;
            ref0.b(v7);
            aqql0.m("Setting moratorium: %d", new Object[]{v7});
        }
        throw exception1;
    }

    private final void k(ProtoLiteBuilder hftp0, ref ref0, gifo gifo0) {
        int v = ((aqfe)hftp0.b_message).b;
        if((v & 1) == 0 || ((aqfe)hftp0.b_message).c <= 0L && (v & 2) == 0) {
            long v1 = bbmq.d(this);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe0 = (aqfe)hftp0.b_message;
            aqfe0.b |= 1;
            aqfe0.c = v1;
            if(hqhk.c()) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aqfe aqfe1 = (aqfe)hftp0.b_message;
                aqfe1.b |= 2;
                aqfe1.d = v1;
            }
            if(((aqfe)hftp0.b_message).c == 0L) {
                long v2 = System.currentTimeMillis() + 43200000L;
                ref0.b(v2);
                BackupTransportChimeraService.a.m("Could not get a non-zero AndroidId. Moratorium: %d", new Object[]{v2});
                this.m.s(6, gifo0, 4, 0);
                throw BackupTransportChimeraService.i(new AccountsException("No Android ID available"));
            }
        }
    }

    private final boolean l(ProtoLiteBuilder hftp0, Account account0, ref ref0, gifo gifo0, boolean z) {
        String s = hqlt.E() ? "oauth2:https://www.googleapis.com/auth/android_platform_backup_restore" : "android";
        aqql aqql0 = BackupTransportChimeraService.a;
        aqql0.j("Using %s scope \'%s\'", new Object[]{(hqlt.E() ? "OAuth2" : "ClientLogin"), s});
        try {
            String s1 = aqxr.b(this, account0, s, true, hqhn.b());
            if(s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aqfe aqfe0 = (aqfe)hftp0.b_message;
                aqfe0.b |= 16;
                aqfe0.f = s1;
            }
        }
        catch(AuthenticatorException authenticatorException0) {
            BackupTransportChimeraService.a.n("AuthenticationException when getting AuthToken", authenticatorException0, new Object[0]);
            this.j(authenticatorException0, ref0, BackupTransportChimeraService.i(authenticatorException0), 8, gifo0, 0, 43200000L, z);
            return false;
        }
        catch(IOException iOException0) {
            BackupTransportChimeraService.a.n("IOException when getting AuthToken", iOException0, new Object[0]);
            aqyh aqyh0 = new aqyh();
            aqyh0.initCause(iOException0);
            this.j(iOException0, ref0, aqyh0, 12, gifo0, 0, 0L, true);
            return true;
        }
        catch(OperationCanceledException operationCanceledException0) {
            BackupTransportChimeraService.a.n("OperationCanceledException when getting AuthToken", operationCanceledException0, new Object[0]);
            this.j(operationCanceledException0, ref0, BackupTransportChimeraService.i(operationCanceledException0), 10, gifo0, 0, 0L, z);
            return false;
        }
        if((((aqfe)hftp0.b_message).b & 16) != 0) {
            return true;
        }
        aqql0.m("Could not obtain AuthToken.", new Object[0]);
        this.j(BackupTransportChimeraService.i(new AccountsException("No auth token available")), ref0, BackupTransportChimeraService.i(new AccountsException("No auth token available")), 5, gifo0, 0, 43200000L, z);
        return false;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if(!intent0.getBooleanExtra("android.app.backup.extra.TRANSPORT_REGISTRATION", false) && !BackupTransportChimeraService.f()) {
            new clht(this.getMainLooper()).post(new atdm(this));
        }
        Intent intent1 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent1.putExtra("transport", "com.google.android.gms/.backup.BackupTransportService");
        intent1.setPackage("com.google.android.gms");
        this.sendBroadcast(intent1);
        return this.d.getBinder();
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.mi);
        atoa.d();
        this.m = new aqys(this);
        ree ree0 = new ree();
        this.e = ree0;
        ree0.b = 0L;
        hqlt hqlt0 = hqlt.a;
        ree0.a = glun.e(1000L, hqlt0.o().n());
        ree ree1 = this.e;
        ree1.c = gluj.d(1000, ((int)hqlt0.o().m()));
        ree ree2 = this.e;
        ree2.d = glun.e(1000L, hqlt0.o().o());
        ree ree3 = new ree();
        this.f = ree3;
        ree3.b = 0L;
        ree3.a = glun.e(1000L, hqlt0.o().h());
        ree ree4 = this.f;
        ree4.c = gluj.d(1000, ((int)hqlt0.o().g()));
        if(this.b == null) {
            this.b = new atdl(this);
        }
        this.g = atob.a(this);
        this.h = new ref(this.getSharedPreferences("GmsBackupTransport.abortScheduler", 0));
        BroadcastReceiver broadcastReceiver0 = this.n;
        int v = 2;
        jwe.b(this, broadcastReceiver0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        jwe.b(this, broadcastReceiver0, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"), 2);
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
        intentFilter0.addDataScheme("package");
        jwe.b(this, broadcastReceiver0, intentFilter0, 2);
        IntentFilter intentFilter1 = new IntentFilter("com.google.android.gms.backup.BackupAccountChanged");
        if(hqlt0.o().aL()) {
            v = 4;
        }
        jwe.b(this, broadcastReceiver0, intentFilter1, v);
        if(this.c == null) {
            this.c = new atei(this);
        }
        if(this.j == null) {
            this.j = aqwn.a(this);
        }
        this.k = new bakc(this, "cloud_restore", true);
        this.l = new bakc(this, "BackupDeviceState", true);
        ref ref0 = this.h;
        atei atei0 = this.c;
        atdl atdl0 = this.b;
        aqys aqys0 = this.m;
        ree ree5 = this.e;
        bakc bakc0 = this.k;
        bakc bakc1 = this.l;
        bwjm bwjm0 = new bwjm(this);
        aqlj aqlj0 = aqyu.a(this);
        ref ref1 = this.g;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getSystemService("connectivity");
        this.d = new atew(this, this, this, this, ref0, atei0, atdl0, aqys0, ree5, bakc0, bakc1, bwjm0, aqlj0, new atfa(this, ref1), new ateb(), new atdn(this), aqle.a(this), new atez(this, bbnk.a), this.c(), gfsx.m(aqlg.d(this)), new aqjv(this));
        new clht(this.getMainLooper()).post(new atdo(this));
        new bblp(1, 10).execute(new atdp(this));
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        try {
            this.unregisterReceiver(this.n);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            BackupTransportChimeraService.a.n("Exception when unregistering: ", exception0, new Object[0]);
        }
        super.onDestroy();
    }
}

