import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvul implements View.OnClickListener {
    public final dvuz a;

    public dvul(dvuz dvuz0) {
        this.a = dvuz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvuz dvuz0 = this.a;
        dvuz0.f();
        if(dvuz0.x.b) {
            dvuz0.c();
        }
        dvuz0.B.l(((Valuable)dvuz0.r.d()), 7, 4);
    }
}

