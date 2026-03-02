package com.google.android.gms.chromesync.initialization;

import android.content.Intent;
import ayfh;
import ayrt;
import ayrw;
import clkq;
import clkr;
import clks;
import clkz;
import clla;
import cllb;
import cllj;
import com.google.android.gms.chromesync.tasks.SendDeviceInfoTaskBoundService;
import com.google.android.gms.chromesync.tasks.UpdateAffiliationsTaskBoundService;
import hqyq;
import hqza;
import hrwa;
import ibuq;

public final class ModuleInitializer extends ayfh {
    public ayrw a;
    public ayrt b;

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        ayrt ayrt1;
        ayrw ayrw0 = this.a;
        if(ayrw0 == null) {
            ibuq.j("updateAffiliationsTaskScheduler");
            ayrw0 = null;
        }
        if(hrwa.a.b().s()) {
            clks clks0 = new clks();
            clks0.w(UpdateAffiliationsTaskBoundService.class.getName());
            clks0.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            clks0.a = clkz.k;
            clks0.l(true);
            clks0.v(2);
            clla clla0 = clks0.a();
            ayrw0.a.f(clla0);
        }
        else {
            long v1 = hqza.a.b().d();
            long v2 = hqza.a.b().c();
            int v3 = (int)hqza.a.b().h();
            int v4 = (int)hqza.a.b().f();
            int v5 = (int)hqza.a.b().g();
            int v6 = (int)hqza.a.b().e();
            clkq clkq0 = new clkq();
            clkq0.w(UpdateAffiliationsTaskBoundService.class.getName());
            clkq0.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            clkq0.p = true;
            clkq0.e(v1, v2, cllj.a);
            clkq0.y(v3, v4);
            clkq0.x(v5, v6);
            clkq0.f(0, 1);
            clkq0.t = cllb.a(0, ((int)hqza.a.b().a()), ((int)hqza.a.b().b()));
            clkq0.v(2);
            clkr clkr0 = clkq0.a();
            ayrw0.a.f(clkr0);
        }
        ayrt ayrt0 = this.b;
        if(ayrt0 == null) {
            ibuq.j("sendDeviceInfoTaskScheduler");
            ayrt1 = null;
        }
        else {
            ayrt1 = ayrt0;
        }
        clkz clkz0 = clkz.e(((int)hqyq.b()));
        clks clks1 = new clks();
        clks1.w(SendDeviceInfoTaskBoundService.class.getName());
        clks1.q("SendDeviceInfoTaskTag");
        clks1.a = clkz0;
        clks1.l(true);
        clks1.v(2);
        clks1.t = cllb.a(0, ((int)hqyq.a.c().c()), ((int)hqyq.a.c().b()));
        clla clla1 = clks1.a();
        ayrt1.a.f(clla1);
    }
}

