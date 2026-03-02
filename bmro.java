import android.view.View.OnClickListener;
import android.view.View;

public final class bmro implements View.OnClickListener {
    public final bmrs a;
    public final acp b;

    public bmro(bmrs bmrs0, acp acp0) {
        this.a = bmrs0;
        this.b = acp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmrs bmrs0 = this.a;
        if(!bmrs0.d.c()) {
            bmrs0.d.b(new bmrq(bmrs0, this.b));
        }
    }
}

