import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class zlp implements Factory {
    private final Provider a;
    private final Provider b;

    public zlp(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        aavz aavz0 = (aavz)((InstanceFactory)this.a).a;
        Context context0 = zfz.a();
        zed zed0 = (zed)this.b.get();
        if(!hojn.m()) {
            return ggnf.a;
        }
        ggek ggek0 = new ggek();
        for(Object object0: hojn.h().b) {
            ggek0.i(((hoka)object0), gfus.a(((gful_cronetEngineProvider)new zli(context0, ((hoka)object0), zed0, aavz0))));
        }
        return ggek0.g();
    }
}

