package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnht;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class ChangeFindMyDeviceSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Boolean a;
    public Boolean b;
    public FindMyDeviceNetworkSettings c;
    public boolean d;

    static {
        ChangeFindMyDeviceSettingsRequest.CREATOR = new bnht();
    }

    public ChangeFindMyDeviceSettingsRequest() {
    }

    public ChangeFindMyDeviceSettingsRequest(Boolean boolean0, Boolean boolean1, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0, boolean z) {
        this.a = boolean0;
        this.b = boolean1;
        this.c = findMyDeviceNetworkSettings0;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ChangeFindMyDeviceSettingsRequest) && bata.b(this.a, ((ChangeFindMyDeviceSettingsRequest)object0).a) && bata.b(this.b, ((ChangeFindMyDeviceSettingsRequest)object0).b) && bata.b(this.c, ((ChangeFindMyDeviceSettingsRequest)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((ChangeFindMyDeviceSettingsRequest)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.z(parcel0, 1, this.a);
        baub.e(parcel0, 3, this.d);
        baub.z(parcel0, 4, this.b);
        baub.t(parcel0, 5, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

