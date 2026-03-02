import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmxy implements View.OnClickListener {
    public final bmya a;

    public bmxy(bmya bmya0) {
        this.a = bmya0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s;
        bmwt bmwt0 = this.a.a;
        switch(this.a.c) {
            case 2: {
                s = "CONNECTION_ERROR";
                break;
            }
            case 4: {
                s = "NO_CREDENTIALS_ERROR";
                break;
            }
            default: {
                s = "GENERIC_ERROR";
            }
        }
        bmwt0.q(new bmvy(Status.f, s, gfqx.a, gfqx.a));
    }
}

