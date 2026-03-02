import com.google.android.gms.pay.factoryreset.PayFactoryResetChimeraReceiver;

public final class dmkt implements Runnable {
    public final PayFactoryResetChimeraReceiver a;

    public dmkt(PayFactoryResetChimeraReceiver payFactoryResetChimeraReceiver0) {
        this.a = payFactoryResetChimeraReceiver0;
    }

    @Override
    public final void run() {
        ((ggtj)PayFactoryResetChimeraReceiver.b.h()).x("Finished cleanup for all accounts");
        this.a.finishAsync();
    }
}

