import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class bmqo implements View.OnClickListener {
    final bmqr a;

    public bmqo(bmqr bmqr0) {
        Objects.requireNonNull(bmqr0);
        this.a = bmqr0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        bmqr bmqr0 = this.a;
        if(bmqr0.al == 1) {
            bmqr0.y();
        }
    }
}

