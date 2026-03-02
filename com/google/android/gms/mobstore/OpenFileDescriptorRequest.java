package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csol;

public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Uri a;
    public final int b;

    static {
        OpenFileDescriptorRequest.CREATOR = new csol();
    }

    public OpenFileDescriptorRequest(Uri uri0, int v) {
        this.a = uri0;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

