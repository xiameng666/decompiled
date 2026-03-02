package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhz;
import java.util.Arrays;

public final class SaveImagesForValuableResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String[] a;

    static {
        SaveImagesForValuableResponse.CREATOR = new dlhz();
    }

    public SaveImagesForValuableResponse() {
    }

    public SaveImagesForValuableResponse(String[] arr_s) {
        this.a = arr_s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SaveImagesForValuableResponse) ? Arrays.equals(this.a, ((SaveImagesForValuableResponse)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.w(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

