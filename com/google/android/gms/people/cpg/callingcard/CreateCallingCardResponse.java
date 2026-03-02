package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import egde;
import j..util.Objects;

public class CreateCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final CallingCardRequestStatus a;
    public final CallingCardIdentifier b;

    static {
        CreateCallingCardResponse.CREATOR = new egde();
    }

    public CreateCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus0, CallingCardIdentifier callingCardIdentifier0) {
        this.a = callingCardRequestStatus0;
        this.b = callingCardIdentifier0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CreateCallingCardResponse) && Objects.equals(this.a, ((CreateCallingCardResponse)object0).a) && Objects.equals(this.b, ((CreateCallingCardResponse)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = v | 1;
        int v2 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v1, false);
        baub.t(parcel0, 2, this.b, v1, false);
        baub.c(parcel0, v2);
    }
}

