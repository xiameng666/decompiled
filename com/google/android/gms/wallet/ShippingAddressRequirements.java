package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faxl;
import java.util.ArrayList;

public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ArrayList a;

    static {
        ShippingAddressRequirements.CREATOR = new faxl();
    }

    private ShippingAddressRequirements() {
    }

    public ShippingAddressRequirements(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

