package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbws;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class VerifyPhoneNumberRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final IdTokenRequest c;
    public final Bundle d;
    public final List e;
    public final boolean f;
    public final int g;
    public final List h;

    static {
        VerifyPhoneNumberRequest.CREATOR = new bbws();
    }

    public VerifyPhoneNumberRequest(String s, long v, IdTokenRequest idTokenRequest0, Bundle bundle0, List list0, boolean z, int v1, List list1) {
        this.a = s;
        this.b = v;
        this.c = idTokenRequest0;
        this.d = bundle0;
        this.e = list0;
        this.f = z;
        this.g = v1;
        this.h = list1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.g(parcel0, 4, this.d, false);
        baub.y(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.o(parcel0, 7, this.g);
        baub.E(parcel0, 8, this.h);
        baub.c(parcel0, v1);
    }
}

