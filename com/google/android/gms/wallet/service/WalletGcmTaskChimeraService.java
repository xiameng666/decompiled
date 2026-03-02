package com.google.android.gms.wallet.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import bbmq;
import cchj;
import cljp;
import clkm;
import clkq;
import clks;
import clkz;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import fbdo;
import fbod;
import fbsy;
import fbtc;
import fbwk;
import gamy;
import gged_interceptors;
import ggna;
import hfyz;
import hfzc;
import hrwa;
import hrwu;
import hzsv;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class WalletGcmTaskChimeraService extends GmsTaskChimeraService {
    private gamy a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        fbsy fbsy0;
        try {
            if(Log.isLoggable("WalletGcmTaskService", 4)) {
                Log.i("WalletGcmTaskService", String.format(Locale.US, "Running GcmTask w/ tag %s", cllr0.a));
            }
            String s = cllr0.a;
            if(s.equals("INSTANTBUY_REFRESH_INSTRUMENT_AVAILABILITY")) {
                fbsy0 = new fbsy(this, this.a);
            }
            else if(fbtc.a.contains(s)) {
                fbsy0 = new fbtc(this, this.a);
            }
            else if(s.equals("WALLET_STORAGE_CLEAN_UP")) {
                fbsy0 = new fbod(this);
            }
            else {
                Log.w("WalletGcmTaskService", String.format(Locale.US, "No GcmTask corresponding to tag %s", s));
                fbsy0 = null;
            }
            return fbsy0 == null ? 2 : fbsy0.a(cllr0);
        }
        catch(Throwable unused_ex) {
        }
        return 2;
    }

    public static void d(Context context0) {
        bbmq.G(context0, "com.google.android.gms.wallet.service.WalletGcmTaskService", true);
        fbwk fbwk0 = new fbwk(context0);
        cljp cljp0 = cljp.a(context0);
        if(!fbtc.c()) {
            gged_interceptors gged0 = fbtc.a;
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                cljp0.d(((String)gged0.get(v1)), "com.google.android.gms.wallet.service.WalletGcmTaskService");
            }
            Account[] arr_account = cchj.b(context0).p("com.google");
            for(int v2 = 0; v2 < arr_account.length; ++v2) {
                Account account0 = arr_account[v2];
                hfzc hfzc0 = fbwk0.c(1, account0);
                if(hfzc0 != null) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfzc0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hfzc0));
                    hfyz hfyz0 = (hfyz)hftp0;
                    if(!hfyz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfyz0).ensureMutable();
                    }
                    ((hfzc)hfyz0.b_message).e = null;
                    ((hfzc)hfyz0.b_message).b &= -9;
                    fbwk0.f(1, account0, ((hfzc)((ProtoLiteBuilder)hfyz0).N_build()));
                }
            }
        }
        else if(hrwa.p()) {
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            clks0.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            clks0.v(2);
            clks0.l(true);
            clks0.a = clkz.j;
            clks0.e();
            cljp0.f(clks0.a());
        }
        else {
            clkq clkq0 = new clkq();
            clkq0.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            clkq0.y(0, 1);
            clkq0.x(1, 1);
            clkq0.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            clkq0.a = TimeUnit.HOURS.toSeconds(24L);
            clkq0.b = TimeUnit.HOURS.toSeconds(1L);
            clkq0.v(0);
            if(hrwu.l()) {
                clkq0.j(clkm.h);
            }
            else {
                clkq0.a = TimeUnit.HOURS.toSeconds(24L);
                clkq0.b = TimeUnit.HOURS.toSeconds(1L);
            }
            cljp0.f(clkq0.a());
        }
        cljp cljp1 = cljp.a(context0);
        if(hzsv.a.b().a()) {
            if(hrwa.p()) {
                clks clks1 = new clks();
                clks1.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
                clks1.q("WALLET_STORAGE_CLEAN_UP");
                clks1.v(2);
                clks1.l(false);
                clks1.a = clkz.j;
                clks1.e();
                cljp1.f(clks1.a());
                return;
            }
            clkq clkq1 = new clkq();
            clkq1.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            clkq1.y(2, 2);
            clkq1.x(1, 1);
            clkq1.q("WALLET_STORAGE_CLEAN_UP");
            clkq1.v(0);
            if(hrwu.l()) {
                clkq1.j(clkm.h);
            }
            else {
                clkq1.a = TimeUnit.HOURS.toSeconds(24L);
                clkq1.b = TimeUnit.HOURS.toSeconds(1L);
            }
            cljp1.f(clkq1.a());
            return;
        }
        cljp1.d("WALLET_STORAGE_CLEAN_UP", "com.google.android.gms.wallet.service.WalletGcmTaskService");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        WalletGcmTaskChimeraService.d(this);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        super.onCreate();
        this.a = fbdo.a(this.getApplicationContext());
    }
}

