package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import eqxr;
import java.util.ArrayList;
import java.util.List;

public class QuickStartTargetEventData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final VerificationInfo c;
    public final int d;
    public final boolean e;
    public final ArrayList f;
    public final int g;
    public final String h;
    public final boolean i;
    public final List j;
    public final int k;

    static {
        QuickStartTargetEventData.CREATOR = new eqxr();
    }

    public QuickStartTargetEventData(int v, String s, VerificationInfo verificationInfo0, int v1, boolean z, ArrayList arrayList0, int v2, String s1, boolean z1, List list0, int v3) {
        this.a = v;
        this.b = s;
        this.c = verificationInfo0;
        this.d = v1;
        this.e = z;
        this.f = arrayList0;
        this.g = v2;
        this.h = s1;
        this.i = z1;
        this.j = list0;
        this.k = v3;
    }

    public static QuickStartTargetEventData a(int v) {
        return new QuickStartTargetEventData(15, null, null, 0, false, null, 0, null, false, null, v);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.o(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.y(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.e(parcel0, 9, this.i);
        baub.y(parcel0, 10, this.j, false);
        baub.o(parcel0, 11, this.k);
        baub.c(parcel0, v1);
    }
}

