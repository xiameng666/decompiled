import android.os.Bundle;
import dagger.internal.Factory;

public final class dome implements Factory {
    private final doma a;

    public dome(doma doma0) {
        this.a = doma0;
    }

    public final Bundle a() {
        return dome.b(this.a);
    }

    public static Bundle b(doma doma0) {
        return doma0.a.am();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

