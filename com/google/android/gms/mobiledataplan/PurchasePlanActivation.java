package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crvt;
import java.util.ArrayList;
import java.util.Arrays;

public class PurchasePlanActivation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;

    static {
        PurchasePlanActivation.CREATOR = new crvt();
    }

    public PurchasePlanActivation() {
    }

    public PurchasePlanActivation(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof PurchasePlanActivation) ? bata.b(this.a, ((PurchasePlanActivation)object0).a) && bata.b(this.b, ((PurchasePlanActivation)object0).b) && this.c == ((PurchasePlanActivation)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("transactionId", this.a, arrayList0);
        basz.b("planId", this.b, arrayList0);
        basz.b("state", Integer.valueOf(this.c), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

