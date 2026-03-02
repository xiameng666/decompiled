import android.content.Intent;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;

public final class ercp implements Runnable {
    public final TargetQuickStartChimeraActivity a;
    public final int b;
    public final Intent c;

    public ercp(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0, int v, Intent intent0) {
        this.a = targetQuickStartChimeraActivity0;
        this.b = v;
        this.c = intent0;
    }

    @Override
    public final void run() {
        this.a.setResult(this.b, this.c);
        this.a.finish();
        if(bbqa.d()) {
            TargetQuickStartChimeraActivity.i.d("Apply new finish transition in Android U+", new Object[0]);
        }
    }
}

