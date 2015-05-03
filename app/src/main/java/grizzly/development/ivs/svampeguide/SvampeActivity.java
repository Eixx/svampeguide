package grizzly.development.ivs.svampeguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Christian Petersen{chpetersen1989@gmail.com}
 * 03-05-2015
 */
public class SvampeActivity extends Activity {

  private String[] mNavnDrawTitles;
  private DrawerLayout mDrawerLayout;
  private ListView mDrawerList;
  private RecyclerView mRecyclerView;
  private SvampeAdapter mAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_svampe);

    mNavnDrawTitles = getResources().getStringArray(R.array.nav_draw_titles);
    mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    mDrawerList = (ListView) findViewById(R.id.list_view_of_navn_items);

    // Set the adapter for the list view
    mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.nav_draw_list_item, R.id.text_view1, mNavnDrawTitles));
    // Set the list's click listener
    mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

    mRecyclerView = (RecyclerView) findViewById(R.id.svampe_recycler_view);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    mAdapter = new SvampeAdapter();
    mRecyclerView.setAdapter(mAdapter);

  }



  private class DrawerItemClickListener implements ListView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView parent, View view, int position, long id) {
      selectItem(position);
    }
  }

  /** Swaps fragments in the main content view */
  private void selectItem(int position) {

  }

  @Override
  public void setTitle(CharSequence title) {

  }


}
