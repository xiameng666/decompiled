import android.view.View.OnClickListener;
import android.view.View;

public final class bmuc implements View.OnClickListener {
    public final bmue a;

    public bmuc(bmue bmue0) {
        this.a = bmue0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.d.b(new bmtv(this.a));
    }
}

