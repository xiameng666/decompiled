import android.os.Parcel;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

public abstract class fbwv extends wby implements fbww {
    public fbwv() {
        super("com.google.android.gms.wallet.service.ow.IOwInternalService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)wbz.a(parcel0, BuyFlowConfig.CREATOR);
            CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0 = (CreateWalletObjectsServiceRequest)wbz.a(parcel0, CreateWalletObjectsServiceRequest.CREATOR);
            fbwv.gr(parcel0);
            ServerResponse serverResponse0 = this.a(buyFlowConfig0, createWalletObjectsServiceRequest0);
            parcel1.writeNoException();
            wbz.g(parcel1, serverResponse0);
            return true;
        }
        return false;
    }
}

