import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.Handler;
import android.os.ParcelUuid;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

public final class akvf {
    public static final baun a;
    static final ParcelUuid b;
    public final akul c;
    public final Set d;
    public final List e;
    public final List f;
    public final Map g;
    public final Map h;
    public final List i;
    public final Handler j;
    public final akzh k;
    public final aliu l;
    public final Executor m;
    public akve n;
    public akvd o;
    public byte[] p;
    public Map q;
    private final akvs r;
    private final BluetoothAdapter s;
    private final akwm t;
    private final akxd u;
    private boolean v;
    private boolean w;

    static {
        akvf.a = new baun("ProximityAuth", new String[]{"BleForegroundAdvertiser"});
        akvf.b = new ParcelUuid(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb"));
    }

    public akvf() {
        akvs akvs0 = akvs.a();
        BluetoothAdapter bluetoothAdapter0 = bahu.a(AppContextProvider.a());
        akwm akwm0 = new akwm();
        clht clht0 = new clht();
        akwq akwq0 = new akwq();
        akzh akzh0 = null;
        akzh akzh1 = akzh.b == null ? null : ((akzh)akzh.b.get());
        if(akzh1 == null) {
            synchronized(akzh.class) {
                WeakReference weakReference0 = akzh.b;
                if(weakReference0 != null) {
                    akzh0 = (akzh)weakReference0.get();
                }
                if(akzh0 == null) {
                    akzh0 = new akzh();
                    akzh.b = new WeakReference(akzh0);
                }
            }
            akzh1 = akzh0;
        }
        akul akul0 = new akul();
        bblp bblp0 = new bblp(1, 10);
        super();
        this.r = akvs0;
        this.s = bluetoothAdapter0;
        this.t = akwm0;
        this.j = clht0;
        this.u = akwq0;
        this.k = akzh1;
        this.l = new aliu();
        this.c = akul0;
        this.f = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.i = new ArrayList();
        this.g = new bxd();
        this.h = new HashMap();
        this.v = false;
        this.w = false;
        this.m = bblp0;
    }

    final void a(RemoteDevice remoteDevice0) {
        akuy akuy0 = new akuy(this, remoteDevice0);
        this.j.post(akuy0);
    }

    public final void b() {
        akve akve0 = this.n;
        if(akve0 != null) {
            akve0.c();
        }
    }

    public final void c(String s) {
        Map map0 = this.g;
        if(map0.containsKey(s)) {
            ((akva)map0.remove(s)).a = true;
        }
    }

    public final void d() {
        akwj akwj3;
        akwj akwj0;
        List list3;
        akva akva2;
        aliu aliu2;
        if(!this.v) {
            Map map0 = this.q;
            if(map0 != null) {
                byte[] arr_b = this.p;
                if(arr_b != null) {
                    Set set0 = this.d;
                    if(!set0.isEmpty()) {
                        for(Object object0: set0) {
                            String s = (String)object0;
                            if(this.i.contains(s)) {
                                continue;
                            }
                            akul akul0 = this.c;
                            if(s != null) {
                                List list0 = akul0.b;
                                Object object1 = null;
                                for(Object object2: list0) {
                                    RemoteDevice remoteDevice0 = (RemoteDevice)object2;
                                    if(!s.equals(remoteDevice0.b)) {
                                        continue;
                                    }
                                    object1 = remoteDevice0;
                                }
                                if(list0.remove(object1)) {
                                    list0.add(object1);
                                }
                            }
                            if(!this.g.containsKey(s)) {
                                continue;
                            }
                            akvs akvs0 = this.r;
                            Object object3 = akvs0.a.c;
                            __monitor_enter(object3);
                            int v = FIN.finallyOpen$NT();
                            akzm akzm0 = (akzm)akvs0.a.b.get(s);
                            if(akzm0 == null) {
                                akzn.a.m("Failed to mark device ID %s for connection failure: not found", new Object[]{akwe.a(s)});
                                FIN.finallyExec$NT(v);
                            }
                            else {
                                akzu akzu0 = (akzu)akzm0.d.get(1);
                                if(akzu0 != null && akzu0.b() != 0) {
                                    akzn.a.m("Failed to mark device ID %s for connection failure: currently connected", new Object[]{akwe.a(s)});
                                    akzm0.e.put(1, false);
                                    FIN.finallyExec$NT(v);
                                }
                                else {
                                    boolean z = akzm0.e.get(1);
                                    akzm0.e.put(1, false);
                                    FIN.finallyCodeBegin$NT(v);
                                    if(z) {
                                        akvs0.e(s, 1, 4, 0);
                                    }
                                }
                            }
                            this.c(s);
                        }
                        this.d.clear();
                    }
                    ArrayList arrayList0 = new ArrayList();
                    StringBuilder stringBuilder0 = new StringBuilder("Should advertise to the following device IDs: [");
                    for(Object object4: this.c.b) {
                        arrayList0.add(((RemoteDevice)object4));
                        stringBuilder0.append(((RemoteDevice)object4).b());
                        stringBuilder0.append(',');
                        if(arrayList0.size() == 2) {
                            break;
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        akul.a.d("No devices to which to advertise.", new Object[0]);
                    }
                    else {
                        stringBuilder0.replace(stringBuilder0.length() - 1, stringBuilder0.length(), "]");
                        akul.a.d(stringBuilder0.toString(), new Object[0]);
                    }
                    batl.l(arrayList0.size() <= 2);
                    List list1 = this.f;
                    Iterator iterator3 = list1.iterator();
                    while(iterator3.hasNext()) {
                        Object object5 = iterator3.next();
                        akvb akvb0 = (akvb)object5;
                        if(arrayList0.contains(akvb0.a) && System.currentTimeMillis() <= akvb0.c) {
                            continue;
                        }
                        batl.b(akvb0 != null);
                        this.c(akvb0.a.b);
                        this.h.remove(akvb0.a.b);
                        if(list1.contains(akvb0)) {
                            BluetoothLeAdvertiser bluetoothLeAdvertiser0 = this.k();
                            if(bluetoothLeAdvertiser0 == null) {
                                akvf.a.m("BLE advertising is not enabled; cannot stop advertising.", new Object[0]);
                            }
                            else {
                                bluetoothLeAdvertiser0.stopAdvertising(akvb0.b);
                            }
                        }
                        iterator3.remove();
                    }
                    Iterator iterator4 = arrayList0.iterator();
                label_84:
                    while(iterator4.hasNext()) {
                        Object object6 = iterator4.next();
                        RemoteDevice remoteDevice1 = (RemoteDevice)object6;
                        String s1 = remoteDevice1.b;
                        for(Object object7: list1) {
                            if(s1.equals(((akvb)object7).a.b)) {
                                Map map1 = this.g;
                                if(map1.containsKey(s1)) {
                                    continue label_84;
                                }
                                akva akva0 = new akva(remoteDevice1, this);
                                map1.put(s1, akva0);
                                this.r.g(s1);
                                long v1 = hpyn.c();
                                this.j.postDelayed(akva0, v1);
                                continue label_84;
                            }
                            else {
                                continue;
                            }
                            break;
                        }
                        List list2 = (List)map0.get(s1);
                        aliu aliu0 = new aliu();
                        Map map2 = this.g;
                        if(map2.containsKey(s1)) {
                            akvf.a.m("Tried to advertise to a device already advertising.", new Object[0]);
                            aliu0.S(1);
                        }
                        else {
                            akva akva1 = new akva(remoteDevice1, this);
                            map2.put(s1, akva1);
                            this.r.g(s1);
                            if(this.g()) {
                                aliu aliu1 = new aliu();
                                if(list2 == null) {
                                    akwm.a.m("Tried to advertise with null beacon seeds.", new Object[0]);
                                    aliu1.x(1);
                                    aliu2 = aliu0;
                                    akva2 = akva1;
                                    list3 = list1;
                                    akwj0 = null;
                                }
                                else {
                                    akwl akwl0 = akwm.a(list2, hpyn.a.d().c());
                                    if(akwl0 == null) {
                                        aliu1.x(2);
                                        aliu2 = aliu0;
                                        akva2 = akva1;
                                        list3 = list1;
                                        akwj0 = null;
                                    }
                                    else {
                                        aliu aliu3 = new aliu();
                                        list3 = list1;
                                        akva2 = akva1;
                                        long v2 = akwl0.b;
                                        aliu2 = aliu0;
                                        long v3 = akwl0.a;
                                        akwj akwj1 = akwm.b(list2, v3, v2, arr_b);
                                        akwj akwj2 = akwm.c(list2, v3, v2);
                                        if(akwj1 != null && akwj2 != null) {
                                            aliu3.v(0);
                                            akwj3 = new akwj(ByteBuffer.allocate(4).put(akwj2.a).put(akwj1.a).array(), v3, v2);
                                        }
                                        else {
                                            if(akwj1 == null) {
                                                aliu3.v(1);
                                            }
                                            else {
                                                aliu3.v(2);
                                            }
                                            akwj3 = null;
                                        }
                                        if(akwj3 == null) {
                                            aliu1.x(3);
                                            akwj0 = null;
                                        }
                                        else {
                                            aliu1.x(0);
                                            akwj0 = akwj3;
                                        }
                                    }
                                }
                                if(akwj0 == null) {
                                    akvf.a.m("No EID seeds for device %s", new Object[]{remoteDevice1.b()});
                                    aliu2.S(4);
                                    this.j.post(akva2);
                                }
                                else {
                                    akuz akuz0 = new akuz(remoteDevice1, this);
                                    aliu2.S(0);
                                    this.k().startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(2).setConnectable(true).setTxPowerLevel(3).build(), new AdvertiseData.Builder().addServiceUuid(akvf.b).addServiceData(akvf.b, akwj0.a).build(), akuz0);
                                    list3.add(new akvb(remoteDevice1, akuz0, akwj0.c));
                                    long v4 = hpyn.c();
                                    this.j.postDelayed(akva2, v4);
                                }
                                list1 = list3;
                            }
                            else {
                                akvf.a.m("BLE advertising is not enabled; cannot start advertising.", new Object[0]);
                                aliu0.S(3);
                                this.j.post(akva1);
                            }
                        }
                    }
                    this.q = null;
                }
            }
        }
    }

    public final void e() {
        if(this.e.isEmpty()) {
            if(this.p == null && !this.v) {
                this.v = true;
                akuw akuw0 = new akuw(this, this.j);
                this.u.a(akuw0);
            }
            else {
                this.d();
            }
            if(!this.w) {
                this.w = true;
                akzh akzh0 = this.k;
                akux akux0 = new akux(this, this.j);
                Object object0 = akzh0.e;
                synchronized(object0) {
                    akzh0.d.add(akux0);
                    if(!akzh0.g) {
                        if(akzh0.h) {
                            akzh0.g = true;
                            akzd akzd0 = new akzd();
                            gmbu.t(akzh0.c.e(akzd0), new akze(akzh0), gmap.a);
                        }
                        else {
                            akzh0.a(akzh0.f);
                        }
                    }
                }
            }
        }
    }

    public final void f(List list0) {
        akut akut0 = new akut(this, list0);
        this.j.post(akut0);
    }

    public final boolean g() {
        return this.k() != null;
    }

    public final boolean h() {
        return this.c.b.size() != 0;
    }

    static void i(akvf akvf0) {
        akvf0.w = false;
    }

    static void j(akvf akvf0) {
        akvf0.v = false;
    }

    private final BluetoothLeAdvertiser k() {
        return this.s == null ? null : this.s.getBluetoothLeAdvertiser();
    }
}

