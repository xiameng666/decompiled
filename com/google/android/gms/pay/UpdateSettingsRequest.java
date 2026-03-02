package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlks;
import java.util.Arrays;

public final class UpdateSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public ProtoSafeParcelable b;
    public ProtoSafeParcelable c;

    static {
        UpdateSettingsRequest.CREATOR = new dlks();
    }

    public UpdateSettingsRequest() {
    }

    public UpdateSettingsRequest(Account account0, ProtoSafeParcelable protoSafeParcelable0, ProtoSafeParcelable protoSafeParcelable1) {
        this.a = account0;
        this.b = protoSafeParcelable0;
        this.c = protoSafeParcelable1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UpdateSettingsRequest) && bata.b(this.a, ((UpdateSettingsRequest)object0).a) && bata.b(this.b, ((UpdateSettingsRequest)object0).b) && bata.b(this.c, ((UpdateSettingsRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

