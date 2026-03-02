import android.view.View.OnClickListener;
import android.view.View;

public final class aawm implements View.OnClickListener {
    public final aawq a;

    public aawm(aawq aawq0) {
        this.a = aawq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aawq aawq0 = this.a;
        aawp aawp0 = aawq0.ai;
        if(aawp0 != null) {
            aawp0.s(aawq0, 1);
        }
    }
}

