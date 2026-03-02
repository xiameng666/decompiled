import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class ftqm {
    private final Handler a;
    private Runnable b;
    public final Context f;
    public final String g;
    public final String h;
    public final Executor i;
    public final int j;
    public final Queue k;
    public boolean l;
    public final ServiceConnection m;
    public ftqf n;

    public ftqm(Context context0, String s, String s1, Executor executor0) {
        this(context0, s, s1, executor0, 0);
    }

    public ftqm(Context context0, String s, String s1, Executor executor0, int v) {
        this.m = new ftql(this);
        this.f = context0.getApplicationContext();
        this.g = s;
        this.h = s1;
        this.a = new Handler(Looper.getMainLooper());
        this.k = new ArrayDeque();
        this.i = executor0;
        this.j = v;
    }

    public final evql k(ByteString hfsf0) {
        evqp evqp0 = new evqp();
        ftqi ftqi0 = new ftqi(this, hfsf0, evqp0);
        this.i.execute(ftqi0);
        return evqp0.a;
    }

    public final evql l(MessageLite hfvm0, Parser hfvs0) {
        evql evql0 = this.k(hfvm0.getDefaultInstanceForType());
        ftqj ftqj0 = new ftqj(hfvs0);
        return evql0.h(this.i, ftqj0);
    }

    public final void m(Status status0) {
        ftqg ftqg0;
        while((ftqg0 = (ftqg)this.k.poll()) != null) {
            aztb aztb0 = new aztb(status0);
            ftqg0.b.d(aztb0);
        }
    }

    public final void n() {
        ftqh ftqh0 = new ftqh(this);
        this.i.execute(ftqh0);
    }

    public final void o() {
        if(this.b == null) {
            this.b = new ftqh(this);
        }
        this.a.removeCallbacks(this.b);
        this.a.postDelayed(this.b, 60000L);
    }

    public final boolean p() {
        if(this.l) {
            return true;
        }
        PackageManager packageManager0 = this.f.getPackageManager();
        try {
            packageManager0.getPackageInfo(this.g, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
        Intent intent0 = new Intent(this.h);
        String s = this.g;
        ResolveInfo resolveInfo0 = packageManager0.resolveService(intent0.setPackage(s), 0);
        if(resolveInfo0 == null) {
            return false;
        }
        if(resolveInfo0.serviceInfo == null) {
            return false;
        }
        if(resolveInfo0.serviceInfo.isEnabled()) {
            try {
                azql.c(this.f).d(s);
                return true;
            }
            catch(SecurityException unused_ex) {
            }
        }
        return false;
    }

    public final void q(ftqf ftqf0, ftqg ftqg0) {
        if(ftqf0 != null) {
            try {
                byte[] arr_b = ftqg0.a.toByteArray();
                Parcel parcel0 = ftqf0.jo();
                parcel0.writeByteArray(arr_b);
                wbz.h(parcel0, ftqg0);
                ftqf0.jq(2, parcel0);
                this.o();
            }
            catch(RemoteException unused_ex) {
                aztb aztb0 = new aztb(Status.h);
                ftqg0.b.a(aztb0);
                this.n();
            }
            return;
        }
        aztb aztb1 = new aztb(Status.h);
        ftqg0.b.a(aztb1);
    }
}

