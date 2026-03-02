import android.app.PendingIntent;
import android.os.Parcel;
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

public class dono extends wby implements donp {
    public dono() {
        super("com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    @Override  // donp
    public void A(Status status0, SyncTransactionsResponse syncTransactionsResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void B(Status status0, GetTransitCardsResponse getTransitCardsResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void C(Status status0, GetImagesForValuableResponse getImagesForValuableResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void D(Status status0, SaveImagesForValuableResponse saveImagesForValuableResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void E(Status status0, GetWalletStatusResponse getWalletStatusResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void a(Status status0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void b(Status status0, byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void c(Status status0, GetClosedLoopBundleResponse getClosedLoopBundleResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void d(DataChangeListenerResponse dataChangeListenerResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void e(Status status0, EmoneyReadiness emoneyReadiness0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void f(Status status0, GetIntegrityTokenForPixResponse getIntegrityTokenForPixResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                dono.gr(parcel0);
                this.x(status0);
                return true;
            }
            case 3: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse0 = (GetPayGlobalActionCardsResponse)wbz.a(parcel0, GetPayGlobalActionCardsResponse.CREATOR);
                dono.gr(parcel0);
                this.o(status1, getPayGlobalActionCardsResponse0);
                return true;
            }
            case 4: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                dono.gr(parcel0);
                this.p(status2, pendingIntent0);
                return true;
            }
            case 5: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)wbz.a(parcel0, ProtoSafeParcelable.CREATOR);
                dono.gr(parcel0);
                this.q(status3, protoSafeParcelable0);
                return true;
            }
            case 6: {
                DataChangeListenerResponse dataChangeListenerResponse0 = (DataChangeListenerResponse)wbz.a(parcel0, DataChangeListenerResponse.CREATOR);
                dono.gr(parcel0);
                this.d(dataChangeListenerResponse0);
                return true;
            }
            case 7: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetSortOrderResponse getSortOrderResponse0 = (GetSortOrderResponse)wbz.a(parcel0, GetSortOrderResponse.CREATOR);
                dono.gr(parcel0);
                this.w(status4, getSortOrderResponse0);
                return true;
            }
            case 8: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                boolean z = wbz.i(parcel0);
                dono.gr(parcel0);
                this.a(status5, z);
                return true;
            }
            case 9: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetTransactionsResponse getTransactionsResponse0 = (GetTransactionsResponse)wbz.a(parcel0, GetTransactionsResponse.CREATOR);
                dono.gr(parcel0);
                this.z(status6, getTransactionsResponse0);
                return true;
            }
            case 10: {
                PayApiError payApiError0 = (PayApiError)wbz.a(parcel0, PayApiError.CREATOR);
                dono.gr(parcel0);
                this.m(payApiError0);
                return true;
            }
            case 11: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetOutstandingPurchaseOrderIdResponse getOutstandingPurchaseOrderIdResponse0 = (GetOutstandingPurchaseOrderIdResponse)wbz.a(parcel0, GetOutstandingPurchaseOrderIdResponse.CREATOR);
                dono.gr(parcel0);
                this.k(status7, getOutstandingPurchaseOrderIdResponse0);
                return true;
            }
            case 12: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetClosedLoopBundleResponse getClosedLoopBundleResponse0 = (GetClosedLoopBundleResponse)wbz.a(parcel0, GetClosedLoopBundleResponse.CREATOR);
                dono.gr(parcel0);
                this.c(status8, getClosedLoopBundleResponse0);
                return true;
            }
            case 13: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetPayCardArtResponse getPayCardArtResponse0 = (GetPayCardArtResponse)wbz.a(parcel0, GetPayCardArtResponse.CREATOR);
                dono.gr(parcel0);
                this.n(status9, getPayCardArtResponse0);
                return true;
            }
            case 14: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                SyncTransactionsResponse syncTransactionsResponse0 = (SyncTransactionsResponse)wbz.a(parcel0, SyncTransactionsResponse.CREATOR);
                dono.gr(parcel0);
                this.A(status10, syncTransactionsResponse0);
                return true;
            }
            case 15: {
                Status status11 = (Status)wbz.a(parcel0, Status.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                dono.gr(parcel0);
                this.b(status11, arr_b);
                return true;
            }
            case 16: {
                Status status12 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetPassesResponse getPassesResponse0 = (GetPassesResponse)wbz.a(parcel0, GetPassesResponse.CREATOR);
                dono.gr(parcel0);
                this.l(status12, getPassesResponse0);
                return true;
            }
            case 17: {
                Status status13 = (Status)wbz.a(parcel0, Status.CREATOR);
                long v1 = parcel0.readLong();
                dono.gr(parcel0);
                this.j(status13, v1);
                return true;
            }
            case 18: {
                Status status14 = (Status)wbz.a(parcel0, Status.CREATOR);
                dono.gr(parcel0);
                this.h(status14);
                return true;
            }
            case 19: {
                Status status15 = (Status)wbz.a(parcel0, Status.CREATOR);
                Gp3SupportInfo gp3SupportInfo0 = (Gp3SupportInfo)wbz.a(parcel0, Gp3SupportInfo.CREATOR);
                dono.gr(parcel0);
                this.g(status15, gp3SupportInfo0);
                return true;
            }
            case 20: {
                Status status16 = (Status)wbz.a(parcel0, Status.CREATOR);
                int v2 = parcel0.readInt();
                dono.gr(parcel0);
                this.i(status16, v2);
                return true;
            }
            case 21: {
                Status status17 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetTransitCardsResponse getTransitCardsResponse0 = (GetTransitCardsResponse)wbz.a(parcel0, GetTransitCardsResponse.CREATOR);
                dono.gr(parcel0);
                this.B(status17, getTransitCardsResponse0);
                return true;
            }
            case 22: {
                Status status18 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetWalletStatusResponse getWalletStatusResponse0 = (GetWalletStatusResponse)wbz.a(parcel0, GetWalletStatusResponse.CREATOR);
                dono.gr(parcel0);
                this.E(status18, getWalletStatusResponse0);
                return true;
            }
            case 23: {
                Status status19 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse0 = (GetSeFeatureReadinessStatusResponse)wbz.a(parcel0, GetSeFeatureReadinessStatusResponse.CREATOR);
                dono.gr(parcel0);
                this.v(status19, getSeFeatureReadinessStatusResponse0);
                return true;
            }
            case 24: {
                Status status20 = (Status)wbz.a(parcel0, Status.CREATOR);
                SyncTransactionByIdResponse syncTransactionByIdResponse0 = (SyncTransactionByIdResponse)wbz.a(parcel0, SyncTransactionByIdResponse.CREATOR);
                dono.gr(parcel0);
                this.y(status20, syncTransactionByIdResponse0);
                return true;
            }
            case 25: {
                Status status21 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetImagesForValuableResponse getImagesForValuableResponse0 = (GetImagesForValuableResponse)wbz.a(parcel0, GetImagesForValuableResponse.CREATOR);
                dono.gr(parcel0);
                this.C(status21, getImagesForValuableResponse0);
                return true;
            }
            case 26: {
                Status status22 = (Status)wbz.a(parcel0, Status.CREATOR);
                EmoneyReadiness emoneyReadiness0 = (EmoneyReadiness)wbz.a(parcel0, EmoneyReadiness.CREATOR);
                dono.gr(parcel0);
                this.e(status22, emoneyReadiness0);
                return true;
            }
            case 27: {
                Status status23 = (Status)wbz.a(parcel0, Status.CREATOR);
                SaveImagesForValuableResponse saveImagesForValuableResponse0 = (SaveImagesForValuableResponse)wbz.a(parcel0, SaveImagesForValuableResponse.CREATOR);
                dono.gr(parcel0);
                this.D(status23, saveImagesForValuableResponse0);
                return true;
            }
            case 28: {
                Status status24 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetIntegrityTokenForPixResponse getIntegrityTokenForPixResponse0 = (GetIntegrityTokenForPixResponse)wbz.a(parcel0, GetIntegrityTokenForPixResponse.CREATOR);
                dono.gr(parcel0);
                this.f(status24, getIntegrityTokenForPixResponse0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // donp
    public void g(Status status0, Gp3SupportInfo gp3SupportInfo0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void h(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void i(Status status0, int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void j(Status status0, long v) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void k(Status status0, GetOutstandingPurchaseOrderIdResponse getOutstandingPurchaseOrderIdResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void l(Status status0, GetPassesResponse getPassesResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void m(PayApiError payApiError0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void n(Status status0, GetPayCardArtResponse getPayCardArtResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void o(Status status0, GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void p(Status status0, PendingIntent pendingIntent0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void q(Status status0, ProtoSafeParcelable protoSafeParcelable0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void v(Status status0, GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void w(Status status0, GetSortOrderResponse getSortOrderResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void x(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public final void y(Status status0, SyncTransactionByIdResponse syncTransactionByIdResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // donp
    public void z(Status status0, GetTransactionsResponse getTransactionsResponse0) {
        throw new UnsupportedOperationException();
    }
}

