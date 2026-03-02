package com.google.android.gms.auth.api.identity;

import ahpy;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ggna;
import java.util.List;

public class FetchVerifiedPhoneNumbersResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final String b;
    public final int c;

    static {
        FetchVerifiedPhoneNumbersResult.CREATOR = new ahpy();
    }

    public FetchVerifiedPhoneNumbersResult(List list0, String s, int v) {
        batl.s(list0);
        this.a = list0;
        this.b = s;
        this.c = v;
    }

    public static FetchVerifiedPhoneNumbersResult a() {
        return new FetchVerifiedPhoneNumbersResult(ggna.a, null, 0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

