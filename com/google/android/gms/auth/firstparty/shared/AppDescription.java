package com.google.android.gms.auth.firstparty.shared;

import ajph;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = null;
    final int a;
    public int b;
    String c;
    String d;
    public String e;
    boolean f;
    private static final String g = "[AppDescription]";

    static {
        AppDescription.CREATOR = new ajph();
    }

    public AppDescription(int v, int v1, String s, String s1, String s2, boolean z) {
        this.getClass();
        this.a = v;
        this.c = s;
        this.d = s1;
        batl.r(s2, "[AppDescription] callingPkg cannot be null or empty!");
        this.e = s2;
        batl.c(v1 != 0, "Invalid callingUid! Cannot be 0!");
        this.b = v1;
        this.f = z;
    }

    public AppDescription(String s, int v) {
        this(s, v, null, null);
    }

    public AppDescription(String s, int v, String s1, String s2) {
        this(1, v, s1, s2, s, false);
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

