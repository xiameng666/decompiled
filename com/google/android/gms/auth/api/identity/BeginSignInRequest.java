package com.google.android.gms.auth.api.identity;

import ahpl;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final BeginSignInRequest.PasswordRequestOptions a;
    public final BeginSignInRequest.GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final BeginSignInRequest.PasskeysRequestOptions f;
    public final BeginSignInRequest.PasskeyJsonRequestOptions g;
    public final boolean h;

    static {
        BeginSignInRequest.CREATOR = new ahpl();
    }

    public BeginSignInRequest(BeginSignInRequest.PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0, BeginSignInRequest.GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0, String s, boolean z, int v, BeginSignInRequest.PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions0, BeginSignInRequest.PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions0, boolean z1) {
        batl.s(beginSignInRequest$PasswordRequestOptions0);
        this.a = beginSignInRequest$PasswordRequestOptions0;
        batl.s(beginSignInRequest$GoogleIdTokenRequestOptions0);
        this.b = beginSignInRequest$GoogleIdTokenRequestOptions0;
        this.c = s;
        this.d = z;
        this.e = v;
        if(beginSignInRequest$PasskeysRequestOptions0 == null) {
            beginSignInRequest$PasskeysRequestOptions0 = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
        }
        this.f = beginSignInRequest$PasskeysRequestOptions0;
        if(beginSignInRequest$PasskeyJsonRequestOptions0 == null) {
            beginSignInRequest$PasskeyJsonRequestOptions0 = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
        }
        this.g = beginSignInRequest$PasskeyJsonRequestOptions0;
        this.h = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BeginSignInRequest) ? bata.b(this.a, ((BeginSignInRequest)object0).a) && bata.b(this.b, ((BeginSignInRequest)object0).b) && bata.b(this.f, ((BeginSignInRequest)object0).f) && bata.b(this.g, ((BeginSignInRequest)object0).g) && bata.b(this.c, ((BeginSignInRequest)object0).c) && this.d == ((BeginSignInRequest)object0).d && this.e == ((BeginSignInRequest)object0).e && this.h == ((BeginSignInRequest)object0).h : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), ((int)this.e), Boolean.valueOf(this.h)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.e(parcel0, 8, this.h);
        baub.c(parcel0, v1);
    }
}

