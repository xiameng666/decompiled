package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cbwc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class ClientLanguageSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        ClientLanguageSettings.CREATOR = new cbwc();
    }

    public ClientLanguageSettings(List list0) {
        this.a = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

