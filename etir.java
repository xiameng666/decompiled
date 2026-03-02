import com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.SupervisedUserInfo;
import com.google.android.gms.tapandpay.issuer.UserAddress;

public final class etir {
    public int a;
    public int b;
    public byte[] c;
    public String d;
    public String e;
    public UserAddress f;
    public boolean g;
    public CobadgedTokenInfo h;
    public SupervisedUserInfo i;
    public PushTokenizeExtraOptions j;

    public final PushTokenizeRequest a() {
        int v = this.a;
        int v1 = this.b;
        byte[] arr_b = this.c;
        String s = this.d;
        String s1 = this.e;
        UserAddress userAddress0 = this.f;
        boolean z = this.g;
        CobadgedTokenInfo cobadgedTokenInfo0 = this.h;
        SupervisedUserInfo supervisedUserInfo0 = this.i;
        PushTokenizeExtraOptions pushTokenizeExtraOptions0 = this.j == null ? new PushTokenizeExtraOptions(false, false, null) : this.j;
        return new PushTokenizeRequest(v, v1, arr_b, s, s1, userAddress0, z, new int[0], null, cobadgedTokenInfo0, supervisedUserInfo0, new String[0], pushTokenizeExtraOptions0);
    }
}

