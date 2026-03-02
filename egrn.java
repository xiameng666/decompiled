import android.content.ContentResolver;
import android.view.View.OnClickListener;
import android.view.View;

public final class egrn implements View.OnClickListener {
    public final egrw a;

    public egrn(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.E(43);
        ContentResolver.setSyncAutomatically(this.a.a, "com.android.contacts", true);
        this.a.b.n();
    }
}

