import java.util.Locale;

public final class albo implements gful_cronetEngineProvider {
    public final hfjb a;

    public albo(hfjb hfjb0) {
        this.a = hfjb0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return String.format(Locale.US, "logWebRtcEvent webRtcSignal session id: %d", ((long)this.a.b));
    }
}

