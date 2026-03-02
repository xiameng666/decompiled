import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache.Entry;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ByteArrayPool;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.PoolingByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public final class sqr {
    public static NetworkResponse a(Request request0, long v, List list0) {
        Cache.Entry cache$Entry0 = request0.getCacheEntry();
        if(cache$Entry0 == null) {
            return new NetworkResponse(304, null, true, v, list0);
        }
        TreeSet treeSet0 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                treeSet0.add(((Header)object0).getName());
            }
        }
        ArrayList arrayList0 = new ArrayList(list0);
        List list1 = cache$Entry0.allResponseHeaders;
        if(list1 != null) {
            if(!list1.isEmpty()) {
                for(Object object1: cache$Entry0.allResponseHeaders) {
                    Header header0 = (Header)object1;
                    if(!treeSet0.contains(header0.getName())) {
                        arrayList0.add(header0);
                    }
                }
                return new NetworkResponse(304, cache$Entry0.data, true, v, arrayList0);
            }
        }
        else if(!cache$Entry0.responseHeaders.isEmpty()) {
            for(Object object2: cache$Entry0.responseHeaders.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                if(!treeSet0.contains(map$Entry0.getKey())) {
                    arrayList0.add(new Header(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue())));
                }
            }
        }
        return new NetworkResponse(304, cache$Entry0.data, true, v, arrayList0);
    }

    public static sqq b(Request request0, IOException iOException0, long v, HttpResponse httpResponse0, byte[] arr_b) {
        if((iOException0 instanceof SocketTimeoutException)) {
            return new sqq("socket", new TimeoutError());
        }
        if((iOException0 instanceof MalformedURLException)) {
            throw new RuntimeException("Bad URL " + request0.getUrl(), iOException0);
        }
        if(httpResponse0 != null) {
            int v1 = httpResponse0.getStatusCode();
            VolleyLog.e("Unexpected response code %d for %s", new Object[]{v1, request0.getUrl()});
            if(arr_b != null) {
                List list0 = httpResponse0.getHeaders();
                NetworkResponse networkResponse0 = new NetworkResponse(v1, arr_b, false, SystemClock.elapsedRealtime() - v, list0);
                if(v1 != 401 && v1 != 403) {
                    if(v1 >= 400 && v1 <= 0x1F3) {
                        throw new ClientError(networkResponse0);
                    }
                    if(v1 >= 500 && v1 <= 599 && request0.shouldRetryServerErrors()) {
                        return new sqq("server", new ServerError(networkResponse0));
                    }
                    throw new ServerError(networkResponse0);
                }
                return new sqq("auth", new AuthFailureError(networkResponse0));
            }
            return new sqq("network", new NetworkError());
        }
        if(request0.shouldRetryConnectionErrors()) {
            return new sqq("connection", new NoConnectionError());
        }
        throw new NoConnectionError(iOException0);
    }

    public static void c(Request request0, sqq sqq0) {
        int v = request0.getTimeoutMs();
        try {
            request0.getRetryPolicy().retry(sqq0.b);
        }
        catch(VolleyError volleyError0) {
            request0.addMarker(String.format("%s-timeout-giveup [timeout=%s]", sqq0.a, v));
            throw volleyError0;
        }
        request0.addMarker(String.format("%s-retry [timeout=%s]", sqq0.a, v));
    }

    public static void d(long v, Request request0, byte[] arr_b, int v1) {
        if(!VolleyLog.DEBUG && v <= 3000L) {
            return;
        }
        Long long0 = v;
        Integer integer0 = arr_b == null ? "null" : ((int)arr_b.length);
        VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[]{request0, long0, integer0, v1, request0.getRetryPolicy().getCurrentRetryCount()});
    }

    public static byte[] e(InputStream inputStream0, int v, ByteArrayPool byteArrayPool0) {
        byte[] arr_b1;
        byte[] arr_b;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream0 = new PoolingByteArrayOutputStream(byteArrayPool0, v);
        try {
            arr_b = null;
            arr_b = byteArrayPool0.getBuf(0x400);
            int v1;
            while((v1 = inputStream0.read(arr_b)) != -1) {
                poolingByteArrayOutputStream0.write(arr_b, 0, v1);
            }
            arr_b1 = poolingByteArrayOutputStream0.toByteArray();
        }
        catch(Throwable throwable0) {
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException unused_ex) {
                    VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            byteArrayPool0.returnBuf(arr_b);
            poolingByteArrayOutputStream0.close();
            throw throwable0;
        }
        try {
            inputStream0.close();
        }
        catch(IOException unused_ex) {
            VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
        }
        byteArrayPool0.returnBuf(arr_b);
        poolingByteArrayOutputStream0.close();
        return arr_b1;
    }
}

