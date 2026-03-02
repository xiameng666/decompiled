import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zrg extends aaep {
    public final aacf t;
    public final aacd u;
    public final aacb v;
    public final zem w;

    @AssistedInject
    public zrg(@Assisted View view0, aacf aacf0, aacd aacd0, aacb aacb0, zem zem0) {
        ibuq.f(view0, "view");
        ibuq.f(aacf0, "adviceLinkClickListener");
        ibuq.f(aacd0, "adviceDismissClickListener");
        ibuq.f(aacb0, "adviceBodyClickListener");
        ibuq.f(zem0, "imageFetcher");
        super(view0);
        this.t = aacf0;
        this.u = aacd0;
        this.v = aacb0;
        this.w = zem0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "listItem");
        if(!(aaem0 instanceof znn)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).setZ(100.0f);
        ((ComposeView)view0).a(new gze(0x75E81251, true, new zqw(this, aaem0)));
    }
}

