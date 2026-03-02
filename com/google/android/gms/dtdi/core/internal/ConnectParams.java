package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import bitm;
import biux;
import biuz;
import bivt;
import bivv;
import biwa;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import java.util.Arrays;

public final class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public TokenWrapper a;
    public bivv b;
    public biuz c;
    public WakeUpRequest d;
    public azxs e;
    public biwa f;

    static {
        ConnectParams.CREATOR = new bitm();
    }

    public ConnectParams() {
    }

    public ConnectParams(TokenWrapper tokenWrapper0, IBinder iBinder0, IBinder iBinder1, WakeUpRequest wakeUpRequest0, IBinder iBinder2, IBinder iBinder3) {
        biwa biwa0;
        biuz biuz0;
        bivv bivv0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            bivv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnPayloadReceivedCallback");
            bivv0 = (iInterface0 instanceof bivv) ? ((bivv)iInterface0) : new bivt(iBinder0);
        }
        if(iBinder1 == null) {
            biuz0 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IChannelInfoStatusCallback");
            biuz0 = (iInterface1 instanceof biuz) ? ((biuz)iInterface1) : new biux(iBinder1);
        }
        if(iBinder2 == null) {
            biwa0 = null;
        }
        else {
            IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnWakeupCompletedListener");
            biwa0 = (iInterface2 instanceof biwa) ? ((biwa)iInterface2) : new biwa(iBinder2);
        }
        if(iBinder3 != null) {
            IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
        }
        super();
        this.a = tokenWrapper0;
        this.b = bivv0;
        this.c = biuz0;
        this.d = wakeUpRequest0;
        this.f = biwa0;
        this.e = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ConnectParams) && bata.b(this.a, ((ConnectParams)object0).a) && bata.b(this.b, ((ConnectParams)object0).b) && bata.b(this.c, ((ConnectParams)object0).c) && bata.b(this.d, ((ConnectParams)object0).d) && bata.b(this.f, ((ConnectParams)object0).f) && bata.b(this.e, ((ConnectParams)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        IBinder iBinder0 = null;
        baub.D(parcel0, 2, (this.b == null ? null : this.b.asBinder()));
        baub.D(parcel0, 3, (this.c == null ? null : this.c.asBinder()));
        baub.t(parcel0, 4, this.d, v, false);
        baub.D(parcel0, 5, (this.f == null ? null : this.f.a));
        azxs azxs0 = this.e;
        if(azxs0 != null) {
            iBinder0 = azxs0.asBinder();
        }
        baub.D(parcel0, 6, iBinder0);
        baub.c(parcel0, v1);
    }
}

