import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class beai implements Factory {
    private final Provider a;

    public beai(Provider provider0) {
        this.a = provider0;
    }

    public final azts a() {
        Context context0 = ((ejaz)this.a).a();
        ajqo ajqo0 = new ajqo();
        ajqo0.a = "hw_protected";
        return new azts(context0, ajqo0.a());
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

