package tv.onairm.com.layoutmanagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tv.onairm.com.layoutmanagerdemo.adapter.TextAdapter;
import tv.onairm.com.layoutmanagerdemo.study.LinearLayoutManager;
import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;
import tv.onairm.com.layoutmanagerdemo.tool.CrashHandler;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CrashHandler.getInstance().init(this,"测试");
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        initData();
        initListeners();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void initData() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TextAdapter adapter = new TextAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void initListeners() {

    }
}
