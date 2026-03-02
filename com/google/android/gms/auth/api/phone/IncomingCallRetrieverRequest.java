package com.google.android.gms.auth.api.phone;

import ahwz;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class IncomingCallRetrieverRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        IncomingCallRetrieverRequest.CREATOR = new ahwz();
    }

    public IncomingCallRetrieverRequest(String s, String s1, String s2, String s3) {
        ibuq.f(s, "countryCode");
        ibuq.f(s1, "prefix");
        ibuq.f(s2, "startRange");
        ibuq.f(s3, "endRange");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

