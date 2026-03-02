package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbcq;
import fbcr;

public final class GetInstrumentAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        GetInstrumentAvailabilityResponse.CREATOR = new fbcr();
    }

    private GetInstrumentAvailabilityResponse() {
    }

    public GetInstrumentAvailabilityResponse(String s, int v, boolean z, String s1, String s2, String s3, String s4, String s5, String s6) {
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
    }

    public static fbcq a() {
        return new fbcq(new GetInstrumentAvailabilityResponse());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.c(parcel0, v1);
    }
}

