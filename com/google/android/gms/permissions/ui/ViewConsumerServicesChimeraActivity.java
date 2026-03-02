package com.google.android.gms.permissions.ui;

import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import cmec;
import com.google.android.apps.common.proguard.UsedByReflection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import ehlc;
import ehnb;
import ehrd;
import ehre;
import ibuq;

public final class ViewConsumerServicesChimeraActivity extends ehrd {
    public static final ehre j;
    private final DispatchingAndroidInjector k;

    static {
        ViewConsumerServicesChimeraActivity.j = new ehre();
        bboh.b("ViewConsumerServicesChimeraActivity", bbcu.dO);
    }

    public ViewConsumerServicesChimeraActivity(cmec cmec0, DispatchingAndroidInjector dispatchingAndroidInjector0, ehlc ehlc0) {
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(dispatchingAndroidInjector0, "androidInjector");
        ibuq.f(ehlc0, "hatsController");
        super(cmec0, dispatchingAndroidInjector0, ehlc0);
        this.k = dispatchingAndroidInjector0;
    }

    @Override  // ehrd
    public final Class a() {
        return ehnb.class;
    }

    @Override  // dagger.android.HasAndroidInjector
    public final AndroidInjector androidInjector() {
        return this.k;
    }

    @Override  // ehrd
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.bN);
        super.onCreate(bundle0);
    }

    @UsedByReflection
    public static final ViewConsumerServicesChimeraActivity provideInstance() {
        return ViewConsumerServicesChimeraActivity.j.provideInstance();
    }
}

