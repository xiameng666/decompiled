import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;

final class flvx extends BroadcastReceiver {
    final flvy a;

    public flvx(flvy flvy0) {
        Objects.requireNonNull(flvy0);
        this.a = flvy0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(flct.a(context0)) {
            iakr iakr0 = this.a.c;
            if((iakr0 instanceof ianj_grpcChannel)) {
                ((ianj_grpcChannel)iakr0).f();
            }
        }
    }
}

