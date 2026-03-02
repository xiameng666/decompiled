import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class gbnf extends gbni implements View.OnFocusChangeListener {
    public gbnf(gbnm gbnm0, gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super(gbnm0, gaym0);
    }

    @Override  // gbni
    public final Object a(View view0, Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        ibuq.f(view0, "view");
        ibts ibts0 = gavs.a;
        try {
            for(Object object1: this.e()) {
                ((View.OnFocusChangeListener)object1).onFocusChange(view0, z);
            }
            return ibom.a;
        }
        catch(Throwable throwable0) {
            gaym gaym0 = this.a;
            if(!(throwable0 instanceof gavn)) {
                if(!(throwable0 instanceof gavu)) {
                    if((throwable0 instanceof gavs)) {
                        throw throwable0;
                    }
                    gayy.i(gaym0, "BE_VFD_01", gavs.b, ibts0);
                    throw new gavs("BE_VFD_01", throwable0);
                }
                ((gavu)throwable0).a(gaym0);
                throw ((gavu)throwable0).a;
            }
            ((gavn)throwable0).a(gaym0);
            throw new gavs("BE_VFD_01", throwable0);
        }
    }

    @Override  // gbni
    public final void b(View view0) {
        ibuq.f(view0, "view");
        view0.setOnFocusChangeListener(this);
    }

    @Override  // gbni
    public final void c(View view0) {
        ibuq.f(view0, "view");
        view0.setOnFocusChangeListener(null);
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        ibuq.f(view0, "view");
        this.d(view0, Boolean.valueOf(z));
    }
}

