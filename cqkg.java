import android.content.Context;
import com.google.android.gms.mdm.settings.DropdownMenuPreference;
import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class cqkg implements Function {
    public final Context a;

    public cqkg(Context context0) {
        this.a = context0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((Map.Entry)object0).getValue();
        Integer integer0 = (Integer)DropdownMenuPreference.a.get(object1);
        gftb.check(integer0);
        return this.a.getString(integer0.intValue());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

