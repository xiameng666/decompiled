package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlkf;
import java.util.Arrays;

public final class TransitCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public Bitmap c;
    public Bitmap d;
    public String e;
    public String f;
    public PendingIntent g;
    public TransitCardDialog h;

    static {
        TransitCard.CREATOR = new dlkf();
    }

    public TransitCard() {
    }

    public TransitCard(int v, String s, Bitmap bitmap0, Bitmap bitmap1, String s1, String s2, PendingIntent pendingIntent0, TransitCardDialog transitCardDialog0) {
        this.a = v;
        this.b = s;
        this.c = bitmap0;
        this.d = bitmap1;
        this.e = s1;
        this.f = s2;
        this.g = pendingIntent0;
        this.h = transitCardDialog0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof TransitCard) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((TransitCard)object0).a)) && bata.b(this.b, ((TransitCard)object0).b) && bata.b(this.c, ((TransitCard)object0).c) && bata.b(this.d, ((TransitCard)object0).d) && bata.b(this.e, ((TransitCard)object0).e) && bata.b(this.f, ((TransitCard)object0).f) && bata.b(this.g, ((TransitCard)object0).g) && bata.b(this.h, ((TransitCard)object0).h);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.c(parcel0, v1);
    }
}

