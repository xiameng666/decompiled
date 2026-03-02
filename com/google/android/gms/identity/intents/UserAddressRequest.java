package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxrm;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public List a;

    static {
        UserAddressRequest.CREATOR = new bxrm();
    }

    UserAddressRequest() {
    }

    public UserAddressRequest(List list0) {
        this.a = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}

