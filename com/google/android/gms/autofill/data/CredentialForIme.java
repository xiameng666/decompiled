package com.google.android.gms.autofill.data;

import amni;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialForIme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final SensitiveStringForIme b;
    public final String c;
    public final String d;
    public final Icon e;

    static {
        CredentialForIme.CREATOR = new amni();
    }

    public CredentialForIme(String s, SensitiveStringForIme sensitiveStringForIme0, String s1, String s2, Icon icon0) {
        this.a = s;
        this.b = sensitiveStringForIme0;
        this.c = s1;
        this.d = s2;
        this.e = icon0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}

