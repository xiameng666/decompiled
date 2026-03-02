import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class dovl implements View.OnClickListener {
    public final dovr a;
    public final String b;
    public final dokz c;

    public dovl(dovr dovr0, dokz dokz0) {
        this.a = dovr0;
        this.b = "MSE_WALLET";
        this.c = dokz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Context context0 = this.c.requireContext();
        this.a.b.j(this.b, context0);
    }
}

