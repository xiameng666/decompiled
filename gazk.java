public final class gazk extends gazf {
    public final gazh a;
    public final gazh b;
    public final gazh c;
    public final gazh d;
    public final gazh e;
    public final gazh f;
    public final gazh g;
    public final gazh h;
    public final gazh i;
    public final gazh j;
    public final gazh k;
    public final gazh l;
    public final gazh m;
    public final gazh n;
    private final String o;

    public gazk(gazw gazw0) {
        super(gazw0);
        this.o = "FrameReplacement";
        this.a = this.a("not_a_container");
        this.b = this.a("container_not_flex");
        this.c = this.a("container_has_multiple_children");
        this.d = this.a("container_has_min_max_size");
        this.e = this.a("container_has_alignment");
        this.f = this.a("container_width_height_not_set_together");
        this.g = this.a("container_has_relative_spec");
        this.h = this.a("container_align_items_not_supported");
        this.i = this.a("container_flex_direction_not_supported");
        this.j = this.a("container_justify_content_not_supported");
        this.k = this.a("child_has_flex_spec");
        this.l = this.a("child_has_max_size");
        this.m = this.a("unknown_error");
        this.n = this.a("successful_replacement");
    }

    @Override  // gazf
    protected final String b(String s) {
        return this.o + "__" + s;
    }
}

