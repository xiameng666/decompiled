import android.view.View.OnClickListener;
import android.view.View;

public final class bcls implements View.OnClickListener {
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bbzc bbzc0 = bbzc.b();
        bbzc.a.j("Delete all CellularNetworkEvents", new Object[0]);
        bbzc0.h("event_type = ?", new String[]{"1"});
    }
}

