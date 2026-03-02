import android.text.Spannable;

public final class buol implements ibts {
    public final hivr a;

    public buol(hivr hivr0) {
        this.a = hivr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bunn)object0), "it");
        hivq hivq0 = this.a.h == null ? hivq.a : this.a.h;
        ibuq.e(hivq0, "getIneligibleView(...)");
        ibuq.f(hivq0, "ineligibleView");
        ((bunn)object0).h.setText(hivq0.b);
        ghik ghik0 = ghin.b((hivq0.c == null ? ghim.a : hivq0.c));
        if(!ibuq.m(ghik0, ghik.a)) {
            Spannable spannable0 = busk.a(ghik0.b);
            ((bunn)object0).i.setText(spannable0);
        }
        return ibom.a;
    }
}

