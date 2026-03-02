package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cobg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ListLocationSharesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ListLocationSharesRequest.CREATOR = new cobg();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

