import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.googleone.smui.selection.ItemCell;
import java.util.List;

public final class buke implements View.OnClickListener {
    public final bukv a;

    public buke(bukv bukv0) {
        this.a = bukv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bukv bukv0 = this.a;
        if(bukv0.L()) {
            bukv0.d.f();
            bukv0.N(1);
        }
        else {
            bumw bumw0 = bukv0.d;
            busg busg0 = bumw0.g;
            busg0.a();
            List list0 = bumw0.f;
            for(Object object0: list0) {
                busg0.b(((ItemCell)object0));
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("partial_update", "SELECTION_TRUE");
            bumw0.v(0, list0.size(), bundle0);
            bukv0.N(2);
        }
        bukv0.K();
    }
}

