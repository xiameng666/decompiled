import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;

public final class dnjr implements dpue {
    final RowSecondaryToggle a;
    final dnjs b;

    public dnjr(RowSecondaryToggle rowSecondaryToggle0, dnjs dnjs0) {
        this.a = rowSecondaryToggle0;
        this.b = dnjs0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        ibuq.f(dpui0, "error");
        RowSecondaryToggle rowSecondaryToggle0 = this.a;
        rowSecondaryToggle0.s(((boolean)(rowSecondaryToggle0.g() ^ 1)));
        if((dpui0.getCause() instanceof dpuk)) {
            dpuk dpuk0 = (dpuk)dpui0.getCause();
            ibuq.c(dpuk0);
            String s = dpuk0.a.c;
            ibuq.e(s, "getTitle(...)");
            String s1 = dpuk0.a.d;
            ibuq.e(s1, "getContent(...)");
            eflw eflw0 = new eflw();
            eflw0.b = s;
            eflw0.c = s1;
            eflw0.d = this.b.e.getString(0x7F1508A8);  // string:common_ok "OK"
            eflz eflz0 = eflw0.a();
            fm fm0 = this.b.e.getFragmentManager();
            if(fm0 != null) {
                eflz0.I(fm0, "pay_error_dialog");
            }
            return;
        }
        dnjs dnjs0 = this.b;
        fm fm1 = dnjs0.e.getFragmentManager();
        if(fm1 != null) {
            dnjs0.j.c(dpui0, fm1);
        }
        rowSecondaryToggle0.setClickable(true);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gtpd gtpd0 = (gtpd)object0;
        this.a.setClickable(true);
    }
}

