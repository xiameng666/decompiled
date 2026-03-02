import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dpwb implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Bundle bundle0 = ((StatusBarNotification)object0).getNotification().extras;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkqy.a).v_newBuilder();
        int v = ((StatusBarNotification)object0).getId();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkqy)hftp0.b_message).b = v;
        String s = gfta.b(bundle0.getString("pass_notification_id_ext"));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkqy)hftp0.b_message).c = s;
        int v1 = bundle0.getInt("target_valuable_type");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkqy)hftp0.b_message).d = v1;
        int v2 = bundle0.getInt("pass_notification_hash_ext");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkqy)hftp0.b_message).e = v2;
        return (hkqy)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

