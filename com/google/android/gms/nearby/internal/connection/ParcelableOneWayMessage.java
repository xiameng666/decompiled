package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czhj;
import java.util.Arrays;

public final class ParcelableOneWayMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public ParcelByteArray b;

    static {
        ParcelableOneWayMessage.CREATOR = new czhj();
    }

    public ParcelableOneWayMessage() {
    }

    public ParcelableOneWayMessage(String s, ParcelByteArray parcelByteArray0) {
        this.a = s;
        this.b = parcelByteArray0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ParcelableOneWayMessage) && bata.b(this.a, ((ParcelableOneWayMessage)object0).a) && bata.b(this.b, ((ParcelableOneWayMessage)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

