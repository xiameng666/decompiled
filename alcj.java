import android.app.usage.UsageStats;
import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class alcj implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        long v = ((UsageStats)((Map.Entry)object0).getValue()).getLastTimeUsed();
        String s = (String)((Map.Entry)object0).getKey();
        if(s != null) {
            return new alcp(s, v);
        }
        throw new NullPointerException("Null packageName");
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

