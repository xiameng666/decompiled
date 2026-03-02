import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.Locale;

public final class aknc extends lvb {
    public long a;
    private Handler b;
    private Integer c;
    private boolean d;

    public aknc(Context context0) {
        super(context0);
        this.c = null;
    }

    public final void a(Integer integer0) {
        this.c = integer0;
        if(this.isStarted()) {
            this.b.post(new aknb(this, integer0));
        }
    }

    public final void b() {
        Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppMddDownloadStatusLoader] Download failed."));
        this.a(Integer.valueOf(-2));
    }

    @Override  // lvb
    protected final void onReset() {
        if(this.d) {
            this.d = false;
            this.b = null;
            this.a = 0L;
            this.c = null;
        }
    }

    @Override  // lvb
    public final void onStartLoading() {
        Integer integer0 = this.c;
        if(integer0 != null) {
            this.deliverResult(integer0);
        }
        if(!this.d) {
            this.d = true;
            this.b = new clht();
            this.a = 0L;
        }
    }
}

