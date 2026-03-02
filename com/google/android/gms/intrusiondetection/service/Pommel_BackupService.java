package com.google.android.gms.intrusiondetection.service;

import android.app.Application;
import cadw;
import com.google.android.gms.chimera.modules.intrusiondetection.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import eixi;
import eixj;
import eizh;
import ejbo;
import ejbp;
import hrui;

public abstract class Pommel_BackupService extends GmsTaskBoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public Pommel_BackupService() {
        this.b = new Object();
        this.c = false;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.k();
    }

    @Override  // ejbo
    public final Object h() {
        return this.k().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizh k() {
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

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((cadw)this.h()).a(((BackupService)this));
        }
        super.onCreate();
    }
}

