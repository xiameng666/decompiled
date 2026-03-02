package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dljs;
import java.util.Arrays;

public final class TicketOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public AccessibleImage a;
    public String b;
    public String c;
    public AccessibleImage d;
    public PendingIntent e;

    static {
        TicketOption.CREATOR = new dljs();
    }

    public TicketOption() {
    }

    public TicketOption(AccessibleImage accessibleImage0, String s, String s1, AccessibleImage accessibleImage1, PendingIntent pendingIntent0) {
        this.a = accessibleImage0;
        this.b = s;
        this.c = s1;
        this.d = accessibleImage1;
        this.e = pendingIntent0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof TicketOption) && bata.b(this.a, ((TicketOption)object0).a) && bata.b(this.b, ((TicketOption)object0).b) && bata.b(this.c, ((TicketOption)object0).c) && bata.b(this.d, ((TicketOption)object0).d) && bata.b(this.e, ((TicketOption)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}

