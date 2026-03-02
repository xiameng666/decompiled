import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dwhr implements AndroidInjector {
    private final domv a;

    public dwhr(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwix dwix0 = (dwix)object0;
        dwix0.a = new fuok();
        dwix0.b = this.a.j();
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dwix0.c = fhwk0;
        dwix0.d = this.a.g();
        domj domj0 = this.a.b();
        Preconditions.e(domj0);
        dwix0.ag = domj0;
    }
}

