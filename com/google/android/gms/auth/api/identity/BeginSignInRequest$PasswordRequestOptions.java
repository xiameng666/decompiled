package com.google.android.gms.auth.api.identity;

import ahqm;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public final class BeginSignInRequest.PasswordRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        BeginSignInRequest.PasswordRequestOptions.CREATOR = new ahqm();
    }

    public BeginSignInRequest.PasswordRequestOptions(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BeginSignInRequest.PasswordRequestOptions) ? this.a == ((BeginSignInRequest.PasswordRequestOptions)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

