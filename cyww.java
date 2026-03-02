import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothLeAudio;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.nearby.fastpair.tempbond.TempBondManager.bondStateChangeReceiver.1;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class cyww implements cyga, gxxt {
    public final Context a;
    public final gxxu b;
    public final kar c;
    public final bbng d;
    public final icnj e;
    public final cxya f;
    public final ScheduledExecutorService g;
    public iced h;
    public boolean i;
    public final bsaq j;
    public final cywc k;
    public final HashMap l;
    public final HashMap m;
    public final BroadcastReceiver n;
    public final icmq o;
    private boolean p;
    private final cyws q;
    private final icmn r;

    public cyww(Context context0, gxxu gxxu0, kar kar0, bbng bbng0, AudioManager audioManager0, icnj icnj0, cxya cxya0, ScheduledExecutorService scheduledExecutorService0) {
        ibuq.f(audioManager0, "audioManager");
        ibuq.f(icnj0, "broadcastStateFlow");
        super();
        this.a = context0;
        this.b = gxxu0;
        this.c = kar0;
        this.d = bbng0;
        this.e = icnj0;
        this.f = cxya0;
        this.g = scheduledExecutorService0;
        this.j = cumz.e(context0, "TempBondManager");
        cyws cyws0 = new cyws(this);
        this.q = cyws0;
        this.k = new cywc(audioManager0, cyws0, scheduledExecutorService0);
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = new TempBondManager.bondStateChangeReceiver.1(this);
        icmn icmn0 = cygu.b();
        this.r = icmn0;
        this.o = new icmo(icmn0);
    }

    @Override  // gxxt
    public final void a(int v, int v1, int v2, BluetoothDevice bluetoothDevice0) {
        Integer integer0 = (int)22;
        switch(v) {
            case 22: {
                break;
            }
            case 29: {
                v = 29;
                break;
            }
            default: {
                return;
            }
        }
        switch(v2) {
            case 0: {
                v2 = 0;
                break;
            }
            case 2: {
                break;
            }
            default: {
                return;
            }
        }
        for(Object object0: this.l.entrySet()) {
            if(((cywo)((Map.Entry)object0).getValue()).a.contains(bluetoothDevice0)) {
                cywe cywe0 = () -> {
                    gynl gynl0;
                    if(ibuq.m(this.e.b(), Boolean.valueOf(false))) {
                        Iterator iterator0 = new HashSet(this.l.values()).iterator();
                        ibuq.e(iterator0, "iterator(...)");
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            ibuq.e(object0, "next(...)");
                            cywo cywo0 = (cywo)object0;
                            if(cywo0.c == cywp.a) {
                                cywo0.d(cywq.c);
                            }
                        }
                        return;
                    }
                    boolean z = this.k.c;
                    List list0 = this.b.h(22);
                    List list1 = this.b.h(29);
                    for(Object object1: this.l.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(((cywo)map$Entry0.getValue()).c == cywp.a) {
                            boolean z1 = cywk.a(list0, ((cywo)map$Entry0.getValue()).a);
                            boolean z2 = cywk.a(list1, ((cywo)map$Entry0.getValue()).a);
                            cust cust0 = cyjh.a;
                            cust0.d().Z("%s: updateTempBondStatus for %s, isMediaActive=%b, isLeaConnected=%b, isLeaBroadcastAssistantConnected=%b", "TempBondManager", ((cywo)map$Entry0.getValue()).a(), Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2));
                            if(z) {
                                gynl0 = !z1 || !z2 ? gynl.e : null;
                            }
                            else {
                                gynl0 = gynl.f;
                            }
                            cywo cywo1 = (cywo)map$Entry0.getValue();
                            boolean z3 = z && z1 && z2;
                            Long long0 = cywo1.d;
                            if(long0 != null && z3) {
                                cust0.d().R("%s: Device group %s is active now", "TempBondManager", cywo1.a());
                                cywo1.d = null;
                                Iterator iterator2 = cywo1.a.iterator();
                                ibuq.e(iterator2, "iterator(...)");
                                while(iterator2.hasNext()) {
                                    Object object2 = iterator2.next();
                                    ibuq.e(object2, "next(...)");
                                    cywk.b(((BluetoothDevice)object2), null);
                                }
                                cywo1.b();
                            }
                            else if(long0 == null && !z3) {
                                cust0.d().R("%s: Device group %s is not active now, schedule to unpair", "TempBondManager", cywo1.a());
                                long v = TimeUnit.SECONDS.toMillis(hvpg.a.aY().en());
                                cywo1.d = (long)(cywo1.g.d.b() + v);
                                Iterator iterator3 = cywo1.a.iterator();
                                ibuq.e(iterator3, "iterator(...)");
                                while(iterator3.hasNext()) {
                                    Object object3 = iterator3.next();
                                    ibuq.e(object3, "next(...)");
                                    cywk.b(((BluetoothDevice)object3), String.valueOf(cywo1.d));
                                }
                                cywo1.c();
                            }
                            cywo1.f = gynl0;
                        }
                    }
                };
                this.g.execute(cywe0);
                return;
            }
        }
        if(v2 == 2 && ibuq.m(this.e.b(), Boolean.valueOf(true)) && v == 22) {
            HashMap hashMap0 = this.m;
            long v3 = this.d.b();
            Long long0 = (Long)hashMap0.get(bluetoothDevice0);
            if(long0 != null) {
                long v4 = v3 - ((long)long0);
                hashMap0.remove(bluetoothDevice0);
                if(v4 <= hvpg.a.aY().eJ()) {
                    cyjh.a.d().X("%s: %s profile %d connected after bond, set as temp bond for audio sharing", "TempBondManager", cywk.c(bluetoothDevice0), integer0);
                    this.j(bluetoothDevice0, false);
                    return;
                }
                cyjh.a.d().Y("%s: %s profile %d connected after bond but timeout, latencyMs=%d", "TempBondManager", cywk.c(bluetoothDevice0), integer0, Long.valueOf(v4));
            }
        }
    }

    @Override  // gxxt
    public final void b(BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void c(BluetoothDevice bluetoothDevice0, int v) {
    }

    @Override  // gxxt
    public final void d(int v, BluetoothProfile bluetoothProfile0) {
        if(v != 22) {
            return;
        }
        cywd cywd0 = new cywd(this, bluetoothProfile0);
        this.g.execute(cywd0);
    }

    @Override  // cyga
    public final void f() {
        cywh cywh0 = new cywh(this);
        this.g.execute(cywh0);
    }

    @Override  // cyga
    public final void g(PrintWriter printWriter0) {
        ibuq.f(printWriter0, "writer");
        printWriter0.println();
        printWriter0.println("TempBondManager");
        HashMap hashMap0 = new HashMap(this.l);
        printWriter0.printf("  Temp bond device count: %d\n", new Object[]{hashMap0.size()});
        for(Object object0: hashMap0.values()) {
            ibuq.e(object0, "next(...)");
            printWriter0.printf("    " + ((cywo)object0) + "\n", new Object[0]);
        }
        this.f.a(printWriter0);
    }

    @Override  // cyga
    public final void h() {
        cywi cywi0 = new cywi(this);
        this.g.execute(cywi0);
    }

    public final cyck i() {
        BluetoothProfile bluetoothProfile0 = this.b.d(22);
        cyck cyck0 = bluetoothProfile0 == null ? null : new cyck(((BluetoothLeAudio)bluetoothProfile0));
        if(cyck0 == null) {
            cyjh.a.g().B("%s: Failed to BluetoothLeAudioWrapper because no profile proxy", "TempBondManager");
            return null;
        }
        return cyck0;
    }

    public final void j(BluetoothDevice bluetoothDevice0, boolean z) {
        ibuq.f(bluetoothDevice0, "device");
        cywg cywg0 = new cywg(bluetoothDevice0, this, z);
        this.g.execute(cywg0);
    }

    @Override  // gxxt
    public final void jl() {
    }

    public final void k(cyck cyck0) {
        cywo cywo2;
        HashMap hashMap1;
        Set set0;
        if(this.p) {
            return;
        }
        this.l.clear();
        bsaq bsaq0 = this.j;
        if(bsaq0 != null) {
            try {
                set0 = bsaq0.m();
            }
            catch(SecurityException securityException0) {
                ((ggtj)cyjh.a.d().s(securityException0)).B("%s: Can\'t get bonded devices", "TempBondManager");
                set0 = null;
            }
            if(set0 != null && !set0.isEmpty()) {
                for(Object object0: set0) {
                    BluetoothDevice bluetoothDevice0 = (BluetoothDevice)object0;
                    Integer integer0 = cyww.n(bluetoothDevice0, cyck0);
                    if(integer0 != null) {
                        int v = (int)integer0;
                        cust cust0 = cyjh.a;
                        cust0.d().X("%s: updateCachedTempBondDevices, %s group ID=%d", "TempBondManager", cywk.c(bluetoothDevice0), integer0);
                        HashMap hashMap0 = this.l;
                        cywo cywo0 = (cywo)hashMap0.get(integer0);
                        if(cywo0 == null) {
                            ibuq.f(bluetoothDevice0, "device");
                            cywp cywp0 = ibuq.m(cyan.a(bluetoothDevice0, "TEMP_BOND_TYPE"), cywp.a.b) ? cywp.a : null;
                            if(cywp0 == null) {
                                hashMap1 = hashMap0;
                            }
                            else {
                                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                                linkedHashSet0.add(bluetoothDevice0);
                                String s = cyan.a(bluetoothDevice0, "TEMP_BOND_TIMEOUT");
                                hashMap1 = hashMap0;
                                cywo cywo1 = new cywo(this, linkedHashSet0, v, cywp0, (s == null ? null : Long.parseLong(s)), false, null, 0x30);
                                if(cywo1.e) {
                                    cust0.d().R("%s: Device %s was unpaired while TempBondDevice initializing, ignored", "TempBondManager", cywk.c(bluetoothDevice0));
                                }
                                else {
                                    cywo2 = cywo1;
                                    goto label_40;
                                }
                            }
                            cywo2 = null;
                        label_40:
                            if(cywo2 == null) {
                                continue;
                            }
                            hashMap1.put(integer0, cywo2);
                        }
                        else {
                            cywo0.a.add(bluetoothDevice0);
                        }
                    }
                }
                this.m();
                this.l();
                this.p = true;
                return;
            }
            this.l();
            return;
        }
        cyjh.a.g().B("%s: Can\'t get BluetoothAdapter!", "TempBondManager");
    }

    public final void l() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.l.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Integer integer0 = ((cywo)map$Entry0.getValue()).c == cywp.a ? ((int)((cywo)map$Entry0.getValue()).b) : null;
            if(integer0 != null) {
                arrayList0.add(integer0);
            }
        }
        cyjh.a.d().R("%s: updateTempBondForAudioSharingState, current list=%s", "TempBondManager", arrayList0);
        icmn icmn0 = this.r;
        ibuq.f(icmn0, "<this>");
        if(!ibuq.m(arrayList0, ibpo.X(icmn0.c()))) {
            icmn0.f(arrayList0);
        }
    }

    // Detected as a lambda impl.
    public final void m() {
        gynl gynl0;
        if(ibuq.m(this.e.b(), Boolean.valueOf(false))) {
            Iterator iterator0 = new HashSet(this.l.values()).iterator();
            ibuq.e(iterator0, "iterator(...)");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ibuq.e(object0, "next(...)");
                cywo cywo0 = (cywo)object0;
                if(cywo0.c == cywp.a) {
                    cywo0.d(cywq.c);
                }
            }
            return;
        }
        boolean z = this.k.c;
        List list0 = this.b.h(22);
        List list1 = this.b.h(29);
        for(Object object1: this.l.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(((cywo)map$Entry0.getValue()).c == cywp.a) {
                boolean z1 = cywk.a(list0, ((cywo)map$Entry0.getValue()).a);
                boolean z2 = cywk.a(list1, ((cywo)map$Entry0.getValue()).a);
                cust cust0 = cyjh.a;
                cust0.d().Z("%s: updateTempBondStatus for %s, isMediaActive=%b, isLeaConnected=%b, isLeaBroadcastAssistantConnected=%b", "TempBondManager", ((cywo)map$Entry0.getValue()).a(), Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2));
                if(z) {
                    gynl0 = !z1 || !z2 ? gynl.e : null;
                }
                else {
                    gynl0 = gynl.f;
                }
                cywo cywo1 = (cywo)map$Entry0.getValue();
                boolean z3 = z && z1 && z2;
                Long long0 = cywo1.d;
                if(long0 != null && z3) {
                    cust0.d().R("%s: Device group %s is active now", "TempBondManager", cywo1.a());
                    cywo1.d = null;
                    Iterator iterator2 = cywo1.a.iterator();
                    ibuq.e(iterator2, "iterator(...)");
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        ibuq.e(object2, "next(...)");
                        cywk.b(((BluetoothDevice)object2), null);
                    }
                    cywo1.b();
                }
                else if(long0 == null && !z3) {
                    cust0.d().R("%s: Device group %s is not active now, schedule to unpair", "TempBondManager", cywo1.a());
                    long v = TimeUnit.SECONDS.toMillis(hvpg.a.aY().en());
                    cywo1.d = (long)(cywo1.g.d.b() + v);
                    Iterator iterator3 = cywo1.a.iterator();
                    ibuq.e(iterator3, "iterator(...)");
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        ibuq.e(object3, "next(...)");
                        cywk.b(((BluetoothDevice)object3), String.valueOf(cywo1.d));
                    }
                    cywo1.c();
                }
                cywo1.f = gynl0;
            }
        }
    }

    public static final Integer n(BluetoothDevice bluetoothDevice0, cyck cyck0) {
        Object object0;
        try {
            object0 = cyck0.a(bluetoothDevice0);
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            ((ggtj)cyjh.a.g().s(throwable1)).R("%s: Meet exception to get group ID for %s!", "TempBondManager", cywk.c(bluetoothDevice0));
            object0 = null;
        }
        return (Integer)object0;
    }
}

