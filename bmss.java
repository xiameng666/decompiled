import android.view.View.OnClickListener;
import android.view.View;

public final class bmss implements View.OnClickListener {
    public final bmsw a;
    public final acp b;

    public bmss(bmsw bmsw0, acp acp0) {
        this.a = bmsw0;
        this.b = acp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmsw bmsw0 = this.a;
        if(!bmsw0.d.c()) {
            bmsw0.d.b(new bmsu(bmsw0, this.b));
        }
    }
}

