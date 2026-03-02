import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public final class bfec {
    private static final bboh a;
    private final bcyv b;
    private final bdbt c;
    private final Context d;
    private final bdzu e;

    static {
        bfec.a = bboh.b("SharedPasswordsSubscriber", bbcu.cX);
    }

    public bfec(bcyv bcyv0, bdbt bdbt0, bdzu bdzu0, Context context0) {
        this.b = bcyv0;
        this.c = bdbt0;
        this.e = bdzu0;
        this.d = context0;
    }

    public final Object a(String s, ibrl ibrl0) {
        bfea bfea0;
        if((ibrl0 instanceof bfea)) {
            bfea0 = (bfea)ibrl0;
            int v = bfea0.c;
            if((v & 0x80000000) == 0) {
                bfea0 = new bfea(this, ibrl0);
            }
            else {
                bfea0.c = v - 0x80000000;
            }
        }
        else {
            bfea0 = new bfea(this, ibrl0);
        }
        Object object0 = bfea0.a;
        Object object1 = ibrx.a;
        switch(bfea0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.a(s).a.c(null).e(new bdbz());
                bfea0.c = 1;
                object0 = ictn.b(evql0, bfea0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public static Object b(bfec bfec0, ibrl ibrl0) {
        Object object7;
        Object object6;
        Object object4;
        String s1;
        bfec bfec2;
        Object object3;
        Object object2;
        bfec bfec1;
        bfeb bfeb0;
        if((ibrl0 instanceof bfeb)) {
            bfeb0 = (bfeb)ibrl0;
            int v = bfeb0.d;
            if((v & 0x80000000) == 0) {
                bfeb0 = new bfeb(bfec0, ibrl0);
            }
            else {
                bfeb0.d = v - 0x80000000;
            }
        }
        else {
            bfeb0 = new bfeb(bfec0, ibrl0);
        }
        Object object0 = bfeb0.b;
        Object object1 = ibrx.a;
        switch(bfeb0.d) {
            case 0: {
                ibnx.b(object0);
                bfec1 = bfec0;
                object2 = bfec0.b.a().iterator();
                break;
            }
            case 1: {
                try {
                    String s = bfeb0.f;
                    object3 = bfeb0.a;
                    bfec2 = bfeb0.e;
                    object2 = object3;
                    bfec1 = bfec2;
                    ibnx.b(object0);
                    s1 = s;
                    object2 = object3;
                    bfec1 = bfec2;
                    object4 = object0;
                    goto label_45;
                }
                catch(aztb aztb0) {
                }
                catch(CancellationException cancellationException0) {
                    goto label_66;
                }
                object2 = object3;
                bfec1 = bfec2;
                a.ae(bfec.a.j(), "Subscribing for incoming password sharing invitations failed.", aztb0);
                break;
            }
            case 2: {
                try {
                    object2 = bfeb0.a;
                    bfec1 = bfeb0.e;
                    ibnx.b(object0);
                    break;
                }
                catch(aztb aztb0) {
                    goto label_63;
                }
                catch(CancellationException cancellationException0) {
                    goto label_66;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object5 = ((Iterator)object2).next();
            s1 = (String)object5;
            try {
                bfeb0.e = bfec1;
                bfeb0.a = object2;
                bfeb0.f = s1;
                bfeb0.d = 1;
                object4 = bfec1.a(s1, bfeb0);
                if(object4 != object1) {
                label_45:
                    if(!((Boolean)object4).booleanValue()) {
                        continue;
                    }
                    bfeb0.e = bfec1;
                    bfeb0.a = object2;
                    Intent intent0 = null;
                    bfeb0.f = null;
                    bfeb0.d = 2;
                    Intent intent1 = IntentOperation.getStartIntent(bfec1.d, "com.google.android.gms.credential.manager.operations.PasswordSharingIntentOperation", "com.google.android.gms.credential.manager.operations.PROCESS_INCOMING_PASSWORD_SHARING_INVITATIONS");
                    if(intent1 != null) {
                        intent1.putExtra("component_name", "credential_manager");
                        intent0 = intent1;
                    }
                    if(intent0 == null) {
                        object6 = ibom.a;
                    }
                    else {
                        object7 = ictn.b(bfec1.e.a(s1).g(intent0), bfeb0);
                        if(object7 == object1) {
                            goto label_68;
                        }
                        else {
                            object6 = ibom.a;
                        }
                    }
                    goto label_69;
                }
                return object1;
            }
            catch(aztb aztb0) {
            label_63:
                a.ae(bfec.a.j(), "Subscribing for incoming password sharing invitations failed.", aztb0);
                continue;
            }
            catch(CancellationException cancellationException0) {
            label_66:
                a.ae(bfec.a.j(), "Subscribing for incoming password sharing invitations cancelled.", cancellationException0);
                continue;
            }
        label_68:
            object6 = object7;
        label_69:
            if(object6 != object1) {
                continue;
            }
            return object1;
        }
        return ibom.a;
    }
}

