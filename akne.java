import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akne extends bagl {
    private final String c;

    public akne(Context context0, String s) {
        super(context0);
        this.c = s;
    }

    public final Bitmap c() {
        Bitmap bitmap0;
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, PackageIconLoader] loadInBackground"));
        TrafficStats.setThreadStatsTag(0x401);
        float f = this.getContext().getResources().getDisplayMetrics().density * 44.0f;
        StringBuilder stringBuilder0 = new StringBuilder("=s");
        stringBuilder0.append(((int)f));
        try {
            bblp bblp0 = new bblp(0x7FFFFFFF, 10);
            clbs clbs0 = clbv.a(this.getContext());
            aknd aknd0 = new aknd();
            clcj clcj0 = clbs0.e(clcg.f((this.c + stringBuilder0.toString()), ckab.b, clbk.a, clbj.a), aknd0, bblp0, -1, 0x9700);
            clcj0.n("GET");
            clcp clcp0 = (clcp)clcj0.e().a().get(10L, TimeUnit.SECONDS);
            bitmap0 = BitmapFactory.decodeByteArray(aknd0.a, 0, aknd0.a.length);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            Log.w("Auth", String.format(Locale.US, "[AuthManaged, PackageIconLoader] Couldn\'t load app icon."), exception0);
            bitmap0 = null;
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
        return bitmap0;
    }

    @Override  // luw
    public final Object loadInBackground() {
        return this.c();
    }
}

