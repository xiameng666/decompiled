import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

public final class igan extends UrlResponseInfo {
    public final int a;
    public final String b;
    private final List c;
    private final String d;
    private final String e;
    private final AtomicLong f;
    private final igam g;

    public igan(List list0, int v, String s, List list1, String s1) {
        this.c = DesugarCollections.unmodifiableList(list0);
        this.a = v;
        this.d = s;
        this.g = new igam(DesugarCollections.unmodifiableList(list1));
        this.b = s1;
        this.e = "";
        this.f = new AtomicLong(0L);
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        igam igam0 = this.g;
        Map map0 = igam0.b;
        if(map0 != null) {
            return map0;
        }
        TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for(Object object0: igam0.a) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            ArrayList arrayList0 = new ArrayList();
            if(treeMap0.containsKey(map$Entry0.getKey())) {
                arrayList0.addAll(((Collection)treeMap0.get(map$Entry0.getKey())));
            }
            arrayList0.add(((String)map$Entry0.getValue()));
            treeMap0.put(((String)map$Entry0.getKey()), DesugarCollections.unmodifiableList(arrayList0));
        }
        igam0.b = DesugarCollections.unmodifiableMap(treeMap0);
        return igam0.b;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.g.a;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.d;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.b;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return (String)this.c.get(this.c.size() - 1);
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.c;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = this.getUrl();
        String s1 = this.getAllHeadersAsList().toString();
        Long long0 = this.getReceivedByteCount();
        return String.format(locale0, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), s, this.c.toString(), ((int)this.a), this.d, s1, Boolean.valueOf(false), this.b, this.e, long0);
    }

    @Override  // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}

