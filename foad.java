public final class foad {
    public foan a;
    private foac b;

    public foad() {
    }

    public foad(foaf foaf0) {
        this.b = foaf0.b;
        this.a = foaf0.a;
    }

    public final foaf a() {
        foac foac0 = this.b;
        if(foac0 != null) {
            foan foan0 = this.a;
            if(foan0 != null) {
                return new foaf(foac0, foan0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" onContinueWithAccountListenerWithAsyncCallback");
        }
        if(this.a == null) {
            stringBuilder0.append(" features");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(foae foae0) {
        this.b = new foac(foae0);
    }
}

