package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ethv;

public class HasEligibleTokenizationTargetRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    static {
        HasEligibleTokenizationTargetRequest.CREATOR = new ethv();
    }

    public HasEligibleTokenizationTargetRequest(String s, int v, int v1, String s1) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

