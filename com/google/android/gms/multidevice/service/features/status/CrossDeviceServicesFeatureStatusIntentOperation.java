package com.google.android.gms.multidevice.service.features.status;

import bbdi;
import bboh;
import ccrt;
import ccrv;
import csxk;
import ctfu;
import ctfw;
import cuma;
import cume;
import ggtj;
import hvmz;
import ibuk;
import ibuq;

public final class CrossDeviceServicesFeatureStatusIntentOperation extends ctfw {
    public csxk a;
    public cuma b;
    private static final bboh d;

    static {
        CrossDeviceServicesFeatureStatusIntentOperation.d = cume.a(new ibuk(CrossDeviceServicesFeatureStatusIntentOperation.class));
    }

    public CrossDeviceServicesFeatureStatusIntentOperation() {
        super(bbdi.eT);
    }

    @Override  // ccsa
    public final ccrt a(ccrv ccrv0) {
        ((ggtj)CrossDeviceServicesFeatureStatusIntentOperation.d.h()).x("providing fetcher");
        csxk csxk0 = this.a;
        if(csxk0 == null) {
            ibuq.j("settingsManager");
            csxk0 = null;
        }
        cuma cuma0 = this.b;
        if(cuma0 == null) {
            ibuq.j("availabilityChecker");
            return new ctfu(csxk0, null);
        }
        return new ctfu(csxk0, cuma0);
    }

    @Override  // ccql
    protected final boolean b() {
        return hvmz.a.d().f();
    }
}

