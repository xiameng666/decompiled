import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity;

public final class bclz implements View.OnClickListener {
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = 0;
        for(Object object0: bbzc.b().e(-1)) {
            ConstellationDebugChimeraActivity.j.d("ServiceStateEvent %d: %s", new Object[]{v, ((hocx)object0)});
            ++v;
        }
    }
}

