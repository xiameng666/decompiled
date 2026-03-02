import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.wallet.bender3.framework.service.pdfrenderer.idl.RenderPdfResult;

public interface gbke extends IInterface {
    void a(Status arg1, RenderPdfResult arg2);
}

