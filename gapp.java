import com.google.android.gms.idunderstanding.imagequality.ImageQualityDetectorConfig;
import com.google.android.gms.ocr.GetModelPathRequest;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class gapp implements gamu {
    private final gclx a;

    public gapp(gclx gclx0) {
        ibuq.f(gclx0, "idUnderstandingManager");
        super();
        this.a = gclx0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        ibuq.f(gano0, "request");
        ibuq.e(gano0.a, "getIntent(...)");
        ibuq.f(gano0.a, "<this>");
        MessageLite hfvm0 = gawi.i(gano0.a, "modelMetadata", ((MessageLite)hdck.a));
        ibuq.e(hfvm0, "requireTrustedProto(...)");
        ImageQualityDetectorConfig imageQualityDetectorConfig0 = new ImageQualityDetectorConfig(((hdck)hfvm0).b);
        try {
            this.a.a.add(imageQualityDetectorConfig0);
            evql[] arr_evql = new evql[2];
            Object object0 = this.a.b.b.a(this.a.b.a);
            ArrayList arrayList0 = new ArrayList();
            bavv.b(this.a.b, arrayList0);
            arr_evql[0] = ((bavt)object0).c(bavv.a(arrayList0, null));
            arr_evql[1] = ((dkhw)this.a.b.c.a(this.a.b.a)).c(new GetModelPathRequest(1, true, imageQualityDetectorConfig0.a));
            evrg.n(evrg.f(arr_evql));
            return new ganp(ganp.e(0));
        }
        catch(ExecutionException unused_ex) {
            return ganp.j();
        }
        catch(InterruptedException unused_ex) {
            return ganp.j();
        }
    }
}

