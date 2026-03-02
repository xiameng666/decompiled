import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class egrf implements View.OnClickListener {
    public final egrw a;

    public egrf(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = egxj.c(this.a.a, "Choose an account");
        this.a.E(4);
        this.a.startActivityForResult(intent0, 1);
    }
}

