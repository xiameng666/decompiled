import android.content.Intent;
import android.os.Looper;
import androidx.activity.result.ActivityResult;

public final class bunw implements acn {
    public final bupl a;

    public bunw(bupl bupl0) {
        this.a = bupl0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        int v = ((ActivityResult)object0).a;
        if(v == -1) {
            Intent intent0 = ((ActivityResult)object0).b;
            if(intent0 == null) {
                ((ggtj)bupl.a.j()).x("Upsell completed successfully but no result was returned");
                return;
            }
            switch(intent0.getIntExtra("UPSELL_RESULT_KEY", -1)) {
                case 0: {
                    ((ggtj)bupl.a.h()).x("Purchase was cancelled");
                    return;
                }
                case 1: {
                    new clht(Looper.getMainLooper()).postDelayed(new buno(this.a), htuh.e().d());
                    return;
                }
                case 2: {
                    ((ggtj)bupl.a.j()).x("Error while purchasing");
                    return;
                }
                default: {
                    ((ggtj)bupl.a.j()).x("Unknown result code returned");
                    return;
                }
            }
        }
        ((ggtj)bupl.a.j()).z("There was an error starting the activity with error code %d", v);
    }
}

