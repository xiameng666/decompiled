import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class aahf implements View.OnClickListener {
    public final aahl a;
    public final aaby b;
    public final Intent c;

    public aahf(aahl aahl0, aaby aaby0, Intent intent0) {
        this.a = aahl0;
        this.b = aaby0;
        this.c = intent0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aahl aahl0 = this.a;
        if(this.b.e) {
            aahl0.a.b.i(aahl0.a.a.a);
            return;
        }
        Intent intent0 = this.c;
        if(hoju.o()) {
            acp acp0 = aahl0.c;
            if(acp0 != null && intent0 != null) {
                acp0.b(intent0);
                return;
            }
        }
        if(intent0 != null) {
            aahl0.startActivityForResult(intent0, 9);
        }
    }
}

