package com.google.android.gms.nearby.presence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import dbag;
import java.util.Arrays;

public final class BroadcastWithIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public azxs a;
    public PendingIntent b;
    public PresenceIdentity c;
    public PresenceAction[] d;

    static {
        BroadcastWithIntentParams.CREATOR = new dbag();
    }

    private BroadcastWithIntentParams() {
    }

    public BroadcastWithIntentParams(IBinder iBinder0, PendingIntent pendingIntent0, PresenceIdentity presenceIdentity0, PresenceAction[] arr_presenceAction) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = azxs0;
        this.b = pendingIntent0;
        this.c = presenceIdentity0;
        this.d = arr_presenceAction;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof BroadcastWithIntentParams) && bata.b(this.a, ((BroadcastWithIntentParams)object0).a) && bata.b(this.b, ((BroadcastWithIntentParams)object0).b) && bata.b(this.c, ((BroadcastWithIntentParams)object0).c) && Arrays.equals(this.d, ((BroadcastWithIntentParams)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Arrays.hashCode(this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.J(parcel0, 4, this.d, v);
        baub.c(parcel0, v1);
    }
}

