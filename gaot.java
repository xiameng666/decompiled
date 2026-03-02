import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.IntermediatePaymentData;
import com.google.android.gms.wallet.callback.PaymentAuthorizationResult;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import j..util.Objects;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class gaot implements Handler.Callback, gaoq {
    final Map a;
    public CountDownLatch b;
    public Messenger c;
    private final AtomicInteger d;
    private final Context e;
    private final clil f;
    private final String g;
    private final String h;
    private Messenger i;
    private boolean j;

    public gaot(Context context0, String s) {
        this.d = new AtomicInteger(1);
        this.j = false;
        this.a = new bxd();
        this.b = new CountDownLatch(1);
        this.h = "com.google.android.gms.wallet.callback.PAYMENT_DATA_CALLBACKS";
        this.g = s;
        this.e = context0;
        this.f = new gaor(this);
    }

    @Override  // gaoq
    public final fbyg a(fbyf fbyf0, int v) {
        fbyg fbyg2;
        fbyg fbyg1;
        fbyg fbyg0;
        CallbackOutput callbackOutput1;
        String s1;
        Integer integer0;
        int v5;
        CountDownLatch countDownLatch0;
        long v1 = SystemClock.elapsedRealtime() + ((long)v);
        CallbackInput callbackInput0 = new CallbackInput();
        Objects.requireNonNull(callbackInput0);
        callbackInput0.a = (fbyi.b(fbyf0.b) == null ? fbyi.d : fbyi.b(fbyf0.b)).a();
        int v2 = fbyf0.b;
        if((fbyi.b(v2) == null ? fbyi.d : fbyi.b(v2)) == fbyi.c) {
            fbyj fbyj0 = (fbyj)gcvs.b(fbyf0.c.toByteArray(), ((Parser)((ProtoLiteMessage)fbyj.a).jf(7, null)));
            String s = fbyj0.b;
            batl.t(s, "JSON cannot be null!");
            IntermediatePaymentData intermediatePaymentData0 = new IntermediatePaymentData(s, null);
            intermediatePaymentData0.b = gcur.a(fbyj0.c.toByteArray(), this.getClass().getClassLoader());
            callbackInput0.b = bauc.n(intermediatePaymentData0);
        }
        else if((fbyi.b(v2) == null ? fbyi.d : fbyi.b(v2)) == fbyi.b) {
            callbackInput0.b = fbyf0.c.toByteArray();
        }
        int v3 = callbackInput0.a;
        synchronized(this) {
            if(!this.j) {
                throw new IllegalStateException("Service connection has not been requested.");
            }
            countDownLatch0 = this.b;
        }
        __monitor_exit(this);
        if(this.i == null) {
            this.i = new Messenger(new clht(Looper.getMainLooper(), this));
        }
        if(countDownLatch0 != null) {
            CallbackOutput callbackOutput0 = gaot.f(countDownLatch0, v1, v3);
            if(callbackOutput0 != null) {
                return gaot.e(callbackOutput0);
            }
        }
        int v4 = this.d.getAndIncrement();
        try {
            __monitor_enter(this);
            v5 = FIN.finallyOpen$NT();
            Messenger messenger0 = this.c;
            if(messenger0 != null) {
                gaos gaos0 = new gaos();
                integer0 = v4;
                this.a.put(integer0, gaos0);
                FIN.finallyExec$NT(v5);
                Message message0 = Message.obtain();
                Bundle bundle0 = new Bundle();
                switch(callbackInput0.a) {
                    case 1: {
                        s1 = "onPaymentAuthorized Callback";
                        break;
                    }
                    case 2: {
                        s1 = "onPaymentDataChanged Callback";
                        break;
                    }
                    default: {
                        s1 = "Unknown Callback";
                    }
                }
                bundle0.putString("message_task_tag", s1);
                bundle0.putByteArray("extra_callback_input", bauc.n(callbackInput0));
                message0.setData(bundle0);
                message0.replyTo = this.i;
                message0.arg1 = v4;
                messenger0.send(message0);
                callbackOutput1 = gaot.f(gaos0.a, v1, v3);
                if(callbackOutput1 == null) {
                    byte[] arr_b = gaos0.b.getByteArray("extra_callback_output");
                    if(arr_b == null) {
                        arr_b = new byte[0];
                    }
                    fbyg0 = gaot.e(((CallbackOutput)bauc.a(arr_b, CallbackOutput.CREATOR)));
                    goto label_60;
                }
                goto label_68;
            }
            goto label_77;
        }
        catch(Throwable throwable1) {
            goto label_83;
        }
    label_60:
        synchronized(this) {
            this.a.remove(integer0);
        }
        __monitor_exit(this);
        return fbyg0;
        try {
        label_68:
            fbyg1 = gaot.e(callbackOutput1);
        }
        catch(Throwable throwable1) {
            goto label_83;
        }
        synchronized(this) {
            this.a.remove(integer0);
        }
        __monitor_exit(this);
        return fbyg1;
        try {
        label_77:
            fbyg2 = gaot.e(gaot.d(4, v3));
            FIN.finallyCodeBegin$NT(v5);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v5);
        }
        catch(Throwable throwable1) {
        label_83:
            synchronized(this) {
                this.a.remove(Integer.valueOf(v4));
            }
            __monitor_exit(this);
            throw throwable1;
        }
        synchronized(this) {
            this.a.remove(Integer.valueOf(v4));
        }
        __monitor_exit(this);
        return fbyg2;
    }

    @Override  // gaoq
    public final void b() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.j) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        this.j = true;
        bbic bbic0 = bbic.a();
        Intent intent0 = new Intent(this.h).setPackage(this.g);
        if(bbic0.d(this.e, intent0, this.f, 1)) {
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException("Failed to bind to the service.");
    }

    @Override  // gaoq
    public final void c() {
        synchronized(this) {
            if(this.j) {
                bbic.a().b(this.e, this.f);
                this.j = false;
            }
        }
    }

    private static CallbackOutput d(int v, int v1) {
        fbdh fbdh0 = CallbackOutput.b();
        fbdh0.a(v1);
        fbdh0.b(v);
        return fbdh0.a;
    }

    private static final fbyg e(CallbackOutput callbackOutput0) {
        fbyh fbyh0;
        fbyi fbyi0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbyg.a).v_newBuilder();
        switch(callbackOutput0.a) {
            case 1: {
                fbyi0 = fbyi.b;
                break;
            }
            case 2: {
                fbyi0 = fbyi.c;
                break;
            }
            default: {
                fbyi0 = fbyi.a;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbyg fbyg0 = (fbyg)hftp0.b_message;
        fbyg0.d = fbyi0.a();
        int v = callbackOutput0.b;
        switch(v) {
            case 1: {
                fbyh0 = fbyh.b;
                break;
            }
            case 2: {
                fbyh0 = fbyh.c;
                break;
            }
            case 3: {
                fbyh0 = fbyh.d;
                break;
            }
            case 4: {
                fbyh0 = fbyh.e;
                break;
            }
            default: {
                fbyh0 = v == 5 ? fbyh.f : fbyh.a;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbyg fbyg1 = (fbyg)hftp0.b_message;
        fbyg1.e = fbyh0.a();
        int v1 = callbackOutput0.a;
        if(v1 == 2) {
            PaymentDataRequestUpdate paymentDataRequestUpdate0 = (PaymentDataRequestUpdate)callbackOutput0.a(PaymentDataRequestUpdate.CREATOR);
            if(paymentDataRequestUpdate0 != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fbyl.a).v_newBuilder();
                String s = paymentDataRequestUpdate0.a;
                if(s != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((fbyl)hftp1.b_message).b = s;
                }
                Bundle bundle0 = paymentDataRequestUpdate0.b;
                if(bundle0 != null) {
                    ByteString hfsf0 = ByteString.copyFrom(gcur.c(bundle0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((fbyl)hftp1.b_message).c = hfsf0;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fbyg fbyg2 = (fbyg)hftp0.b_message;
                fbyl fbyl0 = (fbyl)hftp1.N_build();
                fbyl0.getClass();
                fbyg2.c = fbyl0;
                fbyg2.b = 4;
            }
        }
        else if(v1 == 1) {
            PaymentAuthorizationResult paymentAuthorizationResult0 = (PaymentAuthorizationResult)callbackOutput0.a(PaymentAuthorizationResult.CREATOR);
            if(paymentAuthorizationResult0 != null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fbyk.a).v_newBuilder();
                String s1 = paymentAuthorizationResult0.a;
                if(s1 != null) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((fbyk)hftp2.b_message).b = s1;
                }
                Bundle bundle1 = paymentAuthorizationResult0.b;
                if(bundle1 != null) {
                    ByteString hfsf1 = ByteString.copyFrom(gcur.c(bundle1));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((fbyk)hftp2.b_message).c = hfsf1;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fbyg fbyg3 = (fbyg)hftp0.b_message;
                fbyk fbyk0 = (fbyk)hftp2.N_build();
                fbyk0.getClass();
                fbyg3.c = fbyk0;
                fbyg3.b = 3;
            }
        }
        String s2 = callbackOutput0.d;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fbyg)hftp0.b_message).f = s2;
        }
        return (fbyg)hftp0.N_build();
    }

    private static final CallbackOutput f(CountDownLatch countDownLatch0, long v, int v1) {
        if(SystemClock.elapsedRealtime() < v) {
            try {
                return countDownLatch0.await(v - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS) ? null : gaot.d(2, v1);
            }
            catch(InterruptedException unused_ex) {
                return gaot.d(3, v1);
            }
        }
        return gaot.d(2, v1);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        gaos gaos0;
        if(message0.what == 1) {
            synchronized(this) {
                Integer integer0 = (int)message0.arg1;
                gaos0 = (gaos)this.a.get(integer0);
                this.a.remove(integer0);
            }
            if(gaos0 != null) {
                gaos0.b = message0.getData();
                gaos0.a.countDown();
            }
            return true;
        }
        return false;
    }
}

