import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

public final class cct {
    public final ceq a;
    public final cer b;
    public final gtj c;
    public cgq d;

    public cct(ceq ceq0, cer cer0) {
        this(ceq0, cer0, 0.0f, new cgq(cat.a));
    }

    public cct(ceq ceq0, cer cer0, float f, cgq cgq0) {
        this.a = ceq0;
        this.b = cer0;
        this.c = new ParcelableSnapshotMutableFloatState(f);
        this.d = cgq0;
    }
}

