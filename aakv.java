import android.support.v4.app.Fragment.SavedState;
import android.view.View;

public final class aakv {
    public static void a(du du0, aanw aanw0) {
        if(aanw0 != null && du0.getClass().getName().equals(aanw0.a)) {
            Fragment.SavedState fragment$SavedState0 = aanw0.b;
            if(fragment$SavedState0 != null) {
                du0.setInitialSavedState(fragment$SavedState0);
            }
        }
    }

    public static boolean b(xob xob0, String s) {
        return xob0.getSupportFragmentManager().h(s) != null;
    }

    public static void c(fm fm0, du du0, String s, aaku aaku0) {
        if(aaku0.j) {
            du du1 = fm0.h(s);
            if(du1 != null && du1.getView() != null) {
                View view0 = du1.getView();
                gftb.check(view0);
                view0.setTranslationZ(-1.0f);
            }
        }
        ca ca0 = new ca(fm0);
        ca0.I(aaku0.h, aaku0.i);
        ca0.z(0x7F0B14C5, du0, s);  // id:fragment_container
        ca0.f();
    }

    public static void d(du du0, du du1, String s, aaku aaku0) {
        du0.requireContext();
        aakv.c(du0.getChildFragmentManager(), du1, s, aaku0);
    }
}

