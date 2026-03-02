package com.google.android.gms.castauth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import avne;
import avng;
import avnh;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class SignParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public avng b;

    static {
        SignParams.CREATOR = new avnh();
    }

    public SignParams() {
    }

    public SignParams(byte[] arr_b, IBinder iBinder0) {
        avng avng0;
        if(iBinder0 == null) {
            avng0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.castauth.internal.ISignatureCallback");
            avng0 = (iInterface0 instanceof avng) ? ((avng)iInterface0) : new avne(iBinder0);
        }
        super();
        this.a = arr_b;
        this.b = avng0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SignParams) && Arrays.equals(this.a, ((SignParams)object0).a) && bata.b(this.b, ((SignParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.c(parcel0, v1);
    }
}

