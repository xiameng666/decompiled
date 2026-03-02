import j..util.Objects;

final class erdz extends ali {
    final ered a;

    public erdz(ered ered0) {
        Objects.requireNonNull(ered0);
        this.a = ered0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        erqc erqc0 = ered.d;
        erqc0.d("GmsBiometricPrompt authentication error: %d-%s", new Object[]{v, charSequence0});
        if(v == 10) {
            ered ered0 = this.a;
            if(ered0.aj == 0) {
                erqc0.d("Showing CancelConfirmationFragment", new Object[0]);
                new erds().show(ered0.getParentFragmentManager(), "smartdevice.dialogfragment");
                if(hyis.t()) {
                    ered.E(ered0);
                }
            }
            return;
        }
        this.a.ag.C(1);
    }

    @Override  // ali
    public final void c(alj alj0) {
        ered.d.d("GmsBiometricPrompt successfully validated", new Object[0]);
        this.a.ag.C(0);
    }
}

