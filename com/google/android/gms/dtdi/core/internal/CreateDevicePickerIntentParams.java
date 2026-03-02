package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bitn;
import biva;
import bivb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import com.google.android.gms.dtdi.discovery.DiscoveryParams;
import java.util.Arrays;

public final class CreateDevicePickerIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public DiscoveryParams a;
    public long b;
    public bivb c;
    public WakeUpRequest d;
    public AnalyticsInfo e;
    public int f;

    static {
        CreateDevicePickerIntentParams.CREATOR = new bitn();
    }

    private CreateDevicePickerIntentParams() {
    }

    public CreateDevicePickerIntentParams(DiscoveryParams discoveryParams0, long v, IBinder iBinder0, WakeUpRequest wakeUpRequest0, AnalyticsInfo analyticsInfo0, int v1) {
        bivb bivb0;
        if(iBinder0 == null) {
            bivb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ICreateDevicePickerIntentCallback");
            bivb0 = (iInterface0 instanceof bivb) ? ((bivb)iInterface0) : new biva(iBinder0);
        }
        super();
        this.a = discoveryParams0;
        this.b = v;
        this.c = bivb0;
        this.d = wakeUpRequest0;
        this.e = analyticsInfo0;
        this.f = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CreateDevicePickerIntentParams) && bata.b(this.a, ((CreateDevicePickerIntentParams)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((CreateDevicePickerIntentParams)object0).b)) && bata.b(this.c, ((CreateDevicePickerIntentParams)object0).c) && bata.b(this.d, ((CreateDevicePickerIntentParams)object0).d) && bata.b(this.e, ((CreateDevicePickerIntentParams)object0).e) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((CreateDevicePickerIntentParams)object0).f));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), this.c, this.d, this.e, ((int)this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.q(parcel0, 2, this.b);
        baub.D(parcel0, 3, (this.c == null ? null : this.c.asBinder()));
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.o(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

