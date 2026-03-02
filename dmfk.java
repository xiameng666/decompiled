import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmfk implements View.OnClickListener {
    public final dmfu a;
    public final fsyk b;

    public dmfk(dmfu dmfu0, fsyk fsyk0) {
        this.a = dmfu0;
        this.b = fsyk0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = dlnf.v(this.b);
        this.a.a.startActivityForResult(intent0, 1201);
        this.a.c.f("CARD_STATUS_CLOSED_LOOP");
    }
}

