import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.io.File;
import java.util.ArrayList;

public final class bnsz implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public bnsz(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public final frli a() {
        Context context0 = bopg.a();
        frii frii0 = (frii)this.b.get();
        return bnsz.b(context0, ((Account)((InstanceFactory)this.a).a), frii0, true);
    }

    public static frli b(Context context0, Account account0, frii frii0, boolean z) {
        frce frce0 = new frce(context0);
        frce0.d("findmydevice");
        frce0.c(account0);
        frce0.e("SpotOwnerKey.pb");
        frce0.f(frgo.a);
        ArrayList arrayList0 = new ArrayList(frce0.a().getPathSegments());
        if(context0.getFilesDir() != null && !(hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), TextUtils.join(File.separator, arrayList0.subList(1, arrayList0.size())))) : new File(context0.getFilesDir(), TextUtils.join(File.separator, arrayList0.subList(1, arrayList0.size())))).exists()) {
            frce0.j();
        }
        frie frie0 = frif.a();
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fqzo.a));
        frie0.d(bnsy.a);
        frli frli0 = frii0.a(frie0.a());
        Preconditions.f(frli0);
        return frli0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

