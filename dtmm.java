import com.google.android.gms.pay.pass.common.timeticker.TimeTickerTextClock;
import dagger.android.AndroidInjector;

public final class dtmm implements AndroidInjector {
    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((TimeTickerTextClock)object0).e = new edln(dxei.b(dlnj.a()));
    }
}

