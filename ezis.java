import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..lang.Iterable.-EL;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ezis implements Consumer {
    public final ezjf a;

    public ezis(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override
    public final void accept(Object object0) {
        ezji ezji0 = this.a.am;
        if(ezji0 != null) {
            ezil ezil0 = ezji0.a;
            ezck ezck0 = ezil0.c;
            if(ezck0 != null) {
                ezjt ezjt0 = new ezjt(ezck0);
                Iterable.-EL.forEach(((TrustedUiDevice)object0).b, ezjt0);
                ezcf.a(ezil0.d, bbdg.lx);
                ezil0.a();
            }
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

