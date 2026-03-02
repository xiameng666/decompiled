import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

public final class ctka implements ibty {
    final List a;
    final Map b;
    final ibts c;

    public ctka(List list0, Map map0, ibts ibts0) {
        this.a = list0;
        this.b = map0;
        this.c = ibts0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dpw)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if(((goz)object2).ad((v2 & 0x93) != 0x92, v2 & 1)) {
            ctza ctza0 = (ctza)this.a.get(v);
            ((goz)object2).M(0x52FC9676);
            Bitmap bitmap0 = (Bitmap)this.b.get(ctza0.c);
            hey hey0 = hfc.e;
            hfc hfc0 = dla.f(dls.B(dls.w(hey0)), 24.0f, 16.0f, 16.0f, 8.0f);
            ((goz)object2).M(-1633490746);
            ibts ibts0 = this.c;
            int v3 = ((goz)object2).X(ibts0) | ((goz)object2).X(ctza0);
            Object object4 = ((goz)object2).k();
            if(v3 != 0 || object4 == gop.a) {
                object4 = new ctjy(ibts0, ctza0);
                ((goz)object2).R(object4);
            }
            ((goz)object2).A();
            hfc hfc1 = cru.d(hfc0, false, null, null, null, ((ibth)object4), 15);
            iau iau0 = dii.a(dho.c, hei.m, ((goz)object2), 0);
            long v4 = gol.c(((goz)object2));
            gzk gzk0 = ((goz)object2).ap();
            hfc hfc2 = hew.c(((goz)object2), hfc1);
            ibth ibth0 = iej.a;
            ((goz)object2).O();
            if(((goz)object2).ab()) {
                ((goz)object2).t(ibth0);
            }
            else {
                ((goz)object2).T();
            }
            int v5 = (int)(v4 ^ v4 >>> 0x20);
            guo.b(((goz)object2), iau0, iej.e);
            guo.b(((goz)object2), gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(((goz)object2).ab() || !ibuq.m(((goz)object2).k(), Integer.valueOf(v5))) {
                Integer integer0 = v5;
                ((goz)object2).R(integer0);
                ((goz)object2).p(integer0, ibtw0);
            }
            guo.a(((goz)object2), iej.g);
            guo.b(((goz)object2), hfc2, iej.c);
            dim dim0 = dim.a;
            String s = isq.c(0x7F151949, ((goz)object2));  // string:multidevice_sync_remote_app_list_item_content_description "App Icon"
            hfc hfc3 = dla.j(dls.e(dls.o(hey0, 48.0f), 48.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            hej hej0 = hei.n;
            hfc hfc4 = dim0.a(hfc3, hej0);
            if(bitmap0 == null) {
                ((goz)object2).M(0x8B179718);
                cth.a(ism.a(0x7F0804CB, ((goz)object2), 0), s, hfc4, null, hys.b, 0.0f, null, ((goz)object2), 0x6008, 104);  // drawable:gs_android_vd_theme_24
            }
            else {
                ((goz)object2).M(-1961138807);
                cth.c(new hkn(bitmap0), s, hfc4, null, hys.b, 0.0f, null, ((goz)object2), 0x6000, 0xE8);
            }
            ((goz)object2).A();
            String s1 = ctza0.d;
            ibuq.e(s1, "getVisibleName(...)");
            hfc hfc5 = dim0.a(dla.j(dls.B(dls.w(hey0)), 0.0f, 0.0f, 0.0f, 16.0f, 7), hej0);
            jjy jjy0 = new jjy(3);
            evt.a(s1, hfc5, hll.e, 0L, 0L, jjy0, 0L, 0, false, 0, 0, null, ((goz)object2), 0x180, 0);
            ((goz)object2).z();
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

