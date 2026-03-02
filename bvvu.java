import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class bvvu extends du implements HasAndroidInjector {
    public DispatchingAndroidInjector a;

    @Override  // dagger.android.HasAndroidInjector
    public final AndroidInjector androidInjector() {
        return this.a;
    }

    @Override  // du
    public final void onAttach(Context context0) {
        bvvv.a(this);
        super.onAttach(context0);
    }
}

