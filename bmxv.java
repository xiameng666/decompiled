import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmxv implements View.OnClickListener {
    public final bmxx a;

    public bmxv(bmxx bmxx0) {
        this.a = bmxx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.q(new bmvy(Status.f, "USER_CANCELED", gfqx.a, gfqx.a));
    }
}

