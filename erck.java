import androidx.activity.result.ActivityResult;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartChimeraActivity;

public final class erck implements acn {
    public final SourceQuickStartChimeraActivity a;

    public erck(SourceQuickStartChimeraActivity sourceQuickStartChimeraActivity0) {
        this.a = sourceQuickStartChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        int v = ((ActivityResult)object0).a;
        erqc erqc0 = SourceQuickStartChimeraActivity.h;
        erqc0.d("onOemAppUpdateResult(): %d", new Object[]{v});
        SourceQuickStartChimeraActivity sourceQuickStartChimeraActivity0 = this.a;
        if(v == -1) {
            sourceQuickStartChimeraActivity0.k.k(2);
            PostTransferAction postTransferAction1 = sourceQuickStartChimeraActivity0.o;
            batl.s(postTransferAction1);
            sourceQuickStartChimeraActivity0.w(postTransferAction1);
        }
        else {
            switch(v) {
                case 5010: {
                    erqc0.h("User skipped OEM app install/update, finishing activity...", new Object[0]);
                    sourceQuickStartChimeraActivity0.k.k(4);
                    break;
                }
                case 5011: {
                    erqc0.f("OEM app install/update failed", new Object[0]);
                    sourceQuickStartChimeraActivity0.k.k(3);
                    break;
                }
                case 5012: {
                    sourceQuickStartChimeraActivity0.k.k(5);
                    PostTransferAction postTransferAction0 = sourceQuickStartChimeraActivity0.o;
                    batl.s(postTransferAction0);
                    sourceQuickStartChimeraActivity0.w(postTransferAction0);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown OEM app installer result code: " + v);
                }
            }
        }
        if(hyis.a.k().Z()) {
            sourceQuickStartChimeraActivity0.finishAndRemoveTask();
            return;
        }
        sourceQuickStartChimeraActivity0.p();
    }
}

