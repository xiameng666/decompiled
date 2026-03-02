package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuxc;
import java.util.Arrays;

public final class UwbRangingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public boolean d;

    static {
        UwbRangingData.CREATOR = new cuxc();
    }

    public UwbRangingData() {
    }

    public UwbRangingData(int v, int v1, int v2, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UwbRangingData) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((UwbRangingData)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((UwbRangingData)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((UwbRangingData)object0).c)) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((UwbRangingData)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), Boolean.valueOf(this.d)});
    }

    @Override
    public final String toString() {
        return "UwbRangingData{rawDistance=" + this.a + ", rawAngleOfArrivalAzimuth=" + this.b + ", rawAngleOfArrivalPolar=" + this.c + ", isValidAngleOfArrivalData=" + this.d + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

