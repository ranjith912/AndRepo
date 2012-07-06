package com.eshiah.base;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.eshiah.adapter.RuleAdapter;

public class AppActivity extends Activity {
	RuleAdapter ruleAdapter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView ruleListView=(ListView)findViewById(R.id.rule_list);
        ruleAdapter = new RuleAdapter();
        ruleListView.setAdapter(ruleAdapter);
    }
}