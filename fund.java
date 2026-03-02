import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.tile.list.TileList;

public final class fund implements ibth {
    public final View.OnClickListener a;
    public final TileList b;

    public fund(View.OnClickListener view$OnClickListener0, TileList tileList0) {
        this.a = view$OnClickListener0;
        this.b = tileList0;
    }

    @Override  // ibth
    public final Object a() {
        View.OnClickListener view$OnClickListener0 = this.a;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this.b);
        }
        return ibom.a;
    }
}

