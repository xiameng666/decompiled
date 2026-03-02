package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egcu;

public class CallingCardRequestStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        CallingCardRequestStatus.CREATOR = new egcu();
    }

    public CallingCardRequestStatus(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CallingCardRequestStatus) && this.a == ((CallingCardRequestStatus)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

