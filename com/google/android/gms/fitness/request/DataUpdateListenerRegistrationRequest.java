package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import brag;
import brai;
import brce;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Arrays;

public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final DataSource a;
    public final DataType b;
    public final PendingIntent c;
    public final brai d;

    static {
        DataUpdateListenerRegistrationRequest.CREATOR = new brce();
    }

    public DataUpdateListenerRegistrationRequest(DataSource dataSource0, DataType dataType0, PendingIntent pendingIntent0, IBinder iBinder0) {
        brai brai0;
        this.a = dataSource0;
        this.b = dataType0;
        this.c = pendingIntent0;
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.d = brai0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DataUpdateListenerRegistrationRequest) ? bata.b(this.a, ((DataUpdateListenerRegistrationRequest)object0).a) && bata.b(this.b, ((DataUpdateListenerRegistrationRequest)object0).b) && bata.b(this.c, ((DataUpdateListenerRegistrationRequest)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("dataSource", this.a, arrayList0);
        basz.b("dataType", this.b, arrayList0);
        basz.b("pendingIntent", this.c, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.D(parcel0, 4, (this.d == null ? null : this.d.asBinder()));
        baub.c(parcel0, v1);
    }
}

