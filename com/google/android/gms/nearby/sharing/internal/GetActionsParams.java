package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import ddnd;
import ddox;
import ddoz;
import java.util.Arrays;

public final class GetActionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ShareTarget a;
    public ddoz b;

    static {
        GetActionsParams.CREATOR = new ddnd();
    }

    public GetActionsParams() {
    }

    public GetActionsParams(ShareTarget shareTarget0, IBinder iBinder0) {
        ddoz ddoz0;
        if(iBinder0 == null) {
            ddoz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetActionListResultListener");
            ddoz0 = (iInterface0 instanceof ddoz) ? ((ddoz)iInterface0) : new ddox(iBinder0);
        }
        super();
        this.a = shareTarget0;
        this.b = ddoz0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetActionsParams) && bata.b(this.a, ((GetActionsParams)object0).a) && bata.b(this.b, ((GetActionsParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.c(parcel0, v1);
    }
}

