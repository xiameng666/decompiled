import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
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

public interface czft extends IInterface {
    void A(StopAdvertisingParams arg1);

    void B(long arg1);

    void C(StopAllEndpointsParams arg1);

    void D(StopDiscoveryParams arg1);

    void E(StopListeningParams arg1);

    void H(UnregisterDeviceProviderParams arg1);

    void I(UpdateAdvertisingOptionsParams arg1);

    void J(UpdateAdvertisingOptionsParamsV3 arg1);

    void K(UpdateConnectionOptionsParams arg1);

    void L(UpdateConnectionSettingParams arg1);

    void M(UpdateDiscoveryOptionsParams arg1);

    void N(UpdateDiscoveryOptionsParamsV3 arg1);

    String O();

    void P(long arg1);

    void Q(czfq arg1, String arg2, byte[] arg3, long arg4);

    void R(czfq arg1, String arg2, long arg3);

    void S(czfq arg1, String arg2, String arg3, byte[] arg4, long arg5);

    void T(czfq arg1, String arg2, long arg3, long arg4);

    void U(czfq arg1, String arg2, long arg3, long arg4);

    String a();

    String c(long arg1);

    void d(AcceptConnectionRequestParams arg1);

    void e(CancelPayloadParams arg1);

    void f(long arg1);

    void g(ClientDisconnectingParams arg1);

    void h(String arg1, long arg2);

    void i(DisconnectFromEndpointParams arg1);

    void k(InitiateBandwidthUpgradeParams arg1);

    void l(RegisterDeviceProviderParams arg1);

    void m(RejectConnectionRequestParams arg1);

    void n(SendConnectionRequestParams arg1);

    void o(SendConnectionRequestParamsV3 arg1);

    void p(SendPayloadParams arg1);

    void q(String[] arg1, byte[] arg2, long arg3);

    void r(String[] arg1, byte[] arg2, long arg3);

    void s(SetDownloadsDirectoryParams arg1);

    void t(StartAdvertisingParams arg1);

    void u(StartAdvertisingParamsV3 arg1);

    void v(StartDiscoveryParams arg1);

    void w(StartDiscoveryParamsV3 arg1);

    void x(StartListeningParams arg1);

    void y(StartListeningParamsV3 arg1);

    void z(long arg1);
}

