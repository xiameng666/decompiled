import android.util.Log;
import j..util.Objects;
import java.util.HashSet;
import java.util.Iterator;

final class fdqy extends fdrc {
    final fdqz a;

    public fdqy(fdqz fdqz0) {
        Objects.requireNonNull(fdqz0);
        this.a = fdqz0;
        super(fdqz0.a);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running onConnectedNodes");
        }
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        fdri fdri0 = this.a.a;
        fdxp fdxp0 = fdri0.f;
        for(Object object0: fdxp0.b()) {
            fdyo fdyo0 = (fdyo)object0;
            if(fdyo0.b < 0x7FFFFFFF) {
                hashSet0.add(fdyo0.a.a);
            }
            if(fdyo0.d) {
                hashSet1.add(fdyo0.a.a);
            }
        }
        hashSet0.add(fdxp0.a().a);
        Iterator iterator1 = fdri0.d.d().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            fdro fdro0 = (fdro)object1;
            if(!hashSet0.contains(fdro0.a.a) || hashSet1.contains(fdro0.a.a) && !fdro0.b) {
                iterator1.remove();
                this.g = fdro0;
                try {
                    fdro0.g();
                }
                catch(fdrm unused_ex) {
                }
                fdro0.d();
            }
        }
    }
}

