import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.io.File;
import java.util.ArrayList;

public final class bovv implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public bovv(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public final frli a() {
        Context context0 = bopg.a();
        frii frii0 = (frii)this.b.get();
        frgt frgt0 = (frgt)this.c.get();
        return bovv.b(context0, ((Account)((InstanceFactory)this.a).a), frii0, frgt0, true);
    }

    public static frli b(Context context0, Account account0, frii frii0, frgt frgt0, boolean z) {
        frce frce0 = new frce(context0);
        frce0.d("findmydevice");
        frce0.c(account0);
        frce0.e("SpotUserDataCache.pb");
        frce0.f(frgo.a);
        ArrayList arrayList0 = new ArrayList(frce0.a().getPathSegments());
        if(context0.getFilesDir() != null && !(hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), TextUtils.join(File.separator, arrayList0.subList(1, arrayList0.size())))) : new File(context0.getFilesDir(), TextUtils.join(File.separator, arrayList0.subList(1, arrayList0.size())))).exists()) {
            frce0.j();
        }
        frie frie0 = frif.a();
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fqzv.b));
        frie0.d(bovu.a);
        frie0.h(new frjp(frgt0));
        frli frli0 = frii0.a(frie0.a());
        Preconditions.f(frli0);
        return frli0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

