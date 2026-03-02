package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import efyo;
import java.util.List;

public class GetContactsConsentsStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final int b;
    public final int c;

    static {
        GetContactsConsentsStatusRequest.CREATOR = new efyo();
    }

    public GetContactsConsentsStatusRequest(List list0, int v, int v1) {
        this.a = list0;
        this.b = v;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

