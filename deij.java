import androidx.compose.runtime.snapshots.SnapshotStateSet;

public final class deij {
    public final SnapshotStateSet a;
    public final icnj b;

    public deij(icck icck0) {
        ibuq.f(icck0, "scope");
        super();
        this.a = new SnapshotStateSet();
        this.b = iclp.b(gud.a(new deih(this)), icck0, icmy.a(0L, 3), Boolean.valueOf(false));
    }

    public final void a(Object object0) {
        this.a.remove(object0);
    }

    public final void b(Object object0) {
        this.a.add(object0);
    }
}

