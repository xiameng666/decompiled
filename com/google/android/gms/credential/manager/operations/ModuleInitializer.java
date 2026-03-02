package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import android.safetycenter.SafetyEvent.Builder;
import android.safetycenter.SafetyEvent;
import bbmq;
import bbqa;
import bdjd;
import beun;
import beuo;
import beuu;
import beuv;
import beuy;
import bgkc;
import bgkf;
import bgoi;
import cljp;
import clkm;
import clkq;
import clkr;
import clks;
import clkz;
import clla;
import cllb;
import cllj;
import com.google.android.gms.credential.manager.service.operations.checkup.OnDeviceCheckupTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordChangesSubscriptionTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordSharingSubscriptionTaskBoundService;
import hrwa;
import hsag;
import hsav;
import ibuq;
import icbb;

public final class ModuleInitializer extends beuy {
    public bgkf a;
    public bgkc b;
    public bdjd c;

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        ibuq.f(intent0, "intent");
        bbmq.J("com.google.android.gms.credential.manager.PasswordManagerActivity", true);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        SafetyEvent safetyEvent0;
        ibuq.f(intent0, "intent");
        long v1 = hsav.a.b().d();
        long v2 = hsav.a.b().c();
        int v3 = (int)hsav.a.b().h();
        int v4 = (int)hsav.a.b().f();
        int v5 = (int)hsav.a.b().g();
        int v6 = (int)hsav.a.b().e();
        clkq clkq0 = new clkq();
        clkq0.w(OnDeviceCheckupTaskBoundService.class.getName());
        clkq0.q("PeriodicOnDeviceCheckup");
        clkq0.p = true;
        clkq0.e(v1, v2, cllj.a);
        clkq0.y(v3, v4);
        clkq0.x(v5, v6);
        clkq0.f(0, 1);
        clkq0.t = cllb.a(0, ((int)hsav.a.b().a()), ((int)hsav.a.b().b()));
        clkq0.v(2);
        clkr clkr0 = clkq0.a();
        cljp.a(this).f(clkr0);
        beun beun0 = new beun(this);
        if(bbqa.d()) {
            beuv beuv0 = new beuv(this, ((bgoi)beun0.a()));
            if((v & 2) == 0) {
                safetyEvent0 = beuu.a();
            }
            else {
                safetyEvent0 = new SafetyEvent.Builder(600).build();
                ibuq.e(safetyEvent0, "build(...)");
            }
            beuv0.a(safetyEvent0);
        }
        bgkc bgkc0 = this.b;
        if(bgkc0 == null) {
            ibuq.j("passwordChangesSubscriptionTaskScheduler");
            bgkc0 = null;
        }
        clks clks0 = new clks();
        clks0.w(PasswordChangesSubscriptionTaskBoundService.class.getName());
        clks0.q("PasswordChangesSubscriptionTaskTag");
        clkz clkz0 = clkz.j;
        clks0.a = clkz0;
        clks0.l(false);
        clks0.v(2);
        clla clla0 = clks0.a();
        bgkc0.a.f(clla0);
        bgkf bgkf0 = this.a;
        if(bgkf0 == null) {
            ibuq.j("passwordSharingSubscriptionTaskScheduler");
            bgkf0 = null;
        }
        if(hrwa.a.b().t()) {
            clks clks1 = new clks();
            clks1.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            clks1.q("PasswordSharingSubscriptionTaskTag");
            clks1.a = clkz0;
            clks1.l(false);
            clks1.v(2);
            clla clla1 = clks1.a();
            bgkf0.a.f(clla1);
        }
        else {
            clkq clkq1 = new clkq();
            clkq1.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            clkq1.q("PasswordSharingSubscriptionTaskTag");
            clkq1.j(clkm.h);
            clkq1.v(2);
            clkq1.p = true;
            clkq1.y(2, 2);
            clkq1.f(0, 1);
            clkq1.x(0, 1);
            clkr clkr1 = clkq1.a();
            bgkf0.a.f(clkr1);
        }
        if(hsag.c()) {
            icbb.c(new beuo(this, null));
        }
    }
}

