import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenIntentOperation;
import com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationChimeraWorkflow;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public final class aild {
    public static ailb a;
    public final ailf b;
    public final aiip c;
    public static final baun d;

    static {
        aild.d = new baun(new String[]{"TransactionManager"});
        aild.a = ailb.b(AppContextProvider.a());
    }

    public aild() {
        ailf ailf0 = ailf.b(AppContextProvider.a());
        super();
        this.b = ailf0;
        aiip aiip0 = new aiip();
        aiip0.c = fcfo.b;
        aiip0.d = fcfo.c;
        this.c = aiip0;
        aild.a = ailb.b(AppContextProvider.a());
    }

    public final aila a(byte[] arr_b) {
        try {
            return aild.a.a(arr_b);
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot get transaction by tx id", illegalStateException0, new Object[0]);
            return null;
        }
    }

    public static String b(byte[] arr_b) {
        return arr_b == null ? "null_transaction" : bboy.c(arr_b);
    }

    public static void c(Context context0, hhqx hhqx0, String s, byte[] arr_b, hhra hhra0, hhqs hhqs0) {
        ByteString hfsf0 = hhqx0.c;
        Intent intent0 = TransactionReplyIntentOperation.a(s, arr_b, hhtt.e);
        if(hfsf0 == null) {
            TransactionReplyIntentOperation.a.f("Ack requests should have a txId, none was provided", new Object[0]);
            intent0 = null;
        }
        else {
            intent0.putExtra("transaction_id", hfsf0.toByteArray());
            if(hhra0 != null) {
                intent0.putExtra("syncState", hhra0);
            }
            if(hhqs0 != null) {
                intent0.putExtra("trigger", hhqs0);
            }
            if(hhqx0 != null) {
                intent0.putExtra("txRequest", hhqx0.toBytesArray());
            }
        }
        context0.startService(intent0);
    }

    public final boolean d(aila aila0, int v) {
        ailb ailb1;
        aila aila1;
        String s;
        ReentrantLock reentrantLock0;
        ailb ailb0;
        try {
            ailb0 = aild.a;
            if(aila0 == null) {
                return false;
            }
            reentrantLock0 = ailb.b;
            reentrantLock0.lock();
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
            return false;
        }
        try {
            ailb0.f();
            s = ailb.c(aila0);
            String s1 = ailb.c.a(s);
            if(s1 != null) {
                aila1 = aila.a(s1);
                if(aila1 != null) {
                    int v1 = aila1.h;
                    if(!ailg.c(v1, v)) {
                        ailb.d.m("updateTransactionState found incompatible state update from to " + ailg.a(v1) + " to " + ailg.a(v) + " for transaction" + s, new Object[0]);
                        ailb.c.c();
                        goto label_15;
                    }
                    goto label_17;
                }
                goto label_31;
            }
            goto label_35;
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        try {
        label_15:
            reentrantLock0.unlock();
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
        }
        return false;
        try {
            try {
            label_17:
                ailb1 = ailb0;
            }
            catch(IOException iOException0) {
                goto label_39;
            }
            try {
                aila aila2 = new aila(aila1.a, aila1.b, aila1.c, aila1.d, aila1.e, aila1.f, v, aila1.g);
                if(!ailb.c.d(s, aila2.toString(), s1)) {
                    ailb1.e();
                    ailb.d.f("Tx cache storage failed internally in updateTransactionState", new Object[0]);
                    goto label_22;
                }
                goto label_24;
            }
            catch(IOException iOException0) {
                goto label_40;
            }
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        try {
        label_22:
            reentrantLock0.unlock();
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
        }
        return false;
        try {
        label_24:
            ailb.d.h("Transaction entry " + s + " state is updated to " + ailg.a(v), new Object[0]);
            ailb.c.c();
            goto label_29;
        }
        catch(IOException iOException0) {
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        goto label_40;
        try {
        label_29:
            ailb.b.unlock();
            return true;
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
            return false;
        }
        try {
        label_31:
            ailb.d.f("Transaction entry was found to be corrupted during cache.updateTransactionState : " + s, new Object[0]);
            ailb.c.c();
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        try {
            reentrantLock0.unlock();
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
        }
        return false;
        try {
        label_35:
            ailb.d.m("Could not update transaction state - not found", new Object[0]);
            ailb.c.c();
            goto label_47;
        }
        catch(IOException iOException0) {
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
    label_39:
        ailb1 = ailb0;
        try {
        label_40:
            ailb.d.g("Internal transaction cache error", iOException0, new Object[0]);
            ailb1.e();
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        try {
            ailb.b.unlock();
            return false;
        label_45:
            ailb.b.unlock();
            throw throwable0;
        label_47:
            reentrantLock0.unlock();
        }
        catch(IllegalStateException illegalStateException0) {
            aild.d.g("Cannot update transaction state", illegalStateException0, new Object[0]);
        }
        return false;
    }

    public static final Intent e(Context context0, hhqx hhqx0, String s, byte[] arr_b) {
        try {
            hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
            if((hhpy.b(hhqw0.h) == null ? hhpy.a : hhpy.b(hhqw0.h)) == hhpy.b) {
                hhqw hhqw1 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                if((hhqw1.m == null ? hhpv.a : hhqw1.m).c.size() == 1) {
                    hhqw hhqw2 = hhqx0.e;
                    hhqw hhqw3 = hhqw2 == null ? hhqw.b : hhqw2;
                    if(((hhqw3.m == null ? hhpv.a : hhqw3.m).b & 1) != 0) {
                        hhqw hhqw4 = hhqw2 == null ? hhqw.b : hhqw2;
                        if(((hhqw4.m == null ? hhpv.a : hhqw4.m).b & 2) != 0) {
                            if(hhqw2 == null) {
                                hhqw2 = hhqw.b;
                            }
                            if((hhqw2.m == null ? hhpv.a : hhqw2.m).c.size() == 1) {
                                hhqw hhqw5 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                                switch(hhqp.a(((hhqm)(hhqw5.m == null ? hhpv.a : hhqw5.m).c.get(0)).c)) {
                                    case 0: 
                                    case 1: {
                                        hhqw hhqw6 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                                        if((((hhqm)(hhqw6.m == null ? hhpv.a : hhqw6.m).c.get(0)).b & 1) != 0) {
                                            return SimpleNotificationChimeraWorkflow.t(hhqx0, s, arr_b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new UnsupportedOperationException("Req proto for simple notification malformed.");
                }
            }
            hhqw hhqw7 = hhqx0.e == null ? hhqw.b : hhqx0.e;
            if((hhqw7.m == null ? hhpv.a : hhqw7.m).c.size() != 2) {
                hhqw hhqw8 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                throw new UnsupportedOperationException("Invalid workflow - unexpected number of selectors: " + (hhqw8.m == null ? hhpv.a : hhqw8.m).c.size());
            }
            hhqw hhqw9 = hhqx0.e;
            if(((hhqw9 == null ? hhqw.b : hhqw9).c & 0x400) == 0) {
                throw new UnsupportedOperationException("Req proto misses prompt");
            }
            if(hhqw9 == null) {
                hhqw9 = hhqw.b;
            }
            switch(hhqp.a(((hhqm)(hhqw9.m == null ? hhpv.a : hhqw9.m).c.get(0)).c)) {
                case 0: 
                case 1: {
                    if(((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x400) != 0) {
                        try {
                            ailz.a(hhqx0).a();
                        }
                        catch(aily aily1) {
                            BasicConfirmationChimeraWorkflow.x.g("Error while creating TextProvider", aily1, new Object[0]);
                            throw new UnsupportedOperationException("Req proto for simple notification malformed.");
                        }
                        return BasicConfirmationChimeraWorkflow.t(hhqx0, s, arr_b);
                    }
                    BasicConfirmationChimeraWorkflow.x.f("Request is missing prompt parameters", new Object[0]);
                    throw new UnsupportedOperationException("Req proto for simple notification malformed.");
                }
                case 3: {
                    if(((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x400) == 0) {
                        throw new UnsupportedOperationException("Req proto for DOUBLE_CONFIRMATION malformed");
                    }
                    try {
                        ailz.a(hhqx0).a();
                    }
                    catch(aily aily2) {
                        DoubleConfirmationChimeraWorkflow.x.g("Error while creating TextProvider: ", aily2, new Object[0]);
                        throw new UnsupportedOperationException("Req proto for DOUBLE_CONFIRMATION malformed");
                    }
                    return DoubleConfirmationChimeraWorkflow.t(hhqx0, s, arr_b);
                }
                default: {
                    if(((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x400) == 0) {
                        PinConfirmationChimeraWorkflow.x.f("Malformed request: " + ((ProtoLiteMessage)hhqx0).toString(), new Object[0]);
                    }
                    else {
                        try {
                            ailz.a(hhqx0).a();
                        }
                        catch(aily aily0) {
                            PinConfirmationChimeraWorkflow.x.g("Error while creating TextProvider: %s", aily0, new Object[0]);
                            throw new UnsupportedOperationException("Req proto for PIN_CONFIRMATION malformed");
                        }
                        hhqw hhqw10 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                        hhpv hhpv0 = hhqw10.m == null ? hhpv.a : hhqw10.m;
                        if(hhpv0.c.size() > 0) {
                            hhqm hhqm0 = (hhqm)hhpv0.c.get(0);
                            if(hhqm0.e.size() == 3) {
                                return PinConfirmationChimeraWorkflow.t(hhqx0, s, arr_b);
                            }
                            PinConfirmationChimeraWorkflow.x.f("Unexpected number of pin options found: " + hhqm0.e.size(), new Object[0]);
                        }
                        else {
                            PinConfirmationChimeraWorkflow.x.f("Request has 0 SelectorDescriptors", new Object[0]);
                        }
                    }
                    throw new UnsupportedOperationException("Req proto for PIN_CONFIRMATION malformed");
                }
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            aiju aiju0 = new aiju(context0);
            aiju0.d = 2;
            aiju0.a();
            throw unsupportedOperationException0;
        }
    }

    public static long f(hhqx hhqx0) {
        long v = hhqx0.d;
        long v1 = (hhqx0.e == null ? hhqw.b : hhqx0.e).d;
        Long.valueOf(v).getClass();
        return v1 - v;
    }

    public final void g(Context context0, hhqx hhqx0, String s, byte[] arr_b, boolean z) {
        Context context1;
        aila aila3;
        aila aila2;
        long v7;
        long v6;
        long v5;
        aila aila1;
        baun baun0;
        String s3;
        byte[] arr_b3;
        hhqw hhqw2;
        Intent intent2;
        hhqx hhqx2;
        ReentrantLock reentrantLock0;
        ailb ailb0;
        long v4;
        long v3;
        String s1 = s;
        byte[] arr_b1 = arr_b;
        long v = SystemClock.elapsedRealtime();
        long v1 = (hhqx0.e == null ? hhqw.b : hhqx0.e).d;
        if(Long.compare(v, v1) > 0) {
            aild.d.h("Authzen prompt was supposed to be expired based on device clock, expiry=%s, now=%s", new Object[]{v1, v});
            aiju aiju0 = new aiju(context0);
            aiju0.d = 16;
            aiju0.b = true;
            aiju0.a();
        }
        try {
            hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
            int v2 = hhqe.a(hhqw0.e) == 0 ? 1 : hhqe.a(hhqw0.e);
            v3 = SystemClock.elapsedRealtime();
            v4 = System.currentTimeMillis();
            if(v2 - 1 != 1) {
                switch(v2 - 1) {
                    case 11: {
                        batl.s(hhqx0);
                        batl.q(s1);
                        Intent intent0 = SecondScreenIntentOperation.getStartIntent(AppContextProvider.a(), SecondScreenIntentOperation.class, "com.google.android.gms.auth.authzen.transaction.secondscreen.START_FLOW");
                        intent0.putExtra("account", s1);
                        intent0.putExtra("tx_request", hhqx0.toBytesArray());
                        intent0.putExtra("encryption_key_handle", arr_b1);
                        context0.startService(intent0);
                        return;
                    }
                    case 100: {
                        aild.d.h("Handling TX_SYNC_PING", new Object[0]);
                        aild.i(context0, hhqx0, s1, arr_b1, hhqj.a);
                        return;
                    }
                    default: {
                        aiju aiju1 = new aiju(context0);
                        aiju1.d = 18;
                        aiju1.a();
                        throw new UnsupportedOperationException("Unknown workflow. Transaction not handled for prompt type: " + hhqe.b(v2));
                    }
                }
            }
            aila aila0 = this.a(hhqx0.c.toByteArray());
            if(aila0 != null) {
                if(!z || !ailg.c(aila0.h, 46)) {
                    Object[] arr_object = {aild.b(hhqx0.c.toByteArray())};
                    aild.d.d("Prompt for TxRequest (txId=%s) already shown, stopping...", arr_object);
                    return;
                }
                hhqx hhqx1 = aila0.a;
                String s2 = aila0.b;
                byte[] arr_b2 = aila0.c;
                aild.c(context0, hhqx1, s2, arr_b2, hhra.c, hhqs.d);
                if(!this.d(aila0, 46)) {
                    return;
                }
                hhqw hhqw1 = hhqx1.e == null ? hhqw.b : hhqx1.e;
                hhpy hhpy0 = hhpy.b(hhqw1.h) == null ? hhpy.a : hhpy.b(hhqw1.h);
                if(!hhpy0.equals(hhpy.c) && !hhpy0.equals(hhpy.a)) {
                    Intent intent1 = aild.e(context0, hhqx1, s2, arr_b2);
                    this.b.h(hhqx1, intent1, aila0.e, aila0.f, true);
                    return;
                }
                TransactionReplyIntentOperation.c(hhqx1.c.toByteArray());
                return;
            }
            if(z) {
                Object[] arr_object1 = {aild.b(hhqx0.c.toByteArray())};
                aild.d.d("Can\'t trigger TxRequest (txId=%s) - not found in the cache", arr_object1);
                return;
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            context1 = context0;
            hhqx2 = hhqx0;
            goto label_198;
        }
        try {
            ailb0 = aild.a;
            reentrantLock0 = ailb.b;
            reentrantLock0.lock();
            goto label_61;
        }
        catch(IllegalStateException illegalStateException0) {
            v6 = v4;
            v7 = v3;
            hhqx2 = hhqx0;
            goto label_164;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
        }
        hhqx2 = hhqx0;
        context1 = context0;
        goto label_198;
    label_61:
        if(hhqx0 == null) {
            try {
                ailb.d.f("can\'t add transaction cache entry: null request to cache", new Object[0]);
                goto label_126;
            }
            catch(IOException iOException0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_152;
            }
            catch(Throwable throwable0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_159;
            }
        }
        else if(s1 == null) {
            goto label_146;
        label_152:
            aila1 = null;
            try {
            label_153:
                ailb0.e();
                ailb.d.g("Transaction cache contents have been corrupted and cleared", iOException0, new Object[0]);
            }
            catch(Throwable throwable0) {
                goto label_159;
            }
            try {
            label_155:
                ailb.b.unlock();
                aila3 = aila1;
                goto label_166;
            label_159:
                ailb.b.unlock();
                throw throwable0;
            label_161:
                reentrantLock0.unlock();
                goto label_165;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                context1 = context0;
                goto label_198;
            }
            try {
            label_164:
                aild.d.g("Cannot add transaction", illegalStateException0, new Object[0]);
            label_165:
                aila3 = null;
            label_166:
                if(aila3 != null) {
                    TransactionReplyIntentOperation.c(aila3.a.c.toByteArray());
                }
                if(((hhqx2.e == null ? hhqw.b : hhqx2.e).c & 0x400) != 0) {
                    intent2 = aild.e(context0, hhqx0, s, arr_b);
                    hhqw2 = hhqx2.e == null ? hhqw.b : hhqx2.e;
                    int v8 = hhqw2.e;
                    switch((hhqe.a(v8) == 0 ? 1 : hhqe.a(v8)) - 1) {
                        case 1: {
                            goto label_176;
                        }
                        case 100: {
                            return;
                        }
                    }
                    int v9 = hhqe.a(v8);
                    aild.d.f("Unexpected tx request type: " + hhqe.b((v9 == 0 ? 1 : v9)), new Object[0]);
                    return;
                label_176:
                    if((hhpy.b(hhqw2.h) == null ? hhpy.a : hhpy.b(hhqw2.h)) != hhpy.d) {
                        arr_b3 = hhqx2.c.toByteArray();
                        context1 = context0;
                        goto label_183;
                    }
                    goto label_189;
                }
                goto label_192;
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                context1 = context0;
                goto label_198;
            }
        }
        else {
            try {
                try {
                    if(s1.isEmpty()) {
                        goto label_146;
                    }
                    else if(arr_b1 != null && arr_b1.length != 0) {
                        s3 = ailb.d(hhqx0);
                        baun0 = ailb.d;
                        baun0.h("adding transaction to cache: " + s3, new Object[0]);
                        if(s3 == null) {
                            goto label_114;
                        }
                        else {
                            String s4 = ailb.c.a(s3);
                            if(s4 == null) {
                                aila1 = null;
                            }
                            else {
                                baun0.d("Found transaction: " + s4, new Object[0]);
                                aila1 = aila.a(s4);
                            }
                            v5 = aild.f(hhqx0) + v3;
                            hhqx2 = hhqx0;
                            goto label_85;
                        }
                    }
                    else {
                        goto label_141;
                    }
                    goto label_166;
                }
                catch(IOException iOException0) {
                    v6 = v4;
                    v7 = v3;
                    hhqx2 = hhqx0;
                    goto label_152;
                }
                try {
                    v5 = aild.f(hhqx0) + v3;
                    hhqx2 = hhqx0;
                    goto label_85;
                }
                catch(IOException iOException0) {
                }
            }
            catch(Throwable throwable0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_159;
            }
            v6 = v4;
            v7 = v3;
            hhqx2 = hhqx0;
            goto label_153;
            try {
            label_85:
                v6 = v4;
                arr_b1 = arr_b;
                aila2 = new aila(hhqx2, s1, arr_b, v5, v3, v4, 40, null);
                v6 = v4;
                arr_b1 = arr_b;
                s1 = s1;
                v7 = v3;
            }
            catch(IOException iOException0) {
                v6 = v4;
                arr_b1 = arr_b;
                s1 = s1;
                v7 = v3;
                goto label_153;
            }
            catch(Throwable throwable0) {
                s1 = s1;
                v7 = v3;
                goto label_159;
            }
            try {
                String s5 = aila2.toString();
                if(s5 == null) {
                    throw new IllegalStateException("Error serializing new entry: " + s3);
                }
                if(!ailb.c.d(s3, s5, s4)) {
                    ailb0.e();
                    throw new IllegalStateException("Transaction cache storage failed internally during add");
                }
                ailb0.f();
                ailb.c.c();
                goto label_155;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_159;
            }
            goto label_153;
            try {
            label_114:
                baun0.f("Cache was asked to add an entry with a null key", new Object[0]);
            }
            catch(IOException iOException0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_152;
            }
            catch(Throwable throwable0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_159;
            }
            try {
            label_126:
                reentrantLock0.unlock();
                v6 = v4;
                aila3 = null;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_166;
            }
            catch(IllegalStateException illegalStateException0) {
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                goto label_164;
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                context1 = context0;
                hhqx2 = hhqx0;
                goto label_198;
            }
            try {
            label_141:
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                ailb.d.f("can\'t add transaction cache entry: null or empty key handle", new Object[0]);
                goto label_161;
            label_146:
                v6 = v4;
                v7 = v3;
                hhqx2 = hhqx0;
                ailb.d.f("can\'t add transaction cache entry: null or empty account", new Object[0]);
                goto label_161;
            }
            catch(IOException iOException0) {
                goto label_152;
            }
            catch(Throwable throwable0) {
                goto label_159;
            }
        }
        goto label_166;
        try {
        label_183:
            aild.h(arr_b3, 2, context1);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            goto label_198;
        }
        try {
            this.b.h(hhqx0, intent2, v7, v6, false);
            return;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            hhqx2 = hhqx0;
            goto label_198;
        }
        try {
        label_189:
            context1 = context0;
            new hfuh(hhqw2.l, hhqw.a);
            return;
        label_192:
            context1 = context0;
            aiju aiju2 = new aiju(context1);
            aiju2.d = 17;
            aiju2.a();
            throw new UnsupportedOperationException("The request proto for GENERIC_APPROVAL was malformed");
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
        }
    label_198:
        aild.d.g("Error handling authzen event", unsupportedOperationException0, new Object[0]);
        aild.i(context1, hhqx2, s1, arr_b1, hhqj.d);
    }

    public static void h(byte[] arr_b, int v, Context context0) {
        aiju aiju0 = new aiju(context0);
        aiju0.b(arr_b);
        aiju0.e = v;
        aiju0.a();
    }

    private static void i(Context context0, hhqx hhqx0, String s, byte[] arr_b, hhqj hhqj0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhqy)hftp0.b_message).c = hhqj0.j;
        ((hhqy)hftp0.b_message).b |= 1;
        hhqy hhqy0 = (hhqy)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hhqx0.getClass();
        ((hhqu)hftv0).c = hhqx0;
        ((hhqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhqu hhqu0 = (hhqu)hftp1.b_message;
        hhqy0.getClass();
        hhqu0.d = hhqy0;
        hhqu0.b |= 2;
        byte[] arr_b1 = ((hhqu)hftp1.N_build()).toBytesArray();
        context0.startService(TransactionReplyIntentOperation.b(s, arr_b, hhqx0, new hhts(hhtt.d, arr_b1)));
    }
}

