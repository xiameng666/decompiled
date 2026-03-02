package com.google.android.gms.auth.firstparty.dataservice;

import ajmq;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AccountInterruptControls extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        AccountInterruptControls.CREATOR = new ajmq();
    }

    public AccountInterruptControls(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AccountInterruptControls) ? ((AccountInterruptControls)object0).a == this.a : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

