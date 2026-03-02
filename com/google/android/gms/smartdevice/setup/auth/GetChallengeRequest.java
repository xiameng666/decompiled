package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import erhl;
import java.util.Arrays;

public class GetChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;

    static {
        GetChallengeRequest.CREATOR = new erhl();
    }

    public GetChallengeRequest() {
    }

    public GetChallengeRequest(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetChallengeRequest) && bata.b(this.a, ((GetChallengeRequest)object0).a) && bata.b(this.b, ((GetChallengeRequest)object0).b) && bata.b(this.c, ((GetChallengeRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

