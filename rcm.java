public final class rcm {
    public int a;
    public int b;
    public String c;

    @Override
    public final String toString() {
        Integer integer0 = (int)this.a;
        return rdi.p.containsKey(integer0) ? "Response Code: " + ((rdi)rdi.p.get(integer0)).toString() + ", Debug Message: " + this.c : "Response Code: " + rdi.a.toString() + ", Debug Message: " + this.c;
    }
}

