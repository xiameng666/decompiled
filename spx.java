import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public final class spx {
    public final Map a;
    public final ResponseDelivery b;
    private final RequestQueue c;
    private final CacheDispatcher d;
    private final BlockingQueue e;

    public spx(CacheDispatcher cacheDispatcher0, BlockingQueue blockingQueue0, ResponseDelivery responseDelivery0) {
        this.a = new HashMap();
        this.c = null;
        this.b = responseDelivery0;
        this.d = cacheDispatcher0;
        this.e = blockingQueue0;
    }

    public spx(RequestQueue requestQueue0) {
        this.a = new HashMap();
        this.c = requestQueue0;
        this.b = requestQueue0.getResponseDelivery();
        this.d = null;
        this.e = null;
    }

    public final void a(Request request0) {
        synchronized(this) {
            Map map0 = this.a;
            String s = request0.getCacheKey();
            List list0 = (List)map0.remove(s);
            if(list0 != null && !list0.isEmpty()) {
                if(VolleyLog.DEBUG) {
                    VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", new Object[]{list0.size(), s});
                }
                Request request1 = (Request)list0.remove(0);
                map0.put(s, list0);
                request1.e(this);
                RequestQueue requestQueue0 = this.c;
                if(requestQueue0 != null) {
                    requestQueue0.e(request1);
                    return;
                }
                if(this.d != null) {
                    BlockingQueue blockingQueue0 = this.e;
                    if(blockingQueue0 != null) {
                        try {
                            blockingQueue0.put(request1);
                        }
                        catch(InterruptedException interruptedException0) {
                            VolleyLog.e("Couldn\'t add request to queue. %s", new Object[]{interruptedException0.toString()});
                            Thread.currentThread().interrupt();
                            this.d.quit();
                        }
                    }
                }
            }
        }
    }

    public final boolean b(Request request0) {
        synchronized(this) {
            Map map0 = this.a;
            String s = request0.getCacheKey();
            if(map0.containsKey(s)) {
                List list0 = (List)map0.get(s);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                request0.addMarker("waiting-for-response");
                list0.add(request0);
                map0.put(s, list0);
                if(VolleyLog.DEBUG) {
                    VolleyLog.d("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{s});
                }
                return true;
            }
            map0.put(s, null);
            request0.e(this);
            if(VolleyLog.DEBUG) {
                VolleyLog.d("new request, sending to network %s", new Object[]{s});
            }
        }
        return false;
    }
}

