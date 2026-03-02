import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hu extends Handler {
    final hw a;

    public hu(hw hw0, Looper looper0) {
        this.a = hw0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        hx hx0;
        if(message0.what == 1) {
            synchronized(this.a.a) {
                hx0 = (hx)this.a.c.get();
                hu hu0 = this.a.d;
            }
            if(hx0 != null) {
                hw hw0 = hx0.a();
                if(this.a == hw0 && hu0 != null) {
                    lvk lvk0 = (lvk)message0.obj;
                    hx0.d();
                    hx0.d();
                }
            }
        }
    }
}

