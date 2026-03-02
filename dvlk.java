import dagger.android.AndroidInjector;

final class dvlk implements AndroidInjector {
    private final domv a;

    public dvlk(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvld dvld0 = (dvld)object0;
        dvld0.b = new dvlb(this.a.a());
        dvld0.c = this.a.h();
        dvld0.d = bbnk.a;
    }
}

