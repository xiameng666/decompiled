package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import bata;
import batl;
import baub;
import bauc;
import bbmu;
import bmhk;
import gfsx;
import java.util.Arrays;

public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR;
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    static {
        BrowserPublicKeyCredentialRequestOptions.CREATOR = new bmhk();
    }

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, Uri uri0, byte[] arr_b) {
        batl.s(publicKeyCredentialRequestOptions0);
        this.a = publicKeyCredentialRequestOptions0;
        BrowserPublicKeyCredentialRequestOptions.l(uri0);
        this.b = uri0;
        BrowserPublicKeyCredentialRequestOptions.k(arr_b);
        this.c = arr_b;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public final Uri a() {
        return this.b;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.a.j;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.a.h;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.a.f;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final gfsx e() {
        return gfsx.l(this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BrowserPublicKeyCredentialRequestOptions) ? bata.b(this.a, ((BrowserPublicKeyCredentialRequestOptions)object0).a) && bata.b(this.b, ((BrowserPublicKeyCredentialRequestOptions)object0).b) : false;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.a.b;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.a.e;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver0) {
        this.a.j = resultReceiver0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.a.a;
    }

    @Override  // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        return bauc.n(this);
    }

    public static void k(byte[] arr_b) {
        batl.c(arr_b == null || arr_b.length == 0x20, "clientDataHash must be 32 bytes long");
    }

    public static void l(Uri uri0) {
        batl.s(uri0);
        boolean z = true;
        batl.c(uri0.getScheme() != null, "origin scheme must be non-empty");
        if(uri0.getAuthority() == null) {
            z = false;
        }
        batl.c(z, "origin authority must be non-empty");
    }

    @Override
    public final String toString() {
        String s = bbmu.c(this.c);
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + this.a.toString() + ", \n origin=" + this.b + ", \n clientDataHash=" + s + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.i(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

