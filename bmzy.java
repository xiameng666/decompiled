import com.google.android.libraries.logging.uievents.InstanceId;

public final class bmzy {
    public final InstanceId a;
    private final fhvk b;

    public bmzy() {
        fhvk fhvk0 = new fhvk(null);
        this.b = fhvk0;
        this.a = new InstanceId(fhvk0.b.nextInt(fhvk0.a) + 1);
    }

    public final void a(int v) {
        fhvl.a(v, null, this.a);
    }
}

