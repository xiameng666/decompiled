import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class gpql implements Callable {
    public static final int a;
    private static final List b;
    private final WeakReference c;
    private final String[] d;
    private final List e;
    private final boolean f;
    private final List g;
    private final gpsv h;
    private final boolean i;
    private final byte[] j;
    private final List k;
    private final gprk l;

    static {
        gpql.b = new ArrayList();
    }

    public gpql(gpso gpso0, String s, Collection collection0, gprk gprk0, boolean z, boolean z1, Collection collection1, gpsv gpsv0, Collection collection2) {
        this.j = new byte[1500];
        this.c = new WeakReference(gpso0);
        this.d = TextUtils.split(s, "\\.");
        this.e = new ArrayList(collection0);
        this.l = gprk0;
        this.i = z;
        this.f = z1;
        this.g = new ArrayList(collection1);
        this.h = gpsv0;
        this.k = new ArrayList(collection2);
    }

    public final gpse a() {
        try {
            gpso gpso0 = (gpso)this.c.get();
            if(gpso0 == null) {
                return gpse.a(this.l);
            }
            ArrayList arrayList0 = new ArrayList();
            gprk gprk0 = this.l;
            boolean z = gprk0.a.a;
            int v = gprk0.a.b % 0xFFFF + 1;
            ArrayList arrayList1 = new ArrayList();
            boolean z1 = this.f;
            if(z1) {
                String[] arr_s = this.d;
                arrayList0.add(new gprj(arr_s, z));
                for(Object object0: this.e) {
                    Class class0 = String.class;
                    Object[][] arr2_object = {new String[]{a.v(((String)object0), "_"), "_sub"}, arr_s};
                    int v1 = 0;
                    for(int v2 = 0; v2 < 2; ++v2) {
                        v1 += arr2_object[v2].length;
                    }
                    Object[] arr_object = (Object[])Array.newInstance(class0, v1);
                    int v3 = 0;
                    int v4 = 0;
                    while(v4 < 2) {
                        Object[] arr_object1 = arr2_object[v4];
                        System.arraycopy(arr_object1, 0, arr_object, v3, arr_object1.length);
                        v3 += arr_object1.length;
                        ++v4;
                        v = v;
                    }
                    arrayList0.add(new gprj(((String[])arr_object), z));
                    v = v;
                }
            }
            long v5 = SystemClock.elapsedRealtime();
            for(Object object1: this.g) {
                gprn gprn0 = (gprn)object1;
                String[] arr_s1 = gprn0.d;
                if(arr_s1 != null) {
                    boolean z2 = !gprn0.r() || gptc.b(gprn0.c(), v5);
                    boolean z3 = !gprn0.q() || gptc.b(gprn0.b(), v5);
                    int v6 = arrayList0.size();
                    if(z3) {
                        if(!z2) {
                            goto label_51;
                        }
                        goto label_59;
                    }
                    else if(z2) {
                        arrayList0.add(new gpsp(arr_s1, z));
                    }
                label_51:
                    if(z3) {
                        arrayList0.add(new gpsa(arr_s1, z));
                    }
                    else if(!gprn0.o() && !gprn0.p()) {
                        String[] arr_s2 = gprn0.b().b;
                        arrayList0.add(new gpra(arr_s2, 1, z));
                        arrayList0.add(new gpra(arr_s2, 28, z));
                        goto label_60;
                    label_59:
                        arrayList0.add(new gpqq(arr_s1, z));
                    }
                label_60:
                    if(arrayList0.size() > v6) {
                        arrayList1.add(gprn0);
                    }
                }
            }
            if(arrayList0.size() == 0) {
                return gpse.a(gprk0);
            }
            ArrayList arrayList2 = new ArrayList();
            if(!z1) {
                goto label_69;
            }
            Iterator iterator2 = this.k.iterator();
            while(true) {
            label_68:
                if(!iterator2.hasNext()) {
                label_69:
                    gprf gprf0 = new gprf(v, 0, arrayList0, arrayList2, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
                    this.c(gpso0, 5353, gprf0);
                    for(Object object2: gpql.b) {
                        this.c(gpso0, ((Integer)object2).intValue(), gprf0);
                    }
                    return new gpse(v, this.e, gprk0, arrayList1);
                }
                Object object3 = iterator2.next();
                for(Object object4: ((gprn)object3).g()) {
                    gprj gprj0 = (gprj)object4;
                    if(gppz.b(arrayList0, new gpqk(gprj0))) {
                        arrayList2.add(new gprj(gprj0.c, gprj0.e, gprj0.g(), gprj0.d(v5), gprj0.a));
                    }
                }
            }
        }
        catch(Exception exception0) {
            String s = String.format("Failed to create mDNS packet for subtype: %s.", TextUtils.join(",", this.e));
            gpqn.b(this.h, s, exception0);
            return gpse.a(this.l);
        }
        goto label_68;
    }

    private final void b(gpso gpso0, InetSocketAddress inetSocketAddress0, gprf gprf0) {
        byte[] arr_b = this.j;
        gpri gpri0 = new gpri(arr_b);
        gpri0.d(gprf0.a);
        gpri0.d(gprf0.b);
        gpri0.d(gprf0.c.size());
        List list0 = gprf0.d;
        gpri0.d(list0.size());
        List list1 = gprf0.e;
        gpri0.d(list1.size());
        List list2 = gprf0.f;
        gpri0.d(list2.size());
        for(Object object0: gprf0.c) {
            ((gprm)object0).f(gpri0);
        }
        for(Object object1: list0) {
            ((gprm)object1).i(gpri0);
        }
        for(Object object2: list1) {
            ((gprm)object2).i(gpri0);
        }
        for(Object object3: list2) {
            ((gprm)object3).i(gpri0);
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, gpri0.b);
        new Object[]{new DatagramPacket(arr_b1, 0, arr_b1.length, inetSocketAddress0)};
        DatagramPacket datagramPacket0 = new DatagramPacket(arr_b1, 0, arr_b1.length, inetSocketAddress0);
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(Objects.requireNonNull(datagramPacket0));
        List list3 = DesugarCollections.unmodifiableList(arrayList0);
        if(this.l.a.a) {
            if(Build.VERSION.SDK_INT >= 33 && (gpso0 instanceof gprc)) {
                gprc gprc0 = (gprc)gpso0;
                throw null;
            }
            gpso0.c(list3, this.i);
            return;
        }
        if(Build.VERSION.SDK_INT >= 33 && (gpso0 instanceof gprc)) {
            gprc gprc1 = (gprc)gpso0;
            throw null;
        }
        gpso0.b(list3, this.i);
    }

    private final void c(gpso gpso0, int v, gprf gprf0) {
        try {
            this.b(gpso0, new InetSocketAddress(gpqr.a(), v), gprf0);
        }
        catch(IOException iOException0) {
            gpqn.b(this.h, "Can\'t send packet to IPv4", iOException0);
        }
        try {
            this.b(gpso0, new InetSocketAddress(gpqr.b(), v), gprf0);
        }
        catch(IOException iOException1) {
            gpqn.b(this.h, "Can\'t send packet to IPv6", iOException1);
        }
    }

    @Override
    public final Object call() {
        return this.a();
    }
}

