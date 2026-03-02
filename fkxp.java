import android.content.Intent;

public final class fkxp implements Runnable {
    public final fkwo a;

    public fkxp(fkwo fkwo0) {
        this.a = fkwo0;
    }

    @Override
    public final void run() {
        int v = fkvw.a(this.a.a, this.a.b);
        Intent intent0 = new Intent("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED").putExtra("account_index", v);
        this.a.a.sendBroadcast(intent0);
    }
}

