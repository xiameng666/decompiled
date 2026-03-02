import android.content.Context;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

public final class fbwy extends fbwv {
    public final fbxd a;
    public final fbqa b;
    private final Context c;
    private final fboa d;

    public fbwy(Context context0, fbxd fbxd0, fbqa fbqa0) {
        this.c = context0.getApplicationContext();
        this.a = fbxd0;
        this.d = new fboa(context0, "NetworkOwInternalServic");
        this.b = fbqa0;
    }

    @Override  // fbww
    public final ServerResponse a(BuyFlowConfig buyFlowConfig0, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0) {
        if(!fbyc.a(this.c)) {
            return ServerResponse.a;
        }
        fbwx fbwx0 = new fbwx(this, buyFlowConfig0, createWalletObjectsServiceRequest0.a, createWalletObjectsServiceRequest0, buyFlowConfig0);
        return this.d.a(fbwx0);
    }
}

