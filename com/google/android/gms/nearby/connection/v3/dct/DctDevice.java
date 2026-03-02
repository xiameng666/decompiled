package com.google.android.gms.nearby.connection.v3.dct;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cuwc;
import cuwd;
import cvxx;
import cvxy;
import ggna;
import java.util.Arrays;
import java.util.List;

public class DctDevice extends AbstractSafeParcelable implements cuwd {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final List b;

    static {
        DctDevice.CREATOR = new cvxy();
    }

    public DctDevice(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override  // cuwd
    public final int a() {
        return 3;
    }

    @Override  // cuwd
    public final int b() {
        return 0;
    }

    @Override  // cuwd
    public final cuwc d() {
        cuwc cuwc0 = new cvxx();
        cuwc0.a = this.a;
        cuwc0.b = this.b;
        return cuwc0;
    }

    @Override  // cuwd
    public final String e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof DctDevice) && bata.b(this.a, ((DctDevice)object0).a) && bata.b(this.b, ((DctDevice)object0).b);
    }

    @Override  // cuwd
    public final List f() {
        return ggna.a;
    }

    @Override  // cuwd
    public final byte[] g() {
        for(Object object0: this.b) {
            DctDeviceDataElement dctDeviceDataElement0 = (DctDeviceDataElement)object0;
            if(dctDeviceDataElement0.b == 7) {
                return dctDeviceDataElement0.d;
            }
        }
        return new byte[0];
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override
    public final String toString() {
        return String.format("DctDevice:<endpointId: %s, deviceDataElements: %s>", this.a, this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        cvxy.a(this, parcel0);
    }
}

