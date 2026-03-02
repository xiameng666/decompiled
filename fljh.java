import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fljh implements Runnable {
    public final fljw a;
    public final AccountContext b;

    public fljh(fljw fljw0, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = accountContext0;
    }

    @Override
    public final void run() {
        synchronized(this.a.d) {
            Long long0 = this.b.a();
            this.a.f.remove(long0);
        }
    }
}

