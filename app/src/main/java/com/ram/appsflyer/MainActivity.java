package com.ram.appsflyer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, Object> eventData = new HashMap<>();
        eventData.put(AFInAppEventParameterName.CONTENT_ID, new String[] {"123","988","399"});
        eventData.put(AFInAppEventParameterName.QUANTITY, new int[] {2, 1, 1});
        eventData.put(AFInAppEventParameterName.PRICE,new int[] {25, 50, 10});
        eventData.put(AFInAppEventParameterName.CURRENCY,"USD");
        eventData.put(AFInAppEventParameterName.REVENUE,110);

        AppsFlyerLib.getInstance().trackEvent(getApplicationContext(), AFInAppEventType.PURCHASE, eventData);
    }
}
