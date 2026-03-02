import android.os.IInterface;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import com.google.android.gms.nearby.sharing.internal.ConsentToContactsUploadParams;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import com.google.android.gms.nearby.sharing.internal.GetActionsParams;
import com.google.android.gms.nearby.sharing.internal.GetAllowPermissionAutoParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceAccountIdParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.GetOptInStatusParams;
import com.google.android.gms.nearby.sharing.internal.GetReachablePhoneNumbersParams;
import com.google.android.gms.nearby.sharing.internal.GetShareTargetsParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.HasConsentedToContactsUploadParams;
import com.google.android.gms.nearby.sharing.internal.IgnoreConsentParams;
import com.google.android.gms.nearby.sharing.internal.InstallParams;
import com.google.android.gms.nearby.sharing.internal.InvalidateIntentParams;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsFastInitNotificationEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import com.google.android.gms.nearby.sharing.internal.RegisterCloudSharingReceiverParams;
import com.google.android.gms.nearby.sharing.internal.RegisterInstallCallbackParams;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterStateObserverParams;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import com.google.android.gms.nearby.sharing.internal.ResetParams;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import com.google.android.gms.nearby.sharing.internal.SetAllowPermissionAutoParams;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.StartQrCodeSessionParams;
import com.google.android.gms.nearby.sharing.internal.StopQrCodeSessionParams;
import com.google.android.gms.nearby.sharing.internal.SyncParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterInstallCallbackParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterStateObserverParams;

public interface ddot extends IInterface {
    void A(IsFastInitNotificationEnabledParams arg1);

    void B(IsOptedInParams arg1);

    void D(OpenParams arg1);

    void E(OptInParams arg1);

    void I(RegisterCloudSharingReceiverParams arg1);

    void J(RegisterInstallCallbackParams arg1);

    void K(RegisterReceiveSurfaceParams arg1);

    void L(RegisterSendSurfaceParams arg1);

    void N(RegisterStateObserverParams arg1);

    void O(RejectParams arg1);

    void P(ResetParams arg1);

    void Q(SendParams arg1);

    void R(SetAccountParams arg1);

    void S(SetAllowPermissionAutoParams arg1);

    void T(SetDataUsageParams arg1);

    void U(SetDeviceNameParams arg1);

    void V(SetDeviceVisibilityParams arg1);

    void X(SetEnabledParams arg1);

    void Z(SetVisibilityParams arg1);

    void aa(StartQrCodeSessionParams arg1);

    void ab(StopQrCodeSessionParams arg1);

    void ac(SyncParams arg1);

    void ad(UnregisterInstallCallbackParams arg1);

    void ae(UnregisterReceiveSurfaceParams arg1);

    void af(UnregisterSendSurfaceParams arg1);

    void ah(UnregisterStateObserverParams arg1);

    void c(AcceptParams arg1);

    void d(CancelParams arg1);

    void e(ConsentToContactsUploadParams arg1);

    void f(GetAccountParams arg1);

    void g(GetActionsParams arg1);

    void h(GetAllowPermissionAutoParams arg1);

    void i(GetContactsParams arg1);

    void j(GetContactsCountParams arg1);

    void k(GetDataUsageParams arg1);

    void l(GetDeviceAccountIdParams arg1);

    void m(GetDeviceNameParams arg1);

    void n(GetDeviceVisibilityParams arg1);

    void q(GetOptInStatusParams arg1);

    void r(GetReachablePhoneNumbersParams arg1);

    void s(GetShareTargetsParams arg1);

    void t(GetVisibilityParams arg1);

    void u(HasConsentedToContactsUploadParams arg1);

    void v(IgnoreConsentParams arg1);

    void w(InstallParams arg1);

    void x(InvalidateIntentParams arg1);

    void z(IsEnabledParams arg1);
}

