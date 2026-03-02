import android.net.ConnectivityManager;
import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;
import java.util.Map;

public final class ifzf implements igad {
    public final igac a;

    public ifzf(igac igac0) {
        this.a = igac0;
    }

    @Override  // igad
    public final void a() {
        igac igac0 = this.a;
        if(igac0.g.get() == 8) {
            return;
        }
        URL uRL0 = new URL(igac0.m);
        HttpURLConnection httpURLConnection0 = igac0.q;
        Network network0 = null;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            igac0.q = null;
        }
        long v = igac0.u;
        boolean z = false;
        if(Long.compare(v, -1L) == 0) {
            igac0.q = (HttpURLConnection)uRL0.openConnection();
        }
        else {
            Network[] arr_network = ((ConnectivityManager)igac0.r.d.getSystemService("connectivity")).getAllNetworks();
            for(int v1 = 0; v1 < arr_network.length; ++v1) {
                Network network1 = arr_network[v1];
                if(network1.getNetworkHandle() == v) {
                    network0 = network1;
                    break;
                }
            }
            if(network0 == null) {
                throw new igah();
            }
            igac0.q = (HttpURLConnection)network0.openConnection(uRL0);
        }
        igac0.q.setInstanceFollowRedirects(false);
        Map map0 = igac0.e;
        if(!map0.containsKey("User-Agent")) {
            map0.put("User-Agent", igac0.d);
        }
        for(Object object0: map0.entrySet()) {
            igac0.q.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        igac0.q.setRequestMethod(igac0.i);
        igar igar0 = igac0.j;
        if(igar0 != null) {
            igac0.y = new ifyw(igac0, igac0.k, igac0.c, igac0.q, igar0);
            ifyw ifyw0 = igac0.y;
            if(igac0.f.size() == 1) {
                z = true;
            }
            ifyw0.a(new ifyp(ifyw0, z), "start");
            return;
        }
        igac0.l = 10;
        igac0.q.connect();
        igac0.g();
    }
}

