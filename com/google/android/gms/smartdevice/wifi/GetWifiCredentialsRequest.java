package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import erqu;
import java.util.Arrays;

public final class GetWifiCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;

    static {
        GetWifiCredentialsRequest.CREATOR = new erqu();
    }

    public GetWifiCredentialsRequest() {
    }

    public GetWifiCredentialsRequest(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetWifiCredentialsRequest) && bata.b(this.a, ((GetWifiCredentialsRequest)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((GetWifiCredentialsRequest)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

