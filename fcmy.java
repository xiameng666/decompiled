import android.accounts.Account;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcmy implements Consumer {
    public final ProtoLiteBuilder a;

    public fcmy(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexr.a).v_newBuilder();
        String s = ((Account)object0).name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteBuilder hftp1 = this.a;
        fexr fexr0 = (fexr)hftp0.b_message;
        s.getClass();
        fexr0.b |= 1;
        fexr0.c = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fext fext0 = (fext)hftp1.b_message;
        fexr fexr1 = (fexr)hftp0.N_build();
        fexr1.getClass();
        fext0.e = fexr1;
        fext0.b |= 2;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

