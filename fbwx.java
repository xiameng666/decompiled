import android.accounts.Account;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbwx extends fbny {
    final CreateWalletObjectsServiceRequest b;
    final BuyFlowConfig c;
    final fbwy e;

    public fbwx(fbwy fbwy0, BuyFlowConfig buyFlowConfig0, Account account0, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0, BuyFlowConfig buyFlowConfig1) {
        this.b = createWalletObjectsServiceRequest0;
        this.c = buyFlowConfig1;
        Objects.requireNonNull(fbwy0);
        this.e = fbwy0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest0 = this.b;
        if(createWalletObjectsServiceRequest0.b == null) {
            createWalletObjectsServiceRequest0.b = (guyp)gciq.c(createWalletObjectsServiceRequest0.c, ((Parser)((ProtoLiteMessage)guyp.a).jf(7, null)));
        }
        guyp guyp0 = createWalletObjectsServiceRequest0.b;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)guyp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)guyp0));
        fbwy fbwy0 = this.e;
        BuyFlowConfig buyFlowConfig0 = this.c;
        String s = buyFlowConfig0.c;
        gftb.check(s);
        guym guym0 = fbwy0.b.a(s);
        if(guym0 == null) {
            return ServerResponse.d;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((guyp)hftp0.b_message).c = guym0;
        ((guyp)hftp0.b_message).b |= 1;
        fbxd fbxd0 = fbwy0.a;
        int v = buyFlowConfig0.b.a;
        guyp guyp1 = (guyp)hftp0.N_build();
        switch(v) {
            case 0: 
            case 2: {
                return (ServerResponse)fbdx.a(new fbxc(fbxd0, "https://payments.sandbox.google.com/payments/apis/instantbuy/android/v1/createWalletObjects", gamm0, guyp1, v));
            }
            case 21: {
                return (ServerResponse)fbdx.a(new fbxc(fbxd0, "https://wallet-web.sandbox.google.com/dev/payments/apis/instantbuy/android/v1/createWalletObjects", gamm0, guyp1, 21));
            }
            case 22: {
                return (ServerResponse)fbdx.a(new fbxc(fbxd0, "http://localhost:8889/payments/apis/instantbuy/android/v1/createWalletObjects", gamm0, guyp1, 22));
            }
            default: {
                return (ServerResponse)fbdx.a(new fbxc(fbxd0, "https://wallet.google.com/payments/apis/instantbuy/android/v1/createWalletObjects", gamm0, guyp1, v));
            }
        }
    }
}

