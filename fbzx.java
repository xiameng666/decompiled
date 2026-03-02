import android.view.View.OnClickListener;
import android.view.View;

public final class fbzx implements View.OnClickListener {
    public final fbzy a;
    public final int b;

    public fbzx(fbzy fbzy0, int v) {
        this.a = fbzy0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.dismiss();
        gcyt gcyt0 = this.a.ai;
        if(gcyt0 != null) {
            gcyt0.aA(this.b);
        }
    }
}

