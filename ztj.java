import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class ztj extends aaep {
    public final zem t;
    public final aacf u;
    public final aabl v;

    @AssistedInject
    public ztj(@Assisted View view0, zem zem0, aacf aacf0, aabl aabl0) {
        ibuq.f(view0, "view");
        ibuq.f(zem0, "imageFetcher");
        ibuq.f(aacf0, "onLinkClickListener");
        super(view0);
        this.t = zem0;
        this.u = aacf0;
        this.v = aabl0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "item");
        if(!(aaem0 instanceof zog)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).a(new gze(0xCD3F1791, true, new zti(this, aaem0)));
    }
}

