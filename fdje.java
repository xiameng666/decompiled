import android.accounts.Account;
import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import com.google.android.gms.wearable.internal.AddAccountToConsentRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AddSupervisedAccountRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.ConsentStatusRequest;
import com.google.android.gms.wearable.internal.FetchBackupRequest;
import com.google.android.gms.wearable.internal.GetRestoreStateRequest;
import com.google.android.gms.wearable.internal.LogCounterRequest;
import com.google.android.gms.wearable.internal.LogEventRequest;
import com.google.android.gms.wearable.internal.LogTimerRequest;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;
import com.google.android.gms.wearable.internal.RecordTermConsentRequest;
import com.google.android.gms.wearable.internal.RecordUntetheredSupervisedAccountTransferRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.android.gms.wearable.internal.RequestConnectionParcelable;
import com.google.android.gms.wearable.internal.SaveRestoreStateRequest;
import com.google.android.gms.wearable.internal.StartRestoreSessionRequest;

public interface fdje extends IInterface {
    void A(fdiy arg1);

    void B(fdiy arg1, int arg2);

    void C(fdiy arg1, String arg2);

    void D(fdiy arg1, String arg2);

    void E(fdiy arg1, String arg2);

    void F(fdiy arg1, FetchBackupRequest arg2);

    void G(fdiy arg1, AppTheme arg2);

    void H(fdiy arg1, String arg2, int arg3);

    void I(fdiy arg1);

    void J(fdiy arg1);

    void K(fdiy arg1);

    void L(fdiy arg1, String arg2);

    void M(fdiy arg1);

    void N(fdiy arg1);

    void O(fdiy arg1);

    void P(fdiy arg1, Uri arg2);

    void Q(fdiy arg1);

    void R(fdiy arg1, Uri arg2);

    void S(fdiy arg1, Uri arg2, int arg3);

    void T(fdiy arg1, int arg2);

    void U(fdiy arg1, Account arg2);

    void V(fdiy arg1);

    void W(fdiy arg1, Asset arg2);

    void X(fdiy arg1);

    void Y(fdiy arg1);

    void Z(fdiy arg1, String arg2);

    void a(fdiy arg1);

    void aA(fdiy arg1, RecordTermConsentRequest arg2);

    void aB(fdiy arg1, String arg2);

    void aC(fdiy arg1, RemoveListenerRequest arg2);

    void aD(fdiy arg1, String arg2);

    void aE(fdiy arg1, String arg2, boolean arg3);

    void aF(fdiy arg1, SaveRestoreStateRequest arg2);

    void aG(fdiy arg1, byte arg2);

    void aH(fdiy arg1, String arg2, String arg3, byte[] arg4);

    void aI(fdiy arg1, String arg2, String arg3, byte[] arg4, MessageOptions arg5);

    void aJ(fdiy arg1, String arg2, String arg3, byte[] arg4);

    void aK(fdiy arg1, String arg2, String arg3, byte[] arg4, MessageOptions arg5);

    void aL(fdiy arg1, boolean arg2);

    void aM(fdiy arg1, String arg2, boolean arg3);

    void aN(fdiy arg1, AppTheme arg2);

    void aO(fdiy arg1);

    void aP(fdiy arg1, StartRestoreSessionRequest arg2);

    void aQ(fdiy arg1, String arg2);

    void aR(fdiy arg1, String arg2, String arg3);

    void aS(fdiy arg1);

    void aT(fdiy arg1, ConnectionConfiguration arg2);

    void aU(fdiy arg1, String arg2, int arg3);

    void aV(fdiy arg1, ConnectionDelayConfig arg2);

    void aW(fdiy arg1, String arg2, ParcelFileDescriptor arg3);

    void aX(fdiy arg1);

    void aY(fdiy arg1, fdir arg2, String arg3);

    void aZ(fdiy arg1, fdir arg2, String arg3);

    void aa(fdiy arg1);

    void ab(fdiy arg1, AppRecommendationsRequest arg2);

    void ac(fdiy arg1);

    void ad(fdiy arg1, GetRestoreStateRequest arg2);

    void ae(fdiy arg1);

    void af(fdiy arg1);

    void ag(fdiy arg1, int arg2);

    void ah(fdiy arg1);

    void ai(fdiy arg1, ConsentStatusRequest arg2);

    void aj(fdiy arg1, FetchBackupRequest arg2);

    void ak(fdiy arg1, AncsNotificationParcelable arg2);

    void al(fdiy arg1, String arg2);

    void am(fdiy arg1, String arg2);

    void an(fdiy arg1, LogCounterRequest arg2);

    void ao(fdiy arg1, LogEventRequest arg2);

    void ap(fdiy arg1, LogTimerRequest arg2);

    void aq(fdiy arg1, String arg2);

    void ar(fdiy arg1, String arg2, String arg3);

    void as(fdiy arg1, boolean arg2);

    void at(fdiy arg1, int arg2, String arg3);

    void au(fdiy arg1, ConnectionConfiguration arg2);

    void av(fdiy arg1, PutDataRequest arg2);

    void aw(fdiy arg1, String arg2, ParcelFileDescriptor arg3, long arg4, long arg5);

    void ax(fdiy arg1, RecordUntetheredSupervisedAccountTransferRequest arg2);

    void ay(fdiy arg1, PrivacyRecordOptinRequest arg2);

    void az(fdiy arg1);

    void b(fdiy arg1, AcceptTermsRequest arg2);

    void ba(fdiy arg1, fdis arg2);

    void bb(fdiy arg1, RequestConnectionParcelable arg2, fdis arg3);

    void c(fdiy arg1, AddAccountToConsentRequest arg2);

    void d(fdiy arg1, AddListenerRequest arg2);

    void e(fdiy arg1, String arg2);

    void f(fdiy arg1, AddSupervisedAccountRequest arg2);

    void g(fdiy arg1, String arg2, Account arg3, String arg4, String arg5);

    void h(fdiy arg1, String arg2);

    void i(fdiy arg1, ConnectionConfiguration arg2);

    void j(fdiy arg1);

    void k(fdiy arg1, String arg2);

    void l(fdiy arg1, String arg2, int arg3);

    void m(fdiy arg1, Uri arg2);

    void n(fdiy arg1, Uri arg2, int arg3);

    void o(fdiy arg1);

    void p(fdiy arg1, String arg2);

    void q(fdiy arg1, int arg2);

    void v(fdiy arg1, int arg2);

    void w(fdiy arg1);

    void x(fdiy arg1, String arg2);

    void y(fdiy arg1);

    void z(fdiy arg1, String arg2);
}

