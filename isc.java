import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j..util.Objects;

public final class isc {
    public final Object a;
    public final View b;

    public isc(ContentCaptureSession contentCaptureSession0, View view0) {
        this.a = contentCaptureSession0;
        this.b = view0;
    }

    public final AutofillId a(long v) {
        Object object0 = ((isb)Objects.requireNonNull(isd.a(this.b))).a;
        return ((ContentCaptureSession)this.a).newAutofillId(((AutofillId)object0), v);
    }

    public final ise b(AutofillId autofillId0, long v) {
        return new ise(((ContentCaptureSession)this.a).newVirtualViewStructure(autofillId0, v));
    }
}

