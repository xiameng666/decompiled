package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import czfx;
import czfz;
import czhv;
import java.util.Arrays;

public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfz a;
    public String b;
    public int c;
    public PresenceDevice d;
    public ConnectionsDevice e;
    public DctDevice f;

    static {
        RejectConnectionRequestParams.CREATOR = new czhv();
    }

    public RejectConnectionRequestParams() {
        this.c = 0;
    }

    public RejectConnectionRequestParams(IBinder iBinder0, String s, int v, PresenceDevice presenceDevice0, ConnectionsDevice connectionsDevice0, DctDevice dctDevice0) {
        czfz czfz0;
        if(iBinder0 == null) {
            czfz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            czfz0 = (iInterface0 instanceof czfz) ? ((czfz)iInterface0) : new czfx(iBinder0);
        }
        super();
        this.a = czfz0;
        this.b = s;
        this.c = v;
        this.d = presenceDevice0;
        this.e = connectionsDevice0;
        this.f = dctDevice0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RejectConnectionRequestParams) && bata.b(this.a, ((RejectConnectionRequestParams)object0).a) && bata.b(this.b, ((RejectConnectionRequestParams)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((RejectConnectionRequestParams)object0).c)) && bata.b(this.d, ((RejectConnectionRequestParams)object0).d) && bata.b(this.e, ((RejectConnectionRequestParams)object0).e) && bata.b(this.f, ((RejectConnectionRequestParams)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d, this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

