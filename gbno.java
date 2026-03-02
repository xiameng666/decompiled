import android.view.View.OnLongClickListener;
import android.view.View;
import android.widget.EditText;

public final class gbno extends gbni implements View.OnLongClickListener {
    public gbno(gbnm gbnm0, gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super(gbnm0, gaym0);
    }

    @Override  // gbni
    public final Object a(View view0, Object object0) {
        Void void0 = (Void)object0;
        ibuq.f(view0, "view");
        ibts ibts0 = gavs.a;
        try {
            int v = 0;
            for(Object object1: this.e()) {
                v |= ((View.OnLongClickListener)object1).onLongClick(view0);
            }
            return Boolean.valueOf(((boolean)v));
        }
        catch(Throwable throwable0) {
            gaym gaym0 = this.a;
            if(!(throwable0 instanceof gavn)) {
                if(!(throwable0 instanceof gavu)) {
                    if((throwable0 instanceof gavs)) {
                        throw throwable0;
                    }
                    gayy.i(gaym0, "BE_VOLCD_01", gavs.b, ibts0);
                    throw new gavs("BE_VOLCD_01", throwable0);
                }
                ((gavu)throwable0).a(gaym0);
                throw ((gavu)throwable0).a;
            }
            ((gavn)throwable0).a(gaym0);
            throw new gavs("BE_VOLCD_01", throwable0);
        }
    }

    @Override  // gbni
    public final void b(View view0) {
        ibuq.f(view0, "view");
        view0.setOnLongClickListener(this);
    }

    @Override  // gbni
    public final void c(View view0) {
        ibuq.f(view0, "view");
        view0.setOnLongClickListener(null);
        gaxl.a();
        if(hzlv.a.b().M() && (view0 instanceof EditText)) {
            return;
        }
        view0.setLongClickable(false);
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        ibuq.f(view0, "view");
        Boolean boolean0 = (Boolean)this.d(view0, null);
        return boolean0 == null ? true : boolean0.booleanValue();
    }
}

