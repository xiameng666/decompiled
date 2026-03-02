import android.view.View;
import android.widget.TextView;
import j..util.Objects;

public final class aafa extends aaep {
    final aaff t;
    private final TextView u;

    public aafa(aaff aaff0, View view0) {
        Objects.requireNonNull(aaff0);
        this.t = aaff0;
        super(view0);
        this.u = (TextView)view0.findViewById(0x7F0B22B8);  // id:title
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() != 12) {
            return;
        }
        TextView textView0 = this.u;
        aabu.k(textView0, ((aaez)aaem0).a.d);
        textView0.setTextColor(cchs.a(textView0.getContext(), 0x7F04030C, 0x7F0606C6));  // attr:colorPrimary
        grwp grwp0 = ((aaez)aaem0).a.g;
        if(grwp0 == null) {
            grwp0 = grwp.a;
        }
        aabu.j(textView0, grwp0, this.t.h, cchs.c(this.t.i, 0x7F040136, 0x7F080221));  // attr:asRipple
    }
}

