package com.google.android.gms.accountsettings.service;

import aaua;
import aaud;
import aauf;
import android.content.Context;
import baun;
import clkq;
import clks;
import clkz;
import cllb;
import cllp;
import cllr;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import dlae;
import fgvy;
import gqsm;
import hojn;
import hrwa;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import oqj;
import zks;
import zkw;

public class PurgeScreenDataChimeraService extends GmsTaskChimeraService {
    private static final baun a;
    private RepositoryDatabase b;
    private dlae c;
    private aauf d;

    static {
        PurgeScreenDataChimeraService.a = new baun("AccountSettings", new String[]{"PurgeScreenDataSvc"});
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        int v;
        boolean z;
        baun baun0 = PurgeScreenDataChimeraService.a;
        baun0.j("Running gcm task %s", new Object[]{cllr0.a});
        if("PurgeScreenData".equals(cllr0.a)) {
            hojn hojn0 = hojn.a;
            if(hojn0.g().D()) {
                oqj.b(((zkw)this.b.w()).a, false, true, new zks(System.currentTimeMillis() - hojn0.g().f()));
                z = true;
            }
            else {
                z = false;
            }
            baun0.j("Purging deprecated account database", new Object[0]);
            Context context0 = this.getBaseContext();
            boolean z1 = z && (new HashSet(Arrays.asList(context0.databaseList())).contains("id_as_screens.db") ? context0.deleteDatabase("id_as_screens.db") : true);
            try {
                if(this.c.b.a().a > 0) {
                    v = 3;
                }
                else {
                    goto label_20;
                }
            }
            catch(IOException iOException0) {
                dlae.a.g("Exception while garbage collecting tempfiles.", iOException0, new Object[0]);
                v = 1;
            }
            goto label_21;
        label_20:
            v = 2;
        label_21:
            if(v == 3) {
                this.d.i(gqsm.dV);
                return z1 ? 0 : 1;
            }
            if(v == 1) {
                this.d.i(gqsm.dW);
            }
            return z1 ? 0 : 1;
        }
        return 0;
    }

    public static cllp b() {
        if(hrwa.a.b().n()) {
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
            clks0.t("PurgeScreenData");
            clks0.v(2);
            clks0.l(false);
            clks0.a = clkz.l;
            return clks0.a();
        }
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
        clkq0.t("PurgeScreenData");
        clkq0.v(1);
        clkq0.a = hojn.a.g().h();
        clkq0.b = hojn.a.g().g();
        clkq0.x(0, 1);
        clkq0.y(2, 2);
        clkq0.t = cllb.a(0, ((int)TimeUnit.HOURS.toSeconds(4L)), ((int)TimeUnit.DAYS.toSeconds(3L)));
        clkq0.p = true;
        return clkq0.a();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        super.onCreate();
        if(this.b == null) {
            this.b = RepositoryDatabase.v(this.getBaseContext());
        }
        if(this.c == null) {
            this.c = new dlae(this.getBaseContext(), new fgvy());
        }
        if(this.d == null) {
            this.d = aaud.a(this.getBaseContext(), aaua.a);
        }
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onDestroy() {
        super.onDestroy();
        RepositoryDatabase repositoryDatabase0 = this.b;
        if(repositoryDatabase0 != null) {
            repositoryDatabase0.F();
        }
    }
}

