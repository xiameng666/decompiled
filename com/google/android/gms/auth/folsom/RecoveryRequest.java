package com.google.android.gms.auth.folsom;

import ajqr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class RecoveryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;

    static {
        RecoveryRequest.CREATOR = new ajqr();
    }

    public RecoveryRequest() {
    }

    public RecoveryRequest(String s, String s1, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        this.a = s;
        this.b = s1;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = arr_b2;
        this.f = arr_b3;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RecoveryRequest) && bata.b(this.a, ((RecoveryRequest)object0).a) && bata.b(this.b, ((RecoveryRequest)object0).b) && Arrays.equals(this.c, ((RecoveryRequest)object0).c) && Arrays.equals(this.d, ((RecoveryRequest)object0).d) && Arrays.equals(this.e, ((RecoveryRequest)object0).e) && Arrays.equals(this.f, ((RecoveryRequest)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Arrays.hashCode(this.c), Arrays.hashCode(this.d), Arrays.hashCode(this.e), Arrays.hashCode(this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.i(parcel0, 4, this.d, false);
        baub.i(parcel0, 5, this.e, false);
        baub.i(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}

