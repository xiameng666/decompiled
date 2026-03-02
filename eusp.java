import com.google.android.gms.tapandpay.tokenization.gcmtasks.CachedBackupTaskOperation;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class eusp implements AndroidInjector {
    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        euso euso0 = euso.a(esfl.a());
        Preconditions.f(euso0);
        ((CachedBackupTaskOperation)object0).a = euso0;
    }
}

