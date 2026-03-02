import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class ekie implements View.OnClickListener {
    final int a;
    final ekif b;
    final String c;
    final ejyy d;
    final ekih e;

    public ekie(ekih ekih0, int v, ekif ekif0, String s, ejyy ejyy0) {
        this.a = v;
        this.b = ekif0;
        this.c = s;
        this.d = ejyy0;
        Objects.requireNonNull(ekih0);
        this.e = ekih0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ekih ekih0 = this.e;
        ekih0.j = this.a;
        ekif ekif0 = this.b;
        ekih0.k = ekif0;
        ejyv ejyv0 = ekih0.a;
        String s = this.c;
        if(ejyv0.D(s)) {
            int v = ekif0.z.isChecked() ^ 1;
            ekif0.z.setChecked(((boolean)v));
            ekih0.n(ejyv0.e(s), s);
        }
        else {
            String s1 = ejyv0.i();
            ekih0.e.E(s1, this.d, s, 4);
        }
        ekih0.e.F();
    }
}

