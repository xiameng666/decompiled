import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessChimeraActivity;

public final class cypf implements Runnable {
    public final SassProcessChimeraActivity a;

    public cypf(SassProcessChimeraActivity sassProcessChimeraActivity0) {
        this.a = sassProcessChimeraActivity0;
    }

    @Override
    public final void run() {
        SassProcessChimeraActivity sassProcessChimeraActivity0 = this.a;
        if(sassProcessChimeraActivity0.isFinishing()) {
            return;
        }
        ((ggtj)cyjh.a.d().ar(0x1F2F)).x("SassProcessChimeraActivity: Timeout. Finish activity.");
        if(!sassProcessChimeraActivity0.a()) {
            SassProcessChimeraActivity.b(sassProcessChimeraActivity0);
        }
        sassProcessChimeraActivity0.finish();
    }
}

