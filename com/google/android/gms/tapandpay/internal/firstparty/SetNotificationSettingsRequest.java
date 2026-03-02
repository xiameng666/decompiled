package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import etgv;

public final class SetNotificationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final NotificationSettings a;

    static {
        SetNotificationSettingsRequest.CREATOR = new etgv();
    }

    public SetNotificationSettingsRequest(NotificationSettings notificationSettings0) {
        this.a = notificationSettings0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

