import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jeb.synthetic.FIN;

public final class czrv {
    private static boolean a;
    private static czrv b;

    static cjpc a(Context context0) {
        return cjqh.a(context0, "nearby", "nearbymediums:bluetoothclassic", 0);
    }

    public static czrv b() {
        synchronized(czrv.class) {
            if(czrv.b == null) {
                czrv.b = new czrv();
            }
        }
        return czrv.b;
    }

    public static String c(Context context0) {
        return cjpd.c(czrv.a(context0), "original_device_name", null);
    }

    public static List d(Context context0) {
        if(hvol.A()) {
            String s = cjpd.c(czrv.a(context0), "modified_device_name", "");
            return s.isEmpty() ? Arrays.asList(new String[0]) : Arrays.asList(s.split(","));
        }
        return Arrays.asList(cjpd.c(czrv.a(context0), "modified_device_name", "").split(","));
    }

    public final void e(Context context0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(czrv.a) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        bsaq bsaq0 = cumz.e(context0, "BluetoothDeviceName");
        if(bsaq0 != null) {
            this.f(context0, bsaq0);
            this.g(context0, bsaq0, "auto_restore_bt_device_name");
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException(String.format("BluetoothAdapter not ready yet!"));
    }

    public final void f(Context context0, bsaq bsaq0) {
        synchronized(this) {
            if(!czrv.d(context0).contains(bsaq0.l())) {
                czkq.a.b().p("BluetoothAdapter\'s name was not set by Nearby Connections, ignoring call to restore default scan mode.", new Object[0]);
                return;
            }
            int v1 = bsaq0.b();
            if(bsaq0.v() && v1 != 21) {
                if(!czrv.j(bsaq0, 21)) {
                    czkq.a.e().p("Failed to restore scan mode to CONNECTABLE.", new Object[0]);
                    return;
                }
            }
            else if(!bsaq0.v() && v1 != 20 && !czrv.j(bsaq0, 20)) {
                czkq.a.e().p("Failed to restore scan mode to NONE.", new Object[0]);
                return;
            }
            czkq.a.b().p("Scan mode successfully restored.", new Object[0]);
        }
    }

    public final void g(Context context0, bsaq bsaq0, String s) {
        synchronized(this) {
            czrv.a = false;
            if(hvol.A()) {
                List list0 = czrv.d(context0);
                if(list0.isEmpty() || !list0.contains(bsaq0.l())) {
                    czkq.a.b().p("BluetoothAdapter\'s name was not set by Nearby Connections, ignoring call to restore device name", new Object[0]);
                    return;
                }
            }
            else if(!czrv.d(context0).contains(bsaq0.l())) {
                czkq.a.b().p("BluetoothAdapter\'s name was not set by Nearby Connections, ignoring call to restore device name", new Object[0]);
                return;
            }
            String s1 = czrv.c(context0);
            if(s1 != null) {
                if(!bsaq0.y(s1)) {
                    goto label_28;
                }
                cunf cunf0 = czkq.a;
                cunf0.b().h("Restored bluetooth device name to persisted original device name: %s ", s1);
                if(hvol.A()) {
                    cunf0.b().p("Clearing device name change cache.", new Object[0]);
                    cjpa cjpa0 = czrv.a(context0).c();
                    cjpa0.j("modified_device_name");
                    if(!cjpd.g(cjpa0)) {
                        cunf0.e().p("Failed to clear device name change cache.", new Object[0]);
                        return;
                    label_28:
                        czke.l(s, 3, gymv.b, gymd.cn, String.format("Original Bluetooth Device Name : %s", s1));
                    }
                }
            }
        }
    }

    public final void h(Context context0) {
        synchronized(this) {
            if(czrv.d(context0).isEmpty()) {
                return;
            }
            new bbln(9, new czru(this, context0)).start();
        }
    }

    public final boolean i(Context context0, bsaq bsaq0, String s, String s1) {
        synchronized(this) {
            czrv.a = false;
            String s2 = bsaq0.l();
            if(czrv.d(context0).contains(s2)) {
                czkq.a.e().p("Detected a failure to restore the original Bluetooth device name", new Object[0]);
                s2 = czrv.c(context0);
            }
            ArrayList arrayList0 = new ArrayList(czrv.d(context0));
            while(arrayList0.size() >= 5) {
                arrayList0.remove(0);
            }
            arrayList0.add(s);
            cjpa cjpa0 = czrv.a(context0).c();
            cjpa0.h("original_device_name", s2);
            cjpa0.h("modified_device_name", TextUtils.join(",", arrayList0));
            if(cjpd.g(cjpa0)) {
                if(!bsaq0.y(s)) {
                    czke.C(s1, gymp.i);
                    return false;
                }
                czrv.a = true;
                return true;
            }
            czke.C(s1, gymp.j);
        }
        return false;
    }

    static boolean j(bsaq bsaq0, int v) {
        try {
            if(bbqa.c()) {
                Object object0 = new cuni(bsaq0.b).a("setScanMode", new Class[]{Integer.TYPE}).a(new Object[]{v});
                if(object0 != null) {
                    return ((int)(((Integer)object0))) == 0;
                }
                throw new cunj(new IllegalArgumentException("Failed to call setScanMode"));
            }
            Object object1 = new cuni(bsaq0.b).a("setScanMode", new Class[]{Integer.TYPE}).a(new Object[]{v});
            if(object1 != null) {
                return ((Boolean)object1).booleanValue();
            }
            throw new cunj(new IllegalArgumentException("Failed to call setScanMode"));
        }
        catch(cunj unused_ex) {
            return false;
        }
    }
}

