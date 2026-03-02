import android.view.View.OnClickListener;
import android.view.View;

public final class ekic implements View.OnClickListener {
    public final ekih a;
    public final int b;
    public final ekif c;
    public final String d;
    public final ejyy e;

    public ekic(ekih ekih0, int v, ekif ekif0, String s, ejyy ejyy0) {
        this.a = ekih0;
        this.b = v;
        this.c = ekif0;
        this.d = s;
        this.e = ejyy0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ekih ekih0 = this.a;
        ekih0.j = this.b;
        ekif ekif0 = this.c;
        ekih0.k = ekif0;
        ejyv ejyv0 = ekih0.a;
        String s = this.d;
        if(ejyv0.D(s)) {
            int v = ekif0.z.isChecked() ^ 1;
            ekif0.z.setChecked(((boolean)v));
            return;
        }
        String s1 = ejyv0.i();
        ekih0.e.E(s1, this.e, s, 3);
    }
}

