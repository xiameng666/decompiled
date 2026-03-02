import android.accounts.Account;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState.Authenticated;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState.Unauthenticated;
import com.google.android.gms.kids.libs.webview.BaseWebViewViewModel.AuthState;

final class cbud implements icih {
    final cbuo a;

    public cbud(cbuo cbuo0) {
        this.a = cbuo0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bboh bboh0 = cbuo.a;
        ((ggtj)bboh0.h()).x("Authentication state changed.");
        cbuo cbuo0 = this.a;
        if((((BaseWebViewViewModel.AuthState)object0) instanceof BaseWebViewViewModel.AuthState.Authenticated)) {
            if(cbuo0.d != null) {
                ((ggtj)bboh0.j()).x("Detected reauthentication attempt.");
                return ibom.a;
            }
            Account account0 = ((BaseWebViewViewModel.AuthState.Authenticated)(((BaseWebViewViewModel.AuthState)object0))).a;
            cbuo0.d = account0;
            if(hukc.a.b().a()) {
                cbir cbir0 = cbuo0.R();
                if(cbir0 != null) {
                    cbir0.a = account0.name;
                }
            }
            String s = cbuo0.ag;
            if(s != null) {
                icbb.b(lpt.a(cbuo0), null, null, new cbty(cbuo0, s, null), 3);
                return ibom.a;
            }
        }
        else if(!(((BaseWebViewViewModel.AuthState)object0) instanceof BaseWebViewViewModel.AuthState.Unauthenticated)) {
            ((ggtj)bboh0.i()).x("Detected unknown auth state.");
        }
        else if(cbuo0.d != null) {
            ((ggtj)bboh0.i()).x("Detected attempt of unauthenticate webview.");
            return ibom.a;
        }
        return ibom.a;
    }
}

