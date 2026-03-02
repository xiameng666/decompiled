import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import com.android.settingslib.bluetooth.devicesettings.DeviceInfo;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingState;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsProviderServiceStatus;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.List;

public final class sht extends wby implements IInterface {
    final shn a;

    public sht() {
        super("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsProviderService");
    }

    public sht(shn shn0) {
        this.a = shn0;
        super("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsProviderService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0 = null;
        if(v != 1) {
            switch(v) {
                case 2: {
                    DeviceInfo deviceInfo0 = (DeviceInfo)wbz.a(parcel0, DeviceInfo.CREATOR);
                    IBinder iBinder0 = parcel0.readStrongBinder();
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsListener");
                        object0 = (iInterface0 instanceof shs) ? ((shs)iInterface0) : new shs(iBinder0);
                    }
                    sht.gr(parcel0);
                    ibuq.f(deviceInfo0, "deviceInfo");
                    ibuq.f(object0, "listener");
                    shn shn0 = this.a;
                    Context context0 = shn0.getBaseContext();
                    ibuq.e(context0, "getBaseContext(...)");
                    shp.a(context0);
                    synchronized(shn0) {
                        HashMap hashMap0 = shn0.a;
                        String s = deviceInfo0.a;
                        boolean z = ((RemoteCallbackList)Map.-EL.computeIfAbsent(hashMap0, s, new shm(new shl()))).register(((IInterface)object0));
                        List list0 = (List)shn0.b.get(s);
                        if(list0 != null) {
                            ((shs)object0).a(list0);
                        }
                        if(z) {
                            RemoteCallbackList remoteCallbackList0 = (RemoteCallbackList)hashMap0.get(s);
                            if(remoteCallbackList0 != null && remoteCallbackList0.getRegisteredCallbackCount() == 1) {
                                shn0.a(deviceInfo0);
                            }
                        }
                    }
                    return true;
                }
                case 3: {
                    DeviceInfo deviceInfo1 = (DeviceInfo)wbz.a(parcel0, DeviceInfo.CREATOR);
                    IBinder iBinder1 = parcel0.readStrongBinder();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsListener");
                        object0 = (iInterface1 instanceof shs) ? ((shs)iInterface1) : new shs(iBinder1);
                    }
                    sht.gr(parcel0);
                    ibuq.f(deviceInfo1, "deviceInfo");
                    ibuq.f(object0, "listener");
                    shn shn1 = this.a;
                    Context context1 = shn1.getBaseContext();
                    ibuq.e(context1, "getBaseContext(...)");
                    shp.a(context1);
                    synchronized(shn1) {
                        HashMap hashMap1 = shn1.a;
                        String s1 = deviceInfo1.a;
                        RemoteCallbackList remoteCallbackList1 = (RemoteCallbackList)hashMap1.get(s1);
                        if(remoteCallbackList1 != null && remoteCallbackList1.unregister(((IInterface)object0))) {
                            RemoteCallbackList remoteCallbackList2 = (RemoteCallbackList)hashMap1.get(s1);
                            if(remoteCallbackList2 != null && remoteCallbackList2.getRegisteredCallbackCount() == 0) {
                                shn1.b(deviceInfo1);
                                shn1.b.remove(s1);
                            }
                        }
                    }
                    return true;
                }
                case 4: {
                    DeviceInfo deviceInfo2 = (DeviceInfo)wbz.a(parcel0, DeviceInfo.CREATOR);
                    DeviceSettingState deviceSettingState0 = (DeviceSettingState)wbz.a(parcel0, DeviceSettingState.CREATOR);
                    sht.gr(parcel0);
                    ibuq.f(deviceInfo2, "deviceInfo");
                    ibuq.f(deviceSettingState0, "state");
                    Context context2 = this.a.getBaseContext();
                    ibuq.e(context2, "getBaseContext(...)");
                    shp.a(context2);
                    this.a.c(deviceInfo2, deviceSettingState0);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        Context context3 = this.a.getBaseContext();
        ibuq.e(context3, "getBaseContext(...)");
        shp.a(context3);
        DeviceSettingsProviderServiceStatus deviceSettingsProviderServiceStatus0 = new DeviceSettingsProviderServiceStatus(true, Bundle.EMPTY);
        parcel1.writeNoException();
        wbz.g(parcel1, deviceSettingsProviderServiceStatus0);
        return true;
    }
}

