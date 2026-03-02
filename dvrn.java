import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvrn implements View.OnClickListener {
    public final dvsn a;
    public final Context b;
    public final Valuable c;

    public dvrn(dvsn dvsn0, Context context0, Valuable valuable0) {
        this.a = dvsn0;
        this.b = context0;
        this.c = valuable0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.am = gfsx.m(new dvsm(this.c));
        dsio dsio0 = this.a.aw;
        dsik dsik0 = new dsik("share_education_dialog");
        dvrj dvrj0 = new dvrj(this.a, this.c);
        dsio0.c(this.b, dsik0, dvrj0);
    }
}

