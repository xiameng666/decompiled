import android.content.Intent;
import com.android.settingslib.widget.StatusBannerPreference;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgue implements Consumer {
    public final bguf a;
    public final StatusBannerPreference b;
    public final bgva c;

    public bgue(bguf bguf0, StatusBannerPreference statusBannerPreference0, bgva bgva0) {
        this.a = bguf0;
        this.b = statusBannerPreference0;
        this.c = bgva0;
    }

    @Override
    public final void accept(Object object0) {
        this.b.o(this.c.e);
        bguc bguc0 = new bguc(this.a, ((Intent)object0), this.c);
        this.b.l(bguc0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

