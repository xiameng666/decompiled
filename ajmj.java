import android.util.Log;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;

public final class ajmj implements evqf {
    public final ajmf a;

    public ajmj(ajmf ajmf0) {
        this.a = ajmf0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Log.w("Auth", a.h(((ZeroTouchFlowResult)object0).a, "[ZeroTouchLauncherImpl] onZeroTouchFlowSuccess with status="));
        ajmf ajmf0 = this.a;
        switch(((ZeroTouchFlowResult)object0).a) {
            case 1: {
                ajmf0.f(((ZeroTouchFlowResult)object0).b);
                return;
            }
            case 2: {
                ajmf0.g();
                return;
            }
            default: {
                ajmf0.h();
            }
        }
    }
}

