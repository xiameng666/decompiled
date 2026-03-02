import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;

public final class ifyz implements Runnable {
    public final igac a;

    public ifyz(igac igac0) {
        this.a = igac0;
    }

    @Override
    public final void run() {
        igac igac0 = this.a;
        ifyw ifyw0 = igac0.y;
        if(ifyw0 != null) {
            try {
                ifyw0.e();
            }
            catch(IOException iOException0) {
                Log.e(igac.a, "Exception when closing OutputChannel", iOException0);
            }
        }
        HttpURLConnection httpURLConnection0 = igac0.q;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            igac0.q = null;
        }
    }
}

