import com.google.android.gms.semanticlocationhistory.FrequentPlace;
import com.google.android.gms.semanticlocationhistory.UserLocationProfile;
import java.util.List;

public final class ehvq implements evqf {
    public final ehvw a;

    public ehvq(ehvw ehvw0) {
        this.a = ehvw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((UserLocationProfile)object0) != null) {
            List list0 = ((UserLocationProfile)object0).a;
            if(!list0.isEmpty()) {
                this.a.d.addAll(list0);
                for(Object object1: this.a.d) {
                    FrequentPlace frequentPlace0 = (FrequentPlace)object1;
                }
            }
        }
    }
}

