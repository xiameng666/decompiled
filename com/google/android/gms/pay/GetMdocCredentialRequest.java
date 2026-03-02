package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dleb;
import java.util.Arrays;

public final class GetMdocCredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public byte[] b;
    public byte[] c;

    static {
        GetMdocCredentialRequest.CREATOR = new dleb();
    }

    public GetMdocCredentialRequest() {
    }

    public GetMdocCredentialRequest(String s, byte[] arr_b, byte[] arr_b1) {
        this.a = s;
        this.b = arr_b;
        this.c = arr_b1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetMdocCredentialRequest) && bata.b(this.a, ((GetMdocCredentialRequest)object0).a) && Arrays.equals(this.b, ((GetMdocCredentialRequest)object0).b) && Arrays.equals(this.c, ((GetMdocCredentialRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 5, this.c, false);
        baub.c(parcel0, v1);
    }
}

