import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import java.util.List;

public final class ajes extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ajes.b = azss0;
        ajdm ajdm0 = new ajdm();
        ajes.c = ajdm0;
        ajes.a = new azta_api("Cryptauth.CryptauthServiceApi", ajdm0, azss0);
    }

    public ajes(Context context0) {
        azuw azuw0 = new azuw();
        aztq aztq0 = new aztq();
        aztq0.a = azuw0;
        aztr_settings aztr0 = aztq0.a();
        super(context0, ajes.a, null, aztr0);
    }

    public final evql b(String s, Account account0) {
        return this.iG(new ajdw(this, s, account0));
    }

    public final evql c(byte[] arr_b) {
        return this.iG(new ajdx(this, arr_b));
    }

    public final evql e(String s, Account account0) {
        return this.iG(new ajdt(this, s, account0));
    }

    public final evql f(byte[] arr_b) {
        return this.iG(new ajeb(this, arr_b));
    }

    public final evql g(Account account0, String s, byte[] arr_b) {
        return this.iG(new ajea(this, account0, s, arr_b));
    }

    public final evql h(Account account0, ClientPublicKey clientPublicKey0) {
        return this.iG(new ajef(this, account0, clientPublicKey0));
    }

    public final evql i(int v, List list0, String s, Account account0, byte[] arr_b) {
        return this.jn(new ajdr(this, v, list0, s, account0, arr_b));
    }

    public final evql j(Account account0) {
        return this.iG(new ajei(this, account0));
    }

    public final evql k(Account account0) {
        return this.iG(new ajej(this, account0));
    }

    public final evql l(Account account0, List list0) {
        return this.jn(new ajdq(this, account0, list0));
    }

    public final evql m(Account account0, Payload payload0) {
        return this.iG(new ajek(this, account0, payload0));
    }

    public final evql n(Account account0, Payload payload0) {
        return this.iG(new ajeo(this, account0, payload0));
    }

    public final evql o(byte[] arr_b, byte[] arr_b1) {
        return this.iG(new ajem(this, arr_b, arr_b1));
    }
}

