package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esks;
import java.util.Arrays;

public final class CheckContactlessEligibilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;

    static {
        CheckContactlessEligibilityResponse.CREATOR = new esks();
    }

    public CheckContactlessEligibilityResponse() {
    }

    public CheckContactlessEligibilityResponse(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CheckContactlessEligibilityResponse) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((CheckContactlessEligibilityResponse)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((CheckContactlessEligibilityResponse)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

