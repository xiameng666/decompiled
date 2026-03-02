package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import bivl;
import biwm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import com.google.android.gms.dtdi.core.InvitationHandle;
import java.util.Arrays;

public final class StartBroadcastInvitationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public InvitationHandle a;
    public DeviceFilter[] b;
    private azxs c;
    private bivl d;

    static {
        StartBroadcastInvitationParams.CREATOR = new biwm();
    }

    private StartBroadcastInvitationParams() {
    }

    public StartBroadcastInvitationParams(InvitationHandle invitationHandle0, IBinder iBinder0, IBinder iBinder1, DeviceFilter[] arr_deviceFilter) {
        bivl bivl0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            bivl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IInvitationAcceptedCallback");
            bivl0 = (iInterface0 instanceof bivl) ? ((bivl)iInterface0) : new bivl(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
        }
        super();
        this.a = invitationHandle0;
        this.d = bivl0;
        this.c = azxs0;
        this.b = arr_deviceFilter;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof StartBroadcastInvitationParams) && bata.b(this.a, ((StartBroadcastInvitationParams)object0).a) && bata.b(this.d, ((StartBroadcastInvitationParams)object0).d) && bata.b(this.c, ((StartBroadcastInvitationParams)object0).c) && Arrays.equals(this.b, ((StartBroadcastInvitationParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.c, Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.D(parcel0, 2, this.d.a);
        baub.D(parcel0, 3, this.c.asBinder());
        baub.J(parcel0, 4, this.b, v);
        baub.c(parcel0, v1);
    }
}

