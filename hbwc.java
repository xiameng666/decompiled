import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

final class hbwc extends bark {
    public hbwc(Context context0, Looper looper0, baqv baqv0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 362, baqv0, azvy0, azyj0);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 17895000;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        return (iInterface0 instanceof hbun) ? ((hbun)iInterface0) : new hbun(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.mlkit.docscan.ui.DocumentScanningChimeraService.START";
    }

    @Override  // baqp
    protected final boolean f() {
        return true;
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return new Feature[]{hawq.t};
    }
}

