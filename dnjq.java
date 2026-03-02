import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class dnjq implements dpue {
    final dnjs a;
    final RowSecondary b;

    public dnjq(dnjs dnjs0, RowSecondary rowSecondary0) {
        this.a = dnjs0;
        this.b = rowSecondary0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        ibuq.f(dpui0, "error");
        if((dpui0.getCause() instanceof dpuk)) {
            Throwable throwable0 = dpui0.getCause();
            ibuq.d(throwable0, "null cannot be cast to non-null type com.google.android.gms.pay.net.api.TapAndPayApiException");
            String s = ((dpuk)throwable0).a.c;
            ibuq.e(s, "getTitle(...)");
            String s1 = ((dpuk)throwable0).a.d;
            ibuq.e(s1, "getContent(...)");
            eflw eflw0 = new eflw();
            eflw0.b = s;
            eflw0.c = s1;
            eflw0.d = this.a.e.getString(0x7F1508A8);  // string:common_ok "OK"
            eflz eflz0 = eflw0.a();
            fm fm0 = this.a.e.getFragmentManager();
            if(fm0 != null) {
                eflz0.I(fm0, "pay_error_dialog");
            }
            return;
        }
        dnjs dnjs0 = this.a;
        fm fm1 = dnjs0.e.getFragmentManager();
        if(fm1 != null) {
            dnjs0.j.c(dpui0, fm1);
        }
        this.b.setClickable(true);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gtpd gtpd0 = (gtpd)object0;
        this.b.setClickable(true);
    }
}

