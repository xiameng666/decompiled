import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.AppRecommendationsResponse;
import com.google.android.gms.wearable.internal.BooleanResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;
import com.google.android.gms.wearable.internal.GetBackupSettingsSupportedResponse;
import com.google.android.gms.wearable.internal.GetCachedBackupsResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetCompanionPackageForNodeResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetEapIdResponse;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeysResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.GetNodeIdResponse;
import com.google.android.gms.wearable.internal.GetRestoreStateResponse;
import com.google.android.gms.wearable.internal.GetRestoreSupportedResponse;
import com.google.android.gms.wearable.internal.GetTermsResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PerformEapAkaResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.RpcResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

public interface fdiy extends IInterface {
    void A(GetConfigsResponse arg1);

    void B(GetConnectedNodesResponse arg1);

    void C(GetDataItemResponse arg1);

    void D(GetEapIdResponse arg1);

    void E(GetFastpairAccountKeyByAccountResponse arg1);

    void F(GetFastpairAccountKeysResponse arg1);

    void G(GetFdForAssetResponse arg1);

    void H(GetLocalCapabilitiesResponse arg1);

    void I(GetLocalNodeResponse arg1);

    void J(GetNodeIdResponse arg1);

    void K(GetRestoreStateResponse arg1);

    void L(GetRestoreSupportedResponse arg1);

    void M(GetTermsResponse arg1);

    void N(OpenChannelResponse arg1);

    void O(PerformEapAkaResponse arg1);

    void P(PutDataResponse arg1);

    void Q(RemoveLocalCapabilityResponse arg1);

    void R(SendMessageResponse arg1);

    void S(RpcResponse arg1);

    void T(ConsentResponse arg1);

    void a(Status arg1);

    void b(AddLocalCapabilityResponse arg1);

    void c(StorageInfoResponse arg1);

    void d(GetAppThemeResponse arg1);

    void e(AppRecommendationsResponse arg1);

    void f(BooleanResponse arg1);

    void g(ChannelReceiveFileResponse arg1);

    void h(ChannelSendFileResponse arg1);

    void i(CloseChannelResponse arg1);

    void j(CloseChannelResponse arg1);

    void k(DataHolder arg1);

    void l(DeleteDataItemsResponse arg1);

    void m(GetAllCapabilitiesResponse arg1);

    void n(GetBackupSettingsSupportedResponse arg1);

    void o(GetCachedBackupsResponse arg1);

    void p(GetCapabilityResponse arg1);

    void q(GetChannelInputStreamResponse arg1);

    void v(GetChannelOutputStreamResponse arg1);

    void w(GetCloudSyncOptInOutDoneResponse arg1);

    void x(GetCloudSyncOptInStatusResponse arg1);

    void y(GetCloudSyncSettingResponse arg1);

    void z(GetCompanionPackageForNodeResponse arg1);
}

