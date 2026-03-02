import android.content.Context;
import android.content.ContextWrapper;

public final class zey {
    public static final zet a(Class class0, Context context0) {
        zex zex0;
        ibuq.f(context0, "context");
        while(true) {
            if((context0 instanceof xnb)) {
                zex0 = new zex(((xnb)context0));
                goto label_6;
            }
            if((context0 instanceof aao)) {
                zex0 = new zew(((aao)context0));
            label_6:
                zfa zfa0 = (zfa)new lso(zex0.c(), new zeu(zex0.d(), zex0.a())).a(zfa.class);
                zex0.b().c(zfa0);
                Object object0 = class0.cast(zfa0.a);
                ibuq.c(object0);
                return (zet)object0;
            }
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
            ibuq.e(context0, "getBaseContext(...)");
        }
        throw new IllegalArgumentException("Activity must inherit from ComponentActivity");
    }
}

