import android.util.Log;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcyd implements Consumer {
    public final fcye a;

    public fcyd(fcye fcye0) {
        this.a = fcye0;
    }

    @Override
    public final void accept(Object object0) {
        fcxj fcxj0 = this.a.h.a();
        fcyc fcyc0 = new fcyc(this.a);
        if(((String)object0).isEmpty()) {
            Log.w("BugreportWearClient", "Failed to send consent message: nodeId is empty");
            fcyc0.a(false);
            return;
        }
        fcxh fcxh0 = new fcxh(fcxj0, ((String)object0), fcyc0);
        fcxj0.b.execute(fcxh0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

