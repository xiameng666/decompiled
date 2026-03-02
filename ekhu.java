import android.view.View.OnClickListener;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class ekhu implements View.OnClickListener {
    public final ekia a;

    public ekhu(ekia ekia0) {
        this.a = ekia0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ekia ekia0 = this.a;
        List list0 = ekia0.c.f;
        if(list0 == null) {
            list0 = new ArrayList();
        }
        ejze.a().r(21, ekia0.c.g(), ekia0.c.c, ekia0.c.b);
        ekia0.b.i(list0);
        ekia0.b.g();
    }
}

