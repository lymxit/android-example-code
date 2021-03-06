package com.github.jiahuanyu.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.jiahuanyu.example.BaseActivity;
import com.github.jiahuanyu.example.R;
import com.github.jiahuanyu.example.ui.dragsortgird.GridViewSortActivity;
import com.github.jiahuanyu.example.ui.recyclerview.RecyclerViewActivity;

/**
 * Created by doom on 16/6/18.
 */
public class UIMenuActivity extends BaseActivity implements AdapterView.OnItemClickListener
{
    private ListView mMenuListView;

    private final Class[] mClass =
            {
                    ServiceDialogActivity.class,
                    DropDownMenuActivity.class,
                    LargeImageViewActivity.class,
                    GridViewSortActivity.class,
                    EmptyViewActivity.class,
                    LayoutInflaterSetFactoryActivity.class,
                    InputEditTextActivity.class,
                    MaterialPreferencesActivity.class,
                    RecyclerViewActivity.class
            };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initActivity(true, R.layout.activity_menu);
        mMenuListView = (ListView) findViewById(R.id.activity_menu_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu_list_ui));
        mMenuListView.setAdapter(adapter);
        mMenuListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        startActivity(new Intent(this, mClass[i]));
    }

}
