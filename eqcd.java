import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class eqcd implements epzk {
    final eqck a;

    public eqcd(eqck eqck0) {
        Objects.requireNonNull(eqck0);
        this.a = eqck0;
        super();
    }

    @Override  // epzk
    public final void a(int v, String s) {
        eqck eqck0 = this.a;
        if(eqck0.w) {
            eqck.h.m("accountTransferListener onError: " + v, new Object[0]);
            return;
        }
        eqck0.v(v, s, null);
    }

    @Override  // epzk
    public final void b() {
    }

    @Override  // epzk
    public final void c(PendingIntent pendingIntent0) {
        throw new UnsupportedOperationException();
    }

    @Override  // epzk
    public final void d(List list0) {
        this.a.q.a();
        ArrayList arrayList0 = new ArrayList(list0);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("extraAccountChallengeData", arrayList0);
        this.a.p.c(1010, bundle0);
        ProtoLiteBuilder hftp0 = this.a.k.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoj gjoj0 = (gjoj)hftp0.b_message;
        gjoj0.b |= 8;
        gjoj0.f = true;
    }

    @Override  // epzk
    public final void e(String s) {
        eqck.h.j("onTextMessage: ", new Object[]{s});
    }

    @Override  // epzk
    public final void f(MessagePayload messagePayload0) {
        this.a.m(messagePayload0);
    }
}

