package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import biwk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class SetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public azxs b;
    public int c;

    static {
        SetMediaTransferEnabledParams.CREATOR = new biwk();
    }

    public SetMediaTransferEnabledParams() {
    }

    public SetMediaTransferEnabledParams(boolean z, IBinder iBinder0, int v) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = z;
        this.b = azxs0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetMediaTransferEnabledParams) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((SetMediaTransferEnabledParams)object0).a)) && bata.b(this.b, ((SetMediaTransferEnabledParams)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((SetMediaTransferEnabledParams)object0).c));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b.asBinder());
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

