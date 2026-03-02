import android.support.v7.widget.SwitchCompat;
import android.view.View;
import j..util.Objects;

final class dngi implements dpue {
    final View a;
    final dngl b;

    public dngi(dngl dngl0, View view0) {
        this.a = view0;
        Objects.requireNonNull(dngl0);
        this.b = dngl0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        if((dpui0.getCause() instanceof dpuk)) {
            gtli gtli0 = ((dpuk)dpui0.getCause()).a;
            String s = gtli0.c;
            String s1 = gtli0.d;
            eflw eflw0 = new eflw();
            eflw0.b = s;
            eflw0.c = s1;
            eflw0.d = this.b.a.getString(0x7F1508A8);  // string:common_ok "OK"
            eflz eflz0 = eflw0.a();
            fm fm0 = this.b.a.getFragmentManager();
            if(fm0 != null) {
                eflz0.I(fm0, "pay_error_dialog");
            }
            return;
        }
        dngl dngl0 = this.b;
        fm fm1 = dngl0.a.getFragmentManager();
        if(fm1 != null) {
            dngl0.j.c(dpui0, fm1);
        }
        this.a.setClickable(true);
    }

    @Override  // dpug
    public final void b(Object object0) {
        gtpd gtpd0 = (gtpd)object0;
        ((SwitchCompat)this.a.findViewById(0x7F0B0868)).toggle();  // id:Switch
        this.a.setClickable(true);
    }
}

