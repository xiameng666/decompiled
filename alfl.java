import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class alfl implements akvr {
    public static final baun a;
    public final akzn b;
    public final algs c;
    public final AtomicBoolean d;
    public final AtomicInteger e;
    public final gmcg f;

    static {
        alfl.a = new baun("ProximityAuth", new String[]{"FirstPartyRegistry"});
    }

    public alfl() {
        gmcg gmcg0 = gmcn.a(new bblp(1, 10));
        super();
        this.b = akzn.c();
        this.c = algs.a();
        this.d = new AtomicBoolean(false);
        this.e = new AtomicInteger(0);
        this.f = gmcg0;
    }

    public final Status a(SecureChannelSubscription secureChannelSubscription0) {
        algs algs0 = this.c;
        if(((List)algs0.c().get()).contains(secureChannelSubscription0)) {
            return Status.b;
        }
        this.e.incrementAndGet();
        return (Status)algs0.b(secureChannelSubscription0).get();
    }

    public final Status b(String s, int v, Context context0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = this.d().iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            SecureChannelSubscription secureChannelSubscription0 = (SecureChannelSubscription)object0;
            if(Role.g(secureChannelSubscription0.c, v)) {
                Iterator iterator1 = secureChannelSubscription0.c().iterator();
                do {
                    if(!iterator1.hasNext()) {
                        continue label_3;
                    }
                    Object object1 = iterator1.next();
                }
                while(!((RemoteDevice)object1).b.equals(s));
                arrayList1.add(secureChannelSubscription0);
            }
        }
        int v1 = 0;
        for(Object object2: arrayList1) {
            SecureChannelSubscription secureChannelSubscription1 = (SecureChannelSubscription)object2;
            try {
                alfl.e(context0, secureChannelSubscription1, s, v);
                ++v1;
            }
            catch(PendingIntent.CanceledException unused_ex) {
                arrayList0.add(secureChannelSubscription1);
            }
        }
        akzn akzn0 = this.b;
        RemoteDevice remoteDevice0 = akzn0.b(s);
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            SecureChannelSubscription secureChannelSubscription2 = (SecureChannelSubscription)arrayList0.get(v3);
            if(remoteDevice0 != null && !new alfj(this, ggia.d(new RemoteDevice[]{akzn0.b(s)}), new Role(secureChannelSubscription2.b, secureChannelSubscription2.c), secureChannelSubscription2.a, secureChannelSubscription2.e, false).a().equals(Status.b)) {
                alfl.a.m("Failed to remove canceled intent.", new Object[0]);
            }
        }
        return v1 != 0 || arrayList0.isEmpty() ? Status.b : Status.f;
    }

    public final Status c(List list0, SecureChannelSubscription secureChannelSubscription0) {
        Status status0;
        algs algs0 = this.c;
        if(((List)algs0.c().get()).contains(secureChannelSubscription0)) {
            this.e.decrementAndGet();
            status0 = (Status)algs0.d(secureChannelSubscription0).get();
        }
        else {
            status0 = Status.b;
        }
        Status status1 = Status.b;
        if(status1.equals(status0)) {
            ArrayList arrayList0 = new ArrayList(secureChannelSubscription0.c());
            for(Object object0: list0) {
                arrayList0.remove(((RemoteDevice)object0));
            }
            if(!arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList();
                Role role0 = new Role(secureChannelSubscription0.b, secureChannelSubscription0.c);
                algc.b(arrayList0, arrayList1);
                return this.a(algc.a(secureChannelSubscription0.a, secureChannelSubscription0.e, role0, arrayList1));
            }
            return status1;
        }
        return status0;
    }

    public final List d() {
        List list0 = new ArrayList();
        try {
            return (List)this.c.c().get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            alfl.a.m("Failed to retrieve subscriptions.", new Object[0]);
            return list0;
        }
    }

    public static void e(Context context0, SecureChannelSubscription secureChannelSubscription0, String s, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("EXTRA_DEVICE_ID", s);
        bundle0.putInt("EXTRA_CONNECTION_MEDIUM", v);
        secureChannelSubscription0.d(context0, bundle0);
    }
}

