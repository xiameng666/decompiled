package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejsy;

public class AccountState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean[] a;
    public final boolean[] b;

    static {
        AccountState.CREATOR = new ejsy();
    }

    public AccountState(boolean[] arr_z, boolean[] arr_z1) {
        this.a = arr_z;
        this.b = arr_z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.f(parcel0, 2, this.a, false);
        baub.f(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

