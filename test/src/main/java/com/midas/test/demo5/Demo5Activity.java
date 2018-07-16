package com.midas.test.demo5;

import android.view.MenuItem;
import android.widget.Toast;

import com.midas.test.R;
import com.restse.themvp.presenter.ActivityPresenter;

/**
 *
 *@author Dell
 *@time 2018/7/16 14:20
 *@description: Toolbar与Menu
 */
public class Demo5Activity extends ActivityPresenter<Demo5Delegate> {
    @Override
    protected Class<Demo5Delegate> getDelegateClass() {
        return Demo5Delegate.class;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu) {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
