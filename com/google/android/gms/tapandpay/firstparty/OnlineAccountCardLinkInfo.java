package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmb;
import java.util.ArrayList;
import java.util.Arrays;

public final class OnlineAccountCardLinkInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;

    static {
        OnlineAccountCardLinkInfo.CREATOR = new esmb();
    }

    public OnlineAccountCardLinkInfo(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof OnlineAccountCardLinkInfo) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((OnlineAccountCardLinkInfo)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((OnlineAccountCardLinkInfo)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("accountType", Integer.valueOf(this.a), arrayList0);
        basz.b("status", Integer.valueOf(this.b), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

