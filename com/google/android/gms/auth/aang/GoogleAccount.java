package com.google.android.gms.auth.aang;

import actu;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GoogleAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        GoogleAccount.CREATOR = new actu();
    }

    public GoogleAccount(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GoogleAccount) ? bata.b(this.a, ((GoogleAccount)object0).a) && bata.b(this.c, ((GoogleAccount)object0).c) && bata.b(this.b, ((GoogleAccount)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override
    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

