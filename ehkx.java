import dagger.android.HasAndroidInjector;

public final class ehkx {
    public static xob a(ehky ehky0) {
        cmgu cmgu0 = new cmgu();
        ehky0.b(cmgu0);
        xob xob0 = ehky0.a().a();
        batl.l(cmgu0.a == null);
        cmgu0.a = new cmgs(xob0);
        return xob0;
    }

    public static void b(du du0) {
        HasAndroidInjector hasAndroidInjector0 = (HasAndroidInjector)du0.getContext();
        batl.s(hasAndroidInjector0);
        hasAndroidInjector0.androidInjector().inject(du0);
    }
}

