package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhc;
import java.util.Arrays;

public final class PayGlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public Bitmap c;
    public String d;
    public String e;
    public String f;
    public Bitmap g;
    public PendingIntent h;
    public int i;

    static {
        PayGlobalActionCard.CREATOR = new dlhc();
    }

    public PayGlobalActionCard() {
    }

    public PayGlobalActionCard(int v, String s, Bitmap bitmap0, String s1, String s2, String s3, Bitmap bitmap1, PendingIntent pendingIntent0, int v1) {
        this.a = v;
        this.b = s;
        this.c = bitmap0;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = bitmap1;
        this.h = pendingIntent0;
        this.i = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof PayGlobalActionCard) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((PayGlobalActionCard)object0).a)) && bata.b(this.b, ((PayGlobalActionCard)object0).b) && bata.b(this.c, ((PayGlobalActionCard)object0).c) && bata.b(this.d, ((PayGlobalActionCard)object0).d) && bata.b(this.e, ((PayGlobalActionCard)object0).e) && bata.b(this.f, ((PayGlobalActionCard)object0).f) && bata.b(this.g, ((PayGlobalActionCard)object0).g) && bata.b(this.h, ((PayGlobalActionCard)object0).h) && bata.b(Integer.valueOf(this.i), Integer.valueOf(((PayGlobalActionCard)object0).i));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((int)this.i)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.g, v, false);
        baub.t(parcel0, 7, this.h, v, false);
        baub.v(parcel0, 8, this.f, false);
        baub.o(parcel0, 9, this.i);
        baub.c(parcel0, v1);
    }
}

