package com.google.android.gms.auth.cryptauth;

import ajff;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class KeyRegistrationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final Status b;
    public final byte[] c;
    public final List d;

    static {
        KeyRegistrationResult.CREATOR = new ajff();
    }

    public KeyRegistrationResult(int v, Status status0, byte[] arr_b, List list0) {
        this.a = v;
        this.b = status0;
        this.c = arr_b;
        this.d = list0;
    }

    public KeyRegistrationResult(Status status0, byte[] arr_b, List list0) {
        this(1, status0, arr_b, list0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.i(parcel0, 3, this.c, false);
        baub.y(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

