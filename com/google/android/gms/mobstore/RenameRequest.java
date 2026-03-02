package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cson;

public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Uri a;
    public final Uri b;

    static {
        RenameRequest.CREATOR = new cson();
    }

    public RenameRequest(Uri uri0, Uri uri1) {
        this.a = uri0;
        this.b = uri1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

