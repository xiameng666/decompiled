package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmir;
import bmis;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class PublicKeyCredentialType extends Enum implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final enum PublicKeyCredentialType a;
    public final String b;
    private static final PublicKeyCredentialType[] c;

    static {
        PublicKeyCredentialType.a = new PublicKeyCredentialType();
        PublicKeyCredentialType.c = new PublicKeyCredentialType[]{PublicKeyCredentialType.a};
        PublicKeyCredentialType.CREATOR = new bmir();
    }

    private PublicKeyCredentialType() {
        super("PUBLIC_KEY", 0);
        this.b = "public-key";
    }

    public static PublicKeyCredentialType a(String s) {
        PublicKeyCredentialType[] arr_publicKeyCredentialType = PublicKeyCredentialType.values();
        for(int v = 0; v < arr_publicKeyCredentialType.length; ++v) {
            PublicKeyCredentialType publicKeyCredentialType0 = arr_publicKeyCredentialType[v];
            if(s.equals(publicKeyCredentialType0.b)) {
                return publicKeyCredentialType0;
            }
        }
        throw new bmis(String.format("PublicKeyCredentialType %s not supported", s));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.b;
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[])PublicKeyCredentialType.c.clone();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
    }
}

