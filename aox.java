import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jeb.synthetic.FIN;

public final class aox {
    public final awt a;
    public final asn b;
    public final ayv c;
    private final Context d;
    private final bjf e;
    private final bje f;
    private final ats g;
    private final long h;
    private final Map i;
    private final bap j;
    private final bab k;
    private final Object l;
    private List m;

    public aox(Context context0, bjf bjf0, bab bab0, long v, bap bap0) {
        List list0;
        this.i = new HashMap();
        this.l = new Object();
        this.m = new ArrayList();
        this.d = context0;
        this.e = bjf0;
        awt awt0 = new awt(new aww(context0));
        this.a = awt0;
        this.g = ats.d(context0);
        ayv ayv0 = new ayv(awt0);
        this.c = ayv0;
        bje bje0 = new bje(ayv0);
        this.f = bje0;
        synchronized(ayv0.a) {
            ayv0.b.add(bje0);
        }
        this.h = v;
        this.j = bap0;
        this.k = bab0;
        try {
            list0 = Arrays.asList(awt0.f());
        }
        catch(awl awl0) {
            throw new bcr(new baf(awl0));
        }
        this.b = new asn(list0, awt0, bjf0.a);
        this.e(list0);
    }

    final aqj a(String s) {
        try {
            Map map0 = this.i;
            aqj aqj0 = (aqj)map0.get(s);
            if(aqj0 == null) {
                aqj0 = new aqj(s, this.a);
                map0.put(s, aqj0);
            }
            return aqj0;
        }
        catch(awl awl0) {
            throw new baf(awl0);
        }
    }

    public final bin b(String s) {
        Object object0 = this.l;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.m.contains(s)) {
            FIN.finallyCodeBegin$NT(v);
            aqj aqj0 = this.a(s);
            return new aqi(this.d, this.a, s, aqj0, this.c, this.f, this.e.a, this.e.b, this.g, this.h, this.j);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final List c(List list0) {
        ArrayList arrayList0 = new ArrayList(list0);
        try {
            ArrayList arrayList1 = new ArrayList();
            bab bab0 = this.k;
            if(bab0 == null) {
                for(Object object0: arrayList0) {
                    arrayList1.add(((String)object0));
                }
            }
            else {
                try {
                    Object object1 = null;
                    Integer integer0 = bab0.b();
                    awt awt0 = this.a;
                    if(integer0 != null && arrayList0.contains("0") && arrayList0.contains("1")) {
                        switch(((int)integer0)) {
                            case 0: {
                                if(((int)(((Integer)awt0.b("1").c(CameraCharacteristics.LENS_FACING)))) == 0) {
                                    object1 = "0";
                                }
                                break;
                            }
                            case 1: {
                                if(((int)(((Integer)awt0.b("0").c(CameraCharacteristics.LENS_FACING)))) == 1) {
                                    object1 = "1";
                                }
                            }
                        }
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: arrayList0) {
                    String s = (String)object2;
                    if(!s.equals(object1)) {
                        arrayList2.add(this.a(s));
                    }
                }
                for(Object object3: bab0.c(arrayList2)) {
                    arrayList1.add(((bik)(((azz)object3))).j());
                }
            }
        }
        catch(awl awl0) {
            throw new bcr(new baf(awl0));
        }
        catch(baf baf0) {
            throw new bcr(baf0);
        }
        List list1 = new ArrayList();
        for(Object object4: arrayList1) {
            String s1 = (String)object4;
            if(s1.equals("0") || s1.equals("1")) {
                list1.add(s1);
            }
            else if(asx.a(this.a, s1)) {
                list1.add(s1);
            }
            else {
                bcs.h("Camera2CameraFactory");
            }
        }
        return list1;
    }

    public final Set d() {
        synchronized(this.l) {
        }
        return new LinkedHashSet(this.m);
    }

    public final void e(List list0) {
        try {
            List list1 = this.c(list0);
            Object object0 = this.l;
            synchronized(object0) {
                if(this.m.equals(list1)) {
                    return;
                }
                ArrayList arrayList0 = new ArrayList(this.m);
                arrayList0.removeAll(list1);
                for(Object object1: arrayList0) {
                    bcs.h("Camera2CameraFactory");
                    this.i.remove(((String)object1));
                }
                Objects.toString(this.m);
                Objects.toString(list1);
                bcs.h("Camera2CameraFactory");
                this.m = list1;
            }
        }
        catch(bcr bcr0) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", bcr0);
            throw bcr0;
        }
    }

    static String f(atk atk0, String s) {
        return s + ati.a(atk0.h);
    }
}

