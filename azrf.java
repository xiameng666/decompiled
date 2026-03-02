import android.accounts.Account;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;

public final class azrf implements gftc {
    public final AccountPickerChimeraActivity a;

    public azrf(AccountPickerChimeraActivity accountPickerChimeraActivity0) {
        this.a = accountPickerChimeraActivity0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        if(((bxiy)object0) != null) {
            String s = ((bxiy)object0).c;
            if(s != null) {
                Account account0 = this.a.n;
                return s.equals((account0 == null ? "" : account0.name));
            }
        }
        return false;
    }
}

