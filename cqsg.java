import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class cqsg {
    private static final cqwd a;
    private final gful_cronetEngineProvider b;

    static {
        cqsg.a = new cqwd("MdnsResponseDecoder");
    }

    public cqsg() {
        this.b = gfus.a(((gful_cronetEngineProvider)new cqsf()));
    }

    public final int a(DatagramPacket datagramPacket0, List list0, int v) {
        gged_interceptors gged0;
        String[] arr_s;
        int v4;
        LinkedList linkedList0;
        cqrw cqrw0 = new cqrw(datagramPacket0);
        try {
            cqrw0.b();
            if((cqrw0.b() & 0xF80F) != 0x8000) {
                return 1;
            }
            cqrw0.b();
            int v1 = cqrw0.b();
            int v2 = cqrw0.b();
            int v3 = cqrw0.b();
            if(v1 <= 0) {
                return 2;
            }
            linkedList0 = new LinkedList();
            v4 = 0;
        alab1:
            while(true) {
            label_12:
                if(v4 >= v1 + v2 + v3) {
                    goto label_62;
                }
                try {
                    arr_s = cqrw0.f();
                }
                catch(IOException iOException0) {
                    a.ae(cqsg.a.a.i(), "Failed to read labels from mDNS response.", iOException0);
                    return 3;
                }
                switch(cqrw0.b()) {
                    case 1: {
                        try {
                            linkedList0.add(new cqrt(arr_s, 1, cqrw0));
                            break alab1;
                        }
                        catch(IOException iOException2) {
                            a.ae(cqsg.a.a.i(), "Failed to read A record from mDNS response.", iOException2);
                            return 4;
                        }
                    }
                    case 12: {
                        try {
                            linkedList0.add(new cqry(arr_s, cqrw0));
                            break alab1;
                        }
                        catch(IOException iOException3) {
                            a.ae(cqsg.a.a.i(), "Failed to read PTR record from mDNS response.", iOException3);
                            return 6;
                        }
                    }
                    case 16: {
                        try {
                            linkedList0.add(new cqto(arr_s, cqrw0));
                            break alab1;
                        }
                        catch(IOException iOException4) {
                            a.ae(cqsg.a.a.i(), "Failed to read TXT record from mDNS response.", iOException4);
                            return 10;
                        }
                    }
                    case 28: {
                        try {
                            cqrt cqrt0 = new cqrt(arr_s, 28, cqrw0);
                            if(cqrt0.a != null) {
                                linkedList0.add(cqrt0);
                            }
                            break alab1;
                        }
                        catch(IOException iOException5) {
                            a.ae(cqsg.a.a.i(), "Failed to read AAAA record from mDNS response.", iOException5);
                            return 5;
                        }
                    }
                    case 33: {
                        if(arr_s.length == 4) {
                            try {
                                linkedList0.add(new cqso(arr_s, cqrw0));
                            }
                            catch(IOException iOException6) {
                                a.ae(cqsg.a.a.i(), "Failed to read SRV record from mDNS response.", iOException6);
                                return 8;
                            }
                        }
                        else {
                            try {
                                cqsg.d(cqrw0);
                            }
                            catch(IOException iOException7) {
                                a.ae(cqsg.a.a.i(), "Failed to skip SVR record from mDNS response.", iOException7);
                                return 9;
                            }
                        }
                        break alab1;
                    }
                    default: {
                        try {
                            cqsg.d(cqrw0);
                            break alab1;
                        }
                        catch(IOException iOException1) {
                            a.ae(cqsg.a.a.i(), "Failed to skip mDNS record.", iOException1);
                            return 11;
                        }
                    }
                }
            }
        }
        catch(EOFException eOFException0) {
            a.ae(cqsg.a.a.i(), "Reached the end of the mDNS response unexpectedly.", eOFException0);
            return 12;
        }
        ++v4;
        goto label_12;
    label_62:
        long v5 = SystemClock.elapsedRealtime();
        for(Object object0: linkedList0) {
            cqsd cqsd0 = (cqsd)object0;
            if((cqsd0 instanceof cqry)) {
                cqse cqse0 = cqsg.b(list0, ((cqry)cqsd0).a);
                if(cqse0 == null) {
                    cqse0 = new cqse(v5);
                    list0.add(cqse0);
                }
                cqse0.n(((cqry)cqsd0));
            }
        }
        for(Object object1: linkedList0) {
            cqsd cqsd1 = (cqsd)object1;
            if((cqsd1 instanceof cqso)) {
                cqse cqse1 = cqsg.b(list0, ((cqso)cqsd1).c);
                if(cqse1 == null) {
                    continue;
                }
                cqse1.l(((cqso)cqsd1));
            }
            else {
                if(!(cqsd1 instanceof cqto)) {
                    continue;
                }
                cqse cqse2 = cqsg.b(list0, ((cqto)cqsd1).c);
                if(cqse2 == null) {
                    continue;
                }
                cqse2.m(((cqto)cqsd1));
            }
        }
        Iterator iterator2 = linkedList0.iterator();
        while(iterator2.hasNext()) {
            cqse cqse3 = null;
            Object object2 = iterator2.next();
            cqsd cqsd2 = (cqsd)object2;
            if(!(cqsd2 instanceof cqrt)) {
            }
            else if(((Boolean)this.b.mr()).booleanValue()) {
                String[] arr_s1 = ((cqrt)cqsd2).c;
                if(list0.isEmpty()) {
                    gged0 = ggna.a;
                }
                else {
                    for(Object object3: list0) {
                        cqse cqse4 = (cqse)object3;
                        cqso cqso0 = cqse4.d();
                        if(cqso0 != null && Arrays.equals(cqso0.b, arr_s1)) {
                            if(cqse3 == null) {
                                cqse3 = new ArrayList(list0.size());
                            }
                            ((List)cqse3).add(cqse4);
                        }
                    }
                    gged0 = cqse3 == null ? ggna.a : cqse3;
                }
                for(Object object4: gged0) {
                    cqsg.c(((cqse)object4), ((cqrt)cqsd2), v);
                }
            }
            else {
                String[] arr_s2 = ((cqrt)cqsd2).c;
                for(Object object5: list0) {
                    cqse cqse5 = (cqse)object5;
                    cqso cqso1 = cqse5.d();
                    if(cqso1 != null && Arrays.equals(cqso1.b, arr_s2)) {
                        cqse3 = cqse5;
                        break;
                    }
                }
                if(cqse3 == null) {
                    continue;
                }
                cqsg.c(cqse3, ((cqrt)cqsd2), v);
            }
        }
        return 0;
    }

    private static cqse b(List list0, String[] arr_s) {
        for(Object object0: list0) {
            cqse cqse0 = (cqse)object0;
            for(Object object1: cqse0.g()) {
                if(Arrays.equals(((cqry)object1).a, arr_s)) {
                    return cqse0;
                }
            }
        }
        return null;
    }

    private static void c(cqse cqse0, cqrt cqrt0, int v) {
        if(cqrt0.b == null) {
            if(cqrt0.a != null) {
                cqse0.j(cqrt0);
                cqse0.k(v);
            }
            return;
        }
        cqse0.i(cqrt0);
        cqse0.k(v);
    }

    private static void d(cqrw cqrw0) {
        cqrw0.e(6);
        cqrw0.e(cqrw0.b());
    }
}

