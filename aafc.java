import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import j..util.Objects;

public final class aafc extends aaep {
    final aaff t;
    private final TextView u;
    private final TextView v;
    private final FadeInImageView w;
    private final FadeInImageView x;
    private final View y;

    public aafc(aaff aaff0, View view0) {
        Objects.requireNonNull(aaff0);
        this.t = aaff0;
        super(view0);
        this.y = view0;
        this.u = (TextView)view0.findViewById(0x7F0B22B8);  // id:title
        this.v = (TextView)view0.findViewById(0x7F0B10E6);  // id:description
        this.w = (FadeInImageView)view0.findViewById(0x7F0B16E3);  // id:image
        this.x = (FadeInImageView)view0.findViewById(0x7F0B16B9);  // id:icon
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() != 5) {
            return;
        }
        gryi gryi0 = ((aafb)aaem0).a;
        aabu.k(this.u, gryi0.d);
        aabu.k(this.v, gryi0.e);
        aaff aaff0 = this.t;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.w.getLayoutParams();
        boolean z = true;
        zem zem0 = aaff0.j;
        aabu.h(zem0, this.w, 1 == (gryi0.b & 1), (gryi0.c == null ? grwe.a : gryi0.c), (viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.width));
        FadeInImageView fadeInImageView0 = this.x;
        if((gryi0.b & 8) == 0) {
            z = false;
        }
        aabu.g(zem0, fadeInImageView0, z, (gryi0.f == null ? grwe.a : gryi0.f));
        aabu.j(this.y, (gryi0.g == null ? grwp.a : gryi0.g), aaff0.h, cchs.c(aaff0.i, 0x7F040136, 0x7F080221));  // attr:asRipple
    }
}

