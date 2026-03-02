package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmr;
import java.util.Arrays;

public final class SetReceivesIneligibleCardNotificationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public int b;

    static {
        SetReceivesIneligibleCardNotificationRequest.CREATOR = new esmr();
    }

    public SetReceivesIneligibleCardNotificationRequest() {
    }

    public SetReceivesIneligibleCardNotificationRequest(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetReceivesIneligibleCardNotificationRequest) && bata.b(Long.valueOf(this.a), Long.valueOf(((SetReceivesIneligibleCardNotificationRequest)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((SetReceivesIneligibleCardNotificationRequest)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

