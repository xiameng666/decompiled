import android.os.Bundle;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eziy implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return TrustedUiDevice.b(((Bundle)object0), "trusted_device").stream();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

