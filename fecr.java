import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import com.google.android.gms.wearable.node.accountmatching.ui.AutoValue_GoogleAccountInfo;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;

public final class fecr implements lom {
    public final cchj a;
    public final ArrayList b;
    public final AppTheme c;
    public String d;
    public fech e;
    public final fecn f;
    private final acw g;
    private acp h;

    public fecr(fecn fecn0, cchj cchj0, acw acw0, AccountsMatcher.AccountsMatcherResult accountsMatcher$AccountsMatcherResult0, Bundle bundle0, AppTheme appTheme0) {
        ArrayList arrayList0 = null;
        this.h = null;
        this.d = null;
        this.e = null;
        this.f = fecn0;
        this.a = cchj0;
        this.g = acw0;
        this.c = appTheme0;
        if(bundle0 != null) {
            arrayList0 = bundle0.getParcelableArrayList("account_info_list");
        }
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            if(accountsMatcher$AccountsMatcherResult0 != null) {
                ggfp ggfp0 = accountsMatcher$AccountsMatcherResult0.b;
                ggqj ggqj0 = accountsMatcher$AccountsMatcherResult0.a.om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    arrayList0.add(new AutoValue_GoogleAccountInfo(((fewz)object0).d, ((boolean)(ggfp0.contains(((fewz)object0)) ^ 1))));
                }
            }
            else if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "[AccountMatchingFragment] Accounts provided are null");
            }
        }
        this.b = arrayList0;
    }

    public final void a(AccountManagerFuture accountManagerFuture0) {
        try {
            Intent intent0 = (Intent)((Bundle)accountManagerFuture0.getResult()).getParcelable("intent");
            if(intent0 != null) {
                acp acp0 = this.h;
                if(acp0 != null) {
                    acp0.b(intent0);
                    return;
                }
                if(Log.isLoggable("Wear_AccountMatching", 6)) {
                    Log.e("Wear_AccountMatching", "[AccountMatchingFragment] Unable to launch sign in intent.");
                }
            }
            else if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "[AccountMatchingFragment] sign in intent is null");
            }
        }
        catch(OperationCanceledException | AuthenticatorException | IOException exception0) {
            if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "[AccountMatchingFragment] Google account login error.", exception0);
            }
            fyxp fyxp0 = fyxp.s(((View)Objects.requireNonNull(this.f.getView())), 0x7F1500D6, -1);  // string:account_matching_login_error_snackbar_message "Something went wrong. Try 
                                                                                                    // to sign in again."
            fyxp0.p(0x7F0B24A6);  // id:wearable_account_matching_bottom_bar
            fyxp0.i();
            this.f.A();
        }
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        adt adt0 = new adt();
        fecp fecp0 = new fecp(this);
        this.h = this.g.c("sign_in", lps0, adt0, fecp0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

