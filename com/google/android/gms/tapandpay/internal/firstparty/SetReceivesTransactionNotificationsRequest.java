package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etgw;

public final class SetReceivesTransactionNotificationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        SetReceivesTransactionNotificationsRequest.CREATOR = new etgw();
    }

    public SetReceivesTransactionNotificationsRequest(boolean z) {
        this.a = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.c(parcel0, v1);
    }
}

