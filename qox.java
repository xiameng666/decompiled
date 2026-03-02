import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;

public final class qox {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    public qox(List list0) {
        ibuq.f(list0, "properties");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if((((qpb)object0).a instanceof Integer)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            if((((qpb)object1).a instanceof PointF)) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: list0) {
            if((((qpb)object2).a instanceof Float)) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: list0) {
            if((((qpb)object3).a instanceof quc)) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: list0) {
            if((((qpb)object4).a instanceof ColorFilter)) {
                arrayList4.add(object4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: list0) {
            if((((qpb)object5).a instanceof Object[])) {
                arrayList5.add(object5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: list0) {
            if((((qpb)object6).a instanceof Typeface)) {
                arrayList6.add(object6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for(Object object7: list0) {
            if((((qpb)object7).a instanceof Bitmap)) {
                arrayList7.add(object7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for(Object object8: list0) {
            if((((qpb)object8).a instanceof CharSequence)) {
                arrayList8.add(object8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for(Object object9: list0) {
            if((((qpb)object9).a instanceof Path)) {
                arrayList9.add(object9);
            }
        }
        super();
        this.a = arrayList0;
        this.b = arrayList1;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.g = arrayList6;
        this.h = arrayList7;
        this.i = arrayList8;
        this.j = arrayList9;
    }
}

