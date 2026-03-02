import android.os.Handler;
import android.os.Looper;
import java.util.Set;

public final class lln {
    public static final int a;
    private static final llm b;

    static {
        lln.b = llm.a;
    }

    public static final void a(du du0, String s) {
        ibuq.f(du0, "fragment");
        llj llj0 = new llj(du0, s);
        lln.d(llj0);
        llm llm0 = lln.b(du0);
        if(llm0.b.contains(lll.c) && lln.e(llm0, du0.getClass(), llj0.getClass())) {
            lln.c(llm0, llj0);
        }
    }

    public static final llm b(du du0) {
        while(du0 != null) {
            if(du0.isAdded()) {
                du0.getParentFragmentManager();
            }
            du0 = du0.getParentFragment();
        }
        return lln.b;
    }

    public static final void c(llm llm0, llx llx0) {
        du du0 = llx0.a;
        String s = du0.getClass().getName();
        llm0.b.contains(lll.a);
        if(llm0.b.contains(lll.b)) {
            llk llk0 = new llk(s, llx0);
            if(du0.isAdded()) {
                Handler handler0 = du0.getParentFragmentManager().q.d;
                if(ibuq.m(handler0.getLooper(), Looper.myLooper())) {
                    llk0.run();
                    return;
                }
                handler0.post(llk0);
                return;
            }
            llk0.run();
        }
    }

    public static final void d(llx llx0) {
        if(fm.ar(3)) {
            llx0.a.getClass();
        }
    }

    public static final boolean e(llm llm0, Class class0, Class class1) {
        Set set0 = (Set)llm0.c.get(class0.getName());
        if(set0 == null) {
            return true;
        }
        return ibuq.m(class1.getSuperclass(), llx.class) || !ibpo.aB(set0, class1.getSuperclass()) ? !set0.contains(class1) : false;
    }
}

