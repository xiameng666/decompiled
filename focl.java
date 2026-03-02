public final class focl implements gful_cronetEngineProvider {
    public final focq a;

    public focl(focq focq0) {
        this.a = focq0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        frpd[] arr_frpd = {new frpd("part_of_the_view_is_visible", Boolean.class), new frpd("is_laid_out", Boolean.class), new frpd("is_shown", Boolean.class)};
        Object object0 = this.a.a.e("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", arr_frpd);
        ((frpe)object0).d();
        return object0;
    }
}

