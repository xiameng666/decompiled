import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

final class zug extends aaep {
    private final zem t;
    private final ViewGroup u;
    private final TextView v;
    private final FadeInImageView w;
    private final TextView x;
    private final aacf y;

    @AssistedInject
    public zug(@Assisted View view0, zem zem0, aacf aacf0) {
        super(view0);
        this.t = zem0;
        this.u = (ViewGroup)view0.findViewById(0x7F0B1F86);  // id:segment_header_container
        this.v = (TextView)view0.findViewById(0x7F0B1F89);  // id:segment_header_title
        this.w = (FadeInImageView)view0.findViewById(0x7F0B1F88);  // id:segment_header_icon
        this.x = (TextView)view0.findViewById(0x7F0B1F87);  // id:segment_header_description
        this.y = aacf0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() != 7) {
            return;
        }
        grvb grvb0 = ((zuc)aaem0).a;
        gryu gryu0 = grvb0.b == 10 ? ((gryu)grvb0.c) : gryu.a;
        aabu.k(this.v, gryu0.c);
        aabu.h(this.t, this.w, (gryu0.b & 4) != 0, (gryu0.e == null ? grwe.a : gryu0.e), this.w.getWidth());
        aabu.k(this.x, gryu0.d);
        aabu.f(this.x, gryu0.f, (gryu0.g == null ? grwe.a : gryu0.g), (gryu0.h == null ? grwp.a : gryu0.h), this.y);
        kfe.k(this.u, true);
    }
}

