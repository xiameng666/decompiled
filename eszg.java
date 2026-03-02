import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class eszg implements View.OnClickListener {
    public final eszq a;

    public eszg(eszq eszq0) {
        this.a = eszq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eszq eszq0 = this.a;
        Context context0 = eszq0.getContext();
        if(!(context0 instanceof etsq)) {
            return;
        }
        eviu.a(eszq0.c, ((etsq)context0));
    }
}

