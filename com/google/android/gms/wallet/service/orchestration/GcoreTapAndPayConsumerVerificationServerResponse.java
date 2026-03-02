package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcelable.Creator;
import com.google.android.wallet.ui.tapandpay.TapAndPayConsumerVerificationResponse;
import fbtz;
import fbym;
import hcbr;

public class GcoreTapAndPayConsumerVerificationServerResponse extends TapAndPayConsumerVerificationResponse implements fbym {
    public static final Parcelable.Creator CREATOR;

    static {
        GcoreTapAndPayConsumerVerificationServerResponse.CREATOR = new fbtz();
    }

    public GcoreTapAndPayConsumerVerificationServerResponse(hcbr hcbr0, int v) {
        super(hcbr0, v);
    }

    @Override  // fbym
    public final boolean a() {
        return false;
    }
}

