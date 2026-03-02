import com.google.android.gms.pay.passdetection.Barcode;
import com.google.android.gms.pay.passdetection.DetectedPass;
import java.util.List;
import java.util.regex.Pattern;

public final class dxdx implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        dxds dxds0;
        dxde dxde0;
        dxdd dxdd0;
        ggdy ggdy0 = new ggdy();
        for(Object object0: ((List)evql0.j())) {
            hbsn hbsn0 = (hbsn)object0;
            String s = hbsn0.d();
            if(s == null) {
                s = hbsn0.c();
                dxdd0 = dxdd.c;
            }
            else {
                dxdd0 = dxdd.b;
            }
            if(s != null) {
                switch(hbsn0.a()) {
                    case 1: {
                        dxde0 = dxde.c;
                        break;
                    }
                    case 2: {
                        dxde0 = dxde.d;
                        break;
                    }
                    case 4: {
                        dxde0 = dxde.e;
                        break;
                    }
                    case 8: {
                        dxde0 = dxde.f;
                        break;
                    }
                    case 16: {
                        dxde0 = dxde.g;
                        break;
                    }
                    case 0x20: {
                        dxde0 = dxde.h;
                        break;
                    }
                    case 0x40: {
                        dxde0 = dxde.i;
                        break;
                    }
                    case 0x80: {
                        dxde0 = dxde.j;
                        break;
                    }
                    case 0x100: {
                        dxde0 = dxde.l;
                        break;
                    }
                    case 0x200: {
                        dxde0 = dxde.n;
                        break;
                    }
                    case 0x400: {
                        dxde0 = dxde.o;
                        break;
                    }
                    case 0x800: {
                        dxde0 = dxde.k;
                        break;
                    }
                    case 0x1000: {
                        dxde0 = dxde.b;
                        break;
                    }
                    default: {
                        dxde0 = dxde.a;
                    }
                }
                Barcode barcode0 = new Barcode(dxde0, s, hbsn0.c(), dxdd0);
                String s1 = barcode0.b;
                if(!gfta.c(s1)) {
                    glwc glwc0 = glwb.a(s1);
                    if(glwc0.a != null && gfqz.e(glwc0.a, "SHC") && glwc0.c().size() == 1) {
                        String s2 = (String)glwc0.c().get(0);
                        if(s2.length() % 2 == 0) {
                            StringBuilder stringBuilder0 = new StringBuilder();
                            for(int v = 0; v < s2.length(); v += 2) {
                                stringBuilder0.append(Character.toChars(Integer.parseInt(s2.substring(v, v + 2)) + 45));
                            }
                            List list0 = gfud.h(Pattern.quote(".")).n(stringBuilder0.toString());
                            if(list0.size() == 3) {
                                gfsx gfsx0 = dxdz.a(((String)list0.get(1)));
                                if(gfsx0.i()) {
                                    gpzo gpzo0 = gpzv.b(((String)gfsx0.d())).i().c("vc").i().c("type").h();
                                    if(gpzo0.f(new gpzw("https://smarthealth.cards#health-card")) && gpzo0.f(new gpzw("https://smarthealth.cards#covid19")) && gpzo0.f(new gpzw("https://smarthealth.cards#immunization"))) {
                                        dxds0 = dxds.c;
                                        goto label_62;
                                    }
                                }
                            }
                        }
                    }
                }
                dxds0 = dxdq.a(s1).i() ? dxds.b : dxds.d;
            label_62:
                ggdy0.i(new DetectedPass(dxds0, barcode0));
            }
        }
        return evrg.d(ggdy0.h());
    }
}

