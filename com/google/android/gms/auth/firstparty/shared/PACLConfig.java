package com.google.android.gms.auth.firstparty.shared;

import ajpq;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class PACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final String c;

    static {
        PACLConfig.CREATOR = new ajpq();
    }

    public PACLConfig(int v, String s, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
    }

    public PACLConfig(String s, String s1) {
        this.a = 1;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PACLConfig) && TextUtils.equals(this.b, ((PACLConfig)object0).b) && TextUtils.equals(this.c, ((PACLConfig)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

