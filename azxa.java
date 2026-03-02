import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class azxa implements azvt, azxu {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final azpn d;
    public final azwz e;
    final Map f;
    final Map g;
    final baqv h;
    final Map i;
    public volatile azwx j;
    int k;
    final azww l;
    final azxt m;
    final azsy n;

    public azxa(Context context0, azww azww0, Lock lock0, Looper looper0, azpn azpn0, Map map0, baqv baqv0, Map map1, azsy azsy0, ArrayList arrayList0, azxt azxt0) {
        this.g = new HashMap();
        this.c = context0;
        this.a = lock0;
        this.d = azpn0;
        this.f = map0;
        this.h = baqv0;
        this.i = map1;
        this.n = azsy0;
        this.l = azww0;
        this.m = azxt0;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((azvs)arrayList0.get(v1)).b = this;
        }
        this.e = new azwz(this, looper0);
        this.b = lock0.newCondition();
        this.j = new azws(this);
    }

    @Override  // azxu
    public final azvc a(azvc azvc0) {
        azvc0.l();
        this.j.g(azvc0);
        return azvc0;
    }

    @Override  // azxu
    public final azvc b(azvc azvc0) {
        azvc0.l();
        return this.j.a(azvc0);
    }

    @Override  // azxu
    public final void c() {
        this.j.c();
    }

    @Override  // azxu
    public final void d() {
        this.j.h();
        this.g.clear();
    }

    @Override  // azxu
    public final void e(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("mState=").println(this.j);
        for(Object object0: this.i.keySet()) {
            printWriter0.append(s).append(((azta_api)object0).a).println(":");
            azsz azsz0 = (azsz)this.f.get(((azta_api)object0).c);
            batl.s(azsz0);
            azsz0.F(s + "  ", printWriter0);
        }
    }

    @Override  // azxu
    public final void f() {
    }

    final void g(azwy azwy0) {
        Message message0 = this.e.obtainMessage(1, azwy0);
        this.e.sendMessage(message0);
    }

    @Override  // azxu
    public final boolean h() {
        return this.j instanceof azwg;
    }

    @Override  // azxu
    public final boolean i() {
        return this.j instanceof azwr;
    }

    final void j() {
        this.a.lock();
        try {
            this.j = new azws(this);
            this.j.b();
            this.b.signalAll();
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // azxu
    public final boolean k(aied aied0) {
        return false;
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        this.a.lock();
        try {
            this.j.d(bundle0);
        }
        finally {
            this.a.unlock();
        }
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        this.a.lock();
        try {
            this.j.f(v);
        }
        finally {
            this.a.unlock();
        }
    }
}

