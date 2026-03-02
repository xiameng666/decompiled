import android.os.Bundle;
import java.util.Collection;
import java.util.List;

public final class bvyr implements ibth {
    public final bvyu a;
    public final hgmj b;

    public bvyr(bvyu bvyu0, hgmj hgmj0) {
        this.a = bvyu0;
        this.b = hgmj0;
    }

    @Override  // ibth
    public final Object a() {
        fm fm0 = this.a.b.getSupportFragmentManager();
        String s = this.b.b;
        ibuq.e(s, "getTargetUrl(...)");
        ibuq.f(s, "url");
        List list0 = fm0.o();
        ibuq.e(list0, "getFragments(...)");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if((((du)object0) instanceof bvzq)) {
                    return ibom.a;
                }
            }
        }
        bvzq bvzq0 = new bvzq();
        Bundle bundle0 = new Bundle();
        bundle0.putString("url", s);
        bvzq0.setArguments(bundle0);
        bvzq0.show(fm0, "LearnMoreSheet");
        return ibom.a;
    }
}

