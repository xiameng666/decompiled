import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public abstract class eqiy extends wby implements eqiz {
    public eqiy() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqiw eqiw4;
        eqiw eqiw3;
        eqiw eqiw2;
        eqiw eqiw1;
        eqiw eqiw0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    eqiw1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw1 = (iInterface0 instanceof eqiw) ? ((eqiw)iInterface0) : new eqiu(iBinder0);
                }
                BootstrapOptions bootstrapOptions0 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
                    eqiw0 = (iInterface1 instanceof eqit) ? ((eqit)iInterface1) : new eqir(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.f(eqiw1, bootstrapOptions0, ((eqit)eqiw0), apiMetadata0);
                return true;
            }
            case 2: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    eqiw2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw2 = (iInterface2 instanceof eqiw) ? ((eqiw)iInterface2) : new eqiu(iBinder2);
                }
                BootstrapOptions bootstrapOptions1 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
                    eqiw0 = (iInterface3 instanceof eqit) ? ((eqit)iInterface3) : new eqir(iBinder3);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.x(eqiw2, ((eqit)eqiw0), apiMetadata1);
                return true;
            }
            case 3: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface4 instanceof eqiw) ? ((eqiw)iInterface4) : new eqiu(iBinder4);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.e(eqiw0, apiMetadata2);
                return true;
            }
            case 4: {
                BootstrapOptions bootstrapOptions2 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                String s = this.v(bootstrapOptions2);
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface5 instanceof eqiw) ? ((eqiw)iInterface5) : new eqiu(iBinder5);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.l(eqiw0, apiMetadata4);
                return true;
            }
            case 10: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    eqiw3 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw3 = (iInterface6 instanceof eqiw) ? ((eqiw)iInterface6) : new eqiu(iBinder6);
                }
                BootstrapOptions bootstrapOptions3 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                ParcelFileDescriptor[] arr_parcelFileDescriptor = (ParcelFileDescriptor[])parcel0.createTypedArray(ParcelFileDescriptor.CREATOR);
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                    eqiw0 = (iInterface7 instanceof eqib) ? ((eqib)iInterface7) : new eqhy(iBinder7);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.t(eqiw3, bootstrapOptions3, arr_parcelFileDescriptor, ((eqib)eqiw0), apiMetadata5);
                return true;
            }
            case 11: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface8 instanceof eqiw) ? ((eqiw)iInterface8) : new eqiu(iBinder8);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.a(eqiw0, apiMetadata6);
                return true;
            }
            case 13: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface9 instanceof eqvw) ? ((eqvw)iInterface9) : new eqvu(iBinder9);
                }
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.i(((eqvw)eqiw0), apiMetadata7);
                return true;
            }
            case 14: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface10 instanceof eqvw) ? ((eqvw)iInterface10) : new eqvu(iBinder10);
                }
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.q(((eqvw)eqiw0), apiMetadata8);
                return true;
            }
            case 15: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface11 instanceof eqvw) ? ((eqvw)iInterface11) : new eqvu(iBinder11);
                }
                HandshakeData handshakeData0 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.p(((eqvw)eqiw0), handshakeData0, apiMetadata9);
                return true;
            }
            case 16: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface12 instanceof eqiw) ? ((eqiw)iInterface12) : new eqiu(iBinder12);
                }
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.k(eqiw0, apiMetadata10);
                return true;
            }
            case 17: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface13 instanceof eqvw) ? ((eqvw)iInterface13) : new eqvu(iBinder13);
                }
                HandshakeData handshakeData1 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.c(((eqvw)eqiw0), handshakeData1, apiMetadata11);
                return true;
            }
            case 18: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface14 instanceof eqiw) ? ((eqiw)iInterface14) : new eqiu(iBinder14);
                }
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.j(eqiw0, apiMetadata12);
                return true;
            }
            case 19: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw0 = (iInterface15 instanceof eqiw) ? ((eqiw)iInterface15) : new eqiu(iBinder15);
                }
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.h(eqiw0, apiMetadata13);
                return true;
            }
            case 20: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 == null) {
                    eqiw4 = null;
                }
                else {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    eqiw4 = (iInterface16 instanceof eqiw) ? ((eqiw)iInterface16) : new eqiu(iBinder16);
                }
                BootstrapOptions bootstrapOptions4 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                ParcelFileDescriptor[] arr_parcelFileDescriptor1 = (ParcelFileDescriptor[])parcel0.createTypedArray(ParcelFileDescriptor.CREATOR);
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
                    eqiw0 = (iInterface17 instanceof eqia) ? ((eqia)iInterface17) : new eqia(iBinder17);
                }
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.w(eqiw4, bootstrapOptions4, arr_parcelFileDescriptor1, ((eqia)eqiw0), apiMetadata14);
                return true;
            }
            case 21: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface18 instanceof eqvw) ? ((eqvw)iInterface18) : new eqvu(iBinder18);
                }
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.n(((eqvw)eqiw0), apiMetadata15);
                return true;
            }
            case 22: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface19 instanceof eqvw) ? ((eqvw)iInterface19) : new eqvu(iBinder19);
                }
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.u(((eqvw)eqiw0), apiMetadata16);
                return true;
            }
            case 23: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqiw0 = (iInterface20 instanceof eqvw) ? ((eqvw)iInterface20) : new eqvu(iBinder20);
                }
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqiy.gr(parcel0);
                this.d(((eqvw)eqiw0), apiMetadata17);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

