package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etlg;

public final class ServerPushProvisionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PushProvisionSessionContext a;
    public final String b;
    public final UserAddress c;
    public final ServerPushProvisionRequest.ExtraOptions d;

    static {
        ServerPushProvisionRequest.CREATOR = new etlg();
    }

    public ServerPushProvisionRequest(PushProvisionSessionContext pushProvisionSessionContext0, String s, UserAddress userAddress0, ServerPushProvisionRequest.ExtraOptions serverPushProvisionRequest$ExtraOptions0) {
        this.a = pushProvisionSessionContext0;
        this.b = s;
        this.c = userAddress0;
        this.d = serverPushProvisionRequest$ExtraOptions0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

