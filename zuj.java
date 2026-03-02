import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class zuj extends aaep {
    public final aacf t;

    @AssistedInject
    public zuj(@Assisted View view0, aacf aacf0) {
        ibuq.f(view0, "view");
        ibuq.f(aacf0, "linkClickListener");
        super(view0);
        this.t = aacf0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "listItem");
        if(!(aaem0 instanceof zoq)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).a(new gze(0xB34156F3, true, new zuf(this, aaem0)));
    }
}

