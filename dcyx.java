import android.content.Context;
import android.net.Uri;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class dcyx implements Factory {
    private final Provider a;
    private final Provider b;

    public dcyx(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = ((ejaz)this.a).a();
        frii frii0 = (frii)this.b.get();
        ibuq.f(frii0, "factory");
        frce frce0 = new frce(context0);
        frce0.d("nearby");
        frce0.e("nearby/sharing/DeviceConfig.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dbyj.a(((ProtoLiteMessage)dbyi.a).v_newBuilder()).a()));
        frie0.h(new frjp(cjtd.a));
        Object object0 = frii0.a(frie0.a());
        ibuq.e(object0, "getOrCreate(...)");
        Preconditions.f(object0);
        return object0;
    }
}

