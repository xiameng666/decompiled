import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import java.util.ArrayList;

public class eqqh extends du {
    protected AccountPickerOptions a;
    protected UiCustomization ag;
    protected int b;
    public ArrayList c;
    protected boolean d;

    public eqqh() {
        this.b = 0x7F080BEB;
        this.d = false;
    }

    protected final String G() {
        String s = this.a.b;
        return s == null ? this.getString(0x7F152E54) : s;  // string:smartdevice_d2d_account_picker_title "Choose your Google Account"
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            ArrayList arrayList0 = bauc.e(bundle1, "accounts", BootstrapAccount.CREATOR);
            batl.t(arrayList0, "Accounts cannot be null");
            this.c = arrayList0;
            AccountPickerOptions accountPickerOptions0 = (AccountPickerOptions)bundle1.getParcelable("options");
            batl.s(accountPickerOptions0);
            this.a = accountPickerOptions0;
            this.b = bundle1.containsKey("deviceIconId") ? bundle1.getInt("deviceIconId") : 0x7F080BEB;
            this.d = bundle1.getBoolean("skipLockscreen");
            this.ag = (UiCustomization)bundle1.getParcelable("uiCustomization");
            return;
        }
        this.a = new AccountPickerOptions();
    }

    protected final eqqi y() {
        Context context0 = this.getContext();
        if((context0 instanceof eqqi)) {
            return (eqqi)context0;
        }
        throw new IllegalStateException("Parent activity must implement AccountPickerListener");
    }

    protected final String z() {
        String s = this.a.c;
        return s == null ? this.getString(0x7F152E51) : s;  // string:smartdevice_d2d_account_picker_description "Get the most out of your new 
                                                            // device by linking your account"
    }
}

