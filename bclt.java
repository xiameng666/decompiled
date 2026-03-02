import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity;

public final class bclt implements View.OnClickListener {
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = 0;
        for(Object object0: bbzc.b().d(-1)) {
            ConstellationDebugChimeraActivity.j.d("CellularNetworkEvent %d: %s", new Object[]{v, ((hoct)object0)});
            ++v;
        }
    }
}

