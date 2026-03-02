import android.content.Intent;

public final class bmyx implements Runnable {
    public final bmza a;

    public bmyx(bmza bmza0) {
        this.a = bmza0;
    }

    @Override
    public final void run() {
        Intent intent0 = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        this.a.ag.b(intent0);
    }
}

