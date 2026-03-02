package com.google.android.gms.googleone.service.scheduler;

import android.app.Application;
import buid;
import com.google.android.gms.chimera.modules.googleone.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import eixi;
import eixj;
import eizh;
import ejbo;
import ejbp;
import hrui;

public abstract class Pommel_StorageUpdateTaskBoundService extends GmsTaskBoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public Pommel_StorageUpdateTaskBoundService() {
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
            ((buid)this.h()).e(((StorageUpdateTaskBoundService)this));
        }
        super.onCreate();
    }
}

