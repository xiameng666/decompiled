import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.googlehelp.common.HelpConfig;

public final class btiu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((btib)object0).c.isEmpty() && !((btib)object0).f.isEmpty()) {
            HelpConfig helpConfig0 = new HelpConfig();
            helpConfig0.b = ((btib)object0).c;
            helpConfig0.e = ((btib)object0).f;
            helpConfig0.h = ((btib)object0).h;
            helpConfig0.Q(((btib)object0).l);
            if(!((btib)object0).d.isEmpty()) {
                helpConfig0.c = ((btib)object0).d;
            }
            if((((btib)object0).b & 4) != 0) {
                btii btii0 = ((btib)object0).e;
                if(btii0 == null) {
                    btii0 = btii.a;
                }
                if(!btii0.c.isEmpty()) {
                    btii btii1 = ((btib)object0).e;
                    if(btii1 == null) {
                        btii1 = btii.a;
                    }
                    if(!btii1.d.isEmpty()) {
                        btii btii2 = ((btib)object0).e;
                        String s = (btii2 == null ? btii.a : btii2).c;
                        if(btii2 == null) {
                            btii2 = btii.a;
                        }
                        helpConfig0.d = new Account(s, btii2.d);
                    }
                }
            }
            if(!((btib)object0).g.isEmpty()) {
                Bundle bundle0 = new Bundle();
                for(Object object1: ((btib)object0).g) {
                    bundle0.putString(((btvz)object1).c, ((btvz)object1).d);
                }
                if(helpConfig0.f == null || helpConfig0.f.isEmpty()) {
                    helpConfig0.f = btnt.a(htom.d()) ? btoa.e(bundle0) : bundle0;
                }
            }
            if(!((btib)object0).i.isEmpty()) {
                helpConfig0.I = ((btib)object0).i;
            }
            if(!((btib)object0).j.isEmpty()) {
                helpConfig0.K = ((btib)object0).j;
            }
            if(!((btib)object0).k.isEmpty()) {
                helpConfig0.N = ((btib)object0).k;
            }
            return gfsx.m(helpConfig0);
        }
        return gfqx.a;
    }
}

