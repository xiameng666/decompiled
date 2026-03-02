package com.google.android.gms.auth;

import acst;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class NotificationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;

    static {
        NotificationParams.CREATOR = new acst();
    }

    public NotificationParams(String s, String s1, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof NotificationParams) && TextUtils.equals(this.a, ((NotificationParams)object0).a) && TextUtils.equals(this.b, ((NotificationParams)object0).b) && this.c == ((NotificationParams)object0).c;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        return "title=" + this.a + ", text=" + this.b + ", suppressNotification=" + this.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

