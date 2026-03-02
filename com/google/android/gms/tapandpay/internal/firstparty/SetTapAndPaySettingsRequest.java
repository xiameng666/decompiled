package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.TapAndPaySettings;
import etgy;

public class SetTapAndPaySettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final TapAndPaySettings a;

    static {
        SetTapAndPaySettingsRequest.CREATOR = new etgy();
    }

    public SetTapAndPaySettingsRequest(TapAndPaySettings tapAndPaySettings0) {
        this.a = tapAndPaySettings0;
    }

    public final int a() {
        return this.a.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

