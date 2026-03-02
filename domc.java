import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class domc implements Factory {
    public static Activity a(doma doma0) {
        Activity activity0 = ((xni)doma0.a.getContext()).getContainerActivity();
        Preconditions.f(activity0);
        return activity0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        throw null;
    }
}

