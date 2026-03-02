import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zsb extends aaep {
    public final aace t;

    @AssistedInject
    public zsb(@Assisted View view0, aace aace0) {
        ibuq.f(view0, "view");
        ibuq.f(aace0, "adviceOverflowClickListener");
        super(view0);
        this.t = aace0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "overflowItem");
        if(!(aaem0 instanceof znp)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).a(new gze(1954057873, true, new zrv(this, aaem0)));
    }
}

