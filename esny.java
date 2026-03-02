import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.tapandpay.flexuisuccess.FlexUiSuccessChimeraActivity;

public final class esny implements View.OnClickListener {
    public final FlexUiSuccessChimeraActivity a;

    public esny(FlexUiSuccessChimeraActivity flexUiSuccessChimeraActivity0) {
        this.a = flexUiSuccessChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.l.pageScroll(130);
    }
}

