import android.media.AudioManager;

public final class fxlb implements ibnf {
    public final fxle a;

    public fxlb(fxle fxle0) {
        this.a = fxle0;
    }

    @Override  // ibnf
    public final Object get() {
        AudioManager audioManager0 = this.a.a;
        return Boolean.valueOf(audioManager0 != null && audioManager0.getRingerMode() == 1);
    }
}

