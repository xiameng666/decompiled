package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmn;
import java.util.Arrays;

public final class SendTransmissionEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public TransmissionEvent a;

    static {
        SendTransmissionEventRequest.CREATOR = new esmn();
    }

    public SendTransmissionEventRequest() {
    }

    public SendTransmissionEventRequest(TransmissionEvent transmissionEvent0) {
        this.a = transmissionEvent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SendTransmissionEventRequest) ? bata.b(this.a, ((SendTransmissionEventRequest)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

