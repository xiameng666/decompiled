import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.GetLocalEndpointIdParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.RegisterDeviceProviderParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParamsV3;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.SetDownloadsDirectoryParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParamsV3;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParamsV3;
import com.google.android.gms.nearby.internal.connection.StartListeningParams;
import com.google.android.gms.nearby.internal.connection.StartListeningParamsV3;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopListeningParams;
import com.google.android.gms.nearby.internal.connection.UnregisterDeviceProviderParams;
import com.google.android.gms.nearby.internal.connection.UpdateAdvertisingOptionsParams;
import com.google.android.gms.nearby.internal.connection.UpdateAdvertisingOptionsParamsV3;
import com.google.android.gms.nearby.internal.connection.UpdateConnectionOptionsParams;
import com.google.android.gms.nearby.internal.connection.UpdateConnectionSettingParams;
import com.google.android.gms.nearby.internal.connection.UpdateDiscoveryOptionsParams;
import com.google.android.gms.nearby.internal.connection.UpdateDiscoveryOptionsParamsV3;

public abstract class czfs extends wby implements czft {
    public czfs() {
        super("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        czfq czfq0 = null;
        switch(v) {
            case 1001: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    czfq0 = (iInterface0 instanceof czfq) ? ((czfq)iInterface0) : new czfq(iBinder0);
                }
                String s = parcel0.readString();
                AppMetadata appMetadata0 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                long v1 = parcel0.readLong();
                long v2 = parcel0.readLong();
                czfs.gr(parcel0);
                this.U(czfq0, s, v1, v2);
                parcel1.writeNoException();
                return true;
            }
            case 1002: {
                long v3 = parcel0.readLong();
                czfs.gr(parcel0);
                this.z(v3);
                parcel1.writeNoException();
                return true;
            }
            case 1003: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    czfq0 = (iInterface1 instanceof czfq) ? ((czfq)iInterface1) : new czfq(iBinder1);
                }
                String s1 = parcel0.readString();
                long v4 = parcel0.readLong();
                long v5 = parcel0.readLong();
                czfs.gr(parcel0);
                this.T(czfq0, s1, v4, v5);
                parcel1.writeNoException();
                return true;
            }
            case 1004: {
                parcel0.readString();
                long v6 = parcel0.readLong();
                czfs.gr(parcel0);
                this.P(v6);
                parcel1.writeNoException();
                return true;
            }
            case 1007: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    czfq0 = (iInterface2 instanceof czfq) ? ((czfq)iInterface2) : new czfq(iBinder2);
                }
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                long v7 = parcel0.readLong();
                czfs.gr(parcel0);
                this.S(czfq0, s2, s3, arr_b, v7);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F0: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    czfq0 = (iInterface3 instanceof czfq) ? ((czfq)iInterface3) : new czfq(iBinder3);
                }
                String s4 = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                long v8 = parcel0.readLong();
                czfs.gr(parcel0);
                this.Q(czfq0, s4, arr_b1, v8);
                parcel1.writeNoException();
                return true;
            }
            case 1009: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    czfq0 = (iInterface4 instanceof czfq) ? ((czfq)iInterface4) : new czfq(iBinder4);
                }
                String s5 = parcel0.readString();
                long v9 = parcel0.readLong();
                czfs.gr(parcel0);
                this.R(czfq0, s5, v9);
                parcel1.writeNoException();
                return true;
            }
            case 1010: {
                String[] arr_s = parcel0.createStringArray();
                byte[] arr_b2 = parcel0.createByteArray();
                long v10 = parcel0.readLong();
                czfs.gr(parcel0);
                this.q(arr_s, arr_b2, v10);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F3: {
                String[] arr_s1 = parcel0.createStringArray();
                byte[] arr_b3 = parcel0.createByteArray();
                long v11 = parcel0.readLong();
                czfs.gr(parcel0);
                this.r(arr_s1, arr_b3, v11);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F4: {
                String s6 = parcel0.readString();
                long v12 = parcel0.readLong();
                czfs.gr(parcel0);
                this.h(s6, v12);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F5: {
                long v13 = parcel0.readLong();
                czfs.gr(parcel0);
                this.B(v13);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F6: {
                long v14 = parcel0.readLong();
                czfs.gr(parcel0);
                this.f(v14);
                parcel1.writeNoException();
                return true;
            }
            case 0x3F7: {
                long v15 = parcel0.readLong();
                czfs.gr(parcel0);
                String s7 = this.c(v15);
                parcel1.writeNoException();
                parcel1.writeString(s7);
                return true;
            }
            case 0x3F8: {
                String s8 = this.a();
                parcel1.writeNoException();
                parcel1.writeString(s8);
                return true;
            }
            case 2001: {
                StartAdvertisingParams startAdvertisingParams0 = (StartAdvertisingParams)wbz.a(parcel0, StartAdvertisingParams.CREATOR);
                czfs.gr(parcel0);
                this.t(startAdvertisingParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2002: {
                StopAdvertisingParams stopAdvertisingParams0 = (StopAdvertisingParams)wbz.a(parcel0, StopAdvertisingParams.CREATOR);
                czfs.gr(parcel0);
                this.A(stopAdvertisingParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2003: {
                StartDiscoveryParams startDiscoveryParams0 = (StartDiscoveryParams)wbz.a(parcel0, StartDiscoveryParams.CREATOR);
                czfs.gr(parcel0);
                this.v(startDiscoveryParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2004: {
                StopDiscoveryParams stopDiscoveryParams0 = (StopDiscoveryParams)wbz.a(parcel0, StopDiscoveryParams.CREATOR);
                czfs.gr(parcel0);
                this.D(stopDiscoveryParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2005: {
                SendConnectionRequestParams sendConnectionRequestParams0 = (SendConnectionRequestParams)wbz.a(parcel0, SendConnectionRequestParams.CREATOR);
                czfs.gr(parcel0);
                this.n(sendConnectionRequestParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2006: {
                AcceptConnectionRequestParams acceptConnectionRequestParams0 = (AcceptConnectionRequestParams)wbz.a(parcel0, AcceptConnectionRequestParams.CREATOR);
                czfs.gr(parcel0);
                this.d(acceptConnectionRequestParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2007: {
                RejectConnectionRequestParams rejectConnectionRequestParams0 = (RejectConnectionRequestParams)wbz.a(parcel0, RejectConnectionRequestParams.CREATOR);
                czfs.gr(parcel0);
                this.m(rejectConnectionRequestParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2008: {
                SendPayloadParams sendPayloadParams0 = (SendPayloadParams)wbz.a(parcel0, SendPayloadParams.CREATOR);
                czfs.gr(parcel0);
                this.p(sendPayloadParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2009: {
                DisconnectFromEndpointParams disconnectFromEndpointParams0 = (DisconnectFromEndpointParams)wbz.a(parcel0, DisconnectFromEndpointParams.CREATOR);
                czfs.gr(parcel0);
                this.i(disconnectFromEndpointParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2010: {
                StopAllEndpointsParams stopAllEndpointsParams0 = (StopAllEndpointsParams)wbz.a(parcel0, StopAllEndpointsParams.CREATOR);
                czfs.gr(parcel0);
                this.C(stopAllEndpointsParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2011: {
                ClientDisconnectingParams clientDisconnectingParams0 = (ClientDisconnectingParams)wbz.a(parcel0, ClientDisconnectingParams.CREATOR);
                czfs.gr(parcel0);
                this.g(clientDisconnectingParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2012: {
                CancelPayloadParams cancelPayloadParams0 = (CancelPayloadParams)wbz.a(parcel0, CancelPayloadParams.CREATOR);
                czfs.gr(parcel0);
                this.e(cancelPayloadParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2013: {
                InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams0 = (InitiateBandwidthUpgradeParams)wbz.a(parcel0, InitiateBandwidthUpgradeParams.CREATOR);
                czfs.gr(parcel0);
                this.k(initiateBandwidthUpgradeParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2014: {
                GetLocalEndpointIdParams getLocalEndpointIdParams0 = (GetLocalEndpointIdParams)wbz.a(parcel0, GetLocalEndpointIdParams.CREATOR);
                czfs.gr(parcel0);
                String s9 = this.O();
                parcel1.writeNoException();
                parcel1.writeString(s9);
                return true;
            }
            case 0x7DF: {
                UpdateDiscoveryOptionsParams updateDiscoveryOptionsParams0 = (UpdateDiscoveryOptionsParams)wbz.a(parcel0, UpdateDiscoveryOptionsParams.CREATOR);
                czfs.gr(parcel0);
                this.M(updateDiscoveryOptionsParams0);
                parcel1.writeNoException();
                return true;
            }
            case 0x7E0: {
                UpdateAdvertisingOptionsParams updateAdvertisingOptionsParams0 = (UpdateAdvertisingOptionsParams)wbz.a(parcel0, UpdateAdvertisingOptionsParams.CREATOR);
                czfs.gr(parcel0);
                this.I(updateAdvertisingOptionsParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2017: {
                UpdateConnectionSettingParams updateConnectionSettingParams0 = (UpdateConnectionSettingParams)wbz.a(parcel0, UpdateConnectionSettingParams.CREATOR);
                czfs.gr(parcel0);
                this.L(updateConnectionSettingParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2018: {
                RegisterDeviceProviderParams registerDeviceProviderParams0 = (RegisterDeviceProviderParams)wbz.a(parcel0, RegisterDeviceProviderParams.CREATOR);
                czfs.gr(parcel0);
                this.l(registerDeviceProviderParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2019: {
                StartListeningParams startListeningParams0 = (StartListeningParams)wbz.a(parcel0, StartListeningParams.CREATOR);
                czfs.gr(parcel0);
                this.x(startListeningParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2020: {
                StopListeningParams stopListeningParams0 = (StopListeningParams)wbz.a(parcel0, StopListeningParams.CREATOR);
                czfs.gr(parcel0);
                this.E(stopListeningParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2021: {
                UpdateConnectionOptionsParams updateConnectionOptionsParams0 = (UpdateConnectionOptionsParams)wbz.a(parcel0, UpdateConnectionOptionsParams.CREATOR);
                czfs.gr(parcel0);
                this.K(updateConnectionOptionsParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2022: {
                SetDownloadsDirectoryParams setDownloadsDirectoryParams0 = (SetDownloadsDirectoryParams)wbz.a(parcel0, SetDownloadsDirectoryParams.CREATOR);
                czfs.gr(parcel0);
                this.s(setDownloadsDirectoryParams0);
                parcel1.writeNoException();
                return true;
            }
            case 2023: {
                UnregisterDeviceProviderParams unregisterDeviceProviderParams0 = (UnregisterDeviceProviderParams)wbz.a(parcel0, UnregisterDeviceProviderParams.CREATOR);
                czfs.gr(parcel0);
                this.H(unregisterDeviceProviderParams0);
                parcel1.writeNoException();
                return true;
            }
            case 3001: {
                StartAdvertisingParamsV3 startAdvertisingParamsV30 = (StartAdvertisingParamsV3)wbz.a(parcel0, StartAdvertisingParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.u(startAdvertisingParamsV30);
                parcel1.writeNoException();
                return true;
            }
            case 3002: {
                StartDiscoveryParamsV3 startDiscoveryParamsV30 = (StartDiscoveryParamsV3)wbz.a(parcel0, StartDiscoveryParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.w(startDiscoveryParamsV30);
                parcel1.writeNoException();
                return true;
            }
            case 3003: {
                UpdateAdvertisingOptionsParamsV3 updateAdvertisingOptionsParamsV30 = (UpdateAdvertisingOptionsParamsV3)wbz.a(parcel0, UpdateAdvertisingOptionsParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.J(updateAdvertisingOptionsParamsV30);
                parcel1.writeNoException();
                return true;
            }
            case 3004: {
                UpdateDiscoveryOptionsParamsV3 updateDiscoveryOptionsParamsV30 = (UpdateDiscoveryOptionsParamsV3)wbz.a(parcel0, UpdateDiscoveryOptionsParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.N(updateDiscoveryOptionsParamsV30);
                parcel1.writeNoException();
                return true;
            }
            case 3005: {
                SendConnectionRequestParamsV3 sendConnectionRequestParamsV30 = (SendConnectionRequestParamsV3)wbz.a(parcel0, SendConnectionRequestParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.o(sendConnectionRequestParamsV30);
                parcel1.writeNoException();
                return true;
            }
            case 3006: {
                StartListeningParamsV3 startListeningParamsV30 = (StartListeningParamsV3)wbz.a(parcel0, StartListeningParamsV3.CREATOR);
                czfs.gr(parcel0);
                this.y(startListeningParamsV30);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

