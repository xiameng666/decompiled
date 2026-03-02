package com.google.android.gms.nudges;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import djyu;
import java.util.Arrays;

public final class NudgeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public String d;

    static {
        NudgeResponse.CREATOR = new djyu();
    }

    public NudgeResponse() {
    }

    public NudgeResponse(int v, int v1, int v2, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof NudgeResponse) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((NudgeResponse)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((NudgeResponse)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((NudgeResponse)object0).c)) && bata.b(this.d, ((NudgeResponse)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

