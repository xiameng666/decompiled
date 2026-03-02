import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.CheckReadinessForEmoneyRequest;
import com.google.android.gms.pay.GetMdocCredentialRequest;
import com.google.android.gms.pay.GetPayApiAvailabilityStatusRequest;
import com.google.android.gms.pay.GetPendingIntentForWalletOnWearRequest;
import com.google.android.gms.pay.NotifyCardTapEventRequest;
import com.google.android.gms.pay.NotifyEmoneyCardStatusUpdateRequest;
import com.google.android.gms.pay.PushEmoneyCardRequest;
import com.google.android.gms.pay.SavePassesRequest;
import com.google.android.gms.pay.SyncBundleRequest;

public final class donr extends wby implements cjug, dons {
    private final cjts a;
    private final String b;
    private final String c;

    public donr() {
        super("com.google.android.gms.pay.internal.IThirdPartyPayService");
    }

    public donr(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.pay.internal.IThirdPartyPayService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // dons
    public final void a(GetMdocCredentialRequest getMdocCredentialRequest0, donp donp0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dU);
        azuf0.g(bbdq.az);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azuf0.h(true);
        azug azug0 = azuf0.a();
        eazq eazq0 = new eazq(getMdocCredentialRequest0, this.b, donp0, azug0);
        this.a.b(eazq0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        donp donp0 = null;
        switch(v) {
            case 2: {
                GetPayApiAvailabilityStatusRequest getPayApiAvailabilityStatusRequest0 = (GetPayApiAvailabilityStatusRequest)wbz.a(parcel0, GetPayApiAvailabilityStatusRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface0 instanceof donp) ? ((donp)iInterface0) : new donn(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.e(bbdp.dU);
                azuf0.g(bbdq.az);
                azuf0.d(this.b);
                azuf0.c(this.c);
                azuf0.h(true);
                azug azug0 = azuf0.a();
                eazu eazu0 = new eazu(getPayApiAvailabilityStatusRequest0, this.b, donp0, azug0);
                this.a.b(eazu0);
                break;
            }
            case 3: {
                SavePassesRequest savePassesRequest0 = (SavePassesRequest)wbz.a(parcel0, SavePassesRequest.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface1 instanceof donp) ? ((donp)iInterface1) : new donn(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf1 = azug.b(apiMetadata1);
                azuf1.e(bbdp.dU);
                azuf1.g(bbdq.az);
                azuf1.d(this.b);
                azuf1.c(this.c);
                azuf1.h(true);
                azug azug1 = azuf1.a();
                ebbn ebbn0 = new ebbn(savePassesRequest0, this.b, donp0, azug1);
                this.a.b(ebbn0);
                break;
            }
            case 4: {
                SyncBundleRequest syncBundleRequest0 = (SyncBundleRequest)wbz.a(parcel0, SyncBundleRequest.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface2 instanceof donp) ? ((donp)iInterface2) : new donn(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf2 = azug.b(apiMetadata2);
                azuf2.e(bbdp.dU);
                azuf2.g(bbdq.az);
                azuf2.d(this.b);
                azuf2.c(this.c);
                azuf2.h(true);
                azug azug2 = azuf2.a();
                ebel ebel0 = new ebel(syncBundleRequest0, this.b, donp0, azug2);
                this.a.b(ebel0);
                break;
            }
            case 5: {
                GetPendingIntentForWalletOnWearRequest getPendingIntentForWalletOnWearRequest0 = (GetPendingIntentForWalletOnWearRequest)wbz.a(parcel0, GetPendingIntentForWalletOnWearRequest.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface3 instanceof donp) ? ((donp)iInterface3) : new donn(iBinder3);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf3 = azug.b(apiMetadata3);
                azuf3.e(bbdp.dU);
                azuf3.g(bbdq.az);
                azuf3.d(this.b);
                azuf3.c(this.c);
                azuf3.h(true);
                azug azug3 = azuf3.a();
                ebab ebab0 = new ebab(getPendingIntentForWalletOnWearRequest0, this.b, donp0, azug3);
                this.a.b(ebab0);
                break;
            }
            case 6: {
                GetMdocCredentialRequest getMdocCredentialRequest0 = (GetMdocCredentialRequest)wbz.a(parcel0, GetMdocCredentialRequest.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface4 instanceof donp) ? ((donp)iInterface4) : new donn(iBinder4);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                this.a(getMdocCredentialRequest0, donp0, apiMetadata4);
                break;
            }
            case 7: {
                NotifyCardTapEventRequest notifyCardTapEventRequest0 = (NotifyCardTapEventRequest)wbz.a(parcel0, NotifyCardTapEventRequest.CREATOR);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface5 instanceof donp) ? ((donp)iInterface5) : new donn(iBinder5);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf4 = azug.b(apiMetadata5);
                azuf4.e(bbdp.dU);
                azuf4.g(bbdq.az);
                azuf4.d(this.b);
                azuf4.c(this.c);
                azuf4.h(true);
                azug azug4 = azuf4.a();
                ebvx ebvx0 = new ebvx(notifyCardTapEventRequest0, this.b, donp0, azug4);
                this.a.b(ebvx0);
                break;
            }
            case 8: {
                CheckReadinessForEmoneyRequest checkReadinessForEmoneyRequest0 = (CheckReadinessForEmoneyRequest)wbz.a(parcel0, CheckReadinessForEmoneyRequest.CREATOR);
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface6 instanceof donp) ? ((donp)iInterface6) : new donn(iBinder6);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf5 = azug.b(apiMetadata6);
                azuf5.e(bbdp.dU);
                azuf5.g(bbdq.az);
                azuf5.d(this.b);
                azuf5.c(this.c);
                azuf5.h(true);
                azug azug5 = azuf5.a();
                ebjg ebjg0 = new ebjg(checkReadinessForEmoneyRequest0, this.b, donp0, azug5);
                this.a.b(ebjg0);
                break;
            }
            case 9: {
                PushEmoneyCardRequest pushEmoneyCardRequest0 = (PushEmoneyCardRequest)wbz.a(parcel0, PushEmoneyCardRequest.CREATOR);
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface7 instanceof donp) ? ((donp)iInterface7) : new donn(iBinder7);
                }
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf6 = azug.b(apiMetadata7);
                azuf6.e(bbdp.dU);
                azuf6.g(bbdq.az);
                azuf6.d(this.b);
                azuf6.c(this.c);
                azuf6.h(true);
                azug azug6 = azuf6.a();
                ebyb ebyb0 = new ebyb(pushEmoneyCardRequest0, this.b, donp0, azug6);
                this.a.b(ebyb0);
                break;
            }
            case 10: {
                NotifyEmoneyCardStatusUpdateRequest notifyEmoneyCardStatusUpdateRequest0 = (NotifyEmoneyCardStatusUpdateRequest)wbz.a(parcel0, NotifyEmoneyCardStatusUpdateRequest.CREATOR);
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    donp0 = (iInterface8 instanceof donp) ? ((donp)iInterface8) : new donn(iBinder8);
                }
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                donr.gr(parcel0);
                azuf azuf7 = azug.b(apiMetadata8);
                azuf7.e(bbdp.dU);
                azuf7.g(bbdq.az);
                azuf7.d(this.b);
                azuf7.c(this.c);
                azuf7.h(true);
                azug azug7 = azuf7.a();
                ebvy ebvy0 = new ebvy(notifyEmoneyCardStatusUpdateRequest0, this.b, donp0, azug7);
                this.a.b(ebvy0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

