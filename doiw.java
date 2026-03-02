import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.passlistitem.ComposePassListItem;

public final class doiw implements ibth {
    public final View.OnClickListener a;
    public final doiy b;

    public doiw(View.OnClickListener view$OnClickListener0, doiy doiy0) {
        this.a = view$OnClickListener0;
        this.b = doiy0;
    }

    @Override  // ibth
    public final Object a() {
        ComposePassListItem composePassListItem0 = this.b.J();
        this.a.onClick(composePassListItem0);
        return ibom.a;
    }
}

