package com.google.android.gms.people.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import egkb;
import java.util.Collections;

public class ContactsSyncThirdPartyChimeraService extends cjtg {
    public ContactsSyncThirdPartyChimeraService() {
        super(new int[]{0xD0}, new String[]{"com.google.android.gms.people.contactssync.service.THIRD_PARTY_START"}, Collections.EMPTY_SET, 3, 10, 4, null);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new egkb(this, this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

