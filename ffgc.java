import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

final class ffgc implements fduj {
    final ffgm a;

    public ffgc(ffgm ffgm0) {
        Objects.requireNonNull(ffgm0);
        this.a = ffgm0;
        super();
    }

    private final void a(fdxn fdxn0, int v, boolean z, boolean z1) {
        int v1 = 3;
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "onPeerConnected: " + fdxn0.a);
        }
        NodeParcelable nodeParcelable0 = new NodeParcelable(fdxn0.a, fdxn0.b, v, z);
        ffga ffga0 = new ffga(this, new Intent("com.google.android.gms.wearable.NODE_CHANGED", fdzj.b(fdxn0.a, null)), nodeParcelable0, fdxn0);
        ffgm ffgm0 = this.a;
        if(!z1) {
            v1 = 4;
        }
        synchronized(ffgm0.B) {
            for(Object object1: ffgm0.p(v1)) {
                ffgm0.k(((fdpl)object1), ffga0, ffgm0.o(((fdpl)object1).b));
            }
        }
    }

    private final void b(fdxn fdxn0, boolean z) {
        int v = 3;
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "onPeerDisconnected: " + fdxn0.a);
        }
        NodeParcelable nodeParcelable0 = new NodeParcelable(fdxn0.a, fdxn0.b, 0x7FFFFFFF, false);
        ffgb ffgb0 = new ffgb(this, new Intent("com.google.android.gms.wearable.NODE_CHANGED", fdzj.b(fdxn0.a, null)), nodeParcelable0, fdxn0);
        ffgm ffgm0 = this.a;
        if(!z) {
            v = 4;
        }
        synchronized(ffgm0.B) {
            for(Object object1: ffgm0.p(v)) {
                ffgm0.k(((fdpl)object1), ffgb0, ffgm0.o(((fdpl)object1).b));
            }
        }
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        boolean z1;
        ArrayList arrayList0 = new ArrayList();
        TreeSet treeSet0 = new TreeSet(new fffr());
        for(Object object0: collection0) {
            fdyo fdyo0 = (fdyo)object0;
            fdxn fdxn0 = fdyo0.a;
            String s = fdxn0.a;
            if(!Objects.equals(s, "cloud")) {
                int v = fdyo0.b;
                boolean z = fdxu.v(fdxn0, v);
                NodeParcelable nodeParcelable0 = new NodeParcelable(s, fdxn0.b, v, z);
                arrayList0.add(nodeParcelable0);
                treeSet0.add(nodeParcelable0);
            }
        }
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "onConnectedNodes: " + Arrays.toString(arrayList0.toArray()));
        }
        ffgm ffgm0 = this.a;
        synchronized(ffgm0) {
            if(treeSet0.equals(ffgm0.A)) {
                if(Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", "onConnectedNodes: connected nodes hasn\'t changed, skipping notification. " + ffgm0.A);
                }
                return;
            }
            goto label_24;
        }
        return;
    label_24:
        ffgm0.A = treeSet0;
        fffz fffz0 = new fffz(this, new Intent("com.google.android.gms.wearable.NODE_CHANGED", fdzj.a), arrayList0);
        synchronized(ffgm0.B) {
            String s1 = hzzi.a.i().Z();
            if(!ffgm0.C.equals(s1)) {
                ffgm0.C = s1;
                ffgm0.D = new HashSet();
                Collections.addAll(ffgm0.D, TextUtils.split(s1, ","));
            }
            z1 = false;
            boolean z2 = false;
            for(Object object2: ffgm0.p(1)) {
                ffgm0.k(((fdpl)object2), fffz0, ffgm0.o(((fdpl)object2).b));
                ffft ffft0 = ffgm0.c(((fdpl)object2).b);
                if(ffft0 != null && !ffft0.b) {
                    z2 = true;
                }
            }
        }
        if(z2) {
            ffgm ffgm1 = this.a;
            synchronized(ffgm1.O) {
                fdyo fdyo1 = null;
                for(Object object4: collection0) {
                    fdyo fdyo2 = (fdyo)object4;
                    if(!ffgm1.y || !fdyo2.f) {
                        fdxn fdxn1 = fdyo2.a;
                        if(Objects.equals(fdxn1.a, "cloud")) {
                        }
                        else if(fdxn1.equals(ffgm1.Q)) {
                            z1 = true;
                        }
                        else {
                            if(fdyo1 != null && fdyo2.b >= fdyo1.b) {
                                continue;
                            }
                            fdyo1 = fdyo2;
                        }
                    }
                }
                fdxn fdxn2 = ffgm1.Q;
                if(fdxn2 != null && !z1) {
                    ffgm1.Q = null;
                    this.b(fdxn2, true);
                }
                if(ffgm1.Q == null && fdyo1 != null) {
                    ffgm1.Q = fdyo1.a;
                    this.a(fdyo1.a, 1, true, true);
                }
            }
        }
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
        if(Objects.equals(fdxn0.a, "cloud")) {
            return;
        }
        this.a(fdxn0, v, z, false);
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
        if(Objects.equals(fdxn0.a, "cloud")) {
            return;
        }
        this.b(fdxn0, false);
    }
}

