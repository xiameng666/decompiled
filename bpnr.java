import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;

public final class bpnr implements Runnable {
    public final SetupWizardChimeraActivity a;
    public final gaif b;
    public final Bitmap c;

    public bpnr(SetupWizardChimeraActivity setupWizardChimeraActivity0, gaif gaif0, Bitmap bitmap0) {
        this.a = setupWizardChimeraActivity0;
        this.b = gaif0;
        this.c = bitmap0;
    }

    @Override
    public final void run() {
        String s = this.a.l.name;
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.a.getResources(), this.c);
        this.b.d(s, bitmapDrawable0);
    }
}

