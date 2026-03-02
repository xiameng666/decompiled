import android.accounts.Account;
import com.google.android.gms.auth.aang.GetTokenRequest;
import java.util.concurrent.Callable;

public final class dlnt implements Callable {
    public final dlnx a;
    public final Account b;

    public dlnt(dlnx dlnx0, Account account0) {
        this.a = dlnx0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        String s = acso.e(this.a.b, this.b.name);
        actp actp0 = GetTokenRequest.a();
        actp0.c = gged_interceptors.l("https://www.googleapis.com/auth/photos.image.readonly");
        actt actt0 = new actt();
        actt0.d(s);
        actt0.b(this.b.type);
        actt0.c(this.b.name);
        actp0.a = actt0.a();
        GetTokenRequest getTokenRequest0 = actp0.a();
        return fhra.b(this.a.d.d(getTokenRequest0));
    }
}

