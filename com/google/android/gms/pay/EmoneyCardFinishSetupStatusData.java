package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlda;
import java.util.Arrays;

public final class EmoneyCardFinishSetupStatusData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public String c;

    static {
        EmoneyCardFinishSetupStatusData.CREATOR = new dlda();
    }

    public EmoneyCardFinishSetupStatusData() {
    }

    public EmoneyCardFinishSetupStatusData(int v, String s, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof EmoneyCardFinishSetupStatusData) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((EmoneyCardFinishSetupStatusData)object0).a)) && bata.b(this.b, ((EmoneyCardFinishSetupStatusData)object0).b) && bata.b(this.c, ((EmoneyCardFinishSetupStatusData)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

