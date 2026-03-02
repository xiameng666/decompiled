import android.location.Location;
import java.util.ArrayList;
import java.util.List;

public final class fxog {
    private final List a;
    private final boolean b;
    private final int c;

    public fxog(String s, boolean z, int v) {
        fxoe fxoe0;
        this.b = z;
        this.c = v;
        this.a = new ArrayList();
        for(Object object0: gfud.e(';').l(s)) {
            String s1 = ((String)object0).trim();
            if(!s1.isEmpty()) {
                Object object1 = null;
                List list0 = gfud.e(',').n(s1);
                if(!list0.isEmpty()) {
                    if(list0.size() > 1) {
                        if(!((String)list0.get(1)).equals("s2")) {
                            if(!((String)list0.get(1)).equals("l")) {
                                if(((String)list0.get(1)).equals("c") && list0.size() == 5 && ((String)list0.get(1)).equals("c")) {
                                    fxoe0 = new fxoc(Integer.parseInt(((String)list0.get(0))), Double.parseDouble(((String)list0.get(2))), Double.parseDouble(((String)list0.get(3))), Double.parseDouble(((String)list0.get(4))));
                                    goto label_36;
                                }
                            }
                            else if(list0.size() > 5 && ((String)list0.get(1)).equals("l")) {
                                ArrayList arrayList0 = new ArrayList();
                                for(int v1 = 2; v1 < list0.size(); ++v1) {
                                    try {
                                        List list1 = gfud.e('|').n(((CharSequence)list0.get(v1)));
                                        arrayList0.add(ggzv.i(Double.parseDouble(((String)list1.get(0))), Double.parseDouble(((String)list1.get(1)))).k());
                                    }
                                    catch(NumberFormatException unused_ex) {
                                        list0.get(v1);
                                    }
                                }
                                ghab ghab0 = new ghab(arrayList0);
                                ghab0.z();
                                fxoe0 = new fxof(Integer.parseInt(((String)list0.get(0))), ghab0);
                                goto label_36;
                            }
                        }
                        else if(list0.size() == 3 && ((String)list0.get(1)).equals("s2")) {
                            fxoe0 = new fxoe(Integer.parseInt(((String)list0.get(0))), ((String)list0.get(2)));
                            goto label_36;
                        }
                        fxoe0 = null;
                    label_36:
                        if(fxoe0 != null) {
                            object1 = fxoe0;
                        }
                        else if(list0.size() == 4) {
                            object1 = new fxoc(Integer.parseInt(((String)list0.get(0))), Double.parseDouble(((String)list0.get(1))), Double.parseDouble(((String)list0.get(2))), Double.parseDouble(((String)list0.get(3))));
                        }
                    }
                    if(object1 != null) {
                        this.a.add(object1);
                    }
                }
            }
        }
    }

    public final fxob a(Location location0) {
        if(this.b) {
            fxnz fxnz0 = new fxnz();
            fxnz0.a = location0;
            fxnz0.b(0);
            fxnz0.c(fxog.b(location0, this.c));
            return new fxob(1, fxnz0.a());
        }
        for(Object object0: this.a) {
            fxod fxod0 = (fxod)object0;
            if(fxod0.a(location0)) {
                fxnz fxnz1 = new fxnz();
                fxnz1.a = location0;
                fxnz1.b(fxod0.c);
                fxnz1.c(fxog.b(location0, this.c));
                return new fxob(1, fxnz1.a());
            }
        }
        fxnz fxnz2 = new fxnz();
        fxnz2.a = location0;
        fxnz2.b(0);
        fxnz2.c(fxog.b(location0, this.c));
        return new fxob(2, fxnz2.a());
    }

    private static final long b(Location location0, int v) {
        return fhts.m(fhts.h(location0.getLatitude(), location0.getLongitude()), v);
    }
}

