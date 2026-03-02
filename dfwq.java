import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import java.util.concurrent.Callable;

public final class dfwq implements Callable {
    public final dfzz a;
    public final UpdateSelectedContactsParams b;

    public dfwq(dfzz dfzz0, UpdateSelectedContactsParams updateSelectedContactsParams0) {
        this.a = dfzz0;
        this.b = updateSelectedContactsParams0;
    }

    @Override
    public final Object call() {
        dftp dftp0 = this.a.ae;
        Account account0 = dftp0.c.c();
        boolean z = false;
        if(account0 == null) {
            dcvz.a.e().p("Unable to update selected contacts : account is null.", new Object[0]);
            return (int)35505;
        }
        UpdateSelectedContactsParams updateSelectedContactsParams0 = this.b;
        Contact[] arr_contact = updateSelectedContactsParams0.b;
        for(int v = 0; v < arr_contact.length; ++v) {
            if(arr_contact[v].g) {
                z = true;
                break;
            }
        }
        int v1 = dftp0.a.a(account0, updateSelectedContactsParams0);
        if(v1 == 0) {
            if(z) {
                dcpu dcpu0 = new dcpu();
                dcpu0.a = 15;
                dcpu0.b = 1;
                dcpv dcpv0 = new dcpv(dcpu0);
                dftp0.b.c(dcpv0);
            }
            dftv dftv0 = new dftv(dftp0.b);
            dftp0.b.d(dftv0);
        }
        return v1;
    }
}

