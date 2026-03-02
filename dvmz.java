import j..util.Objects;

final class dvmz extends edpj {
    final dvmy a;

    public dvmz(dvmy dvmy0) {
        Objects.requireNonNull(dvmy0);
        this.a = dvmy0;
        super();
    }

    @Override  // edpj
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        String s = gfta.b(charSequence0.toString());
        dvnc dvnc0 = this.a.c;
        if(dvnc0 != null) {
            dvnc0.a.a(s);
        }
    }
}

