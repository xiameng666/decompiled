import android.accounts.Account;
import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.IOException;

public final class gaml extends luw {
    public final Account c;
    public final gepu d;
    public final String e;
    boolean f;

    public gaml(Context context0, Account account0, gepu gepu0, String s) {
        super(context0);
        this.f = false;
        this.c = account0;
        this.d = gepu0;
        this.e = s;
    }

    private static void c(DownloadManager downloadManager0, gepu gepu0, gamm gamm0) {
        DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(gepu0.b));
        downloadManager$Request0.setNotificationVisibility((gepu0.c == null ? gept.a : gepu0.c).f);
        downloadManager$Request0.setAllowedOverMetered((gepu0.c == null ? gept.a : gepu0.c).e);
        if(!(gepu0.c == null ? gept.a : gepu0.c).b.isEmpty()) {
            downloadManager$Request0.setTitle((gepu0.c == null ? gept.a : gepu0.c).b);
        }
        if(!(gepu0.c == null ? gept.a : gepu0.c).c.isEmpty()) {
            downloadManager$Request0.setDescription((gepu0.c == null ? gept.a : gepu0.c).c);
        }
        if(!(gepu0.c == null ? gept.a : gepu0.c).d.isEmpty()) {
            downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, (gepu0.c == null ? gept.a : gepu0.c).d);
        }
        if((gepu0.c == null ? gept.a : gepu0.c).g) {
            downloadManager$Request0.addRequestHeader("Authorization", gamm0.a());
        }
        downloadManager0.enqueue(downloadManager$Request0);
    }

    @Override  // luw
    public final Object loadInBackground() {
        DownloadManager downloadManager0 = (DownloadManager)this.getContext().getSystemService("download");
        gepu gepu0 = this.d;
        if(!(gepu0.c == null ? gept.a : gepu0.c).g) {
            gaml.c(downloadManager0, gepu0, null);
            this.f = true;
            return null;
        }
        try {
            String s = (gepu0.c == null ? gept.a : gepu0.c).h.isEmpty() ? this.e : (gepu0.c == null ? gept.a : gepu0.c).h;
            gaml.c(downloadManager0, gepu0, new gamm(s, acso.f(this.getContext(), this.c, s)));
            this.f = true;
            return null;
        }
        catch(acse | IOException object0) {
            Log.e("DownloadSpecAsyncTaskLo", "Exception getting an auth token", ((Throwable)object0));
            return object0;
        }
    }

    @Override  // lvb
    protected final void onStartLoading() {
        if(!this.f) {
            this.forceLoad();
        }
    }
}

