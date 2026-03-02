import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class dejx implements ibty {
    final cfz a;

    public dejx(cfz cfz0) {
        this.a = cfz0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        ((Number)object3).intValue();
        ibuq.f(((cax)object0), "$this$AnimatedContent");
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object2), 0);
        long v1 = gol.c(((goz)object2));
        gzk gzk0 = ((goz)object2).ap();
        hfc hfc0 = hew.c(((goz)object2), hfc.e);
        ibth ibth0 = iej.a;
        ((goz)object2).O();
        if(((goz)object2).ab()) {
            ((goz)object2).t(ibth0);
        }
        else {
            ((goz)object2).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object2), iau0, iej.e);
        guo.b(((goz)object2), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object2).ab() || !ibuq.m(((goz)object2).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object2).R(integer0);
            ((goz)object2).p(integer0, ibtw0);
        }
        guo.a(((goz)object2), iej.g);
        guo.b(((goz)object2), hfc0, iej.c);
        dim dim0 = dim.a;
        Context context0 = (Context)((goz)object2).h(AndroidCompositionLocals_androidKt.b);
        ((goz)object2).M(5004770);
        boolean z = ((goz)object2).X(context0);
        Object object4 = ((goz)object2).k();
        if(z || object4 == gop.a) {
            object4 = new adv(new adv(context0, 0x7F160C6A), 0x7F160DC9);  // style:Theme.GoogleMaterial3.DayNight
            ((goz)object2).R(object4);
        }
        cfz cfz0 = this.a;
        ((goz)object2).A();
        if(v == 0) {
            ((goz)object2).M(739669802);
            cmig.f(0x42862, gzf.e(0x5023DA5F, new deju(((adv)object4), cfz0, dim0, ((cax)object0)), ((goz)object2)), ((goz)object2), 54);
        }
        else {
            ((goz)object2).M(740855149);
            cmig.f(0x42861, gzf.e(0x42701428, new dejw(((adv)object4), cfz0, dim0, ((cax)object0)), ((goz)object2)), ((goz)object2), 54);
        }
        ((goz)object2).A();
        ((goz)object2).z();
        return ibom.a;
    }
}

