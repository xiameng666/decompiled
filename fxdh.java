import android.media.AudioAttributes;
import android.media.AudioPlaybackConfiguration;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fxdh implements Predicate {
    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        AudioAttributes audioAttributes0 = ((AudioPlaybackConfiguration)object0).getAudioAttributes();
        if(audioAttributes0.getContentType() != 4) {
            switch(audioAttributes0.getUsage()) {
                case 5: 
                case 10: {
                    break;
                }
                default: {
                    return Long.compare(audioAttributes0.getContentType(), huqb.j()) != 0 || ((long)audioAttributes0.getUsage()) != huqb.k();
                }
            }
        }
        return false;
    }
}

