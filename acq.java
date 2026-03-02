import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.Map;

public final class acq implements lpp {
    public final acw a;
    public final String b;
    public final acn c;
    public final adc d;

    public acq(acw acw0, String s, acn acn0, adc adc0) {
        this.a = acw0;
        this.b = s;
        this.c = acn0;
        this.d = adc0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        acw acw0 = this.a;
        String s = this.b;
        if(lpe.ON_START == lpe0) {
            adc adc0 = this.d;
            acn acn0 = this.c;
            acs acs0 = new acs(acn0, adc0);
            acw0.d.put(s, acs0);
            Map map0 = acw0.e;
            if(map0.containsKey(s)) {
                Object object0 = map0.get(s);
                map0.remove(s);
                acn0.jN(object0);
            }
            Bundle bundle0 = acw0.f;
            ActivityResult activityResult0 = (ActivityResult)jyt.a(bundle0, s, ActivityResult.class);
            if(activityResult0 != null) {
                bundle0.remove(s);
                acn0.jN(adc0.b(activityResult0.a, activityResult0.b));
            }
        }
        else {
            if(lpe.ON_STOP == lpe0) {
                acw0.d.remove(s);
                return;
            }
            if(lpe.ON_DESTROY == lpe0) {
                acw0.f(s);
            }
        }
    }
}

