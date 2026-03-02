import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvuo implements View.OnClickListener {
    public final dvuz a;

    public dvuo(dvuz dvuz0) {
        this.a = dvuz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.f();
        this.a.B.l(((Valuable)this.a.r.d()), 3, 4);
    }
}

