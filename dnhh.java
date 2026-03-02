import android.support.v7.widget.SwitchCompat;
import android.view.View;

public final class dnhh implements dpue {
    final dnhi a;
    final View b;

    public dnhh(dnhi dnhi0, View view0) {
        this.a = dnhi0;
        this.b = view0;
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
            eflw0.d = this.a.a.getString(0x7F1508A8);  // string:common_ok "OK"
            eflz eflz0 = eflw0.a();
            fm fm0 = this.a.a.getFragmentManager();
            if(fm0 != null) {
                eflz0.I(fm0, "pay_error_dialog");
            }
            return;
        }
        dnhi dnhi0 = this.a;
        fm fm1 = dnhi0.a.getFragmentManager();
        if(fm1 != null) {
            dnhi0.i.c(dpui0, fm1);
        }
        this.b.setClickable(true);
    }

    @Override  // dpug
    public final void b(Object object0) {
        ibuq.f(((gtpd)object0), "setTokenPreferencesResponse");
        ((SwitchCompat)this.b.findViewById(0x7F0B0868)).toggle();  // id:Switch
        this.b.setClickable(true);
    }
}

