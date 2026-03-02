import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import java.io.PrintWriter;
import java.util.Locale;

public final class cysy implements bbnw {
    public final WearableDataListenerChimeraService a;

    public cysy(WearableDataListenerChimeraService wearableDataListenerChimeraService0) {
        this.a = wearableDataListenerChimeraService0;
    }

    @Override  // bbnw
    public final void a(PrintWriter printWriter0, String[] arr_s) {
        printWriter0.println("Flags:");
        printWriter0.printf("  enableTriangleAudioSwitch=%s\n", new Object[]{Boolean.valueOf(hvpp.av())});
        printWriter0.printf("  enableTriangleAudioSwitchForCalling=%s\n", new Object[]{Boolean.valueOf(hvpp.aw())});
        printWriter0.printf("  enableWearablePeripheralApi=%s\n", new Object[]{Boolean.valueOf(hvpp.aH())});
        printWriter0.printf("  enableTaskSchedulerService=%s\n", new Object[]{Boolean.valueOf(hvpp.as())});
        printWriter0.printf("  enableTriangleAnalytics=%s\n", new Object[]{Boolean.valueOf(hvpp.au())});
        printWriter0.printf("  enableWearMessageMonitor=%s\n", new Object[]{Boolean.valueOf(hvpp.aF())});
        printWriter0.printf("  checkPeripheralSupportSwitch=%s\n", new Object[]{Boolean.valueOf(hvpp.u())});
        printWriter0.printf("  supportToggleForTriangleSwitch=%s\n", new Object[]{Boolean.valueOf(hvpp.br())});
        printWriter0.printf("  enableSassForTriangleCallingCase=%s\n", new Object[]{Boolean.valueOf(hvpp.am())});
        printWriter0.printf("  serviceDestroyTimeoutMs=%s\n", new Object[]{hvpg.ax()});
        printWriter0.printf("  protostoreOperationTimeoutMs=%s\n", new Object[]{hvpg.aa()});
        printWriter0.printf("  discoveryBindingOperationTimeoutMs=%s\n", new Object[]{hvpg.v()});
        printWriter0.printf("  wearApiOperationTimeoutMillis=%s\n", new Object[]{hvpg.aK()});
        printWriter0.printf("  refreshTriangleNodeMins=%s\n", new Object[]{hvpg.ab()});
        printWriter0.printf("  AddSassDeviceIntoTriangleCandidate=%s\n", new Object[]{Boolean.valueOf(hvpp.h())});
        Object[] arr_object = {Boolean.valueOf(hvpp.aa())};
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        printWriter0.printf("  enableIdentityAddressMappingForTriangleCandidate=%s\n", arr_object);
        printWriter0.println();
        printWriter0.printf("isTriangleState=%s\n", new Object[]{Boolean.valueOf(wearableDataListenerChimeraService0.i)});
        cyxs cyxs0 = wearableDataListenerChimeraService0.h();
        printWriter0.println("selfNode:");
        if(cyxs0 != null) {
            printWriter0.printf("  %s\n", new Object[]{cyus.j(cyxs0)});
        }
        printWriter0.println("nearbyNodes:");
        for(Object object0: wearableDataListenerChimeraService0.a.values()) {
            printWriter0.printf("  %s\n", new Object[]{cyus.j(((cyxs)object0))});
        }
        printWriter0.println();
        wearableDataListenerChimeraService0.m().m(printWriter0);
        if(hvpp.aF()) {
            printWriter0.println();
            cyvl cyvl0 = wearableDataListenerChimeraService0.e(wearableDataListenerChimeraService0);
            String s = String.format(Locale.US, "wearMessageMonitorDurationHours=%s", hvpg.aM());
            String s1 = String.format(Locale.US, ", wearMessageMonitorSlots=%s", hvpg.aN());
            String s2 = String.format(Locale.US, ", wearMessageMonitorTotalCount=%s", hvpg.aO());
            String s3 = String.format(Locale.US, ", currentHour=%s UTC", ((long)cyvl0.c));
            Locale locale0 = Locale.US;
            Integer integer0 = cyvl0.c().cardinality();
            Integer integer1 = (int)cyvl0.a;
            String s4 = String.format(Locale.US, ", SentCount=%s", ((int)cyvl0.d));
            String s5 = String.format(Locale.US, ", SentTimeSlots=%s/%s", cyvl0.e.cardinality(), integer1);
            String s6 = String.format(Locale.US, ", ReceivedCount=%s", ((int)cyvl0.f));
            String s7 = String.format(Locale.US, ", ReceivedTimeSlots=%s/%s", cyvl0.g.cardinality(), integer1);
            String s8 = String.format(Locale.US, ", EventTriggerCount=%s", ((int)cyvl0.h));
            String s9 = String.format(Locale.US, ", EventTriggerTimeSlots=%s/%s", cyvl0.i.cardinality(), integer1);
            printWriter0.println("TriangleMessageMonitor{" + s + s1 + s2 + s3 + String.format(locale0, ", MessageTimeSlots=%s/%s", integer0, integer1) + s4 + s5 + s6 + s7 + s8 + s9 + "}");
        }
    }
}

