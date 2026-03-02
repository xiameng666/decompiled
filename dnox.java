import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dnox implements ibth {
    public final dnph a;
    public final RowSecondary b;

    public dnox(dnph dnph0, RowSecondary rowSecondary0) {
        this.a = dnph0;
        this.b = rowSecondary0;
    }

    @Override  // ibth
    public final Object a() {
        dnph dnph0 = this.a;
        Context context0 = dnph0.requireContext();
        Account account0 = dnph0.am;
        if(account0 == null) {
            ibuq.j("account");
            account0 = null;
        }
        dnph0.B().d(hami.f);
        dnph0.D().a(fhvv.d(), this.b);
        dnph0.startActivity(dlnf.by(context0, account0, Boolean.valueOf(false), gjil.c));
        return ibom.a;
    }
}

