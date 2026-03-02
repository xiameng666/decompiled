import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class eyqe implements View.OnClickListener {
    public final eysy a;
    public final eyqp b;

    public eyqe(eysy eysy0, eyqp eyqp0) {
        this.a = eysy0;
        this.b = eyqp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eysy eysy0 = this.a;
        Intent intent0 = eysy0.b;
        if(intent0 == null) {
            ibth ibth0 = eysy0.c;
            if(ibth0 != null) {
                ibth0.a();
            }
            return;
        }
        this.b.aj.b(intent0);
    }
}

