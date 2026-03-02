package com.google.android.gms.identity.accounts.security;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bxhe;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class EncryptedAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    static {
        EncryptedAccountData.CREATOR = new bxhe();
    }

    public EncryptedAccountData(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        boolean z = true;
        batl.c(arr_b.length > 0, "Encrypted bytes must not be empty.");
        batl.c(arr_b1.length > 0, "IV bytes must not be empty.");
        if(arr_b2.length <= 0) {
            z = false;
        }
        batl.c(z, "MAC bytes must not be empty.");
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

