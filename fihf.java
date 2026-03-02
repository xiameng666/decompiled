import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

final class fihf extends ServiceWorkerClient {
    @Override  // android.webkit.ServiceWorkerClient
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest0) {
        long v = System.currentTimeMillis();
        String s = webResourceRequest0.getUrl().toString();
        fiif.a();
        fiif.d("WebAppFragment", "Service worker loading resource: %s", new Object[]{s});
        if(fiim.d(s)) {
            fiif.a().e(gjaq.U, v);
            return null;
        }
        if(s.startsWith(hveg.k()) && s.contains(hveg.i())) {
            fiif.a().e(gjaq.V, v);
        }
        return null;
    }
}

