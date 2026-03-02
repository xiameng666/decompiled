public final class acv extends acp {
    final acw a;
    final String b;
    final adc c;

    public acv(acw acw0, String s, adc adc0) {
        this.a = acw0;
        this.b = s;
        this.c = adc0;
        super();
    }

    @Override  // acp
    public final void a() {
        this.a.f(this.b);
    }

    @Override  // acp
    public final void b(Object object0) {
        acw acw0 = this.a;
        adc adc0 = this.c;
        String s = this.b;
        Object object1 = acw0.b.get(s);
        if(object1 != null) {
            int v = ((Number)object1).intValue();
            acw0.c.add(s);
            try {
                acw0.a(v, adc0, object0);
                return;
            }
            catch(Exception exception0) {
                this.a.c.remove(this.b);
                throw exception0;
            }
        }
        throw new IllegalStateException(a.j(object0, adc0, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
    }
}

