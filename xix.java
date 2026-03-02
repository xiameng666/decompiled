import android.app.ActionBar;
import android.app.Activity.TranslucentConversionListener;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.app.ActivityOptions;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.ComponentCaller;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.SharedElementCallback;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toolbar;
import android.window.OnBackInvokedDispatcher;
import android.window.SplashScreen;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public interface xix {
    void platform_addContentView(View arg1, ViewGroup.LayoutParams arg2);

    void platform_clearOverrideActivityTransition(int arg1);

    void platform_closeContextMenu();

    void platform_closeOptionsMenu();

    void platform_convertFromTranslucent();

    boolean platform_convertToTranslucent(Activity.TranslucentConversionListener arg1, ActivityOptions arg2);

    PendingIntent platform_createPendingResult(int arg1, Intent arg2, int arg3);

    @Deprecated
    void platform_dismissDialog(int arg1);

    void platform_dismissKeyboardShortcutsHelper();

    boolean platform_dispatchGenericMotionEvent(MotionEvent arg1);

    boolean platform_dispatchKeyEvent(KeyEvent arg1);

    boolean platform_dispatchKeyShortcutEvent(KeyEvent arg1);

    boolean platform_dispatchPopulateAccessibilityEvent(AccessibilityEvent arg1);

    boolean platform_dispatchTouchEvent(MotionEvent arg1);

    boolean platform_dispatchTrackballEvent(MotionEvent arg1);

    void platform_dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    @Deprecated
    void platform_enterPictureInPictureMode();

    boolean platform_enterPictureInPictureMode(PictureInPictureParams arg1);

    View platform_findViewById(int arg1);

    void platform_finish();

    void platform_finishActivity(int arg1);

    @Deprecated
    void platform_finishActivityFromChild(Activity arg1, int arg2);

    void platform_finishAffinity();

    void platform_finishAfterTransition();

    void platform_finishAndRemoveTask();

    @Deprecated
    void platform_finishFromChild(Activity arg1);

    ActionBar platform_getActionBar();

    Application platform_getApplication();

    ComponentCaller platform_getCaller();

    ComponentName platform_getCallingActivity();

    String platform_getCallingPackage();

    int platform_getChangingConfigurations();

    ComponentName platform_getComponentName();

    Scene platform_getContentScene();

    TransitionManager platform_getContentTransitionManager();

    ComponentCaller platform_getCurrentCaller();

    View platform_getCurrentFocus();

    @Deprecated
    FragmentManager platform_getFragmentManager();

    ComponentCaller platform_getInitialCaller();

    Intent platform_getIntent();

    Object platform_getLastNonConfigurationInstance();

    String platform_getLaunchedFromPackage();

    int platform_getLaunchedFromUid();

    LayoutInflater platform_getLayoutInflater();

    @Deprecated
    LoaderManager platform_getLoaderManager();

    String platform_getLocalClassName();

    int platform_getMaxNumPictureInPictureActions();

    MediaController platform_getMediaController();

    MenuInflater platform_getMenuInflater();

    OnBackInvokedDispatcher platform_getOnBackInvokedDispatcher();

    @Deprecated
    Activity platform_getParent();

    Intent platform_getParentActivityIntent();

    SharedPreferences platform_getPreferences(int arg1);

    Uri platform_getReferrer();

    int platform_getRequestedOrientation();

    SearchEvent platform_getSearchEvent();

    SplashScreen platform_getSplashScreen();

    int platform_getTaskId();

    CharSequence platform_getTitle();

    int platform_getTitleColor();

    VoiceInteractor platform_getVoiceInteractor();

    int platform_getVolumeControlStream();

    Window platform_getWindow();

    WindowManager platform_getWindowManager();

    boolean platform_hasWindowFocus();

    void platform_invalidateOptionsMenu();

    boolean platform_isActivityTransitionRunning();

    @Deprecated
    boolean platform_isBackgroundVisibleBehind();

    boolean platform_isChangingConfigurations();

    @Deprecated
    boolean platform_isChild();

    boolean platform_isDestroyed();

    boolean platform_isFinishing();

    boolean platform_isImmersive();

    boolean platform_isInMultiWindowMode();

    boolean platform_isInPictureInPictureMode();

    boolean platform_isLaunchedFromBubble();

    boolean platform_isLocalVoiceInteractionSupported();

    boolean platform_isTaskRoot();

    boolean platform_isVoiceInteraction();

    boolean platform_isVoiceInteractionRoot();

    @Deprecated
    Cursor platform_managedQuery(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5);

    boolean platform_moveTaskToBack(boolean arg1);

    boolean platform_navigateUpTo(Intent arg1);

    @Deprecated
    boolean platform_navigateUpToFromChild(Activity arg1, Intent arg2);

    void platform_onActionModeFinished(ActionMode arg1);

    void platform_onActionModeStarted(ActionMode arg1);

    void platform_onActivityReenter(int arg1, Intent arg2);

    void platform_onActivityResult(int arg1, int arg2, Intent arg3);

    void platform_onActivityResult(int arg1, int arg2, Intent arg3, ComponentCaller arg4);

    @Deprecated
    void platform_onAttachFragment(Fragment arg1);

    void platform_onAttachedToWindow();

    @Deprecated
    void platform_onBackPressed();

    @Deprecated
    void platform_onBackgroundVisibleBehindChanged(boolean arg1);

    void platform_onChildTitleChanged(Activity arg1, CharSequence arg2);

    void platform_onConfigurationChanged(Configuration arg1);

    void platform_onContentChanged();

    boolean platform_onContextItemSelected(MenuItem arg1);

    void platform_onContextMenuClosed(Menu arg1);

    void platform_onCreate(Bundle arg1);

    void platform_onCreate(Bundle arg1, PersistableBundle arg2);

    void platform_onCreateContextMenu(ContextMenu arg1, View arg2, ContextMenu.ContextMenuInfo arg3);

    CharSequence platform_onCreateDescription();

    @Deprecated
    Dialog platform_onCreateDialog(int arg1);

    @Deprecated
    Dialog platform_onCreateDialog(int arg1, Bundle arg2);

    void platform_onCreateNavigateUpTaskStack(TaskStackBuilder arg1);

    boolean platform_onCreateOptionsMenu(Menu arg1);

    boolean platform_onCreatePanelMenu(int arg1, Menu arg2);

    View platform_onCreatePanelView(int arg1);

    @Deprecated
    boolean platform_onCreateThumbnail(Bitmap arg1, Canvas arg2);

    View platform_onCreateView(View arg1, String arg2, Context arg3, AttributeSet arg4);

    View platform_onCreateView(String arg1, Context arg2, AttributeSet arg3);

    void platform_onDestroy();

    void platform_onDetachedFromWindow();

    void platform_onEnterAnimationComplete();

    boolean platform_onGenericMotionEvent(MotionEvent arg1);

    boolean platform_onKeyDown(int arg1, KeyEvent arg2);

    boolean platform_onKeyLongPress(int arg1, KeyEvent arg2);

    boolean platform_onKeyMultiple(int arg1, int arg2, KeyEvent arg3);

    boolean platform_onKeyShortcut(int arg1, KeyEvent arg2);

    boolean platform_onKeyUp(int arg1, KeyEvent arg2);

    void platform_onLocalVoiceInteractionStarted();

    void platform_onLocalVoiceInteractionStopped();

    void platform_onLowMemory();

    boolean platform_onMenuItemSelected(int arg1, MenuItem arg2);

    boolean platform_onMenuOpened(int arg1, Menu arg2);

    @Deprecated
    void platform_onMultiWindowModeChanged(boolean arg1);

    void platform_onMultiWindowModeChanged(boolean arg1, Configuration arg2);

    boolean platform_onNavigateUp();

    @Deprecated
    boolean platform_onNavigateUpFromChild(Activity arg1);

    void platform_onNewIntent(Intent arg1);

    void platform_onNewIntent(Intent arg1, ComponentCaller arg2);

    boolean platform_onOptionsItemSelected(MenuItem arg1);

    void platform_onOptionsMenuClosed(Menu arg1);

    void platform_onPanelClosed(int arg1, Menu arg2);

    void platform_onPause();

    @Deprecated
    void platform_onPictureInPictureModeChanged(boolean arg1);

    void platform_onPictureInPictureModeChanged(boolean arg1, Configuration arg2);

    boolean platform_onPictureInPictureRequested();

    void platform_onPictureInPictureUiStateChanged(PictureInPictureUiState arg1);

    void platform_onPointerCaptureChanged(boolean arg1);

    void platform_onPostCreate(Bundle arg1);

    void platform_onPostCreate(Bundle arg1, PersistableBundle arg2);

    void platform_onPostResume();

    @Deprecated
    void platform_onPrepareDialog(int arg1, Dialog arg2);

    @Deprecated
    void platform_onPrepareDialog(int arg1, Dialog arg2, Bundle arg3);

    void platform_onPrepareNavigateUpTaskStack(TaskStackBuilder arg1);

    boolean platform_onPrepareOptionsMenu(Menu arg1);

    boolean platform_onPreparePanel(int arg1, View arg2, Menu arg3);

    void platform_onProvideAssistContent(AssistContent arg1);

    void platform_onProvideAssistData(Bundle arg1);

    void platform_onProvideKeyboardShortcuts(List arg1, Menu arg2, int arg3);

    Uri platform_onProvideReferrer();

    void platform_onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3);

    void platform_onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3, int arg4);

    void platform_onRestart();

    void platform_onRestoreInstanceState(Bundle arg1);

    void platform_onRestoreInstanceState(Bundle arg1, PersistableBundle arg2);

    void platform_onResume();

    Object platform_onRetainNonConfigurationInstance();

    void platform_onSaveInstanceState(Bundle arg1);

    void platform_onSaveInstanceState(Bundle arg1, PersistableBundle arg2);

    boolean platform_onSearchRequested();

    boolean platform_onSearchRequested(SearchEvent arg1);

    void platform_onStart();

    @Deprecated
    void platform_onStateNotSaved();

    void platform_onStop();

    void platform_onTitleChanged(CharSequence arg1, int arg2);

    void platform_onTopResumedActivityChanged(boolean arg1);

    boolean platform_onTouchEvent(MotionEvent arg1);

    boolean platform_onTrackballEvent(MotionEvent arg1);

    void platform_onTrimMemory(int arg1);

    void platform_onUserInteraction();

    void platform_onUserLeaveHint();

    @Deprecated
    void platform_onVisibleBehindCanceled();

    void platform_onWindowAttributesChanged(WindowManager.LayoutParams arg1);

    void platform_onWindowFocusChanged(boolean arg1);

    ActionMode platform_onWindowStartingActionMode(ActionMode.Callback arg1);

    ActionMode platform_onWindowStartingActionMode(ActionMode.Callback arg1, int arg2);

    void platform_openContextMenu(View arg1);

    void platform_openOptionsMenu();

    void platform_overrideActivityTransition(int arg1, int arg2, int arg3);

    void platform_overrideActivityTransition(int arg1, int arg2, int arg3, int arg4);

    @Deprecated
    void platform_overridePendingTransition(int arg1, int arg2);

    @Deprecated
    void platform_overridePendingTransition(int arg1, int arg2, int arg3);

    void platform_postponeEnterTransition();

    void platform_recreate();

    void platform_registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks arg1);

    void platform_registerForContextMenu(View arg1);

    boolean platform_releaseInstance();

    @Deprecated
    void platform_removeDialog(int arg1);

    void platform_reportFullyDrawn();

    DragAndDropPermissions platform_requestDragAndDropPermissions(DragEvent arg1);

    void platform_requestFullscreenMode(int arg1, OutcomeReceiver arg2);

    void platform_requestPermissions(String[] arg1, int arg2);

    void platform_requestPermissions(String[] arg1, int arg2, int arg3);

    void platform_requestShowKeyboardShortcuts();

    @Deprecated
    boolean platform_requestVisibleBehind(boolean arg1);

    boolean platform_requestWindowFeature(int arg1);

    View platform_requireViewById(int arg1);

    void platform_runOnUiThread(Runnable arg1);

    void platform_setActionBar(Toolbar arg1);

    void platform_setAllowCrossUidActivitySwitchFromBelow(boolean arg1);

    void platform_setContentTransitionManager(TransitionManager arg1);

    void platform_setContentView(int arg1);

    void platform_setContentView(View arg1);

    void platform_setContentView(View arg1, ViewGroup.LayoutParams arg2);

    void platform_setDefaultKeyMode(int arg1);

    void platform_setEnterSharedElementCallback(SharedElementCallback arg1);

    void platform_setExitSharedElementCallback(SharedElementCallback arg1);

    void platform_setFeatureDrawable(int arg1, Drawable arg2);

    void platform_setFeatureDrawableAlpha(int arg1, int arg2);

    void platform_setFeatureDrawableResource(int arg1, int arg2);

    void platform_setFeatureDrawableUri(int arg1, Uri arg2);

    void platform_setFinishOnTouchOutside(boolean arg1);

    void platform_setImmersive(boolean arg1);

    void platform_setInheritShowWhenLocked(boolean arg1);

    void platform_setIntent(Intent arg1);

    void platform_setIntent(Intent arg1, ComponentCaller arg2);

    void platform_setLocusContext(LocusId arg1, Bundle arg2);

    void platform_setMediaController(MediaController arg1);

    void platform_setPictureInPictureParams(PictureInPictureParams arg1);

    @Deprecated
    void platform_setProgress(int arg1);

    @Deprecated
    void platform_setProgressBarIndeterminate(boolean arg1);

    @Deprecated
    void platform_setProgressBarIndeterminateVisibility(boolean arg1);

    @Deprecated
    void platform_setProgressBarVisibility(boolean arg1);

    void platform_setRecentsScreenshotEnabled(boolean arg1);

    void platform_setRequestedOrientation(int arg1);

    void platform_setResult(int arg1);

    void platform_setResult(int arg1, Intent arg2);

    @Deprecated
    void platform_setSecondaryProgress(int arg1);

    void platform_setShouldDockBigOverlays(boolean arg1);

    void platform_setShowWhenLocked(boolean arg1);

    void platform_setTaskDescription(ActivityManager.TaskDescription arg1);

    void platform_setTitle(int arg1);

    void platform_setTitle(CharSequence arg1);

    @Deprecated
    void platform_setTitleColor(int arg1);

    boolean platform_setTranslucent(boolean arg1);

    void platform_setTurnScreenOn(boolean arg1);

    void platform_setVisible(boolean arg1);

    void platform_setVolumeControlStream(int arg1);

    void platform_setVrModeEnabled(boolean arg1, ComponentName arg2);

    boolean platform_shouldDockBigOverlays();

    boolean platform_shouldShowRequestPermissionRationale(String arg1);

    boolean platform_shouldShowRequestPermissionRationale(String arg1, int arg2);

    boolean platform_shouldUpRecreateTask(Intent arg1);

    boolean platform_showAssist(Bundle arg1);

    @Deprecated
    void platform_showDialog(int arg1);

    @Deprecated
    boolean platform_showDialog(int arg1, Bundle arg2);

    void platform_showLockTaskEscapeMessage();

    ActionMode platform_startActionMode(ActionMode.Callback arg1);

    ActionMode platform_startActionMode(ActionMode.Callback arg1, int arg2);

    void platform_startActivities(Intent[] arg1);

    void platform_startActivities(Intent[] arg1, Bundle arg2);

    void platform_startActivity(Intent arg1);

    void platform_startActivity(Intent arg1, Bundle arg2);

    void platform_startActivityForResult(Intent arg1, int arg2);

    void platform_startActivityForResult(Intent arg1, int arg2, Bundle arg3);

    void platform_startActivityForResultAsUser(Intent arg1, int arg2, Bundle arg3, UserHandle arg4);

    void platform_startActivityForResultAsUser(Intent arg1, int arg2, UserHandle arg3);

    void platform_startActivityForResultAsUser(Intent arg1, String arg2, int arg3, Bundle arg4, UserHandle arg5);

    @Deprecated
    void platform_startActivityFromChild(Activity arg1, Intent arg2, int arg3);

    @Deprecated
    void platform_startActivityFromChild(Activity arg1, Intent arg2, int arg3, Bundle arg4);

    @Deprecated
    void platform_startActivityFromFragment(Fragment arg1, Intent arg2, int arg3);

    @Deprecated
    void platform_startActivityFromFragment(Fragment arg1, Intent arg2, int arg3, Bundle arg4);

    boolean platform_startActivityIfNeeded(Intent arg1, int arg2);

    boolean platform_startActivityIfNeeded(Intent arg1, int arg2, Bundle arg3);

    void platform_startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5);

    void platform_startIntentSender(IntentSender arg1, Intent arg2, int arg3, int arg4, int arg5, Bundle arg6);

    void platform_startIntentSenderForResult(IntentSender arg1, int arg2, Intent arg3, int arg4, int arg5, int arg6);

    void platform_startIntentSenderForResult(IntentSender arg1, int arg2, Intent arg3, int arg4, int arg5, int arg6, Bundle arg7);

    @Deprecated
    void platform_startIntentSenderFromChild(Activity arg1, IntentSender arg2, int arg3, Intent arg4, int arg5, int arg6, int arg7);

    @Deprecated
    void platform_startIntentSenderFromChild(Activity arg1, IntentSender arg2, int arg3, Intent arg4, int arg5, int arg6, int arg7, Bundle arg8);

    void platform_startLocalVoiceInteraction(Bundle arg1);

    void platform_startLockTask();

    @Deprecated
    void platform_startManagingCursor(Cursor arg1);

    boolean platform_startNextMatchingActivity(Intent arg1);

    boolean platform_startNextMatchingActivity(Intent arg1, Bundle arg2);

    void platform_startPostponedEnterTransition();

    void platform_startSearch(String arg1, boolean arg2, Bundle arg3, boolean arg4);

    void platform_stopLocalVoiceInteraction();

    void platform_stopLockTask();

    @Deprecated
    void platform_stopManagingCursor(Cursor arg1);

    void platform_takeKeyEvents(boolean arg1);

    void platform_triggerSearch(String arg1, Bundle arg2);

    void platform_unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks arg1);

    void platform_unregisterForContextMenu(View arg1);
}

