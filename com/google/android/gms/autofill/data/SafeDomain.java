package com.google.android.gms.autofill.data;

import ammw;
import amno;
import amol;
import amou;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SafeDomain extends AbstractSafeParcelable implements IDomainParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

    static {
        SafeDomain.CREATOR = new amol();
    }

    public SafeDomain(amno amno0) {
        this(amno0.b, ((amno0 instanceof ammw) ? ((ammw)amno0).a : ""));
    }

    public SafeDomain(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.google.android.gms.autofill.data.IDomainParcelable
    public final amno a() {
        String s = this.b;
        String s1 = this.a;
        return s.isEmpty() ? new amou(s1) : new ammw(s1, s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

