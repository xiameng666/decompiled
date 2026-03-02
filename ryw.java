import java.util.List;

public final class ryw {
    final long a;
    final rvp b;

    public ryw(long v, rvp rvp0) {
        this.a = v;
        this.b = rvp0;
        super();
    }

    public final void a(Object object0, scj scj0) {
        List list0;
        rvp rvp0 = this.b;
        ibuq.f(rvp0, "<this>");
        if((rvp0 instanceof rni)) {
            try {
                list0 = ((rni)rvp0).a(object0);
            }
            catch(Throwable throwable0) {
                sct.b("TaskLoggingUtils", "failure encoding metadata", throwable0);
                list0 = ibps.a;
            }
        }
        else {
            list0 = ibps.a;
        }
        rpn rpn0 = new rpn(rvp0.fb(), rvp0.fa(), this.a, scj0, list0, 0x20);
        rqa.c.a(rpn0);
    }
}

