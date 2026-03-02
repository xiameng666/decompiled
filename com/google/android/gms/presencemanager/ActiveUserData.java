package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejff;
import java.util.Arrays;

public final class ActiveUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ActiveUser a;
    public final String b;
    public final boolean c;
    public final int d;

    static {
        ActiveUserData.CREATOR = new ejff();
    }

    public ActiveUserData(ActiveUser activeUser0, String s, boolean z, int v) {
        this.a = activeUser0;
        this.b = s;
        this.c = z;
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ActiveUserData) ? bata.b(this.a, ((ActiveUserData)object0).a) && TextUtils.equals(this.b, ((ActiveUserData)object0).b) && this.c == ((ActiveUserData)object0).c && this.d == ((ActiveUserData)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), ((int)this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

