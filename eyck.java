import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import j..time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public abstract class eyck implements eyce {
    public final fgvt a;
    public final Object b;
    private final bboh c;
    private final ibnf d;
    private final fghr e;
    private final Context f;

    public eyck(bboh bboh0, fgvt fgvt0, ibnf ibnf0, fghr fghr0) {
        ibuq.f(fgvt0, "clock");
        super();
        this.c = bboh0;
        this.a = fgvt0;
        this.d = ibnf0;
        this.e = fghr0;
        this.f = AppContextProvider.a();
        this.b = new Object();
    }

    @Override  // eyce
    public final exjv a() {
        return new exjp(null);
    }

    @Override  // eyce
    public final Object b(List list0, eyfr eyfr0, Duration duration0, ibrl ibrl0) {
        return eyck.e(this, list0, eyfr0, ibrl0);
    }

    @Override  // eyce
    public final void c() {
    }

    protected abstract void d(List arg1, icbr arg2, eyfr arg3, eycg arg4);

    static Object e(eyck eyck0, List list0, eyfr eyfr0, ibrl ibrl0) {
        long v2;
        icbr icbr1;
        eycg eycg0;
        Object object5;
        eyci eyci0;
        Object object0 = eyck0;
        if((ibrl0 instanceof eyci)) {
            eyci0 = (eyci)ibrl0;
            int v = eyci0.f;
            if((v & 0x80000000) == 0) {
                eyci0 = new eyci(((eyck)object0), ibrl0);
            }
            else {
                eyci0.f = v - 0x80000000;
            }
        }
        else {
            eyci0 = new eyci(((eyck)object0), ibrl0);
        }
        Object object1 = eyci0.d;
        Object object2 = ibrx.a;
        switch(eyci0.f) {
            case 0: {
                ibnx.b(object1);
                BluetoothAdapter bluetoothAdapter0 = ((eyck)object0).f();
                if(bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled()) {
                    ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                    for(Object object3: list0) {
                        arrayList0.add(((exwv)object3).e);
                    }
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object4: arrayList0) {
                        if(((eyck)object0).f().getRemoteDevice(((String)object4)).isConnected()) {
                            arrayList1.add(object4);
                        }
                    }
                    if(arrayList1.isEmpty()) {
                        return eycd.b;
                    }
                    fggo fggo0 = ((fggp)object0.d).a();
                    fggo fggo1 = ((fggp)object0.d).a();
                    exwv exwv0 = (exwv)ibpo.R(list0);
                    ibuq.f(exwv0, "enrolledDevice");
                    homx homx0 = homx.a;
                    double f = eycf.b(exwv0, homx0.b().a());
                    fgfw fgfw0 = fgfy.a();
                    fgfw0.b(homc.b() - f);
                    fgfw0.c(((int)homc.e()));
                    fgfy fgfy0 = fgfw0.a();
                    bboh bboh0 = object0.c;
                    ggtj ggtj0 = (ggtj)bboh0.h();
                    double f1 = homc.c() - fgfy0.a;
                    ggtj0.E("Threshold distance for RSSI ranging %f, offset applied %f", fgfy0.a, f1);
                    object5 = ibpz.l(new ibns[]{new ibns(fggo0, fgfy0)});
                    if(homc.a.j().u()) {
                        ibuq.f(exwv0, "enrolledDevice");
                        double f2 = eycf.b(exwv0, homx0.b().b());
                        fgfw fgfw1 = fgfy.a();
                        fgfw1.b(homc.c() - f2);
                        fgfw1.d(1);
                        fgfw1.c(((int)homc.e()));
                        fgfy fgfy1 = fgfw1.a();
                        ggtj ggtj1 = (ggtj)bboh0.h();
                        double f3 = homc.c() - fgfy1.a;
                        ggtj1.E("Threshold distance for reduced RSSI ranging %f, offset applied %f", fgfy1.a, f3);
                        ibns ibns0 = new ibns(fggo1, fgfy1);
                        ((Map)object5).put(ibns0.a, ibns0.b);
                    }
                    long v1 = object0.a.a();
                    icbr icbr0 = new icbr();
                    eycg0 = new eycg(((eyck)object0), ((Map)object5).keySet(), icbr0);
                    ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
                    for(Object object6: arrayList1) {
                        arrayList2.add(Long.valueOf(eycf.a(((String)object6))));
                    }
                    ggfp ggfp0 = ggdx.d(arrayList2);
                    for(Object object7: ((Map)object5).entrySet()) {
                        ((fgfu)((Map.Entry)object7).getKey()).c(ggfp0, ((fgfy)((Map.Entry)object7).getValue()), new eych(icbr0));
                    }
                    ((eyck)object0).d(arrayList1, icbr0, eyfr0, eycg0);
                    Duration duration0 = glyb.d(homc.f());
                    eycj eycj0 = new eycj(icbr0, null);
                    eyci0.a = object0;
                    eyci0.b = object5;
                    eyci0.h = icbr0;
                    eyci0.g = eycg0;
                    eyci0.c = v1;
                    eyci0.f = 1;
                    Object object8 = glya.c(duration0, eycj0, eyci0);
                    if(object8 != object2) {
                        icbr1 = icbr0;
                        object1 = object8;
                        v2 = v1;
                        break;
                    }
                    return object2;
                }
                ((ggtj)object0.c.j()).x("Bluetooth not enabled, ranging won\'t work");
                return eycd.b;
            }
            case 1: {
                v2 = eyci0.c;
                eycg eycg1 = eyci0.g;
                icbr1 = eyci0.h;
                Object object9 = eyci0.b;
                Object object10 = eyci0.a;
                ibnx.b(object1);
                object5 = object9;
                eycg0 = eycg1;
                object0 = object10;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object11 = (eycd)object1;
        if(object11 == null) {
            object11 = eycg0.b <= 0 ? eycd.d : eycd.b;
        }
        if(!icbr1.oM()) {
            iceb.a(icbr1);
        }
        synchronized(((eyck)object0).b) {
            for(Object object13: ((Map)object5).entrySet()) {
                ((fgfu)((Map.Entry)object13).getKey()).b();
            }
        }
        long v4 = ((eyck)object0).a.a() - v2;
        ((eyck)object0).e.b("scan duration: " + v4 + "ms");
        return object11;
    }

    private final BluetoothAdapter f() {
        return ((BluetoothManager)this.f.getSystemService(BluetoothManager.class)).getAdapter();
    }
}

