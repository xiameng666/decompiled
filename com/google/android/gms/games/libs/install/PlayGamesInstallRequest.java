package com.google.android.gms.games.libs.install;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bsgr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PlayGamesInstallRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        PlayGamesInstallRequest.CREATOR = new bsgr();
    }

    public PlayGamesInstallRequest(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

