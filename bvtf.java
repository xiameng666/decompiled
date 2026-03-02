import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class bvtf implements Factory {
    private final Provider a;
    private final Provider b;

    public bvtf(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final frli a() {
        Context context0 = (Context)this.a.get();
        frii frii0 = (frii)this.b.get();
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("growth");
        frce0.e("notification_intent.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)gqqa.a));
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

