package com.google.android.gms.fido.client.dataoperation.converters;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import gfsx;

public class DisplayableCtap2Credential extends PublicKeyCredential {
    public final gfsx a;

    public DisplayableCtap2Credential(PublicKeyCredential publicKeyCredential0, gfsx gfsx0) {
        super(publicKeyCredential0.b, publicKeyCredential0.c, publicKeyCredential0.d, publicKeyCredential0.e, publicKeyCredential0.f, publicKeyCredential0.g, publicKeyCredential0.h, publicKeyCredential0.i);
        this.a = gfsx0;
    }
}

