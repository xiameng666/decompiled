import android.view.View.OnClickListener;
import android.view.View;

public final class bmty implements View.OnClickListener {
    public final bmue a;

    public bmty(bmue bmue0) {
        this.a = bmue0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmue bmue0 = this.a;
        if(!bmue0.d.c()) {
            bmue0.y();
        }
    }
}

