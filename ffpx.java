import android.content.Context;
import android.net.Uri;
import android.os.SystemProperties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ffpx {
    public static boolean a(Context context0, faik faik0) {
        if(SystemProperties.getBoolean("pixel_legal_joint_permission", false)) {
            return true;
        }
        if(bbqa.d() && bbnp.m(context0)) {
            return ffpx.b(faik0);
        }
        bbnp.s();
        return false;
    }

    static boolean b(faik faik0) {
        evql evql0 = faik0.co();
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? false : ((azui)evql0.j()).o();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    public static frli c(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("westworld");
        frce0.e("westworld_metadata_store.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)igyu.a));
        frif frif0 = frie0.a();
        return cjtb.a.a(frif0);
    }
}

