package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bthr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SupportRequestHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final GoogleHelp a;
    public String b;
    public String c;
    public String d;
    public final String e;

    static {
        SupportRequestHelp.CREATOR = new bthr();
    }

    public SupportRequestHelp(GoogleHelp googleHelp0, String s, String s1, String s2, String s3) {
        this.a = googleHelp0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

