package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GetCanonicDeviceIdFromAccountKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;

    static {
        GetCanonicDeviceIdFromAccountKeyResponse.CREATOR = new bnig();
    }

    public GetCanonicDeviceIdFromAccountKeyResponse() {
    }

    public GetCanonicDeviceIdFromAccountKeyResponse(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetCanonicDeviceIdFromAccountKeyResponse) && bata.b(this.a, ((GetCanonicDeviceIdFromAccountKeyResponse)object0).a) && bata.b(this.b, ((GetCanonicDeviceIdFromAccountKeyResponse)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

