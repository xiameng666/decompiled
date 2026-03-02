import java.util.ArrayList;
import java.util.List;

public final class ekll implements lqj {
    public final ekku a;

    public ekll(ekku ekku0) {
        this.a = ekku0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ekku ekku0 = this.a;
        if(((List)object0) == null) {
            ejze.a().d("CRSA.restore_source_no_loaded");
            new ArrayList();
        }
        else {
            ejze.a().b(0, 0, ((List)object0).size());
            ekku0.g = (List)object0;
        }
        ekku0.h = false;
        ekku0.G();
        ekku0.q();
    }
}

