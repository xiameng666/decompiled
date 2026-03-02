import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;

public final class cnjo implements azys {
    @Override  // azys
    public final void d(Object object0, Object object1) {
        LastLocationRequest lastLocationRequest0 = new LastLocationRequest(0x7FFFFFFFFFFFFFFFL, 0, false, null);
        if(((cnkz)object0).V(cmng.j)) {
            ((cnif_locationInterface)((cnkz)object0).H()).l(lastLocationRequest0, LocationReceiver.h(new cnko(((evqp)object1))));
            return;
        }
        if(((cnkz)object0).V(cmng.f)) {
            ((cnif_locationInterface)((cnkz)object0).H()).m(lastLocationRequest0, new cnko(((evqp)object1)));
            return;
        }
        ((evqp)object1).b(((cnif_locationInterface)((cnkz)object0).H()).a());
    }
}

