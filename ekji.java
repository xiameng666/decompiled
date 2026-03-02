import android.view.View.OnClickListener;
import android.view.View;

public final class ekji implements View.OnClickListener {
    public final ekjl a;
    public final uq b;

    public ekji(ekjl ekjl0, uq uq0) {
        this.a = ekjl0;
        this.b = uq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.F();
        int v = this.b.fq() - 1;
        ejyy ejyy0 = (ejyy)this.a.g.get(v);
        ejyy0.h.addAll(ejyy0.i);
        String[] arr_s = new String[ejyy0.h.size()];
        ejyy0.h.toArray(arr_s);
        this.a.a.y(ejyy0.a);
        this.a.a.z(ejyy0.j);
        this.a.a.A(ejyy0.d);
        this.a.a.x(arr_s);
        ejze.a().c(this.a.a.g(), this.a.a.c, false);
        this.a.a.s(this.a.h);
        this.a.e.A();
    }
}

