import android.view.View.OnClickListener;
import android.view.View;

public final class bmsk implements View.OnClickListener {
    public final bmsp a;
    public final acp b;

    public bmsk(bmsp bmsp0, acp acp0) {
        this.a = bmsp0;
        this.b = acp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmsp bmsp0 = this.a;
        if(!bmsp0.d.c()) {
            bmsp0.d.b(new bmse(bmsp0, this.b));
        }
    }
}

