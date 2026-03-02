import androidx.activity.result.ActivityResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;

public final class hbvv implements acn {
    public final GmsDocumentScanningDelegateActivity a;

    public hbvv(GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity0) {
        this.a = gmsDocumentScanningDelegateActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        hbvy hbvy0 = new hbvy(this.a.getApplicationContext());
        evqp evqp0 = new evqp();
        hbvx hbvx0 = new hbvx(hbvy0, activityResult0.a, activityResult0.b, evqp0);
        hbvy.a.execute(hbvx0);
        hbvt hbvt0 = new hbvt(this.a);
        evqp0.a.b(hbvt0);
        hbvu hbvu0 = new hbvu(this.a);
        evqp0.a.A(hbvu0);
    }
}

