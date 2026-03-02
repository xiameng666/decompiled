package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdkw;

public class RecordTermConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    static {
        RecordTermConsentRequest.CREATOR = new fdkw();
    }

    public RecordTermConsentRequest(int v, int v1, boolean z, String s, String s1, String s2) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = s;
        this.e = s1;
        this.f = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}

