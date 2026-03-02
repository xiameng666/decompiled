package com.google.android.gms.games.internal.popup;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bsgo;
import bsgp;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;

public final class PopupLocationInfoParcelable extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;
    public final IBinder b;

    static {
        PopupLocationInfoParcelable.CREATOR = new bsgp();
    }

    public PopupLocationInfoParcelable(Bundle bundle0, IBinder iBinder0) {
        this.a = bundle0;
        this.b = iBinder0;
    }

    public PopupLocationInfoParcelable(bsgo bsgo0) {
        this.a = bsgo0.a();
        this.b = bsgo0.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.g(parcel0, 1, this.a, false);
        baub.D(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

