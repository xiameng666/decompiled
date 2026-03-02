import com.google.android.gms.pay.pass.valuable.view.ucp.ProcessUcpAnimationView;

public final class dxak implements qlb {
    public final boolean a;
    public final ProcessUcpAnimationView b;

    public dxak(boolean z, ProcessUcpAnimationView processUcpAnimationView0) {
        this.a = z;
        this.b = processUcpAnimationView0;
    }

    @Override  // qlb
    public final void a(Object object0) {
        ibuq.f(((qkb)object0), "result");
        if(this.a) {
            return;
        }
        this.b.c.setVisibility(8);
        this.b.d.setVisibility(8);
        this.b.b.o(((qkb)object0));
        this.b.b.t(-1);
        this.b.b.setVisibility(0);
        this.b.b.i();
    }
}

