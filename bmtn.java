import android.view.View.OnClickListener;
import android.view.View;

public final class bmtn implements View.OnClickListener {
    public final bmtp a;

    public bmtn(bmtp bmtp0) {
        this.a = bmtp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.c.b(new bmtk(this.a));
    }
}

