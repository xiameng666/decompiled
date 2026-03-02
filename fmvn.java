public final class fmvn {
    public fmvh a;
    private static final fmvh b;
    private final fmvl c;

    static {
        fmvn.b = new fmvm();
    }

    public fmvn(fmvl fmvl0, boolean z, gfsx gfsx0) {
        this.a = fmvn.b;
        this.c = fmvl0;
        CharSequence charSequence0 = fmvl0.a.getText(0x7F150D12);  // string:delete_conversation_button "Delete"
        fmvi fmvi0 = new fmvi(this);
        ((fyju)fmvl0.b).M(charSequence0, fmvi0);
        CharSequence charSequence1 = fmvl0.a.getText(0x1040000);
        fmvj fmvj0 = new fmvj(this);
        ((fyju)fmvl0.b).G(charSequence1, fmvj0);
        fmvk fmvk0 = new fmvk(this);
        ((fyju)fmvl0.b).J(fmvk0);
        fmvl0.d = z;
        fmvl0.b();
        String s = fmvl0.a();
        gfsx0.f(s);
        fmvl0.c = s;
        fmvl0.b();
    }
}

