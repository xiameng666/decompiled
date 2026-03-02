public final class etoy implements etqp {
    public final String a;

    public etoy(String s) {
        this.a = s;
    }

    @Override  // etqp
    public final Object a(etqg etqg0) {
        String s = this.a;
        if(etqg0.d.equals(s)) {
            throw new etqo(new etqf("Wants to update the state to existing one."));
        }
        etqg0.d = s;
        etqg0.j = null;
        return etqg0;
    }
}

