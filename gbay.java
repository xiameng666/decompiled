import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gbay extends gaok {
    private final gbap b;

    public gbay(gamx gamx0, gbap gbap0) {
        super(gamx0);
        this.b = gbap0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        String s;
        ibuq.f(gano0, "actionRequest");
        WidgetConfig widgetConfig0 = this.e(gano0);
        hdcb hdcb0 = (hdcb)gawi.i(gano0.a, "downloadSpec", ((MessageLite)hdcb.a));
        try {
            if(hdcb0.e) {
                gamx gamx0 = this.d();
                s = this.b.c(gamx0, this.a, widgetConfig0.a, gbbh.a(widgetConfig0.b), true);
            }
            else {
                s = null;
            }
            Object object0 = this.a.getSystemService("download");
            ibuq.d(object0, "null cannot be cast to non-null type android.app.DownloadManager");
            ibuq.c(hdcb0);
            DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(ghiq.a((hdcb0.b == null ? ghip.a : hdcb0.b)).b));
            hdca hdca0 = hdca.b(hdcb0.f) == null ? hdca.a : hdca.b(hdcb0.f);
            int v = 3;
            ibuq.e(hdca0, "getNotificationVisibility(...)");
            ibuq.f(hdca0, "<this>");
            switch(hdca0.ordinal()) {
                case 2: {
                    v = 1;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    v = 0;
                }
            }
            downloadManager$Request0.setNotificationVisibility(v);
            downloadManager$Request0.setAllowedOverMetered(hdcb0.d);
            String s1 = hdcb0.g;
            ibuq.e(s1, "getTitle(...)");
            if(s1.length() != 0) {
                downloadManager$Request0.setTitle(hdcb0.g);
            }
            String s2 = hdcb0.h;
            ibuq.e(s2, "getDescription(...)");
            if(s2.length() != 0) {
                downloadManager$Request0.setDescription(hdcb0.h);
            }
            String s3 = hdcb0.c;
            ibuq.e(s3, "getFileName(...)");
            if(s3.length() != 0) {
                downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, hdcb0.c);
            }
            if(s != null) {
                downloadManager$Request0.addRequestHeader("Authorization", "Bearer " + s);
            }
            ((DownloadManager)object0).enqueue(downloadManager$Request0);
            return new ganp(ganp.e(0));
        }
        catch(gcqt unused_ex) {
            return ganp.j();
        }
        catch(NullPointerException unused_ex) {
            return ganp.k(100);
        }
    }
}

