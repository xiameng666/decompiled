import android.content.Context;
import android.net.Uri;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class bvqb implements Factory {
    private final Provider a;
    private final Provider b;

    public bvqb(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final frli a() {
        return bvqb.b(((Context)this.a.get()), ((frii)this.b.get()));
    }

    public static frli b(Context context0, frii frii0) {
        frce frce0 = new frce(context0);
        frce0.d("growth");
        frce0.e("featuredrops_settings.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)hgnx.a));
        frie0.h(frhj.a);
        frli frli0 = frii0.a(frie0.a());
        Preconditions.f(frli0);
        return frli0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

