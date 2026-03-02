package com.google.android.gms.auth.api.accounttransfer;

import aduq;
import android.os.Bundle;
import bauc;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collections;

public class AccountTransferChimeraService extends cjtg {
    public static final int a;

    public AccountTransferChimeraService() {
        super(0x80, "com.google.android.gms.auth.api.accounttransfer.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new aduq(this, this.l(), getServiceRequest0));
    }

    public static DeviceAuthInfo b(Bundle bundle0) {
        return (DeviceAuthInfo)bauc.a(bundle0.getByteArray("deviceAuth"), DeviceAuthInfo.CREATOR);
    }

    public static ArrayList c(Bundle bundle0) {
        return bundle0.getStringArrayList("accountTypes");
    }
}

