import android.view.View.OnClickListener;
import android.view.View;

public final class bmyv implements View.OnClickListener {
    public final bmza a;

    public bmyv(bmza bmza0) {
        this.a = bmza0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmza bmza0 = this.a;
        if(!bmza0.d.c()) {
            bmza0.d.b(new bmyx(bmza0));
        }
    }
}

