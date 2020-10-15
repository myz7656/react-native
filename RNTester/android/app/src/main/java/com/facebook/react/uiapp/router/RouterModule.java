package com.facebook.react.uiapp.router;

import android.content.Intent;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uiapp.RNTesterTargetActivity;

import javax.annotation.Nonnull;

public class RouterModule extends ReactContextBaseJavaModule {

  public RouterModule(@Nonnull ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Nonnull
  @Override
  public String getName() {
    return "RouterModule";
  }

  @ReactMethod
  public void navigate(Promise promise) {
    Intent intent = new Intent(getCurrentActivity(), RNTesterTargetActivity.class);
    getCurrentActivity().startActivity(intent);
    promise.resolve(0);
  }
}
