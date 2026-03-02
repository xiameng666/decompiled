import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.tapandpay.flexuisuccess.FlexUiSuccessChimeraActivity;

public final class esns implements View.OnClickListener {
    public final FlexUiSuccessChimeraActivity a;

    public esns(FlexUiSuccessChimeraActivity flexUiSuccessChimeraActivity0) {
        this.a = flexUiSuccessChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ftat ftat0 = this.a.k.f == null ? ftat.a : this.a.k.f;
        this.a.m((ftat0.d == null ? ftas.a : ftat0.d));
    }
}

