package tv.onairm.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tv.onairm.com.layoutmanagerdemo.adapter.TextAdapter;
import tv.onairm.com.layoutmanagerdemo.study.LinearLayoutManager;
import tv.onairm.com.layoutmanagerdemo.study.RecyclerView;


public class MainActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        initData();
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
}
