import android.util.Log;

public final class fcxy implements fcys {
    public final fcyb a;

    public fcxy(fcyb fcyb0) {
        this.a = fcyb0;
    }

    @Override  // fcys
    public final void a() {
        Log.d("BugreportConsent", "onCancel");
        fcyb fcyb0 = this.a;
        iw iw0 = (iw)fcyb0.getDialog();
        if(iw0 == null) {
            return;
        }
        fcyb0.ag.h.a().c.ifPresent(new fcxg());
        fcyb0.ag.onClick(iw0, -2);
    }
}

