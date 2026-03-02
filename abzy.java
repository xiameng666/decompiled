import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class abzy {
    public static final bboh a;
    public final bbcp b;
    public final acak c;
    public final gful_cronetEngineProvider d;

    static {
        abzy.a = bboh.b("AppErrorsListener", bbcu.ed);
    }

    public abzy(Context context0, bbcp bbcp0) {
        acak acak0 = new acak(context0);
        abzv abzv0 = new abzv(context0);
        super();
        this.b = bbcp0;
        this.c = acak0;
        this.d = gfus.a(((gful_cronetEngineProvider)abzv0));
    }

    public final bbco a(int v) {
        for(Object object0: this.b.b) {
            bbco bbco0 = (bbco)object0;
            if(bbco0.b.contains(Integer.valueOf(v))) {
                return bbco0;
            }
        }
        return null;
    }

    public final Map b(Iterable iterable0) {
        Map map0 = new HashMap();
        for(Object object0: iterable0) {
            hlwj hlwj0 = (hlwj)object0;
            if(!bbqr.d(hlwj0.g) && (!hlwj0.g.equals("com.android.vending") && !hlwj0.g.equals("com.google.android.gms"))) {
                Integer integer0 = abzs.a(hlwj0.c);
                if(integer0 != null && (this.b.f || hlwj0.j.equals("com.android.vending")) && this.a(integer0.intValue()) != null && new String(hlwj0.d.toByteArray()).contains("Foreground: Yes\n")) {
                    acae acae0 = new acae(hlwj0.g, hlwj0.h, ((int)integer0));
                    List list0 = (List)map0.get(acae0);
                    if(list0 == null) {
                        list0 = new ArrayList();
                        map0.put(acae0, list0);
                    }
                    list0.add(hlwj0);
                }
            }
        }
        return map0;
    }
}

