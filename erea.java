import j..util.Objects;

final class erea extends ali {
    final ered a;

    public erea(ered ered0) {
        Objects.requireNonNull(ered0);
        this.a = ered0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        erqc erqc0 = ered.d;
        erqc0.d("Biometrics/LSKF authentication error: %d-%s", new Object[]{v, charSequence0});
        if(v == 10) {
            erqc0.d("Showing CancelConfirmationFragment", new Object[0]);
            new erds().show(this.a.getParentFragmentManager(), "smartdevice.dialogfragment");
            return;
        }
        this.a.ag.C(1);
    }

    @Override  // ali
    public final void c(alj alj0) {
        ered.d.d("Biometrics/LSKF successfully validated", new Object[0]);
        this.a.ag.C(0);
    }
}

