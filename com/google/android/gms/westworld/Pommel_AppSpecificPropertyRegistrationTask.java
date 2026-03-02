package com.google.android.gms.westworld;

import android.app.Application;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import eixi;
import eixj;
import eizh;
import ejbo;
import ejbp;
import ffnm;
import hrui;

abstract class Pommel_AppSpecificPropertyRegistrationTask extends GmsTaskBoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public Pommel_AppSpecificPropertyRegistrationTask() {
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
            ((ffnm)this.h()).b(((AppSpecificPropertyRegistrationTask)this));
        }
        super.onCreate();
    }
}

