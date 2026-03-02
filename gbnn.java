import android.view.View.OnClickListener;
import android.view.View;

public final class gbnn extends gbni implements View.OnClickListener {
    public gbnn(gbnm gbnm0, gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super(gbnm0, gaym0);
    }

    @Override  // gbni
    public final Object a(View view0, Object object0) {
        Void void0 = (Void)object0;
        ibuq.f(view0, "view");
        ibts ibts0 = gavs.a;
        try {
            for(Object object1: this.e()) {
                ((View.OnClickListener)object1).onClick(view0);
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
                    gayy.i(gaym0, "BE_VOCD_01", gavs.b, ibts0);
                    throw new gavs("BE_VOCD_01", throwable0);
                }
                ((gavu)throwable0).a(gaym0);
                throw ((gavu)throwable0).a;
            }
            ((gavn)throwable0).a(gaym0);
            throw new gavs("BE_VOCD_01", throwable0);
        }
    }

    @Override  // gbni
    public final void b(View view0) {
        ibuq.f(view0, "view");
        view0.setOnClickListener(this);
        view0.setClickable(true);
    }

    @Override  // gbni
    public final void c(View view0) {
        ibuq.f(view0, "view");
        view0.setOnClickListener(null);
        view0.setClickable(false);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ibuq.f(view0, "v");
        this.d(view0, null);
    }
}

