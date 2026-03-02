import android.view.View;

public final class dnjf implements ibts {
    public final dnjs a;
    public final String b;

    public dnjf(dnjs dnjs0, String s) {
        this.a = dnjs0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        du du0 = this.a.e;
        String s = this.b;
        View view0 = du0.getView();
        if(view0 != null) {
            view0.setContentDescription(du0.getString(0x7F1521EE, new Object[]{s}));  // string:pay_set_default_card_confirmation "%1$s is now your default card"
        }
        View view1 = du0.getView();
        if(view1 != null) {
            view1.setAccessibilityLiveRegion(1);
        }
        String s1 = du0.getString(0x7F1521EE, new Object[]{s});  // string:pay_set_default_card_confirmation "%1$s is now your default card"
        ibuq.e(s1, "getString(...)");
        edpc.b(du0.getView(), s1);
        return ibom.a;
    }
}

