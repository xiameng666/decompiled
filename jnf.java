import android.content.Context;
import android.view.View;

final class jnf extends ibur implements ibth {
    final Context a;
    final ibts b;
    final gpg c;
    final haq d;
    final int e;
    final View f;

    public jnf(Context context0, ibts ibts0, gpg gpg0, haq haq0, int v, View view0) {
        this.a = context0;
        this.b = ibts0;
        this.c = gpg0;
        this.d = haq0;
        this.e = v;
        this.f = view0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        ibuq.d(this.f, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        View view0 = (View)this.b.a(this.a);
        huv huv0 = new huv();
        return new jmw(this.a, this.c, view0, huv0, this.d, this.e, ((iio)this.f)).w;
    }
}

