package com.google.android.gms.multidevice.service.enrollment.trigger;

import android.app.Application;
import com.google.android.gms.chimera.modules.multidevice.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import ctfn;
import eixi;
import eixj;
import eizh;
import ejbo;
import ejbp;
import hrui;

public abstract class Pommel_EligibilityTaskService extends GmsTaskBoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public Pommel_EligibilityTaskService() {
        this.b = new Object();
        this.c = false;
    }

    public final eizh d() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = new eizh(this);
                }
            }
            return this.a;
        }
        return this.a;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.d();
    }

    @Override  // ejbo
    public final Object h() {
        return this.d().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((ctfn)this.h()).e(((EligibilityTaskService)this));
        }
        super.onCreate();
    }
}

