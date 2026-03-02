import android.view.View;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zty extends aaep {
    private final ztd t;
    private final View u;
    private final FadeInImageView v;
    private final TextView w;
    private final TextView x;
    private final zem y;
    private final aacf z;

    @AssistedInject
    public zty(@Assisted View view0, ztd ztd0, zem zem0, aacf aacf0) {
        super(view0);
        this.t = ztd0;
        this.z = aacf0;
        View view1 = view0.findViewById(0x7F0B1F2C);  // id:screen_intro
        this.u = view1;
        this.v = (FadeInImageView)view0.findViewById(0x7F0B176B);  // id:intro_image
        this.w = (TextView)view0.findViewById(0x7F0B176C);  // id:intro_title
        this.x = (TextView)view0.findViewById(0x7F0B176A);  // id:intro_description
        this.y = zem0;
        ztf.a(view1, 1);
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() == 2) {
            if(this.fq() == this.t.b() - 1) {
                ztf.a(this.u, 2);
            }
            grya grya0 = ((ztx)aaem0).a;
            zem zem0 = this.y;
            FadeInImageView fadeInImageView0 = this.v;
            boolean z = true;
            grwe grwe0 = grya0.c == null ? grwe.a : grya0.c;
            if(1 != (grya0.b & 1)) {
                z = false;
            }
            aabu.h(zem0, fadeInImageView0, z, grwe0, this.u.getWidth());
            aabu.k(this.w, grya0.d);
            aabu.k(this.x, grya0.e);
            aabu.f(this.x, grya0.f, (grya0.g == null ? grwe.a : grya0.g), (grya0.h == null ? grwp.a : grya0.h), this.z);
        }
    }
}

