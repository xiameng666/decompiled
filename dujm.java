import com.google.android.gms.pay.pass.idcard.view.components.MsoDropDown;
import java.util.function.Consumer;

final class dujm extends ibuo implements ibts {
    public dujm(Object object0) {
        super(1, object0, MsoDropDown.class, "onExpandedUpdate", "onExpandedUpdate(Z)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        MsoDropDown msoDropDown0 = (MsoDropDown)this.e;
        dujy dujy0 = msoDropDown0.a();
        ibuq.f(dujy0.b, "validityInfo");
        msoDropDown0.b(new dujy(((Boolean)object0).booleanValue(), dujy0.b, dujy0.c));
        Consumer consumer0 = msoDropDown0.a().c;
        if(consumer0 != null) {
            consumer0.accept(((Boolean)object0));
        }
        return ibom.a;
    }
}

