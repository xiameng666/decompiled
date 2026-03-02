import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

final class iku extends ibur implements ibts {
    final ili a;

    public iku(ili ili0) {
        this.a = ili0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hib hib0;
        KeyEvent keyEvent0 = ((huj)object0).a;
        long v = hul.b(keyEvent0);
        int v1 = 2;
        Object object1 = Boolean.valueOf(true);
        if(hui.a(v, hui.b)) {
            hib0 = new hib(2);
        }
        else if(hui.a(v, hui.c)) {
            hib0 = new hib(1);
        }
        else if(hui.a(v, hui.i)) {
            hib0 = new hib((keyEvent0.isShiftPressed() ? 2 : 1));
        }
        else if(hui.a(v, hui.g)) {
            hib0 = new hib(4);
        }
        else if(hui.a(v, hui.f)) {
            hib0 = new hib(3);
        }
        else if(hui.a(v, hui.d) || hui.a(v, hui.m)) {
            hib0 = new hib(5);
        }
        else if(hui.a(v, hui.e) || hui.a(v, hui.n)) {
            hib0 = new hib(6);
        }
        else if(hui.a(v, hui.h) || hui.a(v, hui.k) || hui.a(v, hui.o)) {
            hib0 = new hib(7);
        }
        else if(!hui.a(v, hui.a) && !hui.a(v, hui.l)) {
            hib0 = null;
        }
        else {
            hib0 = new hib(8);
        }
        if(hib0 != null && huk.a(hul.a(keyEvent0), 2)) {
            ili ili0 = this.a;
            hio hio0 = ili0.R;
            hji hji0 = hio0.b();
            if(hji0 != null && hji0.a && ili0.c(hib0.a)) {
                return object1;
            }
            hka hka0 = ili0.a();
            int v2 = hib0.a;
            Boolean boolean0 = hio0.d(v2, hka0, new ikt(hib0));
            if(boolean0 != null && !boolean0.booleanValue()) {
                if(hip.a(v2)) {
                    Integer integer0 = hie.d(v2);
                    if(integer0 != null) {
                        v1 = (int)integer0;
                    }
                    FocusFinder focusFinder0 = FocusFinder.getInstance();
                    View view0 = ili0.getRootView();
                    ibuq.d(view0, "null cannot be cast to non-null type android.view.ViewGroup");
                    View view1 = focusFinder0.findNextFocus(((ViewGroup)view0), ili0, v1);
                    return view1 != null && !ibuq.m(view1, ili0) ? Boolean.valueOf(false) : Boolean.valueOf(hio0.k(v2));
                }
                return Boolean.valueOf(false);
            }
            return object1;
        }
        return Boolean.valueOf(false);
    }
}

