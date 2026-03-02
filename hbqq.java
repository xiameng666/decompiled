import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class hbqq implements hbqo {
    final List a;

    public hbqq(Context context0, hbqp hbqp0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        if(hbqp0.b) {
            arrayList0.add(new hbrg(context0, hbqp0));
        }
    }

    @Override  // hbqo
    public final void a(hbrb hbrb0) {
        for(Object object0: this.a) {
            ((hbqo)object0).a(hbrb0);
        }
    }
}

