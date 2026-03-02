import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etke implements View.OnClickListener {
    public final RequestTokenizeChimeraActivity a;

    public etke(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        if(requestTokenizeChimeraActivity0.y != null && requestTokenizeChimeraActivity0.y.b(2)) {
            requestTokenizeChimeraActivity0.D.k();
            return;
        }
        hywi.g();
        if(hywi.c()) {
            requestTokenizeChimeraActivity0.p();
            return;
        }
        requestTokenizeChimeraActivity0.m();
    }
}

