package com.google.android.gms.auth.api.credentials.credman.remote;

import acp;
import adu;
import afdo;
import afdp;
import afdq;
import afdr;
import afec;
import afed;
import afgg;
import android.os.Bundle;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import lso;
import xni;

@GmsCoreVeId(0x3EC6F)
public class RemoteProxyChimeraActivity extends xni {
    public afed j;
    public acp k;

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTheme(0x7F160C40);  // style:Theme.GisHidden
        afed afed0 = (afed)new lso(this, new afec(this.getIntent())).a(afed.class);
        this.j = afed0;
        afdo afdo0 = new afdo(this);
        afed0.e.g(this, afdo0);
        this.j.d.g(this, new afdp(this));
        this.k = this.registerForActivityResult(new adu(), new afgg(new afdq(this), new afdr(this), 0x6F23));
    }

    @Override  // xni
    protected final void onStart() {
        super.onStart();
        afed afed0 = this.j;
        if(afed0 != null) {
            afed0.c.i();
        }
    }
}

