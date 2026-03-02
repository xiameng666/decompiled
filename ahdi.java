import android.graphics.Bitmap;
import android.graphics.Paint;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import java.util.concurrent.Callable;

public final class ahdi implements Callable {
    public final clcf a;

    public ahdi(clcf clcf0) {
        this.a = clcf0;
    }

    @Override
    public final Object call() {
        uow uow0;
        if(ahdk.a == null) {
            ahdk.a = new ahdk();
        }
        clgq clgq0 = clgp.a(AppContextProvider.a()).a().b(this.a);
        if(clgq0.b) {
            try(gdrc gdrc0 = clib.c.a("glide#submit")) {
                uow0 = clgq0.a.m(0x80, 0x80);
            }
        }
        else {
            uow0 = clgq0.a.m(0x80, 0x80);
        }
        Bitmap bitmap0 = (Bitmap)uow0.get();
        if(bitmap0 != null) {
            return bbrs.a(AppContextProvider.a(), bitmap0, new Paint());
        }
        throw bxma.f(0x6F31, "Bitmap is null after loading from URL");
    }
}

