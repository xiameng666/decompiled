package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bndf;
import java.util.Arrays;
import java.util.Set;

@Deprecated
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator CREATOR;
    public final RegisterRequestParams a;
    public final Uri b;

    static {
        BrowserRegisterRequestParams.CREATOR = new bndf();
    }

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams0, Uri uri0) {
        batl.s(registerRequestParams0);
        this.a = registerRequestParams0;
        batl.s(uri0);
        boolean z = true;
        batl.c(uri0.getScheme() != null, "origin scheme must be non-empty");
        if(uri0.getAuthority() == null) {
            z = false;
        }
        batl.c(z, "origin authority must be non-empty");
        this.b = uri0;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Uri a() {
        return this.a.c;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.BrowserRequestParams
    public final Uri b() {
        return this.b;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final ChannelIdValue c() {
        return this.a.f;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Double d() {
        return this.a.b;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Integer e() {
        return this.a.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof BrowserRegisterRequestParams) ? bata.b(this.a, ((BrowserRegisterRequestParams)object0).a) && bata.b(this.b, ((BrowserRegisterRequestParams)object0).b) : false;
    }

    @Override  // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Set f() {
        return this.a.h;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

