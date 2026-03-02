import android.accounts.Account;
import android.net.Uri.Builder;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class ezsd implements Callable {
    public final ezse a;
    public final Account b;

    public ezsd(ezse ezse0, Account account0) {
        this.a = ezse0;
        this.b = account0;
    }

    @Override
    public final Object call() {
        String s = String.format("/%s/%s/%s/%s/%s", "files", ezse.c(), acso.e(this.a.a, this.b.name), ((int)1), "acr.pb");
        Uri uri0 = new Uri.Builder().scheme("android").authority("com.google.android.gms").path(s).build();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ezmc.a));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        return new ezsc(this.a.b.a(frif0));
    }
}

