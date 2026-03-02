import android.view.View;

public final class jhn implements Runnable {
    public final jhv a;

    public jhn(jhv jhv0) {
        this.a = jhv0;
    }

    @Override
    public final void run() {
        jhv jhv0 = this.a;
        jhv0.k = null;
        View view0 = jhv0.a;
        Boolean boolean0 = Boolean.valueOf(true);
        if(!view0.isFocused()) {
            View view1 = view0.getRootView().findFocus();
            if(view1 != null && view1.onCheckIsTextEditor()) {
                jhv0.j.g();
                return;
            }
        }
        ibvd ibvd0 = new ibvd();
        ibvd ibvd1 = new ibvd();
        gwq gwq0 = jhv0.j;
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            jho jho0 = (jho)arr_object[v1];
            int v2 = jho0.ordinal();
            switch(v2) {
                case 0: {
                    ibvd0.a = boolean0;
                    ibvd1.a = boolean0;
                    break;
                }
                case 1: {
                    Boolean boolean1 = Boolean.valueOf(false);
                    ibvd0.a = boolean1;
                    ibvd1.a = boolean1;
                    break;
                }
                default: {
                    if(v2 != 2 && v2 != 3) {
                        throw new ibnq();
                    }
                    if(!ibuq.m(ibvd0.a, Boolean.valueOf(false))) {
                        ibvd1.a = Boolean.valueOf(jho0 == jho.c);
                    }
                }
            }
        }
        gwq0.g();
        if(ibuq.m(ibvd0.a, boolean0)) {
            jhv0.a();
        }
        Boolean boolean2 = (Boolean)ibvd1.a;
        if(boolean2 != null) {
            if(boolean2.booleanValue()) {
                jhv0.l.b.b();
            }
            else {
                jhv0.l.b.a();
            }
        }
        if(ibuq.m(ibvd0.a, Boolean.valueOf(false))) {
            jhv0.a();
        }
    }
}

