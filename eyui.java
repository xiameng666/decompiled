import android.content.Intent;

public abstract class eyui {
    private final du a;
    private final ibnn b;
    private eyuj c;

    public eyui(du du0, ibnn ibnn0) {
        this.a = du0;
        this.b = ibnn0;
        this.c = eyuj.a;
    }

    protected abstract void a();

    protected abstract void b();

    public final void c(eyuk eyuk0) {
        ibuq.f(eyuk0, "enrollmentUiState");
        eyuj eyuj0 = eyuk0.a;
        switch(eyuj0.ordinal()) {
            case 0: 
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                lqd lqd0 = lsa.b(((eyvq)this.b.a()).o, eyuh.a);
                fm fm0 = this.a.getChildFragmentManager();
                ibuq.e(fm0, "getChildFragmentManager(...)");
                if(fm0.h("EnrollmentDialogFragment") == null) {
                    eytv eytv0 = new eytv();
                    eytv0.showNow(fm0, "EnrollmentDialogFragment");
                    lqd0.g(eytv0, new eytu(new eytj(eytv0)));
                }
                break;
            }
            case 4: {
                if(this.c != eyuj.e) {
                    this.a();
                }
                break;
            }
            case 5: {
                this.b();
                ((eyvq)this.b.a()).q();
                break;
            }
            case 6: {
                Intent intent0 = eyuk0.c;
                if(intent0 != null) {
                    xob xob0 = xoc.b(this.a);
                    xob0.startActivity(intent0);
                    xob0.finish();
                }
                ((eyvq)this.b.a()).q();
                break;
            }
            case 7: {
                ((eyvq)this.b.a()).q();
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.c = eyuj0;
    }
}

