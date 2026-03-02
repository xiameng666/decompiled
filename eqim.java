import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public abstract class eqim extends wby implements eqin {
    public eqim() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqik eqik5;
        eqik eqik4;
        eqik eqik3;
        eqik eqik2;
        eqik eqik1;
        eqik eqik0 = null;
        if(v != 16) {
            switch(v) {
                case 1: {
                    IBinder iBinder0 = parcel0.readStrongBinder();
                    if(iBinder0 == null) {
                        eqik1 = null;
                    }
                    else {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik1 = (iInterface0 instanceof eqik) ? ((eqik)iInterface0) : new eqii(iBinder0);
                    }
                    IBinder iBinder1 = parcel0.readStrongBinder();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
                        eqik0 = (iInterface1 instanceof eqiq) ? ((eqiq)iInterface1) : new eqio(iBinder1);
                    }
                    ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.r(eqik1, ((eqiq)eqik0), apiMetadata0);
                    return true;
                }
                case 2: {
                    IBinder iBinder2 = parcel0.readStrongBinder();
                    if(iBinder2 != null) {
                        IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface2 instanceof eqik) ? ((eqik)iInterface2) : new eqii(iBinder2);
                    }
                    ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.s(eqik0, apiMetadata1);
                    return true;
                }
                case 3: {
                    IBinder iBinder3 = parcel0.readStrongBinder();
                    if(iBinder3 == null) {
                        eqik2 = null;
                    }
                    else {
                        IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik2 = (iInterface3 instanceof eqik) ? ((eqik)iInterface3) : new eqii(iBinder3);
                    }
                    D2DDevice d2DDevice0 = (D2DDevice)wbz.a(parcel0, D2DDevice.CREATOR);
                    String s = parcel0.readString();
                    IBinder iBinder4 = parcel0.readStrongBinder();
                    if(iBinder4 != null) {
                        IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
                        eqik0 = (iInterface4 instanceof eqih) ? ((eqih)iInterface4) : new eqif(iBinder4);
                    }
                    ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.f(eqik2, d2DDevice0, s, ((eqih)eqik0), apiMetadata2);
                    return true;
                }
                case 4: {
                    IBinder iBinder5 = parcel0.readStrongBinder();
                    if(iBinder5 == null) {
                        eqik3 = null;
                    }
                    else {
                        IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik3 = (iInterface5 instanceof eqik) ? ((eqik)iInterface5) : new eqii(iBinder5);
                    }
                    D2DDevice d2DDevice1 = (D2DDevice)wbz.a(parcel0, D2DDevice.CREATOR);
                    BootstrapConfigurations bootstrapConfigurations0 = (BootstrapConfigurations)wbz.a(parcel0, BootstrapConfigurations.CREATOR);
                    IBinder iBinder6 = parcel0.readStrongBinder();
                    if(iBinder6 != null) {
                        IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
                        eqik0 = (iInterface6 instanceof eqie) ? ((eqie)iInterface6) : new eqic(iBinder6);
                    }
                    ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.d(eqik3, d2DDevice1, bootstrapConfigurations0, ((eqie)eqik0), apiMetadata3);
                    return true;
                }
                case 5: {
                    IBinder iBinder7 = parcel0.readStrongBinder();
                    if(iBinder7 != null) {
                        IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface7 instanceof eqik) ? ((eqik)iInterface7) : new eqii(iBinder7);
                    }
                    parcel0.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.v(eqik0, apiMetadata4);
                    return true;
                }
                case 6: {
                    IBinder iBinder8 = parcel0.readStrongBinder();
                    if(iBinder8 != null) {
                        IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface8 instanceof eqik) ? ((eqik)iInterface8) : new eqii(iBinder8);
                    }
                    ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.h(eqik0, apiMetadata5);
                    return true;
                }
                case 7: {
                    IBinder iBinder9 = parcel0.readStrongBinder();
                    if(iBinder9 != null) {
                        IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface9 instanceof eqik) ? ((eqik)iInterface9) : new eqii(iBinder9);
                    }
                    Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.p(eqik0, bundle0, apiMetadata6);
                    return true;
                }
                case 8: {
                    IBinder iBinder10 = parcel0.readStrongBinder();
                    if(iBinder10 != null) {
                        IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface10 instanceof eqik) ? ((eqik)iInterface10) : new eqii(iBinder10);
                    }
                    BootstrapConfigurations bootstrapConfigurations1 = (BootstrapConfigurations)wbz.a(parcel0, BootstrapConfigurations.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.t(eqik0, bootstrapConfigurations1, apiMetadata7);
                    return true;
                }
                case 9: {
                    IBinder iBinder11 = parcel0.readStrongBinder();
                    if(iBinder11 != null) {
                        IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface11 instanceof eqik) ? ((eqik)iInterface11) : new eqii(iBinder11);
                    }
                    ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.i(eqik0, apiMetadata8);
                    return true;
                }
                case 10: {
                    IBinder iBinder12 = parcel0.readStrongBinder();
                    if(iBinder12 == null) {
                        eqik4 = null;
                    }
                    else {
                        IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik4 = (iInterface12 instanceof eqik) ? ((eqik)iInterface12) : new eqii(iBinder12);
                    }
                    BootstrapConfigurations bootstrapConfigurations2 = (BootstrapConfigurations)wbz.a(parcel0, BootstrapConfigurations.CREATOR);
                    ParcelFileDescriptor[] arr_parcelFileDescriptor = (ParcelFileDescriptor[])parcel0.createTypedArray(ParcelFileDescriptor.CREATOR);
                    IBinder iBinder13 = parcel0.readStrongBinder();
                    if(iBinder13 != null) {
                        IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                        eqik0 = (iInterface13 instanceof eqib) ? ((eqib)iInterface13) : new eqhy(iBinder13);
                    }
                    ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.q(eqik4, bootstrapConfigurations2, arr_parcelFileDescriptor, ((eqib)eqik0), apiMetadata9);
                    return true;
                }
                case 11: {
                    IBinder iBinder14 = parcel0.readStrongBinder();
                    if(iBinder14 != null) {
                        IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik0 = (iInterface14 instanceof eqik) ? ((eqik)iInterface14) : new eqii(iBinder14);
                    }
                    ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.a(eqik0, apiMetadata10);
                    return true;
                }
                case 19: {
                    IBinder iBinder15 = parcel0.readStrongBinder();
                    if(iBinder15 != null) {
                        IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                        eqik0 = (iInterface15 instanceof eqvw) ? ((eqvw)iInterface15) : new eqvu(iBinder15);
                    }
                    ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.j(((eqvw)eqik0), apiMetadata11);
                    return true;
                }
                case 20: {
                    IBinder iBinder16 = parcel0.readStrongBinder();
                    if(iBinder16 != null) {
                        IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                        eqik0 = (iInterface16 instanceof eqvw) ? ((eqvw)iInterface16) : new eqvu(iBinder16);
                    }
                    HandshakeData handshakeData0 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.k(((eqvw)eqik0), handshakeData0, apiMetadata12);
                    return true;
                }
                case 21: {
                    IBinder iBinder17 = parcel0.readStrongBinder();
                    if(iBinder17 != null) {
                        IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                        eqik0 = (iInterface17 instanceof eqvw) ? ((eqvw)iInterface17) : new eqvu(iBinder17);
                    }
                    HandshakeData handshakeData1 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.c(((eqvw)eqik0), handshakeData1, apiMetadata13);
                    return true;
                }
                case 22: {
                    ConnectParams connectParams0 = (ConnectParams)wbz.a(parcel0, ConnectParams.CREATOR);
                    ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.g(connectParams0, apiMetadata14);
                    return true;
                }
                case 23: {
                    IBinder iBinder18 = parcel0.readStrongBinder();
                    if(iBinder18 == null) {
                        eqik5 = null;
                    }
                    else {
                        IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        eqik5 = (iInterface18 instanceof eqik) ? ((eqik)iInterface18) : new eqii(iBinder18);
                    }
                    BootstrapConfigurations bootstrapConfigurations3 = (BootstrapConfigurations)wbz.a(parcel0, BootstrapConfigurations.CREATOR);
                    ParcelFileDescriptor[] arr_parcelFileDescriptor1 = (ParcelFileDescriptor[])parcel0.createTypedArray(ParcelFileDescriptor.CREATOR);
                    IBinder iBinder19 = parcel0.readStrongBinder();
                    if(iBinder19 != null) {
                        IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
                        eqik0 = (iInterface19 instanceof eqia) ? ((eqia)iInterface19) : new eqia(iBinder19);
                    }
                    ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                    eqim.gr(parcel0);
                    this.u(eqik5, bootstrapConfigurations3, arr_parcelFileDescriptor1, ((eqia)eqik0), apiMetadata15);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        IBinder iBinder20 = parcel0.readStrongBinder();
        if(iBinder20 != null) {
            IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
            eqik0 = (iInterface20 instanceof eqik) ? ((eqik)iInterface20) : new eqii(iBinder20);
        }
        Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
        ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
        eqim.gr(parcel0);
        this.l(eqik0, bundle1, apiMetadata16);
        return true;
    }
}

