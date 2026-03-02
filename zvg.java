import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zvg extends aaep {
    public final aacf t;
    public final aaca u;
    public final aabl v;

    @AssistedInject
    public zvg(@Assisted View view0, aacf aacf0, aaca aaca0, aabl aabl0) {
        ibuq.f(view0, "view");
        ibuq.f(aacf0, "linkClickListener");
        ibuq.f(aaca0, "accountSwitcherClickListener");
        super(view0);
        this.t = aacf0;
        this.u = aaca0;
        this.v = aabl0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "listItem");
        if(!(aaem0 instanceof zpt)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).a(new gze(914800401, true, new zux(this, aaem0)));
    }
}

