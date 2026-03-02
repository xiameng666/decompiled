import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public final class ares {
    private final aqql a;
    private final HashMap b;

    public ares() {
        this.a = new aqql(new String[]{"BaseCallbacksManager"});
        this.b = new HashMap();
    }

    public final void a(arer arer0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.b.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                Object object1 = ((Map.Entry)object0).getValue();
                try {
                    arer0.a(object1);
                }
                catch(RemoteException remoteException0) {
                    this.a.j("RemoteException caught; removing activity from callbacks manager: %s", new Object[]{remoteException0.getMessage()});
                    arrayList0.add(s);
                }
            }
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.b(((String)arrayList0.get(v2)));
            }
        }
    }

    public final void b(String s) {
        synchronized(this) {
            this.b.remove(s);
        }
    }

    public final void c() {
        this.a(new arfa());
    }

    public final void d() {
        this.a(new aret());
    }

    public final void e() {
        this.a(new arex());
    }

    public final void f() {
        this.a(new arff());
    }

    public final void g(boolean z) {
        this.a(new areu(z));
    }

    public final void h() {
        this.a(new arev());
    }

    public final void i() {
        this.a(new arfe());
    }

    public final void j() {
        this.a(new arfb());
    }

    public final void k(Object object0, String s) {
        synchronized(this) {
            this.b.put(s, object0);
        }
    }
}

