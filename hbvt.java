import android.content.Intent;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import java.util.List;

public final class hbvt implements evqf {
    public final GmsDocumentScanningDelegateActivity a;

    public hbvt(GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity0) {
        this.a = gmsDocumentScanningDelegateActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v;
        GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity0 = this.a;
        if(((GmsDocumentScanningResult)object0) != null) {
            Intent intent0 = new Intent();
            intent0.putExtra("extra_scanning_result", ((GmsDocumentScanningResult)object0));
            gmsDocumentScanningDelegateActivity0.setResult(-1, intent0);
            List list0 = ((GmsDocumentScanningResult)object0).b();
            GmsDocumentScanningResult.Pdf gmsDocumentScanningResult$Pdf0 = ((GmsDocumentScanningResult)object0).a();
            if(list0 == null) {
                v = gmsDocumentScanningResult$Pdf0 == null ? 0 : gmsDocumentScanningResult$Pdf0.a();
            }
            else {
                v = list0.size();
            }
            gmsDocumentScanningDelegateActivity0.c(hbkn.a, v);
            gmsDocumentScanningDelegateActivity0.finish();
            return;
        }
        gmsDocumentScanningDelegateActivity0.b();
    }
}

