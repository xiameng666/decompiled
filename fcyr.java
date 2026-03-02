import android.content.Intent;
import j..util.Optional;

public final class fcyr {
    public final Optional a;
    public final Optional b;
    public final Optional c;

    private fcyr() {
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    public fcyr(Intent intent0) {
        this.a = Optional.ofNullable(intent0.getStringExtra("WEAR_DEVICE_NAME"));
        this.b = Optional.ofNullable(intent0.getStringExtra("WEAR_OEM"));
        this.c = Optional.ofNullable(intent0.getStringExtra("WEAR_PEER_ID"));
    }

    public final boolean a() {
        fcyn fcyn0 = new fcyn();
        return ((Boolean)this.b.map(fcyn0).orElse(Boolean.valueOf(false))).booleanValue();
    }
}

