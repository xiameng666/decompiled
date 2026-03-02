package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgr;
import java.util.Arrays;

public final class PassInstance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public PassType a;
    public String b;
    public String c;
    public String d;
    public Bitmap e;
    public String f;
    public PendingIntent g;
    public String h;
    public Bitmap i;
    public int j;

    static {
        PassInstance.CREATOR = new dlgr();
    }

    public PassInstance() {
        this.j = 0xDADCE0;
    }

    public PassInstance(PassType passType0, String s, String s1, String s2, Bitmap bitmap0, String s3, PendingIntent pendingIntent0, String s4, Bitmap bitmap1, int v) {
        this.a = passType0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = bitmap0;
        this.f = s3;
        this.g = pendingIntent0;
        this.h = s4;
        this.i = bitmap1;
        this.j = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof PassInstance) && bata.b(this.a, ((PassInstance)object0).a) && bata.b(this.b, ((PassInstance)object0).b) && bata.b(this.c, ((PassInstance)object0).c) && bata.b(this.d, ((PassInstance)object0).d) && bata.b(this.e, ((PassInstance)object0).e) && bata.b(this.f, ((PassInstance)object0).f) && bata.b(this.g, ((PassInstance)object0).g) && bata.b(this.h, ((PassInstance)object0).h) && bata.b(this.i, ((PassInstance)object0).i) && bata.b(Integer.valueOf(this.j), Integer.valueOf(((PassInstance)object0).j));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ((int)this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.v(parcel0, 6, this.f, false);
        baub.t(parcel0, 7, this.g, v, false);
        baub.v(parcel0, 8, this.h, false);
        baub.t(parcel0, 9, this.i, v, false);
        baub.o(parcel0, 10, this.j);
        baub.c(parcel0, v1);
    }
}

