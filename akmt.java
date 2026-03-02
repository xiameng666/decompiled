import android.content.Context;
import android.util.Log;
import com.google.android.gms.auth.managed.DownloadStatusResponse;
import java.util.Locale;

public final class akmt implements Runnable {
    private final Context a;
    private final long b;
    private final akqv c;
    private final akmy d;

    public akmt(Context context0, akmy akmy0, long v) {
        akqv akqv0 = akqv.f();
        super();
        this.a = context0;
        this.b = v;
        this.d = akmy0;
        this.c = akqv0;
    }

    @Override
    public final void run() {
        DownloadStatusResponse downloadStatusResponse0 = this.c.c(this.a, this.b);
        switch(downloadStatusResponse0.b) {
            case 0x5404: {
                akmy akmy0 = this.d;
                if(!hpwb.c() && !akmy0.b) {
                    akmy0.c();
                    return;
                }
                akmy0.a(Integer.valueOf(101));
                return;
            }
            case 0x5405: {
                this.d.b();
                return;
            }
            case 0x5406: {
                int v = downloadStatusResponse0.c;
                this.d.c = 0L;
                this.d.a(Integer.valueOf(v));
                this.d.c();
                return;
            }
            case 0x5407: {
                akmy akmy1 = this.d;
                if(!hpwb.c() && !akmy1.b) {
                    akmy1.c();
                    return;
                }
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppDownloadStatusLoader] Download failed."));
                akmy1.a(Integer.valueOf(-2));
                return;
            }
            default: {
                this.d.b();
            }
        }
    }
}

