import android.view.View;

public final class ehng implements Runnable {
    public final ehnl a;
    public final oij b;

    public ehng(ehnl ehnl0, oij oij0) {
        this.a = ehnl0;
        this.b = oij0;
    }

    @Override
    public final void run() {
        oij oij0 = this.b;
        View view0 = oij0.a;
        if(!ibuq.m(Boolean.valueOf(true), view0.getTag(0x7F0B1CEC))) {  // id:preference_highlighted
            return;
        }
        view0.setTag(0x7F0B1CEC, Boolean.valueOf(false));  // id:preference_highlighted
        ehnf ehnf0 = new ehnf(view0);
        this.a.c.addUpdateListener(ehnf0);
        ehnk ehnk0 = new ehnk(this.a);
        this.a.c.addListener(ehnk0);
        ehnj ehnj0 = new ehnj(view0, this.a, oij0);
        this.a.c.addListener(ehnj0);
        this.a.c.start();
    }
}

