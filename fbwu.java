import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

public final class fbwu extends wbx implements fbww {
    public fbwu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.wallet.service.ow.IOwInternalService");
    }

    @Override  // fbww
    public final ServerResponse a(BuyFlowConfig buyFlowConfig0, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, buyFlowConfig0);
        wbz.f(parcel0, createWalletObjectsServiceRequest0);
        Parcel parcel1 = this.hM(1, parcel0);
        ServerResponse serverResponse0 = (ServerResponse)wbz.a(parcel1, ServerResponse.CREATOR);
        parcel1.recycle();
        return serverResponse0;
    }
}

