package com.cn.freelinebutterknife;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static butterknife.ButterKnife.bind;
import static com.cn.freelinebutterknife.R.id.toolbar;

public class MainActivity extends AppCompatActivity {
    private Unbinder mUnbinder;

    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.fab) FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUnbinder = ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

    }

    // TODO: 16-12-2 测试增量编译1 把下面代码取消注释, 编译, freeline 增量编译运行, 点击fab看效果 2 再注释掉下面代码, 编译, freeline增量编译运行, 再点击看结果　3 重复１和２继续测试

/*    @OnClick(R.id.fab)
    public void onClick(View view) {
        Snackbar.make(view, "FAB from ButterKnife", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }*/

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
