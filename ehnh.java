import android.animation.ValueAnimator;
import android.view.View;

public final class ehnh implements Runnable {
    public final ehnl a;
    public final oij b;

    public ehnh(ehnl ehnl0, oij oij0) {
        this.a = ehnl0;
        this.b = oij0;
    }

    @Override
    public final void run() {
        oij oij0 = this.b;
        View view0 = oij0.a;
        view0.setTag(0x7F0B1CEC, Boolean.valueOf(true));  // id:preference_highlighted
        ehnl ehnl0 = this.a;
        ValueAnimator valueAnimator0 = ehnl0.b;
        if(valueAnimator0 != null) {
            valueAnimator0.addUpdateListener(new ehni(view0));
            valueAnimator0.start();
        }
        view0.postDelayed(new ehng(ehnl0, oij0), 15000L);
    }
}

