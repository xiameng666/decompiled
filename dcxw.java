import com.google.android.gms.nearby.sharing.common.repository.RadioStatusRepository.radioChangeEvents.3.receiver.1;

public final class dcxw implements ibth {
    public final dcyu a;
    public final RadioStatusRepository.radioChangeEvents.3.receiver.1 b;

    public dcxw(dcyu dcyu0, RadioStatusRepository.radioChangeEvents.3.receiver.1 radioStatusRepository$radioChangeEvents$3$receiver$10) {
        this.a = dcyu0;
        this.b = radioStatusRepository$radioChangeEvents$3$receiver$10;
    }

    @Override  // ibth
    public final Object a() {
        this.a.a.unregisterReceiver(this.b);
        return ibom.a;
    }
}

