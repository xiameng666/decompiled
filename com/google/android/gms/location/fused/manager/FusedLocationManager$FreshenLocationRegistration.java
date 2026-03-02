package com.google.android.gms.location.fused.manager;

import android.location.Location;
import cjax;
import cjde;
import cmtj;
import cmtm;
import cmzz;
import cnal;
import cnam;
import cnap;
import com.google.android.gms.libs.identity.ClientIdentity;
import j..util.Objects;

public final class FusedLocationManager.FreshenLocationRegistration extends FusedLocationManager.Registration {
    final cmzz f;
    private final cnal g;
    private final Location h;

    public FusedLocationManager.FreshenLocationRegistration(cmzz cmzz0, ClientIdentity clientIdentity0, cnal cnal0, Location location0) {
        Objects.requireNonNull(cmzz0);
        this.f = cmzz0;
        cmtj cmtj0 = new cmtj();
        cmtj0.d(0L);
        cmtj0.f(102);
        cmtj0.e(30000L);
        cmtj0.c(30000L);
        cmtj0.g(2);
        cmtj0.b = true;
        cmtj0.d = cjax.a(clientIdentity0);
        super(cmzz0, cmtj0.a(), clientIdentity0, new cnap());
        this.g = cnal0;
        this.h = location0;
    }

    @Override  // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final cjde o(cmtm cmtm0, boolean z) {
        cnam cnam0 = (cnam)Objects.requireNonNull(this.f.h);
        Location location0 = cmtm0.c();
        cnam0.b(this.g, this.h, location0);
        this.l();
        return null;
    }

    @Override  // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final void r(boolean z) {
    }
}

