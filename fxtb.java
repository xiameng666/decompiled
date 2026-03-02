import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class fxtb {
    public final Context a;
    private static final Object b;
    private final fxtr c;
    private final fxso d;
    private final fxtp e;
    private final fxsz f;

    static {
        fxtb.b = new Object();
    }

    private fxtb(Context context0, fxtr fxtr0, fxso fxso0, fxtp fxtp0, fxsz fxsz0) {
        this.a = context0;
        this.c = fxtr0;
        this.d = fxso0;
        this.e = fxtp0;
        this.f = fxsz0;
    }

    public static Intent a(Context context0, String s, Account account0, Boolean boolean0, Boolean boolean1, Boolean boolean2, Boolean boolean3, String s1) {
        Intent intent0 = fxtk.a(context0, "com.google.android.location.reporting.ACTION_INSISTENT_SYNC");
        intent0.putExtra("label", s);
        intent0.putExtra("account", account0);
        intent0.putExtra("ulrRelatedSettingChange", boolean3);
        if(boolean0 != null) {
            intent0.putExtra("reportingEnabled", boolean0);
        }
        if(boolean1 != null) {
            intent0.putExtra("historyEnabled", boolean1);
        }
        if(boolean2 != null) {
            intent0.putExtra("adsSubconsentEnabled", boolean2);
        }
        if(s1 != null) {
            intent0.putExtra("auditToken", s1);
        }
        return intent0;
    }

    public static fxtb b(Context context0) {
        fxva.g(context0);
        fxtr fxtr0 = fxtr.b(context0);
        return new fxtb(context0, fxtr0, fxso.b(context0), new fxtp(context0), fxsz.a(context0, fxtr0, bbnk.a));
    }

    static Boolean c(Intent intent0, String s) {
        return intent0.hasExtra(s) ? Boolean.valueOf(intent0.getBooleanExtra(s, false)) : null;
    }

    final void d(Account account0, Boolean boolean0, Boolean boolean1, Boolean boolean2, boolean z, String s) {
        if(this.f(account0, boolean0, boolean1, boolean2, z, s)) {
            fxtr fxtr0 = this.c;
            if(fxtr0.c(account0).l) {
                boolean z1 = this.f(account0, boolean0, boolean1, boolean2, z, s);
                boolean z2 = fxtr0.c(account0).l;
                if(z1 && z2) {
                    fxqw.j("Preference values still dirty after two sync attempts");
                }
                fxra.f("UlrSyncDirtyRetry", z2);
            }
        }
    }

    static boolean e(String s, Boolean boolean0, boolean z, Boolean boolean1) {
        if(boolean0 != null && !boolean0.equals(Boolean.valueOf(z))) {
            if(boolean1 != null) {
                if(boolean1.booleanValue() == z) {
                    fxqw.c("GCoreUlr", "sync() insistent " + s + " value " + boolean1 + " overriding server value: " + boolean0);
                    return false;
                }
                fxqw.c("GCoreUlr", "sync() ignoring insistent " + s + " value " + boolean1 + ", inconsistent with local value: " + z);
            }
            return true;
        }
        return false;
    }

    final boolean f(Account account0, Boolean boolean0, Boolean boolean1, Boolean boolean2, boolean z, String s) {
        int v4;
        fxsf fxsf2;
        fxud fxud0;
        fxsf fxsf1;
        fxsf fxsf0;
        fxtr fxtr0 = this.c;
        AccountConfig accountConfig0 = fxtr0.c(account0);
        if(hzdy.a.b().b()) {
            cmdb cmdb0 = cmdb.a(this.a);
            if(accountConfig0.e && accountConfig0.g) {
                cmdb0.c(20);
            }
            else {
                cmdb0.c(21);
            }
        }
        if(!accountConfig0.i() && !z) {
            accountConfig0.e();
            return false;
        }
        synchronized(fxtb.b) {
            if(!accountConfig0.b) {
                Account account1 = accountConfig0.a;
                boolean z1 = hzet.a.b().a();
                this.e.b(account1, 2);
                if(z1) {
                    fxse fxse0 = new fxse();
                    fxse0.a = null;
                    fxse0.b = null;
                    fxse0.d = null;
                    fxse0.e = "com.google.android.gms+new-device-tag";
                    fxse0.c = "com.google.android.gms+new-device-tag";
                    fxsf0 = new fxsf(fxse0);
                }
                else {
                    fxse fxse1 = new fxse();
                    fxse1.a = null;
                    fxse1.b = Boolean.valueOf(false);
                    fxse1.d = null;
                    fxse1.e = "com.google.android.gms+new-device-tag";
                    fxse1.c = "com.google.android.gms+new-device-tag";
                    fxsf0 = new fxsf(fxse1);
                }
                try {
                    fxsf1 = this.d.a(account1, fxsf0, "syncNotDefinedYet", null);
                }
                catch(IOException iOException0) {
                    fxqw.f(("syncNotDefinedYet() can\'t get server values: " + iOException0.toString()));
                    int v1 = bbpr.c(this.a) ? 4 : 3;
                    this.e.b(account1, v1);
                    throw iOException0;
                }
                catch(acse acse0) {
                    fxqw.f(("syncNotDefinedYet() auth exception: " + acse0.toString()));
                    this.e.b(account1, 5);
                    throw acse0;
                }
                fxra.m("UlrSyncNewAccount", fxsf1);
                boolean z2 = Boolean.TRUE.equals(fxsf1.b);
                boolean z3 = Boolean.TRUE.equals(fxsf1.d);
                if(z1) {
                    fxud0 = fxtb.h(accountConfig0, "com.google.android.gms+new-account+sync");
                    fxud0.e(fxsf1);
                    fxud0.f = Boolean.valueOf(z2);
                    fxud0.g = Boolean.valueOf(z3);
                }
                else {
                    fxud0 = fxtb.h(accountConfig0, "com.google.android.gms+new-account+sync");
                    fxud0.e(fxsf1);
                    Boolean boolean3 = Boolean.valueOf(false);
                    fxud0.f = boolean3;
                    fxud0.g = Boolean.valueOf(z3);
                    if(z2) {
                        fxud0.f = boolean3;
                        fxud0.a(true);
                    }
                }
                fxue fxue0 = new fxue(fxud0);
                this.c.l("syncNotDefinedYet() " + fxsf1.toString(), fxue0, "sync_new_account");
                if(z3) {
                    fxsz fxsz0 = this.f;
                    if(fxsz0.d(account1)) {
                        fxsz0.a.h(account1, true);
                        fxsz0.c(account1);
                    }
                }
                else {
                    this.f.b(account1);
                    if(hzeq.d()) {
                        fxra.k("UlrAutoEnableEvents", 3);
                    }
                }
                this.e.b(account1, 1);
            }
            else if(accountConfig0.l) {
                Account account3 = accountConfig0.a;
                this.f.b(account3);
                if(hzeq.d()) {
                    fxra.k("UlrAutoEnableEvents", 5);
                }
                fxse fxse2 = new fxse();
                fxse2.a = (long)accountConfig0.i;
                boolean z4 = accountConfig0.e;
                fxse2.b = Boolean.valueOf(z4);
                fxse2.c = accountConfig0.f;
                boolean z5 = accountConfig0.g;
                fxse2.d = Boolean.valueOf(z5);
                fxse2.e = accountConfig0.h;
                if(hzeq.c()) {
                    fxse2.f = Boolean.valueOf(accountConfig0.u);
                }
                fxsf fxsf3 = new fxsf(fxse2);
                fxsf fxsf4 = this.d.a(account3, fxsf3, "syncDirty", s);
                fxra.m("UlrSyncDirty", fxsf4);
                if(fxsf4.h == 3) {
                    fxud fxud2 = fxtb.h(accountConfig0, "com.google.android.gms+ambiguous");
                    if(fxtb.e("reporting", fxsf4.b, z4, boolean0)) {
                        fxqw.f(a.c(accountConfig0, fxsf4, "Ambiguating LR due to conflict between ", " and "));
                        fxud2.f = Boolean.valueOf(false);
                    }
                    if(fxtb.e("history", fxsf4.d, z5, boolean1)) {
                        fxqw.f(a.c(accountConfig0, fxsf4, "Ambiguating LH due to conflict between ", " and "));
                        fxud2.g = Boolean.valueOf(false);
                    }
                    if(hzeq.c() && fxtb.e("ads", fxsf4.f, accountConfig0.u, boolean2)) {
                        fxqw.f(a.c(accountConfig0, fxsf4, "Ambiguating Ads due to conflict between ", " and "));
                        fxud2.h = Boolean.valueOf(false);
                    }
                    fxud2.k = fxsf4.a;
                    fxud2.c(fxsf4.g);
                    fxud2.a(true);
                    fxue fxue1 = new fxue(fxud2);
                    this.c.l("sync() concurrent " + fxsf4.toString(), fxue1, "sync_concurrent");
                }
                else {
                    fxud fxud3 = fxtb.h(accountConfig0, null);
                    fxud3.e(fxsf4);
                    fxud3.j = true;
                    fxud3.a(false);
                    fxue fxue2 = new fxue(fxud3);
                    this.c.l("sync() local wins " + fxsf4.toString(), fxue2, "sync_local_wins");
                }
            }
            else {
                Account account2 = accountConfig0.a;
                fxud fxud1 = fxtb.h(accountConfig0, "com.google.android.gms+not-dirty");
                fxso fxso0 = this.d;
                int v2 = fxso0.a.a(account2);
                String s1 = fxso0.c(account2);
                try {
                    fxsg fxsg0 = fxso0.b;
                    gzsx gzsx0 = (gzsx)fxsg0.c(s1, true).N_build();
                    gzvn gzvn0 = gzvn.a;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzvn0).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gzvn)hftv0).b |= 1;
                    ((gzvn)hftv0).c = v2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzvn gzvn1 = (gzvn)hftp0.b_message;
                    gzsx0.getClass();
                    gzvn1.d = gzsx0;
                    gzvn1.b |= 2;
                    gzvn gzvn2 = (gzvn)hftp0.N_build();
                    try {
                        fxrd.a("UlrRpcDevGetSettings", "UlrRpcBetaGetSettings", "UlrRpcProdGetSettings", 3);
                        if(fxrc.q()) {
                            fxrc.a.r();
                        }
                        fxsp fxsp0 = new fxsp(fxsg.i, cmlp.a, ckio.b);
                        baqr baqr0 = fxsg.a(fxsg0.j, account2);
                        if(fxsp.a == null) {
                            ibjh ibjh0 = new ibjh(((MessageLite)gzvn0));
                            ibjh ibjh1 = new ibjh(((MessageLite)gzvm.a));
                            fxsp.a = new gRPCMethodDescriptor(gRPCMethodType.a, "userlocation.UserLocationReportingService/GetApiSettings", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                        }
                        gzvm gzvm0 = (gzvm)fxsp0.g.callUnaryWithAuth(fxsp.a, baqr0, gzvn2, 10000L, TimeUnit.MILLISECONDS, fxsp0.h);
                        if((gzvm0.b & 1) == 0) {
                            fxrd.b(null);
                            throw new IOException("Received null settings from server for account " + cnug.a(account2));
                        }
                        fxrd.a("UlrRpcDevGetSettings", "UlrRpcBetaGetSettings", "UlrRpcProdGetSettings", 1);
                        fxrc.j(true);
                        fxsf2 = fxsf.b(account2, (gzvm0.c == null ? gzvd.a : gzvm0.c));
                    }
                    catch(iapl | acse exception0) {
                        fxrd.b(exception0);
                        throw exception0;
                    }
                    if(fxso.g(fxsf2)) {
                        fxso0.f(account2, s1);
                        fxso0.e(fxsf2);
                    }
                    fxso0.d(account2, true);
                }
                catch(acse acse1) {
                    fxso0.d(account2, false);
                    throw acse1;
                }
                fxra.m("UlrSyncNotDirty", fxsf2);
                Long long0 = fxsf2.a;
                if(long0 == null) {
                label_132:
                    switch(fxsf2.h) {
                        case 1: {
                            v4 = 1;
                            fxud1.a(true);
                            fxtr0.l(a.b(fxsf2, "sync() server returned empty or device tag unknown ", ", will try uploading ours"), new fxue(fxud1), (v4 == 1 ? "sync_source_no_data" : "sync_unknown_device_tag"));
                            fxqw.c("GCoreUlr", "sync() server returned empty or device tag unknown " + fxsf2.toString() + " for " + cnug.a(account2) + ", will send ours");
                            break;
                        }
                        case 3: {
                            if(fxsf2.i == 2) {
                                v4 = 3;
                                fxud1.a(true);
                                fxtr0.l(a.b(fxsf2, "sync() server returned empty or device tag unknown ", ", will try uploading ours"), new fxue(fxud1), (v4 == 1 ? "sync_source_no_data" : "sync_unknown_device_tag"));
                                fxqw.c("GCoreUlr", "sync() server returned empty or device tag unknown " + fxsf2.toString() + " for " + cnug.a(account2) + ", will send ours");
                            }
                            else {
                            label_142:
                                fxud1.e(fxsf2);
                                fxtr0.l("sync() server wins " + fxsf2.toString(), new fxue(fxud1), "sync_server_wins");
                                this.f.b(account2);
                                if(hzeq.d()) {
                                    fxra.k("UlrAutoEnableEvents", 4);
                                }
                            }
                            break;
                        }
                        default: {
                            goto label_142;
                        }
                    }
                }
                else {
                    long v3 = accountConfig0.i;
                    if(((long)long0) < v3) {
                        fxqw.c("GCoreUlr", dlbc.d(v3, fxsf2.toString(), cnug.a(account2), "sync() rejecting stale server values for account ", ": ", "; local: "));
                        fxra.n(this.c.d().e());
                        return true;
                    }
                    goto label_132;
                }
            }
        }
        fxra.n(this.c.d().e());
        return true;
    }

    public static void g(Context context0, String s, Account account0) {
        fxva.p(context0, fxtb.a(context0, s, account0, null, null, null, null, null));
    }

    private static final fxud h(AccountConfig accountConfig0, String s) {
        fxud fxud0 = new fxud(accountConfig0.a, s);
        fxud0.e = true;
        fxud0.b(accountConfig0.c);
        return fxud0;
    }
}

