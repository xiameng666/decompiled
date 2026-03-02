package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import epug;
import java.util.List;

public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final String b;

    static {
        RecordConsentByConsentResultResponse.CREATOR = new epug();
    }

    public RecordConsentByConsentResultResponse(List list0, String s) {
        this.a = list0;
        this.b = s;
    }

    @Override  // azuj
    public final Status a() {
        return this.b == null ? Status.f : Status.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

