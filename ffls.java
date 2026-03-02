import android.content.IntentFilter;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.util.Log;
import android.util.StringBuilderPrinter;
import j..util.Objects;
import java.util.NoSuchElementException;

final class ffls implements IBinder.DeathRecipient {
    final fdjb a;
    final IntentFilter[] b;
    final String c;
    final boolean d;
    public final String e;
    final fflv f;

    public ffls(fflv fflv0, fdjb fdjb0, IntentFilter[] arr_intentFilter, String s, boolean z, String s1) {
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super();
        batl.s(fdjb0);
        this.a = fdjb0;
        this.b = arr_intentFilter;
        this.c = s;
        this.d = z;
        this.e = s1;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "Binder died for listener: " + Integer.toHexString(this.a.hashCode()) + ". Removing if registered.");
        }
        IBinder iBinder0 = this.a.asBinder();
        try {
            this.f.b.remove(iBinder0);
            iBinder0.unlinkToDeath(this, 0);
        }
        catch(NoSuchElementException noSuchElementException0) {
            Log.e("WearableService", String.format("binderDied: Attempt to unlink an unregistered listener record [%s]", this), noSuchElementException0);
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ListenerRecord[");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        stringBuilder0.append(", listener=");
        stringBuilder0.append(Integer.toHexString(this.a.hashCode()));
        stringBuilder0.append(", listenerAsBinder=");
        stringBuilder0.append(Integer.toHexString(this.a.asBinder().hashCode()));
        stringBuilder0.append(", channelTokenString=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", alive=");
        stringBuilder0.append(this.a.asBinder().isBinderAlive());
        stringBuilder0.append(", firstParty=");
        stringBuilder0.append(this.d);
        IntentFilter[] arr_intentFilter = this.b;
        if(arr_intentFilter != null && arr_intentFilter.length > 0) {
            stringBuilder0.append("\n");
            StringBuilderPrinter stringBuilderPrinter0 = new StringBuilderPrinter(stringBuilder0);
            for(int v = 0; v < arr_intentFilter.length; ++v) {
                arr_intentFilter[v].dump(stringBuilderPrinter0, "  ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

