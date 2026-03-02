import j..lang.Iterable.-EL;
import java.util.Set;

public final class fehi {
    public final Set a;

    public fehi() {
        this.a = ggog.l();
    }

    public final void a(fehg fehg0) {
        Set set0 = this.a;
        if(set0.contains(fehg0)) {
            ffmn.a("BleOffloadEventNotifier", "Unexpected request to add an already registered listener: %s", new Object[]{fehg0});
            return;
        }
        ffmn.a("BleOffloadEventNotifier", "Adding %s", new Object[]{fehg0.getClass().getName()});
        set0.add(fehg0);
    }

    final void b(String s, fehf fehf0) {
        ffmn.a("BleOffloadEventNotifier", "Notifying listeners: %s -> %s", new Object[]{s, fehf0.e});
        fehh fehh0 = new fehh(s, fehf0);
        Iterable.-EL.forEach(this.a, fehh0);
    }
}

