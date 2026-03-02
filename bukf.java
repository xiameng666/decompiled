import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.chip.Chip;
import j..util.Objects;

public final class bukf implements View.OnClickListener {
    public final bukv a;
    public final Chip b;
    public final hivh c;

    public bukf(bukv bukv0, Chip chip0, hivh hivh0) {
        this.a = bukv0;
        this.b = chip0;
        this.c = hivh0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bukv bukv0 = this.a;
        hivh hivh0 = this.c;
        if(bukv0.b.c()) {
            fyju fyju0 = new fyju(((Context)Objects.requireNonNull(bukv0.getContext())));
            if(bukv0.ak != null && !bukv0.ak.e.isEmpty()) {
                fyju0.O(bukv0.ak.e);
            }
            if(bukv0.ak != null && !bukv0.ak.d.isEmpty()) {
                fyju0.D(bukv0.ak.d);
            }
            Chip chip0 = this.b;
            if(bukv0.ak != null && !bukv0.ak.c.isEmpty()) {
                fyju0.M(bukv0.ak.c, new buko(bukv0, chip0, hivh0));
            }
            if(bukv0.ak != null && !bukv0.ak.b.isEmpty()) {
                fyju0.G(bukv0.ak.b, new bukp(bukv0, chip0));
            }
            fyju0.a();
            return;
        }
        bukv0.z(hivh0);
    }
}

