package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cmnn;
import cmnp_IDeviceOrientationListener;
import cnhs;
import cnhx;
import cnhz_IFusedLocationProviderCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int opCode_;
    public final DeviceOrientationRequestInternal request_;
    public final cmnp_IDeviceOrientationListener listener_;
    public final cnhz_IFusedLocationProviderCallback fusedLocationProviderCallback_;

    static {
        DeviceOrientationRequestUpdateData.CREATOR = new cnhs();
    }

    public DeviceOrientationRequestUpdateData(int v, DeviceOrientationRequestInternal deviceOrientationRequestInternal0, IBinder iBinder0, IBinder iBinder1) {
        cmnp_IDeviceOrientationListener cmnp0;
        this.opCode_ = v;
        this.request_ = deviceOrientationRequestInternal0;
        cnhz_IFusedLocationProviderCallback callback = null;
        if(iBinder0 == null) {
            cmnp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            cmnp0 = (iInterface0 instanceof cmnp_IDeviceOrientationListener) ? ((cmnp_IDeviceOrientationListener)iInterface0) : new cmnn(iBinder0);
        }
        this.listener_ = cmnp0;
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            callback = (iInterface1 instanceof cnhz_IFusedLocationProviderCallback) ? ((cnhz_IFusedLocationProviderCallback)iInterface1) : new cnhx(iBinder1);
        }
        this.fusedLocationProviderCallback_ = callback;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.opCode_);
        baub.t(parcel0, 2, this.request_, v, false);
        IBinder iBinder0 = null;
        baub.D(parcel0, 3, (this.listener_ == null ? null : this.listener_.asBinder()));
        cnhz_IFusedLocationProviderCallback cnhz0 = this.fusedLocationProviderCallback_;
        if(cnhz0 != null) {
            iBinder0 = cnhz0.asBinder();
        }
        baub.D(parcel0, 4, iBinder0);
        baub.c(parcel0, v1);
    }
}

