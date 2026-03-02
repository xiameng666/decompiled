public final class aagi implements aaca {
    public final aahd a;

    public aagi(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // aaca
    public final void a() {
        aahd aahd0 = this.a;
        if(hoju.o()) {
            acp acp0 = aahd0.al;
            if(acp0 == null) {
                aahd0.startActivityForResult(cchk.b(aahd0.requireContext(), aahd0.b.b().b), 10);
            }
            else {
                acp0.b(aahd0.b.b().b);
            }
        }
        else {
            aahd0.startActivityForResult(cchk.b(aahd0.requireContext(), aahd0.b.b().b), 10);
        }
        aahd0.b.f();
    }
}

