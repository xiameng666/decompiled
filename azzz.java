import android.webkit.WebView;

public final class azzz implements Runnable {
    public final back a;

    public azzz(back back0) {
        this.a = back0;
    }

    @Override
    public final void run() {
        if(bbqc.e()) {
            WebView.setDataDirectorySuffix("admob-service");
            if(!hris.f()) {
                return;
            }
            pyd.e(0x4000A01);
            return;
        }
        if(bbmq.W(this.a.a)) {
            if(hris.f()) {
                pyd.e(0x4000A02);
            }
            return;
        }
        WebView.disableWebView();
    }
}

