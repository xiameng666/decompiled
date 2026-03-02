package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import bblp;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ezpp;
import java.util.Collections;
import java.util.Set;

public class UdcApiChimeraService extends cjtg {
    public UdcApiChimeraService() {
        Set set0 = Collections.EMPTY_SET;
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        super(new int[]{35}, new String[]{"com.google.android.gms.udc.service.START"}, set0, 2, bblp0, null);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ezpp ezpp0;
        String s = getServiceRequest0.f;
        Account account0 = getServiceRequest0.j;
        int v = Binder.getCallingUid();
        long v1 = Binder.clearCallingIdentity();
        try {
            ezpp0 = new ezpp(this, this.l(), account0, s, v);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
        cjtn0.c(ezpp0);
    }

    public static void c() {
        throw new UnsupportedOperationException("This operation is not supported on this build variant");
    }
}

