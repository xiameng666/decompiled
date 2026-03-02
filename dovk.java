import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.android.gms.pay.main.PayChimeraActivity;
import j..util.Objects;

public final class dovk extends View {
    final PayChimeraActivity a;

    public dovk(PayChimeraActivity payChimeraActivity0, Context context0) {
        Objects.requireNonNull(payChimeraActivity0);
        this.a = payChimeraActivity0;
        super(context0);
    }

    @Override  // android.view.View
    protected final void onConfigurationChanged(Configuration configuration0) {
        fuor fuor1;
        fuor fuor0;
        super.onConfigurationChanged(configuration0);
        fuot fuot0 = this.a.v;
        Activity activity0 = this.a.getContainerActivity();
        ibuq.f(activity0, "context");
        int v = 0;
        int v1 = configuration0 == null ? 0 : configuration0.screenWidthDp;
        if((((float)v1) < 600.0f)) {
            fuor0 = fuor.b;
        }
        else {
            fuor0 = ((float)v1) < 840.0f ? fuor.c : fuor.d;
        }
        if(configuration0 != null) {
            v = configuration0.screenHeightDp;
        }
        if((((float)v) < 480.0f)) {
            fuor1 = fuor.b;
        }
        else {
            fuor1 = ((float)v) < 900.0f ? fuor.c : fuor.d;
        }
        fuot0.a = new fuos(fuor0, fuor1, (v >= v1 ? fuor0 : fuor1), fuoq.a(activity0.getResources().getConfiguration()));
    }
}

