import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class egtf implements View.OnClickListener {
    public final egtw a;

    public egtf(egtw egtw0) {
        this.a = egtw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = egxj.c(this.a.a, "Choose an account");
        this.a.z(4);
        this.a.startActivityForResult(intent0, 1);
    }
}

