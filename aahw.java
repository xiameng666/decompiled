import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class aahw implements View.OnClickListener {
    public final aaif a;
    public final Button b;

    public aahw(aaif aaif0, Button button0) {
        this.a = aaif0;
        this.b = button0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.b.setOnClickListener(null);
        aaif aaif0 = this.a;
        aaot aaot0 = aaif0.a;
        aaot0.b.l.k(aaif0.ak, 1, aaot0.c, 0, 9);
        Long long0 = (long)aaot0.a.d.c;
        aaot0.a.a.k.a.f(long0);
        zjg zjg0 = new zjg(long0);
        zld zld0 = new zld(aaot0.a.a.k, zjg0);
        aaot0.a.a.k.a(zld0);
        int v = aaif0.y(aaif0.ai.c);
        aaid aaid0 = aaif0.d;
        grus grus0 = ((grwz)aaif0.c.d.get(v)).e;
        if(grus0 == null) {
            grus0 = grus.a;
        }
        aaid0.b(grus0, new aahz(aaif0));
    }
}

