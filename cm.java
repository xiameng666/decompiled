import android.view.ViewGroup;
import java.util.List;

public final class cm implements ibth {
    public final cx a;
    public final Object b;
    public final ViewGroup c;

    public cm(cx cx0, Object object0, ViewGroup viewGroup0) {
        this.a = cx0;
        this.b = object0;
        this.c = viewGroup0;
    }

    @Override  // ibth
    public final Object a() {
        cx cx0 = this.a;
        List list0 = cx0.a;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                if(!((cy)object0).a.f) {
                    fm.ar(2);
                    jyv jyv0 = new jyv();
                    cy cy0 = (cy)list0.get(0);
                    cn cn0 = new cn(cx0);
                    cx0.d.r(this.b, jyv0, cn0);
                    jyv0.a();
                    return ibom.a;
                }
            }
        }
        fm.ar(2);
        Object object1 = cx0.g;
        ibuq.c(object1);
        cw cw0 = new cw(cx0, this.c);
        cx0.d.u(object1, cw0);
        return ibom.a;
    }
}

