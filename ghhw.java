public final class ghhw extends ghhy {
    public final ghhq a;
    private final String b;

    public ghhw(ghhq ghhq0, String s) {
        this.a = ghhq0;
        this.b = s;
    }

    @Override  // ghhy
    public final void c(StringBuilder stringBuilder0) {
        String s = this.b;
        if(s != null) {
            stringBuilder0.append(s);
            return;
        }
        stringBuilder0.append("</");
        stringBuilder0.append(this.a.a);
        stringBuilder0.append('>');
    }

    @Override
    public final String toString() {
        return "End Tag: " + this.a.a;
    }
}

