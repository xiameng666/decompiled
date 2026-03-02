import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class dovm implements View.OnClickListener {
    public final dovr a;
    public final String b;
    public final dokz c;

    public dovm(dovr dovr0, String s, dokz dokz0) {
        this.a = dovr0;
        this.b = s;
        this.c = dokz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Context context0 = this.c.requireContext();
        this.a.b.j(this.b, context0);
    }
}

