import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;
import org.webrtc.RTCStats;

public final class czyy implements BiConsumer {
    public final czyz a;

    public czyy(czyz czyz0) {
        this.a = czyz0;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        if(this.a.a.contains(((RTCStats)object1).a)) {
            czkq.a.b().i("%s %s", "[RTCStatsReport]", ((String)object0));
            czkq.a.b().i("%s %s", "[RTCStatsReport]", ((RTCStats)object1));
        }
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

