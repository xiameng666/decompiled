import android.content.Context;
import android.widget.Toast;

public final class eklo implements evqk {
    public final eklt a;
    public final Context b;
    public final aqgg c;
    public final aqfl d;

    public eklo(eklt eklt0, Context context0, aqgg aqgg0, aqfl aqfl0) {
        this.a = eklt0;
        this.b = context0;
        this.c = aqgg0;
        this.d = aqfl0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        Context context0 = this.a.a.getContext();
        if(context0 != null) {
            Toast.makeText(context0, 0x7F1528A4, 1).show();  // string:romanesco_downloading_contacts "Downloading contacts"
        }
        ejyv.d(this.b).e = true;
        return this.c.b(this.d.c);
    }
}

