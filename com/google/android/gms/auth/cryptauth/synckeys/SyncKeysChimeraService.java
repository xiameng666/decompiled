package com.google.android.gms.auth.cryptauth.synckeys;

import acso;
import ajfn;
import ajfw;
import ajkn;
import ajko;
import ajkp;
import ajkq;
import ajkr;
import ajks;
import ajkt;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import azqi;
import azqj;
import baun;
import bblp;
import bnai;
import bnaj;
import cllr;
import com.google.android.gms.chimera.modules.auth.cryptauth.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import erzz;
import esaa;
import glyi;
import glzd;
import gmbt;
import gmbu;
import gmcd;
import gmcg;
import gmkj;
import hptz;
import ygc;
import ygd;

public class SyncKeysChimeraService extends GmsTaskBoundService {
    public static final baun a;
    private static final gmcg b;

    static {
        SyncKeysChimeraService.b = new bblp(0x7FFFFFFF, 9);
        SyncKeysChimeraService.a = new baun(new String[]{"SyncKeysChimeraService"}, null);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        gmcd gmcd0;
        Context context0 = AppContextProvider.a();
        bnaj bnaj0 = bnai.b(context0);
        Integer integer0 = (int)2;
        if(!hptz.c()) {
            SyncKeysChimeraService.a.h("Phone theft sync feature has not been enabled yet.", new Object[0]);
            return gmbu.i(integer0);
        }
        boolean z = Settings.Secure.getInt(context0.getContentResolver(), "mandatory_biometrics", 0) != 0;
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            SyncKeysChimeraService.a.f("No task parameters found.", new Object[0]);
            bnaj0.E(4, 2, z);
            return gmbu.i(integer0);
        }
        gmkj gmkj0 = gmkj.b(bundle0.getInt("invocation_reason"));
        gmkj gmkj1 = gmkj.j;
        if(gmkj0 == gmkj1) {
            baun baun0 = SyncKeysChimeraService.a;
            baun0.h("Setting toggled. Scheduling sync for all accounts.", new Object[0]);
            bnaj0.A(gmkj1);
            try {
                Account[] arr_account = acso.m(context0);
                if(arr_account.length == 0) {
                    baun0.h("No accounts found on device - no tasks scheduled.", new Object[0]);
                }
                for(int v1 = 0; v1 < arr_account.length; ++v1) {
                    ajkt.b(arr_account[v1].name, gmkj.n);
                }
                bnaj0.E(6, 0, z);
                gmcd0 = gmbu.i(Integer.valueOf(0));
            }
            catch(RemoteException | azqi | azqj exception0) {
                SyncKeysChimeraService.a.g("Error scheduling tasks.", exception0, new Object[0]);
                ajkt.b("settingToggleRetry", gmkj.j);
                bnaj0.E(4, 3, z);
                return gmbu.i(integer0);
            }
            finally {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("invocation_reason", 9);
                ajkt.d(Settings.Secure.getUriFor("mandatory_biometrics"), bundle1);
            }
            return gmcd0;
        }
        String s = bundle0.getString("account_name");
        if(s == null) {
            SyncKeysChimeraService.a.f("No account name provided.", new Object[0]);
            bnaj0.E(4, 2, z);
            return gmbu.i(integer0);
        }
        Account account0 = new Account(s, "com.google");
        ajfw ajfw0 = new ajfw(context0, account0);
        if(((long)(((int)ajfw0.a()))) > ajfw0.c()) {
            SyncKeysChimeraService.a.m("Too many retries.", new Object[0]);
            ajfw0.e();
            ajkt.b(s, gmkj.g);
            bnaj0.E(4, 4, z);
            return gmbu.i(integer0);
        }
        ajkn ajkn0 = new ajkn(new ygd(new ajfn(context0), new ygc(SyncKeysChimeraService.a), SyncKeysChimeraService.a), s);
        gmcd gmcd2 = SyncKeysChimeraService.b.e(ajkn0);
        ajko ajko0 = new ajko(context0, s);
        gmcd gmcd3 = glzd.g(SyncKeysChimeraService.b.e(ajko0), new ajkp(context0), SyncKeysChimeraService.b);
        erzz erzz0 = new esaa(context0, 1, "CryptauthSync", null, "com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService").a("Cryptauth Sync wakelock timed out", hptz.a.b().b());
        gmcd gmcd4 = glzd.f(gmbt.h(gmbu.b(new gmcd[]{gmcd2, gmcd3}).a(new ajkq(gmcd2, gmcd3, bundle0, context0, account0, s), SyncKeysChimeraService.b)), new ajkr(ajfw0, bnaj0, z, s, erzz0), SyncKeysChimeraService.b);
        ajks ajks0 = new ajks(ajfw0, erzz0, bnaj0, z);
        return glyi.f(gmcd4, Exception.class, ajks0, SyncKeysChimeraService.b);
    }
}

