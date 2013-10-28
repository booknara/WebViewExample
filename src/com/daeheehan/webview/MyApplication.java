package com.daeheehan.webview;

import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(
    formKey = "", // This is required for backward compatibility but not used
    mailTo="aaa@abc.com",
	customReportContent = { ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, 
    		ReportField.ANDROID_VERSION, ReportField.PHONE_MODEL, ReportField.CUSTOM_DATA, 
    		ReportField.STACK_TRACE, ReportField.LOGCAT },
    mode = ReportingInteractionMode.TOAST,
    resToastText = R.string.crash_toast_text
)
public class MyApplication extends Application {
	 
	@Override
	public void onCreate() {
		super.onCreate();
		
		// The following line triggers the initialization of ACRA
        ACRA.init(this);
	}
}
