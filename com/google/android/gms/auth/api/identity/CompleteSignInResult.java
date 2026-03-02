package com.google.android.gms.auth.api.identity;

import ahpv;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final SignInCredential a;

    static {
        CompleteSignInResult.CREATOR = new ahpv();
    }

    public CompleteSignInResult(SignInCredential signInCredential0) {
        batl.s(signInCredential0);
        this.a = signInCredential0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

