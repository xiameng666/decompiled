package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import ddtp;
import java.util.Arrays;

public final class SendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ShareTarget a;
    public Intent b;
    public azxs c;
    public boolean d;

    static {
        SendParams.CREATOR = new ddtp();
    }

    public SendParams() {
    }

    public SendParams(ShareTarget shareTarget0, Intent intent0, IBinder iBinder0, boolean z) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = shareTarget0;
        this.b = intent0;
        this.c = azxs0;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SendParams) && bata.b(this.a, ((SendParams)object0).a) && bata.b(this.b, ((SendParams)object0).b) && bata.b(this.c, ((SendParams)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((SendParams)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.D(parcel0, 3, this.c.asBinder());
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

