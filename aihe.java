import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationChimeraWorkflow;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class aihe {
    public static final baun a;
    private static final Lock b;
    private final aiix c;
    private final aihf d;
    private final aihh e;

    static {
        aihe.a = new baun(new String[]{"AuthZenEventHandler"});
        aihe.b = new ReentrantLock();
    }

    public aihe(Context context0, aild aild0) {
        aiix aiix0 = aiix.a(context0);
        aihf aihf0 = new aihf(context0, aild0);
        aihh aihh0 = new aihh(context0, aild0);
        super();
        batl.s(aiix0);
        this.c = aiix0;
        this.d = aihf0;
        this.e = aihh0;
    }

    public final void a(Context context0, Intent intent0) {
        Intent intent1;
        hhqw hhqw1;
        hhqx hhqx2;
        hhqw hhqw0;
        hhqx hhqx0;
        baun baun0 = aihe.a;
        baun0.h("Handling event: " + intent0.getAction(), new Object[0]);
        aihe.b.lock();
        int v = intent0.getIntExtra("flags", 0);
        try {
            String s = intent0.getAction();
            if(intent0.hasExtra("P")) {
                this.d.a(intent0);
            }
            else if(intent0.hasExtra("syncPayload")) {
                this.e.a(context0, intent0);
            }
            else {
                boolean z = (v & 12) > 0;
                boolean z1 = (v & 2) > 0;
                if("android.intent.action.BOOT_COMPLETED".equals(s) && z1 || "com.google.android.gms.auth.authzen.CHECK_REGISTRATION".equals(s)) {
                    int v2 = aihe.d(s, z, z1);
                    this.c.c(0, v2);
                    if("android.intent.action.BOOT_COMPLETED".equals(s) && z1) {
                        aild.a.e();
                    }
                }
                else if("com.google.android.gms.auth.authzen.REGISTER_NOW".equals(s) || "com.google.android.gms.gcm.REGISTERED".equals(s)) {
                    int v4 = aihe.d(s, z, z1);
                    this.c.c(100, v4);
                }
                else if("AUTHZEN_PROXIMITY_CHALLENGE_EXPIRED".equals(s)) {
                    String s1 = intent0.getStringExtra("account");
                    byte[] arr_b = intent0.getByteArrayExtra("encryption_key_handle");
                    try {
                        byte[] arr_b1 = intent0.getByteArrayExtra("tx_request");
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b1, 0, arr_b1.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hhqx0 = (hhqx)hftv0;
                        hhqw0 = hhqx0.e;
                    }
                    catch(hfur hfur0) {
                        aild.d.g("Unable to parse TxRequest from proximityChallengeTimeout intent", hfur0, new Object[0]);
                        aiju aiju0 = new aiju(context0);
                        aiju0.d = 15;
                        aiju0.a();
                        goto label_101;
                    }
                    if(hhqw0 == null) {
                        hhqw0 = hhqw.b;
                    }
                    hfuh hfuh0 = new hfuh(hhqw0.l, hhqw.a);
                    if(!hfuh0.isEmpty()) {
                        hhqs hhqs0 = hhqs.c;
                        if(hfuh0.contains(hhqs0)) {
                            aild.c(context0, hhqx0, s1, arr_b, hhra.b, hhqs0);
                        }
                    }
                }
                else if("AUTHZEN_NOTIFICATION_EXPIRED".equals(s)) {
                    hhqx hhqx1 = aiko.o(intent0);
                    aild.h(hhqx1.c.toByteArray(), 11, context0);
                    ailf.b(context0).e(ailf.d(hhqx1));
                    aihg.a(context0, intent0, hhqj.i);
                }
                else if("AUTHZEN_NOTIFICATION_DISMISSED".equals(s)) {
                    aild.h(aiko.o(intent0).c.toByteArray(), 12, context0);
                    aihg.a(context0, intent0, hhqj.g);
                }
                else if(!"com.google.android.gms.auth.authzen.TEST_UI".equals(s)) {
                    baun0.f("unknown action: " + s, new Object[0]);
                }
                else if(hpqx.a.c().p()) {
                    String s2 = intent0.getStringExtra("account");
                    try {
                        byte[] arr_b2 = intent0.getByteArrayExtra("tx_request");
                        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b2, 0, arr_b2.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        hhqx2 = (hhqx)hftv1;
                        hhqw1 = hhqx2.e;
                    }
                    catch(hfur hfur1) {
                        ailh.a.n("Invalid tx request", hfur1, new Object[0]);
                        goto label_101;
                    }
                    if(hhqw1 == null) {
                        hhqw1 = hhqw.b;
                    }
                    int v3 = hhqe.a(hhqw1.e) == 0 ? 1 : hhqe.a(hhqw1.e);
                    if(v3 - 1 == 1) {
                        hhqw hhqw2 = hhqx2.e;
                        hhqw hhqw3 = hhqw2 == null ? hhqw.b : hhqw2;
                        if((hhpy.b(hhqw3.h) == null ? hhpy.a : hhpy.b(hhqw3.h)) == hhpy.b) {
                            if(hhqw2 == null) {
                                hhqw2 = hhqw.b;
                            }
                            if((hhqw2.m == null ? hhpv.a : hhqw2.m).c.size() == 1) {
                                intent1 = SimpleNotificationChimeraWorkflow.t(hhqx2, s2, null);
                                ailf.b(context0).h(hhqx2, intent1, SystemClock.elapsedRealtime(), System.currentTimeMillis(), false);
                                goto label_101;
                            }
                            goto label_81;
                        }
                        else {
                        label_81:
                            hhqw hhqw4 = hhqx2.e == null ? hhqw.b : hhqx2.e;
                            if((hhqw4.m == null ? hhpv.a : hhqw4.m).c.size() == 2) {
                                hhqw hhqw5 = hhqx2.e;
                                if(((hhqw5 == null ? hhqw.b : hhqw5).c & 0x400) != 0) {
                                    if(hhqw5 == null) {
                                        hhqw5 = hhqw.b;
                                    }
                                    switch(hhqp.a(((hhqm)(hhqw5.m == null ? hhpv.a : hhqw5.m).c.get(0)).c)) {
                                        case 0: 
                                        case 1: {
                                            intent1 = BasicConfirmationChimeraWorkflow.t(hhqx2, s2, null);
                                            break;
                                        }
                                        case 3: {
                                            intent1 = DoubleConfirmationChimeraWorkflow.t(hhqx2, s2, null);
                                            break;
                                        }
                                        default: {
                                            intent1 = PinConfirmationChimeraWorkflow.t(hhqx2, s2, null);
                                        }
                                    }
                                    ailf.b(context0).h(hhqx2, intent1, SystemClock.elapsedRealtime(), System.currentTimeMillis(), false);
                                }
                            }
                            else {
                                ailf.b(context0).h(hhqx2, null, SystemClock.elapsedRealtime(), System.currentTimeMillis(), false);
                            }
                        }
                    }
                    else {
                        ailh.a.m("Unknown prompt type: " + hhqe.b(v3), new Object[0]);
                    }
                }
            }
        label_101:
        }
        finally {
            aihe.c(context0, aihe.b());
            aihe.b.unlock();
        }
    }

    private static long b() {
        return ((long)(new Random().nextDouble() * 43200000.0)) + 64800000L;
    }

    private static void c(Context context0, long v) {
        long v1 = SystemClock.elapsedRealtime() + v;
        Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.auth.authzen.GcmReceiverService");
        if(hprk.a.b().a()) {
            intent0.setAction("com.google.android.gms.auth.authzen.CHECK_REGISTRATION");
        }
        else {
            intent0.setAction("com.google.android.gms.auth.authzen.REGISTER_NOW");
        }
        ajcm.a();
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, 0, intent0, 0x2000000);
        new bbib(context0).d("AuthZenEventHandler", (hprn.a.b().a() ? 3 : 2), v1, pendingIntent0, "com.google.android.gms");
    }

    private static final int d(String s, boolean z, boolean z1) {
        if("android.intent.action.BOOT_COMPLETED".equals(s) && z1) {
            return 1;
        }
        if(z) {
            return 12;
        }
        if("com.google.android.gms.auth.authzen.CHECK_REGISTRATION".equals(s)) {
            return 4;
        }
        if("com.google.android.gms.auth.authzen.REGISTER_NOW".equals(s)) {
            return 13;
        }
        if("com.google.android.gms.gcm.REGISTERED".equals(s)) {
            return 11;
        }
        aihe.a.m("unknown action: %s", new Object[]{s});
        return 0;
    }
}

