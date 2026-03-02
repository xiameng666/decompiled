package com.google.android.location.reporting.service;

import android.accounts.Account;
import azqk;
import bbdg;
import bbmn;
import bbpg;
import ccmq;
import cntt;
import com.google.android.chimera.SettingInjectorService;
import fxtr;
import huty;
import java.util.List;

public class LocationHistoryChimeraInjectorService extends SettingInjectorService {
    public LocationHistoryChimeraInjectorService() {
        super("LocationHistoryReportingInjectorService");
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ccmq.a().a(bbdg.jm);
    }

    @Override  // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return bbpg.c(this) && !azqk.g(this);
    }

    @Override  // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        huty huty0 = huty.a;
        if(huty0.b().d()) {
            List list0 = bbmn.h(this, "com.google.android.gms");
            if(huty0.b().b() && list0.size() > 1) {
                return "Tap to manage";
            }
            if(list0.size() == 1) {
                return cntt.b(fxtr.b(this).c(((Account)list0.get(0))).a()) ? "On" : "Off";
            }
        }
        return null;
    }
}

