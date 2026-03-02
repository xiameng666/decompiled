import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class ztu extends aaep {
    public final aacf t;

    @AssistedInject
    public ztu(@Assisted View view0, aacf aacf0) {
        ibuq.f(view0, "view");
        ibuq.f(aacf0, "linkClickListener");
        super(view0);
        this.t = aacf0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "listItem");
        if(!(aaem0 instanceof zon)) {
            return;
        }
        View view0 = this.a.findViewById(0x7F0B0F7C);  // id:compose_view
        ibuq.e(view0, "findViewById(...)");
        ((ComposeView)view0).a(new gze(1180260145, true, new ztp(this, aaem0)));
    }
}

