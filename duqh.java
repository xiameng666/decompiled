import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class duqh implements View.OnClickListener {
    public final duqq a;

    public duqh(duqq duqq0) {
        this.a = duqq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = dlnf.bH(this.a.requireContext(), dtzb.d(this.a.ag));
        this.a.startActivity(intent0);
    }
}

