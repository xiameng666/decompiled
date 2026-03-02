package com.google.android.gms.libs.notifications;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cjki;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class NotificationTrampoline extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PendingIntent a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;

    static {
        NotificationTrampoline.CREATOR = new cjki();
    }

    public NotificationTrampoline(PendingIntent pendingIntent0, int v, String s, String s1, String s2, int v1, String s3, int v2) {
        this.a = pendingIntent0;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = v1;
        this.g = s3;
        this.h = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof NotificationTrampoline) ? this.b == ((NotificationTrampoline)object0).b && this.f == ((NotificationTrampoline)object0).f && Objects.equals(this.a, ((NotificationTrampoline)object0).a) && Objects.equals(this.c, ((NotificationTrampoline)object0).c) && Objects.equals(this.d, ((NotificationTrampoline)object0).d) && Objects.equals(this.e, ((NotificationTrampoline)object0).e) && Objects.equals(this.g, ((NotificationTrampoline)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b), this.c, this.d, this.e, ((int)this.f), this.g});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.v(parcel0, 7, this.g, false);
        baub.o(parcel0, 8, this.h);
        baub.c(parcel0, v1);
    }
}

