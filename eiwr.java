import android.content.Context;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.android.gms.play.integrity.api.DisplayListenerData;
import j..time.Duration;
import j..time.Instant;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public final class eiwr implements DisplayManager.DisplayListener {
    public static final int a;
    private final ccmg b;
    private final DisplayManager c;
    private LinkedHashMap d;
    private final ArrayDeque e;

    static {
        bboh.b("IntegrityApiDisplayListener", bbcu.gf);
    }

    public eiwr(DisplayManager displayManager0, Context context0) {
        this.d = new LinkedHashMap();
        this.e = new ArrayDeque(3);
        this.c = displayManager0;
        eiwt.a(context0);
        this.b = new ccmp();
    }

    public final DisplayListenerData a() {
        DisplayListenerData displayListenerData0;
        synchronized(this) {
            this.c();
            int[] arr_v = Collection.-EL.stream(this.d.keySet()).mapToInt(new eiwq()).toArray();
            Arrays.toString(arr_v);
            this.b.a(bbdg.te);
            displayListenerData0 = new DisplayListenerData();
            displayListenerData0.a = arr_v;
            displayListenerData0.b = this.b();
        }
        return displayListenerData0;
    }

    private final long b() {
        long v1;
        synchronized(this) {
            if(this.d.isEmpty()) {
                return -1L;
            }
            v1 = Duration.between(((Instant)Collections.max(this.d.values())), Instant.now()).toMillis();
        }
        return v1;
    }

    private final void c() {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.d;
            Instant instant0 = Instant.now();
            Duration duration0 = hfyg.c(hxoy.a.b().a());
            this.d = (LinkedHashMap)Collection.-EL.stream(linkedHashMap0.entrySet()).filter(new eiwl(duration0, instant0)).collect(Collectors.toMap(new eiwm(), new eiwn(), new eiwo(), new eiwp()));
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
        synchronized(this) {
            this.b.a(bbdg.tg);
            Display display0 = this.c.getDisplay(v);
            if(display0 == null || (display0.getFlags() & 4) != 0) {
                Instant instant0 = Instant.now();
                Integer integer0 = v;
                if(!this.e.contains(integer0)) {
                    this.d.put(integer0, instant0);
                }
            }
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
        synchronized(this) {
            Integer integer0 = v;
            this.d.remove(integer0);
            this.b.a(bbdg.tg);
            ArrayDeque arrayDeque0 = this.e;
            if(arrayDeque0.size() >= 3) {
                arrayDeque0.remove();
            }
            arrayDeque0.add(integer0);
        }
    }
}

