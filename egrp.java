import android.view.View.OnClickListener;
import android.view.View;

public final class egrp implements View.OnClickListener {
    public final egrw a;
    public final egxb b;

    public egrp(egrw egrw0, egxb egxb0) {
        this.a = egrw0;
        this.b = egxb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.av.b(egxj.g(this.a.a));
        int v = (int)(((Integer)this.b.d.d()));
        egvw.y(this.a, this.b.a, v);
    }
}

