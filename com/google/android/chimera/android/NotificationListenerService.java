package com.google.android.chimera.android;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.UserHandle;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.chimera.Service.ProxyCallbacks;
import com.google.android.chimera.Service;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;
import wwv;

@ChimeraApiVersion(added = 0x73L)
public abstract class NotificationListenerService extends Service {
    private wwv a;

    public final void cancelAllNotifications() {
        this.a.cancelAllNotifications();
    }

    public final void cancelNotification(String s) {
        this.a.cancelNotification(s);
    }

    public final void cancelNotifications(String[] arr_s) {
        this.a.cancelNotifications(arr_s);
    }

    public final void clearRequestedListenerHints() {
        this.a.clearRequestedListenerHints();
    }

    public StatusBarNotification[] getActiveNotifications() {
        return this.a.o();
    }

    public StatusBarNotification[] getActiveNotifications(String[] arr_s) {
        return this.a.p(arr_s);
    }

    @ChimeraApiVersion(added = 0x7FL)
    protected android.service.notification.NotificationListenerService getContainerNotificationListenerService() {
        return this.a;
    }

    public final int getCurrentInterruptionFilter() {
        return this.a.getCurrentInterruptionFilter();
    }

    public final int getCurrentListenerHints() {
        return this.a.getCurrentListenerHints();
    }

    public NotificationListenerService.RankingMap getCurrentRanking() {
        return this.a.a();
    }

    public final List getNotificationChannelGroups(String s, UserHandle userHandle0) {
        return this.a.getNotificationChannelGroups(s, userHandle0);
    }

    public final List getNotificationChannels(String s, UserHandle userHandle0) {
        return this.a.getNotificationChannels(s, userHandle0);
    }

    public final StatusBarNotification[] getSnoozedNotifications() {
        return this.a.getSnoozedNotifications();
    }

    @Override  // com.google.android.chimera.Service
    public IBinder onBind(Intent intent0) {
        return this.a.onBind(intent0);
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        this.a.onCreate();
    }

    @Override  // com.google.android.chimera.Service
    public void onDestroy() {
        this.a.onDestroy();
    }

    public void onInterruptionFilterChanged(int v) {
        this.a.b(v);
    }

    public void onListenerConnected() {
        this.a.c();
    }

    public void onListenerDisconnected() {
        this.a.d();
    }

    public void onListenerHintsChanged(int v) {
        this.a.e(v);
    }

    public void onNotificationChannelGroupModified(String s, UserHandle userHandle0, NotificationChannelGroup notificationChannelGroup0, int v) {
        this.a.f(s, userHandle0, notificationChannelGroup0, v);
    }

    public void onNotificationChannelModified(String s, UserHandle userHandle0, NotificationChannel notificationChannel0, int v) {
        this.a.g(s, userHandle0, notificationChannel0, v);
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification0) {
        this.a.h(statusBarNotification0);
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0) {
        this.a.i(statusBarNotification0, notificationListenerService$RankingMap0);
    }

    public void onNotificationRankingUpdate(NotificationListenerService.RankingMap notificationListenerService$RankingMap0) {
        this.a.j(notificationListenerService$RankingMap0);
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification0) {
        this.a.k(statusBarNotification0);
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0) {
        this.a.l(statusBarNotification0, notificationListenerService$RankingMap0);
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, int v) {
        this.a.m(statusBarNotification0, notificationListenerService$RankingMap0, v);
    }

    @Override  // com.google.android.chimera.Service
    public void onRebind(Intent intent0) {
        this.a.onRebind(intent0);
    }

    public void onSilentStatusBarIconsVisibilityChanged(boolean z) {
        this.a.n(z);
    }

    @Override  // com.google.android.chimera.Service
    public boolean onUnbind(Intent intent0) {
        return this.a.onUnbind(intent0);
    }

    public final void requestInterruptionFilter(int v) {
        this.a.requestInterruptionFilter(v);
    }

    public final void requestListenerHints(int v) {
        this.a.requestListenerHints(v);
    }

    public static void requestRebind(ComponentName componentName0) {
        android.service.notification.NotificationListenerService.requestRebind(componentName0);
    }

    public final void requestUnbind() {
        this.a.requestUnbind();
    }

    public final void setNotificationsShown(String[] arr_s) {
        this.a.setNotificationsShown(arr_s);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Service.ProxyCallbacks service$ProxyCallbacks0, Context context0) {
        super.setProxyCallbacks(service$ProxyCallbacks0, context0);
        wwv wwv0 = new wwv(this);
        this.a = wwv0;
        wwv0.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((Service.ProxyCallbacks)object0), context0);
    }

    public final void snoozeNotification(String s, long v) {
        this.a.snoozeNotification(s, v);
    }

    public final void updateNotificationChannel(String s, UserHandle userHandle0, NotificationChannel notificationChannel0) {
        this.a.updateNotificationChannel(s, userHandle0, notificationChannel0);
    }
}

