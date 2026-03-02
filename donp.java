import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.pay.GetClosedLoopBundleResponse;
import com.google.android.gms.pay.GetImagesForValuableResponse;
import com.google.android.gms.pay.GetIntegrityTokenForPixResponse;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdResponse;
import com.google.android.gms.pay.GetPassesResponse;
import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.GetPayGlobalActionCardsResponse;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusResponse;
import com.google.android.gms.pay.GetSortOrderResponse;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.GetTransitCardsResponse;
import com.google.android.gms.pay.GetWalletStatusResponse;
import com.google.android.gms.pay.Gp3SupportInfo;
import com.google.android.gms.pay.PayApiError;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveImagesForValuableResponse;
import com.google.android.gms.pay.SyncTransactionByIdResponse;
import com.google.android.gms.pay.SyncTransactionsResponse;

public interface donp extends IInterface {
    void A(Status arg1, SyncTransactionsResponse arg2);

    void B(Status arg1, GetTransitCardsResponse arg2);

    void C(Status arg1, GetImagesForValuableResponse arg2);

    void D(Status arg1, SaveImagesForValuableResponse arg2);

    void E(Status arg1, GetWalletStatusResponse arg2);

    void a(Status arg1, boolean arg2);

    void b(Status arg1, byte[] arg2);

    void c(Status arg1, GetClosedLoopBundleResponse arg2);

    void d(DataChangeListenerResponse arg1);

    void e(Status arg1, EmoneyReadiness arg2);

    void f(Status arg1, GetIntegrityTokenForPixResponse arg2);

    void g(Status arg1, Gp3SupportInfo arg2);

    void h(Status arg1);

    void i(Status arg1, int arg2);

    void j(Status arg1, long arg2);

    void k(Status arg1, GetOutstandingPurchaseOrderIdResponse arg2);

    void l(Status arg1, GetPassesResponse arg2);

    void m(PayApiError arg1);

    void n(Status arg1, GetPayCardArtResponse arg2);

    void o(Status arg1, GetPayGlobalActionCardsResponse arg2);

    void p(Status arg1, PendingIntent arg2);

    void q(Status arg1, ProtoSafeParcelable arg2);

    void v(Status arg1, GetSeFeatureReadinessStatusResponse arg2);

    void w(Status arg1, GetSortOrderResponse arg2);

    void x(Status arg1);

    void y(Status arg1, SyncTransactionByIdResponse arg2);

    void z(Status arg1, GetTransactionsResponse arg2);
}

